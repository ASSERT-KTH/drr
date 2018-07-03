
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     int[] var0 = null;
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var0);
//     
//     // Checks the contract:  var1.equals(var1)
//     assertTrue("Contract failed: var1.equals(var1)", var1.equals(var1));
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1), 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(0.0d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4E-45f);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1079574528);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080678E43d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4E-45f);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-1.0d), Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.0f, 10.0f, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test19() {}
//   public void test19() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 10);
// 
//   }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1), 1079574528);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8414709848078965d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-127));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.000001f);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-127), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 127);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.00000000000001d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    org.apache.commons.math.util.MathUtils.checkFinite(0.0d);

  }

  public void test29() {}
//   public void test29() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(100.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(Double.NEGATIVE_INFINITY, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 1079574528);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sin(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1000L);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080678E43d);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-127), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(100.00000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080869E43d);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(100L, 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1000L);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(100.00000000000001d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.00000000000001d);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.718281828459045d);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.3440585709080869E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0d, 1.3440585709080869E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.0d, 100.00000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.3440585709080869E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.3440585709080869E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4758800785707605E27d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(101, 1079574528);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    float var2 = org.apache.commons.math.util.FastMath.min(10.000001f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)100.0f);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.apache.commons.math.exception.MathArithmeticException var0 = new org.apache.commons.math.exception.MathArithmeticException();

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.4758800785707605E27d, 100.00000000000001d, Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(1.4E-45f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3132616875182228d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101);

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(Double.NEGATIVE_INFINITY, (-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(2.4758800785707605E27d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.4758800785707605E27d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    double[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-127), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11013.232874703393d);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(1.3440585709080869E43d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3440585709080869E43d);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var3, true);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var5, var6, var8);
    var5.setContext("hi!", (java.lang.Object)1.4E-45f);
    java.lang.Number var13 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 101+ "'", var13.equals(101));

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    double[] var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var1 = null;
    double[] var5 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.0d);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.5707963267948966d);
    double[][] var10 = new double[][] { var7};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var0, var1, var10);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-100L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(0.0d, 0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8414709848078965d);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     java.util.Collection var2 = null;
//     java.util.List var5 = var1.cluster(var2, 127, 1079574528);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.5049299045672764d));

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.apache.commons.math.util.MathUtils.checkFinite((-1.0d));

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var1 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, var1);
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    long var1 = org.apache.commons.math.util.FastMath.round(2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3L);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1000L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1010L);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var3);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(101, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10100);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.4E-45f, 0);

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }
// 
// 
//     double var0 = org.apache.commons.math.util.FastMath.random();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == 0.6085980977425464d);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1920929E-7f);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(10.0f, 10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test96() {}
//   public void test96() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sinh(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(1010L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    double var2 = org.apache.commons.math.util.FastMath.IEEEremainder(100.00000000000001d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4210854715202004E-14d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


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

  public void test100() {}
//   public void test100() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 100);
// 
//   }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.6085980977425464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8378531015316315d);

  }

  public void test103() {}
//   public void test103() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(11013.232874703393d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 2.718281828459045d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var23, (-127));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(Double.NEGATIVE_INFINITY, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)1.0d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5872139151569291d));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.3132616875182228d, 10.0d, Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(100.00000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.8378531015316315d, Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-31.884770305757485d));

  }

  public void test115() {}
//   public void test115() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }
// 
// 
//     double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
//     double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
//     org.apache.commons.math.util.MathUtils.OrderDirection var8 = null;
//     double[] var12 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0d);
//     double[] var18 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 1.0d);
//     double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var20);
//     double[][] var22 = new double[][] { var14};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var7, var8, var22);
// 
//   }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 3L);
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.000001f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     int[] var2 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
//     java.util.Collection var4 = null;
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var5 = var3.centroidOf(var4);
// 
//   }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(0.0d, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round((-1.0f), 127);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(127, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0d);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-100L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.0d);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.5707963267948966d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 10100);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-2.5049299045672764d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.atan2(Double.NaN, 1.4210854715202004E-14d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-100L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-2.5049299045672764d), 0.6085980977425464d, 0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.8378531015316315d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2178264933584275d);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    double[] var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var1 = null;
    double[] var4 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var4);
    org.apache.commons.math.util.MathUtils.checkOrder(var4);
    double[][] var7 = new double[][] { var4};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var0, var1, var7);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.0d, 0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, 127);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    double var2 = org.apache.commons.math.util.FastMath.max(100.0d, 2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.4758800785707605E27d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.1920929E-7f, 10.000001f, 1072694209);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    org.apache.commons.math.exception.NullArgumentException var0 = new org.apache.commons.math.exception.NullArgumentException();
    double[] var5 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.0d);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.5707963267948966d);
    double[] var13 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 1.0d);
    double[] var19 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 1.0d);
    double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var21);
    double var23 = org.apache.commons.math.util.MathUtils.distance(var7, var21);
    double[] var25 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 2.718281828459045d);
    var0.setContext("(10,1)", (java.lang.Object)var7);
    java.lang.Object var28 = var0.getContext("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(101, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    double[] var2 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    org.apache.commons.math.util.MathUtils.checkOrder(var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var2);
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
    double[] var10 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.normalizeArray(var10, 1.0d);
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.5707963267948966d);
    double[] var18 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 1.0d);
    double[] var24 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.normalizeArray(var24, 1.0d);
    double var27 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var26);
    double var28 = org.apache.commons.math.util.MathUtils.distance(var12, var26);
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 2.718281828459045d);
    double[][] var31 = new double[][] { var30};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var2, var6, var31);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.max(1.4E-45f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10L);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1189396031849523d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 2.718281828459045d);
    double[] var26 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var26);
    org.apache.commons.math.util.MathUtils.checkOrder(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var29 = org.apache.commons.math.util.MathUtils.distance1(var5, var26);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.4E-45f, 100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-31.884770305757485d), 3.0d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1920929E-7f, 10.0f, 10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072694209, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkFinite(Double.POSITIVE_INFINITY);
      fail("Expected exception of type org.apache.commons.math.exception.NotFiniteNumberException");
    } catch (org.apache.commons.math.exception.NotFiniteNumberException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.3440585709080869E43d, 1072694209, 0);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.5872139151569291d), 2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.5872139151569291d));

  }

  public void test160() {}
//   public void test160() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(1.2178264933584275d, (-2.5049299045672764d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.8414709848078965d, 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8414709848078965d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.2178264933584275d, 0.0d, 0);

  }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy var1 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var2 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0, var1);
//     java.util.Collection var3 = null;
//     java.util.List var6 = var2.cluster(var3, 1079574528, 100);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.610125138662288d);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1), 127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { false};
    org.apache.commons.math.exception.NotFiniteNumberException var4 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, var3);
    org.apache.commons.math.exception.MathArithmeticException var5 = new org.apache.commons.math.exception.MathArithmeticException(var0, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.4210854715202004E-14d, 0.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.6085980977425464d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(100);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1079574528, (-127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8071997601754675d);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)0.0f, (-127), var3, true);
    java.lang.Object var7 = var5.getContext("(10,1)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.2178264933584275d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 69.77631824865468d);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.425947759839367E159d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1079574528, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0038848218538872d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.00000000000001d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1189396031849526d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(101, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.1189396031849523d, 1079574528, 1079574528);
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1189396031849526d, (-31.884770305757485d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(10L, 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1010L);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(101, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 201);

  }

  public void test195() {}
//   public void test195() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(100.00000000000001d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)(-1));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    float var3 = org.apache.commons.math.util.MathUtils.round(1.4E-45f, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0f);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    java.lang.Object var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var8 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var6, true);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    java.lang.Object[] var11 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var12 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var8, var9, var11);
    org.apache.commons.math.exception.NotFiniteNumberException var13 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkNotNull(var0, var1, var11);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1010L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(101, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5729.5779513082325d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(Double.NEGATIVE_INFINITY, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.7976931348623157E308d));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1048576));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    int[] var2 = new int[] { 0, 10};
    int[] var4 = new int[] { 100};
    int[] var8 = new int[] { (-1), 1, 1};
    int var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1079574528, (java.lang.Number)(byte)1, (-127), var3, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10100);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(7.610125138662288d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    int var1 = org.apache.commons.math.util.FastMath.round(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.copySign(Double.NaN, 1.3132616875182228d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    int[] var12 = new int[] { 100, 10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var12);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4E-45f);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6);

  }

  public void test216() {}
//   public void test216() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     java.util.Collection var2 = null;
//     java.util.List var5 = var1.cluster(var2, 0, 201);
// 
//   }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test218() {}
//   public void test218() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 1079574528);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1.3440585709080869E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-738962168));

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-2.5049299045672764d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.6490605123312343d));

  }

  public void test222() {}
//   public void test222() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }
// 
// 
//     org.apache.commons.math.exception.NullArgumentException var1 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var2 = new org.apache.commons.math.exception.NullArgumentException();
//     var1.addSuppressed((java.lang.Throwable)var2);
//     org.apache.commons.math.exception.util.Localizable var4 = null;
//     java.lang.Object[] var6 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var7 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var1, var4, var6);
//     org.apache.commons.math.exception.NotFiniteNumberException var8 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var6);
//     java.lang.Throwable var9 = null;
//     var8.addSuppressed(var9);
// 
//   }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(101, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6276125002048193d));

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.1189396031849526d, 2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1189396031849528d);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7509157763716767d);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0f, 1.4E-45f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     double[] var0 = null;
//     java.lang.Number var2 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var4 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var2, 101);
//     org.apache.commons.math.util.MathUtils.OrderDirection var5 = var4.getDirection();
//     org.apache.commons.math.util.MathUtils.checkOrder(var0, var5, false);
// 
//   }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.0f, 10.0f, 201);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-1.6490605123312343d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.5049299045672764d));

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent((-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-1048576), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1048576);

  }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }
// 
// 
//     float var1 = org.apache.commons.math.util.FastMath.nextUp(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    float var2 = org.apache.commons.math.util.FastMath.max(1.0f, 10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000001f);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11013.232920103324d);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.0f, 100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 171.88733853924697d);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     java.util.Collection var2 = null;
//     java.util.List var5 = var1.cluster(var2, 100, 6);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(69.77631824865468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2178264933584275d);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(Float.NaN, 10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy var1 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var2 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0, var1);
//     org.apache.commons.math.exception.NullArgumentException var4 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var5 = new org.apache.commons.math.exception.NullArgumentException();
//     var4.addSuppressed((java.lang.Throwable)var5);
//     org.apache.commons.math.exception.util.Localizable var7 = null;
//     java.lang.Object[] var9 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var10 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var4, var7, var9);
//     org.apache.commons.math.exception.NotFiniteNumberException var11 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var9);
//     java.util.Set var12 = var11.getContextKeys();
//     java.util.List var15 = var2.cluster((java.util.Collection)var12, (-127), (-738962168));
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }
// 
// 
//     double[] var0 = null;
//     double[] var4 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 1.0d);
//     double[] var10 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var12 = org.apache.commons.math.util.MathUtils.normalizeArray(var10, 1.0d);
//     double var13 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var12);
//     double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, (-2.5049299045672764d));
//     double var16 = org.apache.commons.math.util.MathUtils.distance1(var0, var15);
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(1010L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1010L);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1048576), 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test248() {}
//   public void test248() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, (-738962168));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Double.NaN, 69.77631824865468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.3132616875182228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0d);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1.0f), (java.lang.Number)100L, 1079574528);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(171.88733853924697d, 171.88733853924697d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 171.88733853924697d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.1189396031849528d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04880664532067082d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, Float.NaN, (-127));

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(10.000001f, 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.718281828459045d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.718281828459045d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1048576, 100);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(0.04880664532067082d, 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4711276743037347d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-0.6276125002048193d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test267() {}
//   public void test267() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }
// 
// 
//     org.apache.commons.math.exception.ConvergenceException var0 = new org.apache.commons.math.exception.ConvergenceException();
//     java.lang.String var1 = var0.toString();
// 
//   }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.8071997601754675d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8071997601754676d);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 201);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(5729.5779513082325d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8203867151263053d));

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm((-1L), (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.4758800785707605E27d, 1.4711276743037347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(1.1920929E-7f, 1, (-738962168));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-1L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    java.lang.Number var12 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var12, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var14.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var15, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var20 = org.apache.commons.math.util.MathUtils.checkOrder(var5, var15, false, true);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(1.1189396031849528d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3674899999943206d);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(Double.NaN, (-1.0d), 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.6085980977425464d, 1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 1.1189396031849528d, 1.2178264933584275d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    org.apache.commons.math.stat.clustering.Cluster var4 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var3);
    org.apache.commons.math.exception.NullArgumentException var6 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var7 = new org.apache.commons.math.exception.NullArgumentException();
    var6.addSuppressed((java.lang.Throwable)var7);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    java.lang.Object[] var11 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var12 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var6, var9, var11);
    org.apache.commons.math.exception.NotFiniteNumberException var13 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var11);
    java.util.Set var14 = var13.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var15 = var3.centroidOf((java.util.Collection)var14);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(10.0f, 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999f);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    long var2 = org.apache.commons.math.util.FastMath.min(100L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0f, 1.1920929E-7f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7453292519943295d);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-31.884770305757485d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.45185512475708767d));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 720L);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-100L), 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.6085980977425464d, 1.3132616875182228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6085980977425465d);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    int var1 = org.apache.commons.math.util.FastMath.round(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(101, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 107);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(201);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1920929E-7f, 0.0f, 9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test296() {}
//   public void test296() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.ConvergenceException var1 = new org.apache.commons.math.exception.ConvergenceException(var0);
//     org.apache.commons.math.exception.util.Localizable var2 = null;
//     org.apache.commons.math.util.MathUtils.OrderDirection var7 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var7, true);
//     org.apache.commons.math.exception.util.Localizable var10 = null;
//     java.lang.Object[] var12 = new java.lang.Object[] { (short)10};
//     org.apache.commons.math.exception.MathIllegalStateException var13 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var9, var10, var12);
//     org.apache.commons.math.exception.NotFiniteNumberException var14 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var12);
//     org.apache.commons.math.exception.MathIllegalStateException var15 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var1, var2, var12);
// 
//   }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.5872139151569291d), 1.1189396031849526d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.5872139151569291d));

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)1000L, (java.lang.Number)11013.232874703393d, false);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.547657737556848d);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    java.lang.Number var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var7, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var13 = org.apache.commons.math.util.MathUtils.checkOrder(var5, var10, false, true);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb((-0.5872139151569291d), (-1048576));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.0d));

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var5, (-738962168));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-127), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-137));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign((-0.8203867151263053d), (-0.6276125002048193d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.8203867151263053d));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.123233995736766E-17d);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(5729.5779513082325d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5730.0d);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(10, 10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    int var1 = org.apache.commons.math.util.FastMath.round(10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0d, (-1.0d), 2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    int var2 = org.apache.commons.math.util.FastMath.max(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.8071997601754675d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.044582220834825d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(100.0f, (-738962168), 1072694209);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6941159641785049d);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.6085980977425465d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.7509157763716767d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.6085980977425464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 1072694209);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-100L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-110L));

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0038848218538872d, 0.0d, 127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test325() {}
//   public void test325() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }
// 
// 
//     float var1 = org.apache.commons.math.util.MathUtils.sign(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.000001f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000001f);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-31.884770305757485d), 1.547657737556848d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.5222953029988104d));

  }

  public void test328() {}
//   public void test328() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }
// 
// 
//     org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)Double.NaN, (java.lang.Number)(short)1, true);
//     org.apache.commons.math.exception.util.Localizable var4 = null;
//     org.apache.commons.math.exception.ConvergenceException var5 = new org.apache.commons.math.exception.ConvergenceException(var4);
//     java.lang.Object var7 = var5.getContext("(10,1)");
//     var3.addSuppressed((java.lang.Throwable)var5);
//     org.apache.commons.math.exception.MathRuntimeException var9 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var5);
// 
//   }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.6085980977425464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 34.87010242033826d);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    double[] var5 = new double[] { 0.0d, 1.0d};
    double var6 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    org.apache.commons.math.util.MathUtils.checkOrder(var5);
    java.lang.Number var12 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var12, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var14.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var15, false);
    boolean var20 = org.apache.commons.math.util.MathUtils.checkOrder(var5, var15, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var22 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100, (java.lang.Number)Double.NEGATIVE_INFINITY, 1079574528, var15, false);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.0f, 1.4E-45f, 9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.1189396031849523d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb((-0.0d), (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.0d));

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(100.00000000000001d, 34.87010242033826d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0d);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8184464592320668d);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-127));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-53));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(107, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 108);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.99168E7d);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    long var2 = org.apache.commons.math.util.FastMath.max(3L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3L);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    int[] var5 = new int[] { 100};
    int[] var9 = new int[] { (-1), 1, 1};
    int var10 = org.apache.commons.math.util.MathUtils.distance1(var5, var9);
    int[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = org.apache.commons.math.util.MathUtils.distance(var2, var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var7 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var5);
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var11, true);
    org.apache.commons.math.exception.MathRuntimeException var14 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var13);
    java.util.Set var15 = var13.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var16 = var7.centroidOf((java.util.Collection)var15);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    boolean var5 = var3.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var6 = new float[] { };
    float[] var8 = new float[] { 100.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var8);
    boolean var10 = var3.equals((java.lang.Object)var8);
    int[] var13 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var14 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var13);
    boolean var16 = var14.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var17 = new float[] { };
    float[] var19 = new float[] { 100.0f};
    boolean var20 = org.apache.commons.math.util.MathUtils.equals(var17, var19);
    boolean var21 = var14.equals((java.lang.Object)var19);
    double var22 = var3.distanceFrom(var14);
    java.lang.Object var23 = null;
    boolean var24 = var3.equals(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    org.apache.commons.math.stat.clustering.Cluster var4 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var3);
    java.util.List var5 = var4.getPoints();
    int[] var8 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var9 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var8);
    boolean var11 = var9.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var12 = new float[] { };
    float[] var14 = new float[] { 100.0f};
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var12, var14);
    boolean var16 = var9.equals((java.lang.Object)var14);
    int[] var19 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var20 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var19);
    boolean var22 = var20.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var23 = new float[] { };
    float[] var25 = new float[] { 100.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var23, var25);
    boolean var27 = var20.equals((java.lang.Object)var25);
    double var28 = var9.distanceFrom(var20);
    var4.addPoint((org.apache.commons.math.stat.clustering.Clusterable)var20);
    org.apache.commons.math.exception.NullArgumentException var31 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var32 = new org.apache.commons.math.exception.NullArgumentException();
    var31.addSuppressed((java.lang.Throwable)var32);
    org.apache.commons.math.exception.util.Localizable var34 = null;
    java.lang.Object[] var36 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var37 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var31, var34, var36);
    org.apache.commons.math.exception.NotFiniteNumberException var38 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var36);
    java.util.Set var39 = var38.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var40 = var20.centroidOf((java.util.Collection)var39);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.99822295029797d);

  }

  public void test353() {}
//   public void test353() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }
// 
// 
//     float var1 = org.apache.commons.math.util.FastMath.signum(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.3132616875182228d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7632208604112913d);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var7, true);
    org.apache.commons.math.exception.util.Localizable var10 = null;
    java.lang.Object[] var12 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var13 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var9, var10, var12);
    org.apache.commons.math.exception.NotFiniteNumberException var14 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var12);
    org.apache.commons.math.exception.NotFiniteNumberException var15 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, (java.lang.Number)1.0f, var12);
    org.apache.commons.math.exception.MathIllegalArgumentException var16 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.000002f);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.3132616875182228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9936116249145202d);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-110L), 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1100L));

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(201, 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1249902593);

  }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 1L);
// 
//   }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    java.lang.Number var0 = null;
    java.lang.Object[] var2 = new java.lang.Object[] { false};
    org.apache.commons.math.exception.NotFiniteNumberException var3 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, var2);
    java.lang.Number var4 = var3.getArgument();
    org.apache.commons.math.exception.util.Localizable var5 = null;
    var3.addMessage(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4E-45f);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.000001f, Float.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    int var1 = org.apache.commons.math.util.FastMath.round(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    boolean var5 = var3.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var6 = new float[] { };
    float[] var8 = new float[] { 100.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var8);
    boolean var10 = var3.equals((java.lang.Object)var8);
    int[] var11 = var3.getPoint();
    int[] var13 = new int[] { 100};
    int[] var17 = new int[] { (-1), 1, 1};
    int var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var17);
    int[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    int var20 = org.apache.commons.math.util.MathUtils.distance1(var11, var19);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var21 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var19);
    int[] var24 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var25 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var24);
    org.apache.commons.math.stat.clustering.Cluster var26 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var25);
    java.util.List var27 = var26.getPoints();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var28 = var21.centroidOf((java.util.Collection)var27);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test368() {}
//   public void test368() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-1.0d), 1.3132616875182228d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.6085980977425464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6085980977425464d);

  }

  public void test371() {}
//   public void test371() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(9.999999f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.1189396031849526d, 1.1189396031849528d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7853981633974482d);

  }

  public void test373() {}
//   public void test373() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     java.lang.Object[] var1 = null;
//     org.apache.commons.math.exception.NullArgumentException var2 = new org.apache.commons.math.exception.NullArgumentException(var0, var1);
//     org.apache.commons.math.exception.util.Localizable var3 = null;
//     java.lang.Number var4 = null;
//     java.lang.Object[] var6 = new java.lang.Object[] { false};
//     org.apache.commons.math.exception.NotFiniteNumberException var7 = new org.apache.commons.math.exception.NotFiniteNumberException(var4, var6);
//     org.apache.commons.math.exception.MathIllegalStateException var8 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var2, var3, var6);
// 
//   }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 2.718281828459045d);
    org.apache.commons.math.util.MathUtils.checkFinite(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101000L);

  }

  public void test376() {}
//   public void test376() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-0.45185512475708767d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(127, 720L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 784635905);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(7.610125138662288d, 1.6941159641785049d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3517546257973585d);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.5707963267948966d, 0.7853981633974482d, 7.610125138662288d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10L, (-110L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException(var0);
    java.lang.Object var3 = var1.getContext("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.00001f);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh((-1.7976931348623157E308d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)(-2114948001));

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double var2 = org.apache.commons.math.util.FastMath.max(9.425947759839367E159d, 0.7632208604112913d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.425947759839367E159d);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(9.425947759839367E159d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.8071997601754675d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.21418410704948732d));

  }

  public void test390() {}
//   public void test390() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.max(10.000002f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, (-2.5049299045672764d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var11);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.0038848218538872d);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var9);
    double[] var14 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var14, 1.0d);
    double[] var20 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 1.0d);
    double var23 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var22);
    double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    java.lang.Number var26 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var26, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    double[] var33 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var33, 1.0d);
    double[] var39 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var39, 1.0d);
    double var42 = org.apache.commons.math.util.MathUtils.distanceInf(var35, var41);
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, (-2.5049299045672764d));
    double[] var48 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 1.0d);
    double[] var52 = org.apache.commons.math.util.MathUtils.normalizeArray(var50, 1.5707963267948966d);
    double[] var56 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.normalizeArray(var56, 1.0d);
    double[] var62 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var64 = org.apache.commons.math.util.MathUtils.normalizeArray(var62, 1.0d);
    double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var58, var64);
    double var66 = org.apache.commons.math.util.MathUtils.distance(var50, var64);
    double var67 = org.apache.commons.math.util.MathUtils.safeNorm(var64);
    double[] var71 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var73 = org.apache.commons.math.util.MathUtils.normalizeArray(var71, 1.0d);
    double[] var75 = org.apache.commons.math.util.MathUtils.normalizeArray(var71, 0.8414709848078965d);
    boolean var76 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var64, var71);
    double var77 = org.apache.commons.math.util.MathUtils.distanceInf(var41, var64);
    double[][] var78 = new double[][] { var41};
    org.apache.commons.math.util.MathUtils.sortInPlace(var22, var29, var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var9, var29, true);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.9936116249145202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 114.22553209582011d);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(101, 1079574528);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(10.000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536743E-7f);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    double var2 = org.apache.commons.math.util.FastMath.IEEEremainder(1.8378531015316315d, 1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.16991654217614283d));

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(7.610125138662288d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.019162876747147d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(3.0d, 1.3674899999943206d, (-2114948001));

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(2.833923755211775d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.00001f, 1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var8 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var7);
    int[] var11 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var12 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var11);
    org.apache.commons.math.stat.clustering.Cluster var13 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var12);
    java.util.List var14 = var13.getPoints();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var15 = var8.centroidOf((java.util.Collection)var14);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.8378531015316315d, 1.3674899999943206d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8378531015316313d);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(101000L, 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100997L);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(0.0d, 1079574528);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    double var2 = org.apache.commons.math.util.FastMath.max(3.99168E7d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.99168E7d);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.999999f);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-137), (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2114948138));

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7320508075688774d);

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.999999f, 100.00001f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.999999f, 10.000002f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(Float.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 128);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(0.7853981633974482d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7853981633974482d);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.04880664532067082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04882604308023237d);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double[] var28 = new double[] { 0.0d, 1.0d};
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    org.apache.commons.math.util.MathUtils.checkOrder(var28);
    java.lang.Number var35 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var37 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var35, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var38 = var37.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var40 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var38, false);
    boolean var43 = org.apache.commons.math.util.MathUtils.checkOrder(var28, var38, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var45 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100, (java.lang.Number)Double.NEGATIVE_INFINITY, 1079574528, var38, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var19, var38, true);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(7.610125138662288d, 1.6941159641785049d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.610125138662288d);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-2114948001), 1048576);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2113899425));

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var8 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var6, true);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    java.lang.Object[] var11 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var12 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var8, var9, var11);
    org.apache.commons.math.exception.NotFiniteNumberException var13 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var11);
    org.apache.commons.math.exception.NotFiniteNumberException var14 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)1.0f, var11);
    java.lang.Object var16 = var14.getContext("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test423() {}
//   public void test423() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(9.536743E-7f, (-127));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.0038848218538872d);
    java.lang.Number var14 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var16 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var14, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var17 = var16.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var17, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var7, var17, true);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    int var2 = org.apache.commons.math.util.FastMath.min(6, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-0.6276125002048193d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 0, 11);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() {}
//   public void test430() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var1 = null;
//     org.apache.commons.math.exception.util.Localizable var2 = null;
//     org.apache.commons.math.exception.NullArgumentException var3 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var4 = new org.apache.commons.math.exception.NullArgumentException();
//     var3.addSuppressed((java.lang.Throwable)var4);
//     org.apache.commons.math.exception.util.Localizable var6 = null;
//     java.lang.Object[] var8 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var3, var6, var8);
//     org.apache.commons.math.exception.NullArgumentException var10 = new org.apache.commons.math.exception.NullArgumentException(var2, var8);
//     org.apache.commons.math.exception.MathArithmeticException var11 = new org.apache.commons.math.exception.MathArithmeticException(var1, var8);
//     org.apache.commons.math.exception.MathIllegalArgumentException var12 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var8);
//     java.lang.String var13 = var12.toString();
// 
//   }

  public void test431() {}
//   public void test431() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(Double.POSITIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(Float.NaN, 100.00001f, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1048576), 784635905);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(100.00000000000001d, 107, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100.00000000000001d);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(3.99168E7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    double[] var2 = new double[] { 0.0d, 1.0d};
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    org.apache.commons.math.util.MathUtils.checkOrder(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var2, 1079574528);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.00001f, 10.0f, (-2113899425));

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(short)(-1));

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    org.apache.commons.math.util.MathUtils.checkFinite(0.6085980977425464d);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.000002f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.0f, (-1.0f), (-1));

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-2114948001), 201);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    int[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, (-127));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080678E43d, 0.6085980977425464d, 0);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(1.9936116249145202d, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.0d);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536743E-7f);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb(0.0f, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(6, (-1048576));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-1.6490605123312343d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 12.751137675608902d);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999f);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(0.6085980977425464d, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.9750137443868097E32d);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.8184464592320668d, 1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0038848218538872d);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080869E43d, 0.8071997601754675d, 6.123233995736766E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(720L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 720L);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.475880078570761E27d);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    boolean var5 = var3.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var6 = new float[] { };
    float[] var8 = new float[] { 100.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var8);
    boolean var10 = var3.equals((java.lang.Object)var8);
    int[] var13 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var14 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var13);
    boolean var16 = var14.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var17 = new float[] { };
    float[] var19 = new float[] { 100.0f};
    boolean var20 = org.apache.commons.math.util.MathUtils.equals(var17, var19);
    boolean var21 = var14.equals((java.lang.Object)var19);
    double var22 = var3.distanceFrom(var14);
    int[] var25 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var26 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var25);
    org.apache.commons.math.stat.clustering.Cluster var27 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var26);
    java.util.List var28 = var27.getPoints();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var29 = var14.centroidOf((java.util.Collection)var28);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)(-137), false);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 1079574528);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test462() {}
//   public void test462() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(9.999999f, 10100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-1.0d), 1.547657737556848d, 0.04880664532067082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-2114948138), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(9.536743E-7f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536743E-7f);

  }

  public void test467() {}
//   public void test467() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.9936116249145202d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.6941159641785049d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(100.00001f, 9.425947759839367E159d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.000015f);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.8071997601754675d, 34.87010242033826d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(11013.232874703393d, 0, (-137));
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(6.123233995736766E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.123233995736767E-17d);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 12);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)1.0f, true);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    java.lang.Object[] var3 = new java.lang.Object[] { false};
    org.apache.commons.math.exception.NotFiniteNumberException var4 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, var3);
    org.apache.commons.math.exception.MathIllegalStateException var5 = new org.apache.commons.math.exception.MathIllegalStateException(var0, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    float var2 = org.apache.commons.math.util.FastMath.max(9.536743E-7f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0d, 1.1189396031849528d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)10, var1, false);
    java.lang.Number var4 = var3.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1555516045788385d);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test483() {}
//   public void test483() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test484() {}
//   public void test484() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.NullArgumentException var1 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var2 = new org.apache.commons.math.exception.NullArgumentException();
//     var1.addSuppressed((java.lang.Throwable)var2);
//     org.apache.commons.math.exception.util.Localizable var4 = null;
//     java.lang.Object[] var6 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var7 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var1, var4, var6);
//     org.apache.commons.math.exception.NullArgumentException var8 = new org.apache.commons.math.exception.NullArgumentException(var0, var6);
//     java.lang.String var9 = var8.toString();
// 
//   }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(34.87010242033826d, 0.6085980977425465d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1079574528);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1079574528);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.04882604308023237d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04880666379108919d);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)(short)10);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign((-1.0f), 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1048576, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 26214400);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    long var2 = org.apache.commons.math.util.FastMath.max(3L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3L);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    double var2 = org.apache.commons.math.util.FastMath.max(11013.232920103324d, 1.6941159641785049d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 11013.232920103324d);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round((-1.5222953029988104d), (-2113899425), (-53));
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-100L), 100997L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm((-1L), 101000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101000L);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.0038848218538872d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0038848218538874d);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(12.751137675608902d, 2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 90);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-1.0d), 2.99822295029797d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.283185307179586d);

  }

}
