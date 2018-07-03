
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(90L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 91L);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5493061443340549d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.6441187605840392d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7509655283160555d);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.7509655283160555d, 0.699218330199179d, 630998.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    double var2 = org.apache.commons.math.util.FastMath.pow((-0.14695139943744212d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.168240001941272d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 66.93522156958998d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.2128331401446932d, 0.9287285890885333d, (-1.5574077246549023d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    float var2 = org.apache.commons.math.util.FastMath.max(1.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-2.590337896729905d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.2023733333156474d));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    int var2 = org.apache.commons.math.util.FastMath.min(209, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.479425538604203d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(10L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1200L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


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
    java.lang.Number var19 = var5.getPrevious();
    
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
    assertTrue("'" + var19 + "' != '" + 1.1752011936438014d+ "'", var19.equals(1.1752011936438014d));

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    int var2 = org.apache.commons.math.util.FastMath.max(2009326299, (-1442072980));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2009326299);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.1641532182693481E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.4989227756918429d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6953039533394731d));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.10022219450316257d), 4.9E-324d, 951780243);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test21() {}
//   public void test21() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-8.419694981306574d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, (-1442072990), 1862915923);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-1.0d), 0.699218330199179d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-240026100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1338502676), 10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.07570930918522539d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07585429432749323d);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1150131505), 209066259);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.1641532182693481E-10d, 1.0870778487953289E30d, (-10));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(9, (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5707963267948968d, (java.lang.Number)7.207385928451561E-4d, (-1442072980));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    long var2 = org.apache.commons.math.util.FastMath.min(303L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(1.1909687824216308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4931702671658056d);

  }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.max(0.0f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(951780243);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1442072881), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072881));

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3.552713678800501E-15d, (-1.2023733333156474d), 6.9882121507348245d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1532522787, 951780243);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    java.lang.Number var7 = var5.getPrevious();
    int var8 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)1+ "'", var7.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test40() {}
//   public void test40() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.0870778487953289E30d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    int[] var3 = new int[] { 100, 100, 0};
    int[] var7 = new int[] { 10, 0, 1};
    int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    int[] var11 = new int[] { 1, 0};
    int[] var15 = new int[] { 100, 100, 0};
    int[] var19 = new int[] { 10, 0, 1};
    int var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var19);
    int[] var24 = new int[] { 0, 100, 100};
    int var25 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var24);
    int var26 = org.apache.commons.math.util.MathUtils.distance1(var11, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var27 = org.apache.commons.math.util.MathUtils.distance1(var7, var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 9);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var11 = new double[] { 100.0d, 0.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance(var1, var11);
    double[] var14 = new double[] { 0.0d};
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var17 = new double[] { 0.0d};
    double[] var19 = new double[] { 100.0d};
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
    boolean var21 = org.apache.commons.math.util.MathUtils.equals(var14, var17);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var17, var25);
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 0.8575532158463934d);
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 0.6480542736638855d);
    double[] var33 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918025d);
    double[] var35 = new double[] { 0.0d};
    double[] var37 = new double[] { 100.0d};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
    double[] var40 = new double[] { 0.0d};
    double[] var42 = new double[] { 100.0d};
    boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var42);
    double var44 = org.apache.commons.math.util.MathUtils.distanceInf(var37, var40);
    double[] var45 = new double[] { };
    double[] var49 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var50 = null;
    boolean var51 = org.apache.commons.math.util.MathUtils.equals(var49, var50);
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var49);
    boolean var53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var49);
    double var54 = org.apache.commons.math.util.MathUtils.distance1(var33, var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var55 = org.apache.commons.math.util.MathUtils.distance1(var11, var33);
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1.0239010128918025d);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    float var2 = org.apache.commons.math.util.FastMath.max(100.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-89.2328896037985d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.833489212424966E38d));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1442072881), (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072881));

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    int var2 = org.apache.commons.math.util.FastMath.max(209066259, (-291941475));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 209066259);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(2L, 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1000L, 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900000L);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.14748086636738275d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9891443947774783d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(951780243, (-10));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.6441187605840392d, 7.207385928451561E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6441187605840392d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(90L, 1774819148);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(7.481044921481109E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.481044921481109E-17d);

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }
// 
// 
//     double[] var1 = new double[] { 0.0d};
//     double[] var3 = new double[] { 100.0d};
//     boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
//     double[] var6 = new double[] { 0.0d};
//     double[] var8 = new double[] { 100.0d};
//     boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
//     double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
//     double[] var12 = new double[] { 0.0d};
//     double[] var14 = new double[] { 100.0d};
//     boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
//     double[] var17 = new double[] { 0.0d};
//     double[] var19 = new double[] { 100.0d};
//     boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var19);
//     double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var17);
//     double[] var23 = new double[] { 0.0d};
//     double[] var25 = new double[] { 100.0d};
//     boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
//     double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0239010128918022d);
//     double var29 = org.apache.commons.math.util.MathUtils.distance1(var14, var28);
//     boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var28);
//     org.apache.commons.math.util.MathUtils.checkOrder(var3);
//     org.apache.commons.math.util.MathUtils.checkOrder(var3);
//     double[] var33 = null;
//     double var34 = org.apache.commons.math.util.MathUtils.distance(var3, var33);
// 
//   }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-2.8628976317751614E-92d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(3.29371928817332E59d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.29371928817332E59d);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(7.207385928451561E-4d, 0.31326168751822286d, 2.0886708959722813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(9.765623447795783E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765621895592307E-4d);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.1940688187363215d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-1.2261911708835171d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1, (-240026100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-291941475), 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1800407107));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(900000L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.5722296646125027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5722296646125027d);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-3L), 1862915923);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1997450891849582299L));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    double var2 = org.apache.commons.math.util.FastMath.max(100.4987562112089d, 1.7840341610578327d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.4987562112089d);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.0870778487953289E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8973087686975562E28d);

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }
// 
// 
//     double[] var1 = new double[] { 0.0d};
//     double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     double[] var4 = new double[] { 0.0d};
//     double[] var6 = new double[] { 100.0d};
//     boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
//     boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
//     double[] var10 = new double[] { 0.0d};
//     double[] var12 = new double[] { 100.0d};
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
//     double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
//     double[] var17 = null;
//     double[] var19 = new double[] { 0.0d};
//     double[] var21 = new double[] { 100.0d};
//     boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var21);
//     double[] var24 = new double[] { 0.0d};
//     double[] var26 = new double[] { 100.0d};
//     boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
//     double var28 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var24);
//     double[] var30 = new double[] { 0.0d};
//     double[] var32 = new double[] { 100.0d};
//     boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var32);
//     double[] var35 = new double[] { 0.0d};
//     double[] var37 = new double[] { 100.0d};
//     boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
//     double var39 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var35);
//     double[] var41 = new double[] { 0.0d};
//     double[] var43 = new double[] { 100.0d};
//     boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var43);
//     double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var43, 1.0239010128918022d);
//     double var47 = org.apache.commons.math.util.MathUtils.distance1(var32, var46);
//     boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var46);
//     boolean var49 = org.apache.commons.math.util.MathUtils.equals(var17, var46);
//     double var50 = org.apache.commons.math.util.MathUtils.distance(var16, var17);
// 
//   }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1338502675));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round((-2.8628976317751614E-92d), 1150131505);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.6490605123312352d, 1.2545069915963656d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    int var2 = org.apache.commons.math.util.FastMath.max(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-2.8628976317751614E-92d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.000441095849621d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8816854544938376d);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1442072990, (-1338502675));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.5403023058681399d, (java.lang.Number)3.1622776601683795d, 951780243);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.7840341610578327d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9773508306736582d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(301L, 299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 600L);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 209, 2009326299);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9555128079474305d));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.7365279287428347d, 9.332621544395286E157d, 1862915923);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1079574559, (-1862915923));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(9.765625E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.055952909680744456d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1442072880));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-3.193181872794057d), 0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3.193181872794057d));

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.9067427790689399d, 15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.90674277906894d);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1442072881));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.1641532182693481E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1, (-240026100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-240026100));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.4612695550331807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.44630485968672645d);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-240026100), (-1000573857));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(66.93522156958998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.06023871960563d);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


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
      java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, (-89L));
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

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    java.lang.Number var6 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0L+ "'", var6.equals(0L));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 67.3340684745264d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }
// 
// 
//     int[] var2 = new int[] { 1, 0};
//     int[] var6 = new int[] { 100, 100, 0};
//     int[] var10 = new int[] { 10, 0, 1};
//     int var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var10);
//     int[] var15 = new int[] { 0, 100, 100};
//     int var16 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var15);
//     int var17 = org.apache.commons.math.util.MathUtils.distance1(var2, var10);
//     int[] var18 = null;
//     double var19 = org.apache.commons.math.util.MathUtils.distance(var2, var18);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.5707963267948968d, (-0.10022219450316257d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9557502835537018d);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.4932167668855039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4932167668855039d);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(11013.0d, 1.055287372175112d, (-1.0326329306069673d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(13.35506022199452d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 630999.4197775752d);

  }

  public void test106() {}
//   public void test106() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(3.16227766016838d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(2L, 90L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5210953054937474d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.9330920755982086d, 1.1940688187363215d, 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }
// 
// 
//     int[] var3 = new int[] { 100, 100, 0};
//     int[] var7 = new int[] { 10, 0, 1};
//     int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
//     int[] var12 = new int[] { 100, 100, 0};
//     int[] var16 = new int[] { 10, 0, 1};
//     int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
//     int var18 = org.apache.commons.math.util.MathUtils.distance1(var7, var16);
//     int[] var22 = new int[] { 100, 100, 0};
//     int[] var26 = new int[] { 10, 0, 1};
//     int var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var26);
//     int[] var31 = new int[] { 0, 100, 100};
//     int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
//     int var33 = org.apache.commons.math.util.MathUtils.distance1(var7, var31);
//     int[] var37 = new int[] { 100, 100, 0};
//     int[] var41 = new int[] { 10, 0, 1};
//     int var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var41);
//     int[] var46 = new int[] { 100, 100, 0};
//     int[] var50 = new int[] { 10, 0, 1};
//     int var51 = org.apache.commons.math.util.MathUtils.distance1(var46, var50);
//     int[] var55 = new int[] { 100, 100, 0};
//     int[] var59 = new int[] { 10, 0, 1};
//     int var60 = org.apache.commons.math.util.MathUtils.distance1(var55, var59);
//     int var61 = org.apache.commons.math.util.MathUtils.distance1(var50, var59);
//     int[] var65 = new int[] { 100, 100, 0};
//     int[] var69 = new int[] { 10, 0, 1};
//     int var70 = org.apache.commons.math.util.MathUtils.distance1(var65, var69);
//     int[] var74 = new int[] { 100, 100, 0};
//     int[] var78 = new int[] { 10, 0, 1};
//     int var79 = org.apache.commons.math.util.MathUtils.distance1(var74, var78);
//     int var80 = org.apache.commons.math.util.MathUtils.distance1(var69, var78);
//     double var81 = org.apache.commons.math.util.MathUtils.distance(var59, var78);
//     int var82 = org.apache.commons.math.util.MathUtils.distanceInf(var37, var59);
//     int var83 = org.apache.commons.math.util.MathUtils.distance1(var7, var59);
//     int[] var84 = null;
//     int var85 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var84);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.3043457015073627d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9540432297515553d);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1200L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(951780243, 209066259);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(30.48232336227865d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7310309456440016E13d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1000573857));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1000573857);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.9773508306736582d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.009949513583114137d));

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0013201176315390667d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.9330920755982086d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6591208326138481d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(630999.4197775752d, 1.1940688187363215d, 9.765621895592899E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1338502676), 1862915923);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.8575532158463934d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-240026100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 240026100);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(600L, 303L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 181800L);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.9557502835537018d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.7615941559557649d, 0.0013201176315390667d, 0.9540432297515553d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


    float var2 = org.apache.commons.math.util.FastMath.max(1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1940688187363215d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(815.7297363039102d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 28.56098276152118d);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }
// 
// 
//     double[] var1 = new double[] { 0.0d};
//     double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     double[] var4 = new double[] { 0.0d};
//     double[] var6 = new double[] { 100.0d};
//     boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
//     boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
//     double[] var10 = new double[] { 0.0d};
//     double[] var12 = new double[] { 100.0d};
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
//     double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.8575532158463934d);
//     double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 0.6480542736638855d);
//     double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0239010128918025d);
//     org.apache.commons.math.util.MathUtils.OrderDirection var21 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var12, var21, true);
//     double[] var24 = null;
//     double var25 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var24);
// 
//   }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-1.2261911708835171d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 362880L);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    int var2 = org.apache.commons.math.util.FastMath.min(31, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100, (-1442072880));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    long var2 = org.apache.commons.math.util.FastMath.max(1000L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1000L);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(10L, 301L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = var5.getDirection();
    java.lang.String var9 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"+ "'", var9.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-10), 1150131604);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(Double.NEGATIVE_INFINITY, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.9697850179455104d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.770060138012284d);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    java.lang.String var8 = var5.toString();
    java.lang.String var9 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"+ "'", var8.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"+ "'", var9.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"));

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    int var2 = org.apache.commons.math.util.FastMath.min(100, 1532522787);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(13.35506022199452d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 315499.70988958d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(181800L, 181800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(3.29371928817332E59d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 59.517686583057106d);

  }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }
// 
// 
//     float var1 = org.apache.commons.math.util.MathUtils.indicator(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.6163140772864136d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-10), (-1338502676));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1338502686));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(5L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(0, (-1338502676));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1338502676);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(9.765623447795783E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.77039337044457E-4d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(100.0f, 0, 2009326299);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test156() {}
//   public void test156() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var1 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, var1);
// 
//   }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 10.0d, 630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-240026100), (-240026100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 240026100);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.0d, 0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(104.9439511105971d, 1.0239010128918027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.8701991114558751d));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(3.29371928817332E59d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.4601490397061246E43d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(4.4601490397061246E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.4601490397061246E43d);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.6104464895571766d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.9697850179455104d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(3.552713678800501E-15d, 1.1241171695718353d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(900000L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    long var2 = org.apache.commons.math.util.FastMath.min(1000L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(191, 1079574559);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(280988690, (-1338502686));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1774819148, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1774819148);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(1200L, (-1997450891849582299L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test172() {}
//   public void test172() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(0.0d, (-0.009949513583114137d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-1.2261911708835171d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9412089142041425d));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.013292325585375278d);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.44630485968672645d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 25.57138483622782d);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.9891443947774783d, 1.3573856176314845d, (-240026100));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-291941475), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-0.9412089142041425d), 0.5210953054937474d, 0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test179() {}
//   public void test179() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { 0.0d};
//     double[] var4 = new double[] { 100.0d};
//     boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
//     double var6 = org.apache.commons.math.util.MathUtils.distance1(var0, var2);
// 
//   }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1000573857));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-0.14695139943744212d), 0.7509655283160555d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.1932414450926745d));

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.9697850179455104d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9697850179455104d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(9.765621895592899E-4d, 59.517686583057106d, 951780243);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1997450891849582299L), 299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-925632413942248003L));

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (-1338502686));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1338502686));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.220446049250313E-16d, (-0.9555128079474305d), 0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


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
    double[] var36 = new double[] { 100.0d};
    boolean var37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var36);
    double[] var39 = new double[] { 0.0d};
    double[] var41 = new double[] { 100.0d};
    boolean var42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var41);
    double var43 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var39);
    double[] var45 = new double[] { 0.0d};
    double[] var47 = new double[] { 100.0d};
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var47);
    double[] var50 = new double[] { 0.0d};
    double[] var52 = new double[] { 100.0d};
    boolean var53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var52);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var47, var50);
    double[] var56 = new double[] { 0.0d};
    double[] var58 = new double[] { 100.0d};
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var56, var58);
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 1.0239010128918022d);
    double var62 = org.apache.commons.math.util.MathUtils.distance1(var47, var61);
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var61);
    double[] var65 = new double[] { 0.0d};
    double var66 = org.apache.commons.math.util.MathUtils.safeNorm(var65);
    double[] var68 = new double[] { 0.0d};
    double[] var70 = new double[] { 100.0d};
    boolean var71 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var68, var70);
    boolean var72 = org.apache.commons.math.util.MathUtils.equals(var65, var68);
    boolean var73 = org.apache.commons.math.util.MathUtils.equals(var36, var65);
    boolean var74 = org.apache.commons.math.util.MathUtils.equals(var3, var36);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 98.9760989871082d);
    
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
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(1.7310309456440016E13d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1L), (-1997450891849582299L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1997450891849582300L));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.087077848795329E30d, 1079574559);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-1000573857), (-5L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (-1000573857));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test193() {}
//   public void test193() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }
// 
// 
//     double[] var1 = new double[] { 0.0d};
//     double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     double[] var4 = new double[] { 0.0d};
//     double[] var6 = new double[] { 100.0d};
//     boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
//     boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
//     double[] var10 = new double[] { 0.0d};
//     double[] var12 = new double[] { 100.0d};
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
//     double[] var15 = null;
//     double var16 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var15);
// 
//   }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 1532522787, (-1000573857));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (-10));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, (-0.9412089142041425d), (-1442072980));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh((-1.5707963267948966d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5091784786580567d);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb((-0.9412089142041425d), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-963.797928145042d));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.009949513583114137d), 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.009949513583114137d));

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(66.93522156958998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 66.93522156958998d);

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
//     java.math.BigInteger var5 = null;
//     java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var2, var5);
// 
//   }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0013201176315390667d, 104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.2579263668834097E-5d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.479425538604203d, (-0.14695139943744212d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.479425538604203d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


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
    double[] var63 = new double[] { 0.0d};
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    double[] var66 = new double[] { 0.0d};
    double[] var68 = new double[] { 100.0d};
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var66, var68);
    boolean var70 = org.apache.commons.math.util.MathUtils.equals(var63, var66);
    boolean var71 = org.apache.commons.math.util.MathUtils.equals(var34, var63);
    double[] var73 = new double[] { 0.0d};
    double var74 = org.apache.commons.math.util.MathUtils.safeNorm(var73);
    double[] var76 = new double[] { 0.0d};
    double[] var78 = new double[] { 100.0d};
    boolean var79 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var76, var78);
    boolean var80 = org.apache.commons.math.util.MathUtils.equals(var73, var76);
    double[] var82 = new double[] { 0.0d};
    double[] var84 = new double[] { 100.0d};
    boolean var85 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var82, var84);
    double var86 = org.apache.commons.math.util.MathUtils.distance(var76, var84);
    double[] var88 = org.apache.commons.math.util.MathUtils.normalizeArray(var84, 0.8575532158463934d);
    double[] var90 = org.apache.commons.math.util.MathUtils.normalizeArray(var84, 0.6480542736638855d);
    double[] var92 = org.apache.commons.math.util.MathUtils.normalizeArray(var84, 1.0239010128918025d);
    boolean var93 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var63, var92);
    boolean var94 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var92);
    org.apache.commons.math.util.MathUtils.checkOrder(var92);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.2545069915963656d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 71.87795598812558d);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(71.87795598812558d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 71.87795598812559d);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    int var1 = org.apache.commons.math.util.FastMath.round(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.2128331401446932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.021167931572826714d);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.07570930918522539d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0028673189548942d);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    float var2 = org.apache.commons.math.util.FastMath.max(100.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1((-0.14748086636738275d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.13712105182778433d));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.7840341610578332d, 0.4229072086738532d, 1862915923);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.4932167668855039d, 1532522787);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.9623052700725608E87d);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)3.16227766016838d, (java.lang.Number)2.0886708959722813d, 1532522787, var3, false);
    java.lang.String var6 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,532,522,786 and 1,532,522,787 are not decreasing (2.089 < 3.162)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,532,522,786 and 1,532,522,787 are not decreasing (2.089 < 3.162)"));

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1862915923), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1862915913));

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1774819148, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1774819148);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(240026100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8981735759070244d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-925632413942248003L), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-925632413942248003L), 300L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-925632413942248003L));

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9287285890885333d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(900000L, 5L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900000L);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.000441095849621d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7856186626880235d);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-89L), 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-89L));

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.5707963267948966d, 630999.4197775752d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(9.765621895592307E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.76562034338957E-4d);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.1241171695718353d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0878314150298527d);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.4840480658487383d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3947735336066061d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh((-0.9555128079474305d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4923092020050719d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(3.1622776601683795d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2645189576252271d);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-3.193181872794057d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.440892098500626E-16d);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.5612677191481816d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 104.94395111059633d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.9623052700725608E87d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.424868789200273E85d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(364L, 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-636L));

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.7509655283160555d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2954778583706679d);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0028673189548942d, 9.765623447795783E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    int var1 = org.apache.commons.math.util.FastMath.round(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.String var11 = var5.toString();
    
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
    assertTrue("'" + var11 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var11.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(181800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-925632413942248003L), (-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4628162069711240015L);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.0028673189548942d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07570930918522556d);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.4229072086738532d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 600L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0239010128918022d, 0.0d, 1.055287372175112d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(299L, 1338502676);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8627737931242410865L);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(31, 1532522787);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-3L), (-5L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Double.NEGATIVE_INFINITY, 15.104412573075516d, (-0.6953039533394731d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(100, 91L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 3.552713678800501E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    int[] var3 = new int[] { 100, 100, 0};
    int[] var7 = new int[] { 10, 0, 1};
    int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    int[] var12 = new int[] { 100, 100, 0};
    int[] var16 = new int[] { 10, 0, 1};
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    int[] var21 = new int[] { 100, 100, 0};
    int[] var25 = new int[] { 10, 0, 1};
    int var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
    int var27 = org.apache.commons.math.util.MathUtils.distance1(var16, var25);
    int[] var31 = new int[] { 100, 100, 0};
    int[] var35 = new int[] { 10, 0, 1};
    int var36 = org.apache.commons.math.util.MathUtils.distance1(var31, var35);
    int[] var40 = new int[] { 100, 100, 0};
    int[] var44 = new int[] { 10, 0, 1};
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var40, var44);
    int var46 = org.apache.commons.math.util.MathUtils.distance1(var35, var44);
    double var47 = org.apache.commons.math.util.MathUtils.distance(var25, var44);
    int var48 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var25);
    int[] var52 = new int[] { 100, 100, 0};
    int[] var56 = new int[] { 10, 0, 1};
    int var57 = org.apache.commons.math.util.MathUtils.distance1(var52, var56);
    int[] var61 = new int[] { 0, 100, 100};
    int var62 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var61);
    int var63 = org.apache.commons.math.util.MathUtils.distanceInf(var25, var61);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 100);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(5L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5L);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-892927039), 9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1102230246251565E-16d, Double.NEGATIVE_INFINITY, 0);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.168240001941272d, 0.9999995231628797d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(3.552713678800501E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.552713678800501E-15d);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var11 = new double[] { 100.0d, 0.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance(var1, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var11);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
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

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(10L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(2L, 364L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(66.93522156958998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1738088312590378E29d);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1442072980));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1442072980);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(66.93522156958998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.89681668580424d);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.1641532182693481E-10d, 1150131604);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.0870778487953289E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9542985177860862d);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 90L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-1.8701991114558751d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.2395798055406466d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    boolean var4 = var3.getStrict();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1338502675), 209066259);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 209066259);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-8.419694981306574d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2267.7598026864775d));

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    boolean var6 = var5.getStrict();
    java.lang.Number var7 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.1752011936438014d+ "'", var7.equals(1.1752011936438014d));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(240026100, (-1862915923));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    double var1 = org.apache.commons.math.util.FastMath.log(52.47197555529855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.9602792281295054d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    long var2 = org.apache.commons.math.util.FastMath.min(91L, 303L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 91L);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    java.lang.Number var9 = var5.getPrevious();
    boolean var10 = var5.getStrict();
    java.lang.Number var11 = var5.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var12 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1.1752011936438014d+ "'", var9.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 1.1752011936438014d+ "'", var11.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.3043457015073627d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.672649861992869d);

  }

  public void test284() {}
//   public void test284() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round((-1.0f), (-1442072880));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.149548905166106d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.020063413307844603d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1532522787, 100);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.013292325585375278d, 1.2128331401446932d, 2.5380419587163434d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(7.207385928451561E-4d, 1.2645189576252271d, 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-0.6953039533394731d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6075672970622579d));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(67.3340684745264d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2086296610167463d));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1150131505), (-291941475));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    double var2 = org.apache.commons.math.util.FastMath.max(59.517686583057106d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 59.517686583057106d);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 0.0d, 1150131505);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(100, 1442072990);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1442073090);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.9623052700725608E87d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.34607319064430053d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(362880L, 301L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 363181L);

  }

  public void test297() {}
//   public void test297() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-1.5574077246549023d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.8575532158463934d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.030494020926757d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.4989227756918429d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.021167931572826714d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(9.765621895592899E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765625000000295E-4d);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var10, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var10, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var14.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test304() {}
//   public void test304() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(3.9602792281295054d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1338502686), (-1800407107));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


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
    java.math.BigInteger var34 = org.apache.commons.math.util.MathUtils.pow(var4, 10L);
    
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

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 9.76562034338957E-4d, 1150131604);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1000573857));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(9.765625E-4d, (-1150131505), (-1338502686));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8144772166995121d);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.479425538604203d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7351666863853142d));

  }

  public void test313() {}
//   public void test313() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }
// 
// 
//     double[] var1 = new double[] { 0.0d};
//     double[] var3 = new double[] { 100.0d};
//     boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
//     double[] var6 = new double[] { 0.0d};
//     double[] var8 = new double[] { 100.0d};
//     boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var8);
//     double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var6);
//     double[] var11 = new double[] { };
//     double[] var15 = new double[] { 0.0d, 10.0d, 0.0d};
//     double[] var16 = null;
//     boolean var17 = org.apache.commons.math.util.MathUtils.equals(var15, var16);
//     boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var15);
//     boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var15);
//     double[] var20 = null;
//     double var21 = org.apache.commons.math.util.MathUtils.distance(var15, var20);
// 
//   }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.9756549932711598d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8280692718912938d);

  }

  public void test315() {}
//   public void test315() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }
// 
// 
//     float var1 = org.apache.commons.math.util.MathUtils.sign(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.615354633267934E7d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-636L), (-1997450891849582299L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1997450891849582935L));

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    double var2 = org.apache.commons.math.util.FastMath.max(67.3340684745264d, 1.9623052700725608E87d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.9623052700725608E87d);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.087077848795329E30d, (java.lang.Number)1.5612677191481816d, (-1));
    int var4 = var3.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(100.4987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7540341900446972d);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(1.5612677191481816d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(364L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 364L);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(303L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 303L);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }


    double var1 = org.apache.commons.math.util.FastMath.acos((-0.6075672970622579d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2237904935504273d);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.14695139943744212d), 0.9697850179455104d, 1.4931702671658056d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)0.9999995231628797d, (-1338502676));

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1442072881), 1442072980);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072881));

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test331() {}
//   public void test331() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin((-963.797928145042d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(1000L, 90L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9000L);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.6075672970622579d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6075672970622578d));

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1442072990), 1150131505);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    java.lang.String var8 = var5.toString();
    java.lang.Number var9 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"+ "'", var8.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not strictly decreasing (1 <= 0)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0L+ "'", var9.equals(0L));

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }


    int[] var3 = new int[] { 100, 100, 0};
    int[] var7 = new int[] { 10, 0, 1};
    int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    int[] var12 = new int[] { 100, 100, 0};
    int[] var16 = new int[] { 10, 0, 1};
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    int[] var21 = new int[] { 100, 100, 0};
    int[] var25 = new int[] { 10, 0, 1};
    int var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
    int[] var30 = new int[] { 100, 100, 0};
    int[] var34 = new int[] { 10, 0, 1};
    int var35 = org.apache.commons.math.util.MathUtils.distance1(var30, var34);
    int var36 = org.apache.commons.math.util.MathUtils.distance1(var25, var34);
    int[] var40 = new int[] { 100, 100, 0};
    int[] var44 = new int[] { 10, 0, 1};
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var40, var44);
    int[] var49 = new int[] { 100, 100, 0};
    int[] var53 = new int[] { 10, 0, 1};
    int var54 = org.apache.commons.math.util.MathUtils.distance1(var49, var53);
    int var55 = org.apache.commons.math.util.MathUtils.distance1(var44, var53);
    double var56 = org.apache.commons.math.util.MathUtils.distance(var34, var53);
    int var57 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var34);
    double var58 = org.apache.commons.math.util.MathUtils.distance(var7, var12);
    int[] var62 = new int[] { 100, 100, 0};
    int[] var66 = new int[] { 10, 0, 1};
    int var67 = org.apache.commons.math.util.MathUtils.distance1(var62, var66);
    int[] var71 = new int[] { 100, 100, 0};
    int[] var75 = new int[] { 10, 0, 1};
    int var76 = org.apache.commons.math.util.MathUtils.distance1(var71, var75);
    int var77 = org.apache.commons.math.util.MathUtils.distance1(var66, var75);
    int var78 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var75);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 134.5399568901373d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.2954778583706679d, (-1862915913));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1200L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.8144772166995121d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.8657694832396586d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(1.055287372175112d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2623541086902015d);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(2.372549507764957d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.372549507764957d);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1000573857, 951780243);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1952354100);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.0013201176315390667d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0013201168646786218d);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    java.lang.Number var9 = var5.getPrevious();
    boolean var10 = var5.getStrict();
    java.lang.Throwable[] var11 = var5.getSuppressed();
    java.lang.Throwable[] var12 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1.1752011936438014d+ "'", var9.equals(1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    int var2 = org.apache.commons.math.util.FastMath.max(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0239010128918027d, 5.8645326993401346E-15d, 0.37623361672720984d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.07570930918522556d, 23.624342922017807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.316181620061848E-27d);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


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
    java.lang.Number var26 = var5.getArgument();
    java.lang.Number var27 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var27, (java.lang.Number)15.104412573075516d, (-1442072990), var30, false);
    var5.addSuppressed((java.lang.Throwable)var32);
    int var34 = var5.getIndex();
    
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
    assertTrue("'" + var26 + "' != '" + 0.9067427790689399d+ "'", var26.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    double[] var9 = new double[] { 0.0d};
    double[] var11 = new double[] { 100.0d};
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var9, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var9);
    double[] var15 = new double[] { 0.0d};
    double[] var17 = new double[] { 100.0d};
    boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var15, var17);
    double[] var20 = new double[] { 0.0d};
    double[] var22 = new double[] { 100.0d};
    boolean var23 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var20);
    double[] var26 = new double[] { 0.0d};
    double[] var28 = new double[] { 100.0d};
    boolean var29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var28);
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var28, 1.0239010128918022d);
    double var32 = org.apache.commons.math.util.MathUtils.distance1(var17, var31);
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var31);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var1, var6);
    int var35 = org.apache.commons.math.util.MathUtils.hash(var1);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 31);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1338502686));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(4.440892098500626E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(2009326299, 1774819148);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(90L, 1338502676);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.4932167668855039d, (-1442072980), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(4.89681668580424d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.18338397434640138d);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.087077848795329E30d, (java.lang.Number)0L, 100, var3, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }
// 
// 
//     double[] var1 = new double[] { 0.0d};
//     double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     double[] var4 = new double[] { 0.0d};
//     double[] var6 = new double[] { 100.0d};
//     boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
//     boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
//     double[] var10 = new double[] { 0.0d};
//     double[] var12 = new double[] { 100.0d};
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distance(var4, var12);
//     org.apache.commons.math.util.MathUtils.checkOrder(var4);
//     double[] var16 = null;
//     boolean var17 = org.apache.commons.math.util.MathUtils.equals(var4, var16);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
//     org.apache.commons.math.util.MathUtils.OrderDirection var31 = var30.getDirection();
//     org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var31, false);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var35 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var31, true);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var37 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9557502835537018d, (java.lang.Number)1.7840341610578332d, (-240026100), var31, true);
//     org.apache.commons.math.util.MathUtils.checkOrder(var16, var31, true);
// 
//   }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb((-0.9555128079474305d), 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6.056281922601606E29d));

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1150131505), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1150131505));

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(4628162069711240015L, 900000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4628162069712140015L);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(2.0886708959722813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.03645418412529628d);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


    long var2 = org.apache.commons.math.util.FastMath.min(4628162069711240015L, 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900L);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test368"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)104.9439511105971d, (java.lang.Number)951780243, (-10));
    java.lang.Number var4 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 951780243+ "'", var4.equals(951780243));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test369"); }


    double[] var0 = new double[] { };
    double[] var4 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var4, var5);
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var4);
    double[] var10 = new double[] { 0.0d};
    double[] var12 = new double[] { 100.0d};
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
    double[] var15 = new double[] { 0.0d};
    double[] var17 = new double[] { 100.0d};
    boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var15, var17);
    double var19 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var15);
    double[] var21 = new double[] { 0.0d};
    double[] var23 = new double[] { 100.0d};
    boolean var24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var23);
    double[] var26 = new double[] { 0.0d};
    double[] var28 = new double[] { 100.0d};
    boolean var29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var28);
    double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var26);
    double[] var32 = new double[] { 0.0d};
    double[] var34 = new double[] { 100.0d};
    boolean var35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var34);
    double[] var37 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, 1.0239010128918022d);
    double var38 = org.apache.commons.math.util.MathUtils.distance1(var23, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var37);
    double[] var41 = new double[] { 0.0d};
    double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var41);
    double[] var44 = new double[] { 0.0d};
    double[] var46 = new double[] { 100.0d};
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var44, var46);
    boolean var48 = org.apache.commons.math.util.MathUtils.equals(var41, var44);
    boolean var49 = org.apache.commons.math.util.MathUtils.equals(var12, var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var50 = org.apache.commons.math.util.MathUtils.distance1(var4, var41);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test370"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, 90L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-89L));

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test371"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.6104464895571766d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-25.207359322172668d));

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test372"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1997450891849582935L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1997450891849582935L));

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test373"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.2545069915963656d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test374"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-1997450891849582299L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1997450891849582299L);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test375"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1442072980);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1442072980);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test376"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(630998.4197775758d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 630998.4197775758d);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test377"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    java.lang.Number var5 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + Double.POSITIVE_INFINITY+ "'", var5.equals(Double.POSITIVE_INFINITY));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test378"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test379"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(9.765623447795783E-4d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.765623447795783E-4d);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test380"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1442073090, (-1000573857));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test381"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1442072881));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1442072881);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test382"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1952354100, (-3L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test383"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(2.0879311127268826E215d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 495.7919686712069d);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test384"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test385"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.020063413307844603d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.6975951802558271d));

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test386"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(100.0f, (-1338502686), (-1442072881));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test387"); }


    double var1 = org.apache.commons.math.util.FastMath.log(5.8645326993401346E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-32.7698535921364d));

  }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test388"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.2128331401446932d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test389"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1000573857), 301L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1122853665));

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test390"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test391"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.9540432297515553d, 0.44630485968672645d, 1.3573856176314845d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test392() {}
//   public void test392() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test392"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
//     org.apache.commons.math.util.MathUtils.OrderDirection var8 = var7.getDirection();
//     org.apache.commons.math.exception.NonMonotonousSequenceException var10 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var8, false);
//     org.apache.commons.math.util.MathUtils.checkOrder(var0, var8, true);
// 
//   }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test393"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.3573856176314845d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3573856176314845d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test394"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1997450891849582299L, 90L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test395"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(3.424868789200273E85d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test396"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, (-1338502676), 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test397"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(91L, 1338502676);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8305579194716910415L));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test398"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.1909687824216308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.190968782421631d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test399"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-892927039), 209066259);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-892927039));

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test400"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(1000L, (-925632413942248003L));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test401"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    int var6 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = var5.getDirection();
    boolean var9 = var5.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test402"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(900);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test403() {}
//   public void test403() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test403"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(Float.NaN, 1442073090);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test404"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(7.481044921481109E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test405"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    boolean var4 = var3.getStrict();
    int var5 = var3.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1079574559);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test406"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 2.0879311127268826E215d, 3.424868789200273E85d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test407"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.44630485968672645d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2110066489);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test408"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1150131604, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1150131604);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test409"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(0.0d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test410"); }


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
    org.apache.commons.math.util.MathUtils.checkOrder(var55);
    
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

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test411"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07011222389235412d);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test412"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1442072881, (-1000573857));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1442072881);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test413"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.8973087686975562E28d, 630999.4197775752d, 0.31326168751822286d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test414"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(3.16227766016838d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2645189576252271d);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test415"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(209066259, 1150131604);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test416"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(2.5380419587163434d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6893620967346501d));

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test417"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (-1442072990), 1952354100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test418"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.14695139943744212d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test419"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.021167931572826714d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test420"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5430806348152437d);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test421"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test422"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(7.207385928451561E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test423"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(363.7393755555636d, 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.811243611393037E11d);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test424"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.6104464895571766d, 0.9540432297515553d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0359770329454867d);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test425"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.4923092020050719d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.4473535081991327d);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test426"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1150131604, (-1338502686));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test427"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1338502676, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test428"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1997450891849582935L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test429() {}
//   public void test429() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test429"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = org.apache.commons.math.util.MathUtils.normalizeArray(var0, (-0.2086296610167463d));
// 
//   }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test430"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(1774819148);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test431"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(9.77039337044457E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.7703918159661E-4d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test432"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 301L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test433"); }


    double[] var0 = null;
    double[] var2 = new double[] { 0.0d};
    double[] var4 = new double[] { 100.0d};
    boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var0, var2);
    double[] var8 = new double[] { 0.0d};
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var11 = new double[] { 0.0d};
    double[] var13 = new double[] { 100.0d};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var13);
    double[] var16 = new double[] { 0.0d};
    double[] var18 = new double[] { 100.0d};
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var18);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var16);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    double[] var27 = new double[] { 0.0d};
    double[] var29 = new double[] { 100.0d};
    boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var29);
    double var31 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var27);
    double[] var33 = new double[] { 0.0d};
    double[] var35 = new double[] { 100.0d};
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var33, var35);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var35, 1.0239010128918022d);
    double var39 = org.apache.commons.math.util.MathUtils.distance1(var24, var38);
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var38);
    boolean var41 = org.apache.commons.math.util.MathUtils.equals(var8, var13);
    boolean var42 = org.apache.commons.math.util.MathUtils.equals(var2, var8);
    double[] var44 = new double[] { 0.0d};
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double[] var47 = new double[] { 0.0d};
    double[] var49 = new double[] { 100.0d};
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var47, var49);
    boolean var51 = org.apache.commons.math.util.MathUtils.equals(var44, var47);
    double[] var53 = new double[] { 0.0d};
    double[] var55 = new double[] { 100.0d};
    boolean var56 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var53, var55);
    double var57 = org.apache.commons.math.util.MathUtils.distance(var47, var55);
    double[] var59 = org.apache.commons.math.util.MathUtils.normalizeArray(var55, 0.8575532158463934d);
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var55, 0.6480542736638855d);
    double[] var63 = org.apache.commons.math.util.MathUtils.normalizeArray(var55, 1.0239010128918025d);
    boolean var64 = org.apache.commons.math.util.MathUtils.equals(var8, var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test434"); }


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
    double[] var22 = new double[] { 100.0d};
    boolean var23 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var22);
    double[] var25 = new double[] { 0.0d};
    double[] var27 = new double[] { 100.0d};
    boolean var28 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var27);
    double var29 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var25);
    double[] var31 = new double[] { 0.0d};
    double[] var33 = new double[] { 100.0d};
    boolean var34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var31, var33);
    double[] var36 = new double[] { 0.0d};
    double[] var38 = new double[] { 100.0d};
    boolean var39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var38);
    double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var36);
    double[] var42 = new double[] { 0.0d};
    double[] var44 = new double[] { 100.0d};
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var44);
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, 1.0239010128918022d);
    double var48 = org.apache.commons.math.util.MathUtils.distance1(var33, var47);
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var47);
    double[] var51 = new double[] { 0.0d};
    double var52 = org.apache.commons.math.util.MathUtils.safeNorm(var51);
    double[] var54 = new double[] { 0.0d};
    double[] var56 = new double[] { 100.0d};
    boolean var57 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var54, var56);
    boolean var58 = org.apache.commons.math.util.MathUtils.equals(var51, var54);
    boolean var59 = org.apache.commons.math.util.MathUtils.equals(var22, var51);
    org.apache.commons.math.util.MathUtils.OrderDirection var60 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var51, var60, false);
    double var63 = org.apache.commons.math.util.MathUtils.distance1(var17, var51);
    double[] var65 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 4.89681668580424d);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
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
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1.0239010128918022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test435"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-5L), 91L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test436"); }


    int var2 = org.apache.commons.math.util.FastMath.min(99, (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-10));

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test437"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.14748086636738275d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5283380553964488d));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test438"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(1.0f, 0, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test439"); }


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
    java.lang.Number var26 = var18.getPrevious();
    
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
    assertTrue("'" + var26 + "' != '" + 1.1752011936438014d+ "'", var26.equals(1.1752011936438014d));

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test440"); }


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
    java.math.BigInteger var25 = org.apache.commons.math.util.MathUtils.pow(var19, var22);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var19, 364L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var19, 1532522787);
    java.math.BigInteger var30 = null;
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var30, 0L);
    java.math.BigInteger var34 = org.apache.commons.math.util.MathUtils.pow(var32, 0);
    java.math.BigInteger var35 = null;
    java.math.BigInteger var37 = org.apache.commons.math.util.MathUtils.pow(var35, 0L);
    java.math.BigInteger var39 = org.apache.commons.math.util.MathUtils.pow(var37, 0);
    java.math.BigInteger var40 = null;
    java.math.BigInteger var42 = org.apache.commons.math.util.MathUtils.pow(var40, 0L);
    java.math.BigInteger var44 = org.apache.commons.math.util.MathUtils.pow(var42, 0);
    java.math.BigInteger var45 = org.apache.commons.math.util.MathUtils.pow(var39, var42);
    java.math.BigInteger var46 = org.apache.commons.math.util.MathUtils.pow(var32, var42);
    java.math.BigInteger var47 = org.apache.commons.math.util.MathUtils.pow(var19, var46);
    java.math.BigInteger var48 = org.apache.commons.math.util.MathUtils.pow(var14, var19);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
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

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test441"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2204460492503128E-16d);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test442"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var3, true);
    boolean var6 = var5.getStrict();
    java.lang.Number var7 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)1+ "'", var7.equals((byte)1));

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test443"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.0239010128918022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5716125779527041d);

  }

  public void test444() {}
//   public void test444() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test444"); }
// 
// 
//     int[] var0 = null;
//     int[] var4 = new int[] { 100, 100, 0};
//     int[] var8 = new int[] { 10, 0, 1};
//     int var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var8);
//     int[] var13 = new int[] { 100, 100, 0};
//     int[] var17 = new int[] { 10, 0, 1};
//     int var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var17);
//     int var19 = org.apache.commons.math.util.MathUtils.distance1(var8, var17);
//     int[] var23 = new int[] { 100, 100, 0};
//     int[] var27 = new int[] { 10, 0, 1};
//     int var28 = org.apache.commons.math.util.MathUtils.distance1(var23, var27);
//     int[] var32 = new int[] { 100, 100, 0};
//     int[] var36 = new int[] { 10, 0, 1};
//     int var37 = org.apache.commons.math.util.MathUtils.distance1(var32, var36);
//     int[] var41 = new int[] { 100, 100, 0};
//     int[] var45 = new int[] { 10, 0, 1};
//     int var46 = org.apache.commons.math.util.MathUtils.distance1(var41, var45);
//     int var47 = org.apache.commons.math.util.MathUtils.distance1(var36, var45);
//     int[] var51 = new int[] { 100, 100, 0};
//     int[] var55 = new int[] { 10, 0, 1};
//     int var56 = org.apache.commons.math.util.MathUtils.distance1(var51, var55);
//     int[] var60 = new int[] { 100, 100, 0};
//     int[] var64 = new int[] { 10, 0, 1};
//     int var65 = org.apache.commons.math.util.MathUtils.distance1(var60, var64);
//     int var66 = org.apache.commons.math.util.MathUtils.distance1(var55, var64);
//     double var67 = org.apache.commons.math.util.MathUtils.distance(var45, var64);
//     int var68 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var45);
//     int var69 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var23);
//     double var70 = org.apache.commons.math.util.MathUtils.distance(var0, var23);
// 
//   }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test445"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.0239010128918027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 58.66520667787039d);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test446"); }


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
    int var42 = var5.getIndex();
    
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
    assertTrue(var42 == 100);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test447"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-0.9555128079474305d), (java.lang.Number)1.7840341610578332d, 1000573857);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test448"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.7310309456440016E13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.6033217300118383d));

  }

  public void test449() {}
//   public void test449() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test449"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.168240001941272d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test450"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var10, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8280692718912938d, (java.lang.Number)90L, 1, var10, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test451"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1442072881, (-1338502686));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 103570195);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test452"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1442072980), 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072789));

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test453"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 2110066489);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test454"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test455"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.07570930918522556d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test456"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.5210953054937474d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.28308283934013667d));

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test457"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test458"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test459"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.2623541086902015d, (-1.2023733333156474d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.2623541086902015d);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test460"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-2.6033217300118383d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.717254013985337d));

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test461"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.8657694832396586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test462"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.626860407847019d);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test463"); }


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
    int[] var70 = new int[] { 0, 100, 100};
    int var71 = org.apache.commons.math.util.MathUtils.distanceInf(var65, var70);
    int var72 = org.apache.commons.math.util.MathUtils.distance1(var50, var70);
    
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
    assertTrue(var71 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 209);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test464"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8541431904542547d);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test465"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.4932167668855039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8808144024434078d);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test466"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.8808144024434078d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test467"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test468"); }


    double var1 = org.apache.commons.math.util.FastMath.acos((-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.198408826999716d);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test469"); }


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
    int var33 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var30);
    int[] var36 = new int[] { 0, 100};
    int[] var40 = new int[] { 100, 100, 0};
    int[] var44 = new int[] { 10, 0, 1};
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var40, var44);
    int[] var49 = new int[] { 100, 100, 0};
    int[] var53 = new int[] { 10, 0, 1};
    int var54 = org.apache.commons.math.util.MathUtils.distance1(var49, var53);
    int var55 = org.apache.commons.math.util.MathUtils.distance1(var44, var53);
    int[] var59 = new int[] { 100, 100, 0};
    int[] var63 = new int[] { 10, 0, 1};
    int var64 = org.apache.commons.math.util.MathUtils.distance1(var59, var63);
    int[] var68 = new int[] { 100, 100, 0};
    int[] var72 = new int[] { 10, 0, 1};
    int var73 = org.apache.commons.math.util.MathUtils.distance1(var68, var72);
    int var74 = org.apache.commons.math.util.MathUtils.distance1(var63, var72);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var53, var72);
    double var76 = org.apache.commons.math.util.MathUtils.distance(var36, var72);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var77 = org.apache.commons.math.util.MathUtils.distance1(var30, var36);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var33 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 100.4987562112089d);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test470"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.7840341610578332d, 2.220446049250313E-16d, (-1338502686));

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test471"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test472"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-0.9412089142041425d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8391851574885061d));

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test473"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.9623052700725608E87d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9623052700725608E87d);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test474"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.8808144024434078d, (-0.14695139943744212d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8808144024434078d);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test475"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1862915913), (-1442072980));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test476"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.149548905166106d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7367741106353956d);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test477"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.1738088312590378E29d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 66.93522156958998d);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test478"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.672649861992869d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test479"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.44630485968672645d, 104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.004252766970684236d);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test480"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(364L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 364L);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test481"); }


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
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 1.0239010128918025d);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var61);
    double[] var64 = new double[] { 0.0d};
    double var65 = org.apache.commons.math.util.MathUtils.safeNorm(var64);
    int var66 = org.apache.commons.math.util.MathUtils.hash(var64);
    double var67 = org.apache.commons.math.util.MathUtils.distance1(var61, var64);
    int var68 = org.apache.commons.math.util.MathUtils.hash(var64);
    
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
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 31);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test482"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test483"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.7509655283160555d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6357246196688172d);

  }

  public void test484() {}
//   public void test484() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test484"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = null;
//     double[] var3 = new double[] { 0.0d};
//     double[] var5 = new double[] { 100.0d};
//     boolean var6 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var5);
//     boolean var7 = org.apache.commons.math.util.MathUtils.equals(var1, var3);
//     double var8 = org.apache.commons.math.util.MathUtils.distance1(var0, var1);
// 
//   }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test485"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.5707963267948968d, 2.2204460492503128E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948968d);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test486"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test487"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(15.104412573075516d, 0.9540432297515553d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5380419587163434d);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test488"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.9623052700725608E87d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2085588309729804E71d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test489"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    int var11 = var5.getIndex();
    java.lang.Number var12 = var5.getArgument();
    
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
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0.9067427790689399d+ "'", var12.equals(0.9067427790689399d));

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test490"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(9.77039337044457E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test491"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.8808144024434078d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4128639487622443d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test492"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-2.8628976317751614E-92d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-3.0591582231017654E-31d));

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test493"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-2.833489212424966E38d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test494"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-1.0d), 0.705026843555238d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.705026843555238d);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test495"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.0d, 0.9557502835537018d, (-32.7698535921364d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test496"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(1.1241171695718353d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test497"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test498"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-32.7698535921364d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.540289941871101d));

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test499"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(104.9439511105971d, 4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test500"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-10), 1150131604);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1150131614));

  }

}
