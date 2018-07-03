
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = org.apache.commons.math.util.MathUtils.copyOf(var0);
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.0f, 100.0f, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0f, 100.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15.104412573075516d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, (-1.0f), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 1);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test20() {}
//   public void test20() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = org.apache.commons.math.util.MathUtils.normalizeArray(var0, 0.0d);
// 
//   }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-1L), (java.lang.Number)1, false);
    java.lang.Number var5 = var4.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-1L)+ "'", var5.equals((-1L)));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    org.apache.commons.math.util.MathUtils.checkFinite(0.0d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(100, (-30145599));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0f, 100.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[][] var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var3, var4);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-99));

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-99), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 10.0f, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.0d, 0.0d, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-1L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test35() {}
//   public void test35() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     int var4 = org.apache.commons.math.util.MathUtils.hash(var2);
//     org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
//     double[] var8 = new double[] { 1.0d, 10.0d};
//     double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
//     double[] var12 = new double[] { 1.0d, 10.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distance1(var9, var12);
//     double[][] var15 = new double[][] { var9};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var2, var5, var15);
// 
//   }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(99L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test37() {}
//   public void test37() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var6 = new double[] { 1.0d, 10.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
//     org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
//     double[] var12 = new double[] { 1.0d, 10.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double[][] var14 = new double[][] { var13};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var6, var9, var14);
// 
//   }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    int[] var3 = new int[] { 1, 100, 0};
    int[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var4, (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(10.0d, 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.7168146928204138d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080678E43d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-30145599), 99);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, (-1.0f), 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-30145599), (-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1L, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.3440585709080678E43d, 15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.027339371326677953d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(99, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(99, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test49() {}
//   public void test49() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0);
// 
//   }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(10L, 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 990L);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(99L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 0.0f, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(10.0d, 1.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test55() {}
//   public void test55() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var6 = new double[] { 1.0d, 10.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
//     org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var6, var9, false);
// 
//   }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
//     boolean var8 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var5, true, false);
// 
//   }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = null;
    org.apache.commons.math.exception.NotFiniteNumberException var3 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)(-100L), var2);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(100L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0d, 3.7168146928204138d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(1L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(2, 100);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    double var7 = var6.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 9.950376827045293d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-30145599));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3.7168146928204138d, 9.950376827045293d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1814400.000000139d);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.0f, 1.0f, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var2.negate();
    java.util.List var8 = var2.nthRoot(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(9.950376827045293d, 0.027339371326677953d, 9.950376827045293d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(15.104412573075516d, 1.0d, 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11013.232874703393d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30.48232336227865d);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-99), 2);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.0f, 10.0f, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.apache.commons.math.exception.NullArgumentException var0 = new org.apache.commons.math.exception.NullArgumentException();

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test79() {}
//   public void test79() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var6 = new double[] { 1.0d, 10.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     double[] var10 = new double[] { 1.0d, 10.0d};
//     double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
//     double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
//     double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
//     double[] var14 = null;
//     double var15 = org.apache.commons.math.util.MathUtils.distance(var7, var14);
// 
//   }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)1L);
    boolean var3 = var2.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    float var3 = org.apache.commons.math.util.MathUtils.round((-1.0f), (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.0f));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce((-1.0d), 0.027339371326677953d, 15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.025816509664474907d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1814400.000000139d, 0.0d, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-30145599));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var6, (-30145599));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0d, 0.027339371326677953d, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(99L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1795512867667309079L));

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800.0d);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    boolean var16 = org.apache.commons.math.util.MathUtils.checkOrder(var7, var13, false, true);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double var25 = org.apache.commons.math.util.MathUtils.distance1(var20, var23);
    double[][] var26 = new double[][] { var23};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var1, var13, var26);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = null;
//     double var2 = org.apache.commons.math.util.MathUtils.distance(var0, var1);
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var6 = null;
    float[] var9 = new float[] { 0.0f, 10.0f};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var9);
    boolean var11 = org.apache.commons.math.util.MathUtils.equals(var5, var9);
    boolean var12 = org.apache.commons.math.util.MathUtils.equals(var0, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.0d, 0.0d, 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    java.lang.Number var4 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 99L+ "'", var4.equals(99L));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(10L, (-1795512867667309079L));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 100.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)0);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(0.025816509664474907d, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-99));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1814400.000000139d, 0.027339371326677953d, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    float[] var0 = null;
    float[] var1 = null;
    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.0d, 0.09966865249116202d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)10L, (java.lang.Number)(short)(-1), false);
    org.apache.commons.math.exception.util.ExceptionContext var5 = var4.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(3628800.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), (-99));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2.0d, (java.lang.Number)(short)(-1), (-99), var3, false);
    java.lang.Number var6 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 2.0d+ "'", var6.equals(2.0d));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    org.apache.commons.math.exception.util.ExceptionContext var4 = var3.getContext();
    java.lang.Number var5 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 99L+ "'", var5.equals(99L));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-100L), 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = null;
//     double var2 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var1);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var28, var31);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var40);
    double[][] var43 = new double[][] { var40};
    org.apache.commons.math.util.MathUtils.sortInPlace(var28, var43);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    org.apache.commons.math.exception.NonMonotonousSequenceException var53 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var54 = var53.getDirection();
    boolean var57 = org.apache.commons.math.util.MathUtils.checkOrder(var48, var54, false, true);
    boolean var60 = org.apache.commons.math.util.MathUtils.checkOrder(var28, var54, true, false);
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var28, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var63 = org.apache.commons.math.util.MathUtils.distance1(var3, var28);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.025816509664474907d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round((-1.0f), 99);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-2), (-99));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(1.0f, 10, (-30145599));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(2, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.acos();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var7.nthRoot((-2));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-1L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }
// 
// 
//     int[] var1 = new int[] { (-1)};
//     int[] var5 = new int[] { 1, 100, 0};
//     int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
//     int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
//     int[] var9 = new int[] { (-1)};
//     int[] var13 = new int[] { 1, 100, 0};
//     int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
//     int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
//     int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
//     int[] var18 = new int[] { (-1)};
//     int[] var22 = new int[] { 1, 100, 0};
//     int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
//     int var24 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var23);
//     int[] var26 = new int[] { (-1)};
//     int[] var30 = new int[] { 1, 100, 0};
//     int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
//     int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
//     int var33 = org.apache.commons.math.util.MathUtils.distance1(var18, var26);
//     int[] var37 = new int[] { 1, 100, 0};
//     int[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
//     int var39 = org.apache.commons.math.util.MathUtils.distance1(var18, var37);
//     double var40 = org.apache.commons.math.util.MathUtils.distance(var1, var18);
//     int[] var41 = null;
//     double var42 = org.apache.commons.math.util.MathUtils.distance(var1, var41);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(100.0d, 0.0d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.027339371326677953d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    int[] var3 = new int[] { 1, 100, 0};
    int[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var4, (-2));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-100L), 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.027339371326677953d, 1.3440585709080678E43d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(11013.232874703393d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.1909687824208959d));

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.ComplexField var4 = var3.getField();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var15 = var14.conjugate();
    java.lang.Object var16 = null;
    boolean var17 = var14.equals(var16);
    org.apache.commons.math.complex.Complex var18 = var14.sqrt1z();
    org.apache.commons.math.complex.Complex var19 = var7.add(var14);
    org.apache.commons.math.complex.Complex var20 = var3.pow(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var22 = var20.nthRoot(0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.0f, Float.NaN, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 1.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.027339371326677953d, 100.0d, (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    org.apache.commons.math.complex.Complex var38 = var36.tan();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-100L), (-1795512867667309079L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080678E43d, 0.0d, 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = var7.getDirection();
    int var9 = var7.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var7.getDirection();
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var18);
    int var21 = org.apache.commons.math.util.MathUtils.hash(var18);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var31 = var30.getDirection();
    boolean var34 = org.apache.commons.math.util.MathUtils.checkOrder(var25, var31, false, true);
    double[][] var35 = new double[][] { var25};
    org.apache.commons.math.util.MathUtils.sortInPlace(var18, var35);
    org.apache.commons.math.exception.NotFiniteNumberException var37 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100, (java.lang.Object[])var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var3, var10, var35);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)0, (java.lang.Number)101, false);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.09966865249116202d), 0.0d, 3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test158() {}
//   public void test158() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }
// 
// 
//     int[] var0 = null;
//     int[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, 99);
// 
//   }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(2, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), (-0.0f), 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test161() {}
//   public void test161() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }
// 
// 
//     int[] var0 = null;
//     int[] var2 = new int[] { (-1)};
//     int[] var6 = new int[] { 1, 100, 0};
//     int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     int var8 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var7);
//     int[] var10 = new int[] { (-1)};
//     int[] var14 = new int[] { 1, 100, 0};
//     int[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
//     int var16 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var15);
//     int var17 = org.apache.commons.math.util.MathUtils.distance1(var2, var10);
//     int[] var19 = new int[] { (-1)};
//     int[] var23 = new int[] { 1, 100, 0};
//     int[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
//     int var25 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var24);
//     int[] var27 = new int[] { (-1)};
//     int[] var31 = new int[] { 1, 100, 0};
//     int[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
//     int var33 = org.apache.commons.math.util.MathUtils.distanceInf(var27, var32);
//     int var34 = org.apache.commons.math.util.MathUtils.distance1(var19, var27);
//     double var35 = org.apache.commons.math.util.MathUtils.distance(var2, var19);
//     int var36 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var19);
// 
//   }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.asin();
    double var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1.114782621445709d));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1L), 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100L));

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log((-1.1909687824208959d), 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.025816509664474907d, 0.025816509664474907d, (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    org.apache.commons.math.util.MathUtils.checkFinite(1.0d);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    double[] var0 = null;
    double[] var3 = new double[] { 1.0d, 10.0d};
    double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var16);
    double[][] var19 = new double[][] { var16};
    org.apache.commons.math.util.MathUtils.sortInPlace(var4, var19);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var29.getDirection();
    boolean var33 = org.apache.commons.math.util.MathUtils.checkOrder(var24, var30, false, true);
    boolean var36 = org.apache.commons.math.util.MathUtils.checkOrder(var4, var30, true, false);
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var4, 0);
    double[][] var39 = new double[][] { var38};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var0, var39);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }
// 
// 
//     double[] var0 = null;
//     double[] var3 = new double[] { 1.0d, 10.0d};
//     double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     double[] var7 = new double[] { 1.0d, 10.0d};
//     double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
//     double[] var11 = new double[] { 1.0d, 10.0d};
//     double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
//     double var13 = org.apache.commons.math.util.MathUtils.distance1(var8, var11);
//     double var14 = org.apache.commons.math.util.MathUtils.distance1(var4, var8);
//     double[] var17 = new double[] { 1.0d, 10.0d};
//     double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
//     double[] var21 = new double[] { 1.0d, 10.0d};
//     double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
//     double var23 = org.apache.commons.math.util.MathUtils.distance1(var18, var21);
//     double[] var26 = new double[] { 1.0d, 10.0d};
//     double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var26);
//     double[] var30 = new double[] { 1.0d, 10.0d};
//     double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
//     double var32 = org.apache.commons.math.util.MathUtils.distance1(var27, var30);
//     double[][] var33 = new double[][] { var30};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var18, var33);
//     org.apache.commons.math.util.MathUtils.sortInPlace(var4, var33);
//     double var36 = org.apache.commons.math.util.MathUtils.distance1(var0, var4);
// 
//   }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }
// 
// 
//     int[] var1 = new int[] { (-1)};
//     int[] var5 = new int[] { 1, 100, 0};
//     int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
//     int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
//     int[] var9 = new int[] { (-1)};
//     int[] var13 = new int[] { 1, 100, 0};
//     int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
//     int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
//     int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
//     int[] var20 = new int[] { 1, 100, 0};
//     int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
//     int var22 = org.apache.commons.math.util.MathUtils.distance1(var1, var20);
//     int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var1);
//     int[] var24 = null;
//     int var25 = org.apache.commons.math.util.MathUtils.distance1(var1, var24);
// 
//   }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(0, (-1795512867667309079L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)15.104412573075516d, (java.lang.Number)1, false);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(15.104412573075516d, Double.NaN, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, Float.NaN, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.0f, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(15.104412573075516d, 30.48232336227865d, 15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.0f), (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(2, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var20 = new int[] { 1, 100, 0};
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    int var22 = org.apache.commons.math.util.MathUtils.distance1(var1, var20);
    int[] var24 = new int[] { (-1)};
    int[] var28 = new int[] { 1, 100, 0};
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    int var30 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var29);
    int[] var32 = new int[] { (-1)};
    int[] var36 = new int[] { 1, 100, 0};
    int[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    int var38 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var37);
    int var39 = org.apache.commons.math.util.MathUtils.distance1(var24, var32);
    int[] var43 = new int[] { 1, 100, 0};
    int[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var24, var43);
    int var46 = org.apache.commons.math.util.MathUtils.distance1(var1, var43);
    int[] var48 = new int[] { (-1)};
    int[] var52 = new int[] { 1, 100, 0};
    int[] var53 = org.apache.commons.math.util.MathUtils.copyOf(var52);
    int var54 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var53);
    int[] var56 = new int[] { (-1)};
    int[] var60 = new int[] { 1, 100, 0};
    int[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    int var62 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var61);
    int var63 = org.apache.commons.math.util.MathUtils.distance1(var48, var56);
    int[] var65 = new int[] { (-1)};
    int[] var69 = new int[] { 1, 100, 0};
    int[] var70 = org.apache.commons.math.util.MathUtils.copyOf(var69);
    int var71 = org.apache.commons.math.util.MathUtils.distanceInf(var65, var70);
    int[] var73 = new int[] { (-1)};
    int[] var77 = new int[] { 1, 100, 0};
    int[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var77);
    int var79 = org.apache.commons.math.util.MathUtils.distanceInf(var73, var78);
    int var80 = org.apache.commons.math.util.MathUtils.distance1(var65, var73);
    double var81 = org.apache.commons.math.util.MathUtils.distance(var48, var65);
    int var82 = org.apache.commons.math.util.MathUtils.distance1(var1, var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1), 1);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(990L, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0049710332224018d);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(30.48232336227865d, 0.09966865249116202d, (-0.09966865249116202d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.08338435247423098d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.08338435247423098d, 0.027339371326677953d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.0d, 0.0d, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.apache.commons.math.util.MathUtils.checkFinite(10.0d);

  }

  public void test191() {}
//   public void test191() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     org.apache.commons.math.util.MathUtils.OrderDirection var4 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var3, var4, true);
// 
//   }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.math.BigInteger var7 = null;
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0L);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var9, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var14 = new org.apache.commons.math.exception.NumberIsTooSmallException(var6, (java.lang.Number)var11, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var11, 10L);
    org.apache.commons.math.exception.NumberIsTooSmallException var18 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var3, (java.lang.Number)var16, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var3, (-1795512867667309079L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
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
    assertNotNull(var16);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator((-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double[] var27 = new double[] { (-1.0d)};
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 0.027339371326677953d);
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var31 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var29);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.027339371326677953d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)1, false);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1911350513));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    org.apache.commons.math.util.MathUtils.checkFinite(3628800.0d);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(99, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1147826214457093d, 0.025816509664474907d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(1.0049710332224018d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-0.19801980198019803d), 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.19801980198019803d));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.sin();
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var9 = new org.apache.commons.math.exception.MathArithmeticException(var6, var8);
    org.apache.commons.math.exception.util.ExceptionContext var10 = var9.getContext();
    boolean var11 = var2.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     double[] var1 = new double[] { (-1.0d)};
//     double[] var2 = null;
//     double var3 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var2);
// 
//   }

  public void test211() {}
//   public void test211() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }
// 
// 
//     double[] var1 = new double[] { (-1.0d)};
//     double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
//     org.apache.commons.math.util.MathUtils.OrderDirection var4 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var3, var4, true);
//     double[] var7 = null;
//     double var8 = org.apache.commons.math.util.MathUtils.distance(var3, var7);
// 
//   }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(101, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0d, 1.1147826214457093d, Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(30.48232336227865d, (-1.0d), 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 1.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    org.apache.commons.math.complex.Complex var20 = var4.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    org.apache.commons.math.util.MathUtils.checkFinite(1814400.000000139d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.sin();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var5.nthRoot(0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-3.748403376781957E-9d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow((-100L), (-1911350513));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test224() {}
//   public void test224() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }
// 
// 
//     int[] var1 = new int[] { (-1)};
//     int[] var5 = new int[] { 1, 100, 0};
//     int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
//     int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
//     int[] var9 = new int[] { (-1)};
//     int[] var13 = new int[] { 1, 100, 0};
//     int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
//     int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
//     int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
//     int[] var18 = new int[] { (-1)};
//     int[] var22 = new int[] { 1, 100, 0};
//     int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
//     int var24 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var23);
//     int[] var26 = new int[] { (-1)};
//     int[] var30 = new int[] { 1, 100, 0};
//     int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
//     int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
//     int var33 = org.apache.commons.math.util.MathUtils.distance1(var18, var26);
//     int[] var37 = new int[] { 1, 100, 0};
//     int[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
//     int var39 = org.apache.commons.math.util.MathUtils.distance1(var18, var37);
//     int[] var41 = new int[] { (-1)};
//     int[] var45 = new int[] { 1, 100, 0};
//     int[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
//     int var47 = org.apache.commons.math.util.MathUtils.distanceInf(var41, var46);
//     int[] var49 = new int[] { (-1)};
//     int[] var53 = new int[] { 1, 100, 0};
//     int[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var53);
//     int var55 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var54);
//     int var56 = org.apache.commons.math.util.MathUtils.distance1(var41, var49);
//     int[] var60 = new int[] { 1, 100, 0};
//     int[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
//     int var62 = org.apache.commons.math.util.MathUtils.distance1(var41, var60);
//     int var63 = org.apache.commons.math.util.MathUtils.distance1(var18, var60);
//     int var64 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var18);
//     int[] var65 = null;
//     int var66 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var65);
// 
//   }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    org.apache.commons.math.util.MathUtils.checkOrder(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 990L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test227() {}
//   public void test227() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }
// 
// 
//     int[] var3 = new int[] { 1, 100, 0};
//     int[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     int[] var5 = null;
//     int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var5);
// 
//   }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var18 = new int[] { (-1)};
    int[] var22 = new int[] { 1, 100, 0};
    int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    int var24 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var23);
    int[] var26 = new int[] { (-1)};
    int[] var30 = new int[] { 1, 100, 0};
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var31);
    int var33 = org.apache.commons.math.util.MathUtils.distance1(var18, var26);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var1, var18);
    int[] var36 = new int[] { (-1)};
    int[] var40 = new int[] { 1, 100, 0};
    int[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    int var42 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var41);
    int[] var44 = new int[] { (-1)};
    int[] var48 = new int[] { 1, 100, 0};
    int[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    int var50 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var49);
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var36, var44);
    int[] var55 = new int[] { 1, 100, 0};
    int[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    int var57 = org.apache.commons.math.util.MathUtils.distance1(var36, var55);
    int[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    int[] var60 = new int[] { (-1)};
    int[] var64 = new int[] { 1, 100, 0};
    int[] var65 = org.apache.commons.math.util.MathUtils.copyOf(var64);
    int var66 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var65);
    int[] var68 = new int[] { (-1)};
    int[] var72 = new int[] { 1, 100, 0};
    int[] var73 = org.apache.commons.math.util.MathUtils.copyOf(var72);
    int var74 = org.apache.commons.math.util.MathUtils.distanceInf(var68, var73);
    int var75 = org.apache.commons.math.util.MathUtils.distance1(var60, var68);
    int[] var79 = new int[] { 1, 100, 0};
    int[] var80 = org.apache.commons.math.util.MathUtils.copyOf(var79);
    int var81 = org.apache.commons.math.util.MathUtils.distance1(var60, var79);
    int[] var82 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double var83 = org.apache.commons.math.util.MathUtils.distance(var58, var60);
    int var84 = org.apache.commons.math.util.MathUtils.distance1(var18, var60);
    org.apache.commons.math.exception.util.Localizable var85 = null;
    java.lang.Object[] var86 = null;
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var84, var85, var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var2.negate();
    org.apache.commons.math.complex.Complex var7 = var2.atan();
    double var8 = var7.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.4721312010883756d);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, 990L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-989L));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(3628800.0d, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3628800.0d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.0d, 0.0d, (-1.1909687824208959d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.apache.commons.math.util.MathUtils.checkFinite((-1.1909687824208959d));

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Float.NaN, 0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    int var5 = var3.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var3.getDirection();
    java.lang.Number var7 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0f+ "'", var7.equals(1.0f));

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5430806348152437d);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-2));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-1795512867667309079L), (-989L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(100);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    int[] var3 = new int[] { 10, (-1), 100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var3, (-99));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)3628800.0d, (java.lang.Number)(-30145599), true);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1911350513), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1911350515));

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-1795512867667309079L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)2, (java.lang.Number)1.5374020457163808d, true);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    int var9 = org.apache.commons.math.util.MathUtils.hash(var6);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = var18.getDirection();
    boolean var22 = org.apache.commons.math.util.MathUtils.checkOrder(var13, var19, false, true);
    double[][] var23 = new double[][] { var13};
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var23);
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10.04987562112089d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var8 = var2.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.tan();
    org.apache.commons.math.complex.Complex var10 = var9.asin();
    boolean var11 = var10.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.09966865249116202d, 3.7168146928204138d, 9.950376827045293d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-989L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-99), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 786341969);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    org.apache.commons.math.util.MathUtils.checkFinite(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-989L), 990L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.1147826214457093d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0f, Float.NaN, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-1.1909687824208959d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var6 = var4.multiply(10.0d);
    boolean var7 = var4.isInfinite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.027339371326677953d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0003737438906983d);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-1L), (java.lang.Number)1, false);
    boolean var5 = var4.getBoundIsAllowed();
    boolean var6 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1911350515));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 1814400.000000139d, 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(786341969, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 786341870);

  }

  public void test269() {}
//   public void test269() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }
// 
// 
//     double var1 = org.apache.commons.math.util.MathUtils.sinh(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(11013.232874703393d, 0, 101);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(990L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1378206651628553216L);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(1.0d, 0.027339371326677953d, 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.02191423518768043d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(786341870, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20.48290220493995d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-30145599), (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1814400.000000139d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1795512867667309079L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9900L);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var7 = var2.nthRoot((-30145599));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(3628800.0d, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3628800.0d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var8 = var2.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.complex.Complex var10 = var2.add(var9);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    java.lang.Object var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    double[] var5 = new double[] { 1.0d, 10.0d};
    double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    double[] var9 = new double[] { 1.0d, 10.0d};
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var9);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var18);
    double[][] var21 = new double[][] { var18};
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var21);
    org.apache.commons.math.exception.NullArgumentException var23 = new org.apache.commons.math.exception.NullArgumentException(var2, (java.lang.Object[])var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkNotNull(var0, var1, (java.lang.Object[])var21);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)2, (java.lang.Number)0.027339371326677953d, false);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.025816509664474907d, (-1.1909687824208959d), (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    org.apache.commons.math.complex.Complex var38 = var36.tanh();
    double var39 = var38.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-0.11038096704629749d));

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round((-1.0f), 1, (-1911350513));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.025816509664474907d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1656171100));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(100L, (-1911350515));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(100L, (-100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test292() {}
//   public void test292() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }
// 
// 
//     double[] var0 = null;
//     double[] var3 = new double[] { 1.0d, 10.0d};
//     double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     double[] var7 = new double[] { 1.0d, 10.0d};
//     double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
//     double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
//     double[] var12 = new double[] { 1.0d, 10.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double[] var16 = new double[] { 1.0d, 10.0d};
//     double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
//     double var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var16);
//     double[][] var19 = new double[][] { var16};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var4, var19);
//     double[] var23 = new double[] { 1.0d, 10.0d};
//     double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
//     double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var30 = var29.getDirection();
//     boolean var33 = org.apache.commons.math.util.MathUtils.checkOrder(var24, var30, false, true);
//     boolean var36 = org.apache.commons.math.util.MathUtils.checkOrder(var4, var30, true, false);
//     boolean var39 = org.apache.commons.math.util.MathUtils.checkOrder(var0, var30, false, false);
// 
//   }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    org.apache.commons.math.util.MathUtils.checkFinite((-1.5333870746439389d));

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    long var1 = org.apache.commons.math.util.MathUtils.factorial(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800L);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-0.11038096704629749d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(10L, 1378206651628553216L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6891033258142766080L);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(9.950376827045293d, (-1), 101);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    double[] var3 = new double[] { 1.0d, 10.0d};
    double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var16);
    double[][] var19 = new double[][] { var16};
    org.apache.commons.math.util.MathUtils.sortInPlace(var4, var19);
    org.apache.commons.math.exception.NullArgumentException var21 = new org.apache.commons.math.exception.NullArgumentException(var0, (java.lang.Object[])var19);
    java.lang.Throwable[] var22 = var21.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 0.0d, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var7 = var2.asin();
    boolean var8 = var7.isNaN();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var7.nthRoot((-1911350515));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(15.104412573075516d, 0.02191423518768043d);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(10, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(0.025816509664474907d, 99, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.025816509664474907d);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(11.180339887498949d, 1.1147826214457093d);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 786341969, (-30145599));
    org.apache.commons.math.exception.util.ExceptionContext var4 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.1147826214457093d, 11900.950259059777d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-99), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(11.180339887498949d, (-0.19801980198019803d), 11.180339887498949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.08338435247423098d, (java.lang.Number)(-1.1909687824208959d), false);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm((-1911350515), 99);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(11900.950259059777d, 786341870);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round((-1.0f), 100, (-99));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1378206651628553216L);
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.apache.commons.math.exception.NotPositiveException: 1,378,206,651,628,553,216 is smaller than the minimum (0)"+ "'", var2.equals("org.apache.commons.math.exception.NotPositiveException: 1,378,206,651,628,553,216 is smaller than the minimum (0)"));

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    double[] var26 = new double[] { (-1.0d)};
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var28, var29, true);
    org.apache.commons.math.util.MathUtils.checkFinite(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var28);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(1.0049710332224018d, (-1.114782621445709d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test319() {}
//   public void test319() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }
// 
// 
//     int[] var1 = new int[] { (-1)};
//     int[] var5 = new int[] { 1, 100, 0};
//     int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
//     int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
//     int[] var8 = null;
//     int var9 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
// 
//   }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(10, 0);
    int var3 = var2.getDimension();
    int var4 = var2.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(0L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.conjugate();
    org.apache.commons.math.complex.Complex var6 = var5.asin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.0003737438906983d, (-0.3359937911718539d), 1.5430806348152437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1911350513));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0003737438906983d, 0.02191423518768043d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    org.apache.commons.math.complex.Complex var38 = var36.tanh();
    java.lang.String var39 = var38.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "(0.7659808551313332, -0.08489477268832248)"+ "'", var39.equals("(0.7659808551313332, -0.08489477268832248)"));

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.0f), 0.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NumberIsTooLargeException: -1 is larger than, or equal to, the maximum (99)"+ "'", var4.equals("org.apache.commons.math.exception.NumberIsTooLargeException: -1 is larger than, or equal to, the maximum (99)"));

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var20 = var12.nthRoot((-2));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-99), (-2));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-2), (-99));
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-2)+ "'", var4.equals((-2)));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    boolean var14 = org.apache.commons.math.util.MathUtils.equals(var3, var12);
    double[] var16 = new double[] { (-1.0d)};
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 0.027339371326677953d);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var25);
    boolean var28 = org.apache.commons.math.util.MathUtils.equals(var16, var22);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    boolean var35 = org.apache.commons.math.util.MathUtils.equals(var16, var32);
    org.apache.commons.math.util.MathUtils.checkOrder(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var37 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var16);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 90);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(10L, (-30145599));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    double var38 = var36.getImaginary();
    double var39 = var36.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-0.19801980198019803d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.9801980198019803d);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.025816509664474907d, (-2.276056593552136d), 3.7168146928204138d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var14 = var2.add(var9);
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var29 = var17.add(var24);
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    boolean var34 = var33.isNaN();
    org.apache.commons.math.complex.Complex var35 = var33.asin();
    org.apache.commons.math.complex.Complex var36 = var24.divide(var33);
    org.apache.commons.math.complex.Complex var37 = var9.add(var36);
    org.apache.commons.math.complex.Complex var38 = var36.tanh();
    double var39 = var38.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.7659808551313332d);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)786341969);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-2), (-1));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-30145599), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(1.4721312010883756d, 11.180339887498949d, (-1.5333870746439389d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3.0055182757323147d);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, (-1.0f), (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)1L);
//     java.lang.String var3 = var2.toString();
// 
//   }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1L), (-1795512867667309079L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1795512867667309079L);

  }

  public void test346() {}
//   public void test346() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { (-1.0d)};
//     double[] var4 = org.apache.commons.math.util.MathUtils.normalizeArray(var2, 0.027339371326677953d);
//     double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var2, 99);
//     double var7 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
// 
//   }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var6, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var6, 10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var28);
    double[][] var31 = new double[][] { var28};
    org.apache.commons.math.util.MathUtils.sortInPlace(var16, var31);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    org.apache.commons.math.exception.NonMonotonousSequenceException var41 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var42 = var41.getDirection();
    boolean var45 = org.apache.commons.math.util.MathUtils.checkOrder(var36, var42, false, true);
    boolean var48 = org.apache.commons.math.util.MathUtils.checkOrder(var16, var42, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var50 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)var11, 10, var42, false);
    boolean var51 = var50.getStrict();
    int var52 = var50.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 10);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1911350515));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(30.48232336227865d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.655154728220008E12d);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    int[] var6 = new int[] { 1, 100, 0};
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    java.lang.Object[] var8 = new java.lang.Object[] { var6};
    org.apache.commons.math.exception.NotFiniteNumberException var9 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, (java.lang.Number)10, var8);
    org.apache.commons.math.exception.MathIllegalArgumentException var10 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var8 = var2.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.tan();
    double var10 = var9.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-0.21891713329967522d));

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(20.48290220493995d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 0.09966865249116202d, 0.08338435247423098d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, (-0.0f), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1010);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1), 786341870);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(-1911350515));

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 10.0f, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var5.negate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var10 = var8.nthRoot((-1656171100));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 786341870);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    double[] var5 = new double[] { 1.0d, 10.0d};
    double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    double[] var9 = new double[] { 1.0d, 10.0d};
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var9);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var6, var15);
    double[] var20 = new double[] { 1.0d, 10.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var24);
    int var27 = org.apache.commons.math.util.MathUtils.hash(var24);
    double[] var30 = new double[] { 1.0d, 10.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var37 = var36.getDirection();
    boolean var40 = org.apache.commons.math.util.MathUtils.checkOrder(var31, var37, false, true);
    double[][] var41 = new double[][] { var31};
    org.apache.commons.math.util.MathUtils.sortInPlace(var24, var41);
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var41);
    org.apache.commons.math.exception.util.Localizable var45 = null;
    java.math.BigInteger var46 = null;
    java.math.BigInteger var48 = org.apache.commons.math.util.MathUtils.pow(var46, 0L);
    java.math.BigInteger var50 = org.apache.commons.math.util.MathUtils.pow(var48, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var53 = new org.apache.commons.math.exception.NumberIsTooSmallException(var45, (java.lang.Number)var50, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var55 = org.apache.commons.math.util.MathUtils.pow(var50, 10);
    double[] var59 = new double[] { 1.0d, 10.0d};
    double[] var60 = org.apache.commons.math.util.MathUtils.copyOf(var59);
    double[] var63 = new double[] { 1.0d, 10.0d};
    double[] var64 = org.apache.commons.math.util.MathUtils.copyOf(var63);
    double var65 = org.apache.commons.math.util.MathUtils.distance1(var60, var63);
    double[] var68 = new double[] { 1.0d, 10.0d};
    double[] var69 = org.apache.commons.math.util.MathUtils.copyOf(var68);
    double[] var72 = new double[] { 1.0d, 10.0d};
    double[] var73 = org.apache.commons.math.util.MathUtils.copyOf(var72);
    double var74 = org.apache.commons.math.util.MathUtils.distance1(var69, var72);
    double[][] var75 = new double[][] { var72};
    org.apache.commons.math.util.MathUtils.sortInPlace(var60, var75);
    double[] var79 = new double[] { 1.0d, 10.0d};
    double[] var80 = org.apache.commons.math.util.MathUtils.copyOf(var79);
    double[] var81 = org.apache.commons.math.util.MathUtils.copyOf(var80);
    org.apache.commons.math.exception.NonMonotonousSequenceException var85 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var86 = var85.getDirection();
    boolean var89 = org.apache.commons.math.util.MathUtils.checkOrder(var80, var86, false, true);
    boolean var92 = org.apache.commons.math.util.MathUtils.checkOrder(var60, var86, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var94 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)var55, 10, var86, false);
    boolean var97 = org.apache.commons.math.util.MathUtils.checkOrder(var6, var86, false, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var99 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5374020457163808d, (java.lang.Number)(-0.3359937911718539d), 2, var86, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == true);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var12 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var28);
    double[][] var31 = new double[][] { var28};
    org.apache.commons.math.util.MathUtils.sortInPlace(var16, var31);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var12, var16);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var40);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double[] var49 = new double[] { 1.0d, 10.0d};
    double[] var50 = org.apache.commons.math.util.MathUtils.copyOf(var49);
    double var51 = org.apache.commons.math.util.MathUtils.distance1(var46, var49);
    double[][] var52 = new double[][] { var49};
    org.apache.commons.math.util.MathUtils.sortInPlace(var37, var52);
    double[] var56 = new double[] { 1.0d, 10.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    org.apache.commons.math.exception.NonMonotonousSequenceException var62 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var63 = var62.getDirection();
    boolean var66 = org.apache.commons.math.util.MathUtils.checkOrder(var57, var63, false, true);
    boolean var69 = org.apache.commons.math.util.MathUtils.checkOrder(var37, var63, true, false);
    boolean var72 = org.apache.commons.math.util.MathUtils.checkOrder(var12, var63, false, true);
    double var73 = org.apache.commons.math.util.MathUtils.distance(var6, var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var12);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 11.180339887498949d);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-2), (-100L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test367() {}
//   public void test367() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }
// 
// 
//     double[] var0 = null;
//     double[] var3 = new double[] { 1.0d, 10.0d};
//     double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     double[] var7 = new double[] { 1.0d, 10.0d};
//     double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
//     double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
//     double[] var12 = new double[] { 1.0d, 10.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
//     boolean var15 = org.apache.commons.math.util.MathUtils.equals(var4, var13);
//     double[] var18 = new double[] { 1.0d, 10.0d};
//     double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
//     double[] var22 = new double[] { 1.0d, 10.0d};
//     double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
//     double var24 = org.apache.commons.math.util.MathUtils.distance1(var19, var22);
//     int var25 = org.apache.commons.math.util.MathUtils.hash(var22);
//     double[] var28 = new double[] { 1.0d, 10.0d};
//     double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
//     double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var34 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var35 = var34.getDirection();
//     boolean var38 = org.apache.commons.math.util.MathUtils.checkOrder(var29, var35, false, true);
//     double[][] var39 = new double[][] { var29};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var22, var39);
//     org.apache.commons.math.util.MathUtils.sortInPlace(var4, var39);
//     org.apache.commons.math.exception.util.Localizable var43 = null;
//     java.math.BigInteger var44 = null;
//     java.math.BigInteger var46 = org.apache.commons.math.util.MathUtils.pow(var44, 0L);
//     java.math.BigInteger var48 = org.apache.commons.math.util.MathUtils.pow(var46, 990L);
//     org.apache.commons.math.exception.NumberIsTooSmallException var51 = new org.apache.commons.math.exception.NumberIsTooSmallException(var43, (java.lang.Number)var48, (java.lang.Number)30.48232336227865d, false);
//     java.math.BigInteger var53 = org.apache.commons.math.util.MathUtils.pow(var48, 10);
//     double[] var57 = new double[] { 1.0d, 10.0d};
//     double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
//     double[] var61 = new double[] { 1.0d, 10.0d};
//     double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
//     double var63 = org.apache.commons.math.util.MathUtils.distance1(var58, var61);
//     double[] var66 = new double[] { 1.0d, 10.0d};
//     double[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
//     double[] var70 = new double[] { 1.0d, 10.0d};
//     double[] var71 = org.apache.commons.math.util.MathUtils.copyOf(var70);
//     double var72 = org.apache.commons.math.util.MathUtils.distance1(var67, var70);
//     double[][] var73 = new double[][] { var70};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var58, var73);
//     double[] var77 = new double[] { 1.0d, 10.0d};
//     double[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var77);
//     double[] var79 = org.apache.commons.math.util.MathUtils.copyOf(var78);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var83 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var84 = var83.getDirection();
//     boolean var87 = org.apache.commons.math.util.MathUtils.checkOrder(var78, var84, false, true);
//     boolean var90 = org.apache.commons.math.util.MathUtils.checkOrder(var58, var84, true, false);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var92 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)var53, 10, var84, false);
//     boolean var95 = org.apache.commons.math.util.MathUtils.checkOrder(var4, var84, false, false);
//     org.apache.commons.math.util.MathUtils.checkOrder(var0, var84, false);
// 
//   }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1010);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(8.655154728220008E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5430806348152437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(15.104412573075516d, (-1.114782621445709d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(11900.950259059777d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    double[] var4 = new double[] { 1.0d, 10.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var4);
    double[] var8 = new double[] { 1.0d, 10.0d};
    double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance1(var9, var12);
    double var15 = org.apache.commons.math.util.MathUtils.distance1(var5, var9);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var19, var22);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var28, var31);
    double[][] var34 = new double[][] { var31};
    org.apache.commons.math.util.MathUtils.sortInPlace(var19, var34);
    org.apache.commons.math.util.MathUtils.sortInPlace(var5, var34);
    org.apache.commons.math.exception.NotFiniteNumberException var37 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)0.9801980198019803d, (java.lang.Object[])var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, (-2), (-1656171100));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.5333870746439389d), (-0.21891713329967522d), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var2, (java.lang.Number)var3, (java.lang.Number)0.0d, true);
    java.lang.Throwable[] var9 = var8.getSuppressed();
    org.apache.commons.math.exception.NotFiniteNumberException var10 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)90, (java.lang.Object[])var9);
    org.apache.commons.math.exception.NullArgumentException var11 = new org.apache.commons.math.exception.NullArgumentException(var0, (java.lang.Object[])var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(10L, 1795512867667309079L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-1911350515), (-1656171100));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-2.276056593552136d), 0.02191423518768043d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.0d, 1, 101);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var20 = new int[] { 1, 100, 0};
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    int var22 = org.apache.commons.math.util.MathUtils.distance1(var1, var20);
    int[] var24 = new int[] { (-1)};
    int[] var28 = new int[] { 1, 100, 0};
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    int var30 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var29);
    int[] var32 = new int[] { (-1)};
    int[] var36 = new int[] { 1, 100, 0};
    int[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    int var38 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var37);
    int var39 = org.apache.commons.math.util.MathUtils.distance1(var24, var32);
    int[] var43 = new int[] { 1, 100, 0};
    int[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var24, var43);
    int var46 = org.apache.commons.math.util.MathUtils.distance1(var1, var43);
    int[] var50 = new int[] { 1, 100, 0};
    int[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var43, var51);
    int[] var54 = new int[] { (-1)};
    int[] var58 = new int[] { 1, 100, 0};
    int[] var59 = org.apache.commons.math.util.MathUtils.copyOf(var58);
    int var60 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var59);
    int[] var62 = new int[] { (-1)};
    int[] var66 = new int[] { 1, 100, 0};
    int[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
    int var68 = org.apache.commons.math.util.MathUtils.distanceInf(var62, var67);
    int var69 = org.apache.commons.math.util.MathUtils.distance1(var54, var62);
    int[] var73 = new int[] { 1, 100, 0};
    int[] var74 = org.apache.commons.math.util.MathUtils.copyOf(var73);
    int var75 = org.apache.commons.math.util.MathUtils.distance1(var54, var73);
    int[] var76 = org.apache.commons.math.util.MathUtils.copyOf(var54);
    int[] var80 = new int[] { 1, 100, 0};
    int[] var81 = org.apache.commons.math.util.MathUtils.copyOf(var80);
    double var82 = org.apache.commons.math.util.MathUtils.distance(var54, var80);
    int[] var86 = new int[] { 1, 100, 0};
    int[] var87 = org.apache.commons.math.util.MathUtils.copyOf(var86);
    int var88 = org.apache.commons.math.util.MathUtils.distance1(var54, var87);
    int var89 = org.apache.commons.math.util.MathUtils.distance1(var43, var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var91 = org.apache.commons.math.util.MathUtils.copyOf(var43, (-30145599));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-1.5333870746439389d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.2090209834105576d));

  }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 990L);
//     java.math.BigInteger var5 = null;
//     java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, var5);
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    int var9 = org.apache.commons.math.util.MathUtils.hash(var6);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = var18.getDirection();
    boolean var22 = org.apache.commons.math.util.MathUtils.checkOrder(var13, var19, false, true);
    double[][] var23 = new double[][] { var13};
    org.apache.commons.math.util.MathUtils.sortInPlace(var6, var23);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double var37 = org.apache.commons.math.util.MathUtils.distance1(var32, var35);
    double var38 = org.apache.commons.math.util.MathUtils.distance1(var28, var32);
    double[] var40 = new double[] { (-1.0d)};
    double[] var42 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 0.027339371326677953d);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double[] var49 = new double[] { 1.0d, 10.0d};
    double[] var50 = org.apache.commons.math.util.MathUtils.copyOf(var49);
    double var51 = org.apache.commons.math.util.MathUtils.distance1(var46, var49);
    boolean var52 = org.apache.commons.math.util.MathUtils.equals(var40, var46);
    boolean var53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var32, var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var54 = org.apache.commons.math.util.MathUtils.distance1(var6, var40);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1814400.000000139d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Float.NaN, (-0.0f), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, 99L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-98L));

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(90, (-1911350513));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1911350603);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(786341870, 1911350603);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)' ');

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(99L, 6891033258142766080L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1893909151162593279L));

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1L), 1378206651628553216L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1378206651628553215L);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var7.tan();
    org.apache.commons.math.complex.Complex var9 = var8.acos();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var8.nthRoot((-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (-2), (-1));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var6 = var3.exp();
    double var7 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.09966865249116202d);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(6891033258142766080L, 1378206651628553215L);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.3440585709080678E43d, (-1911350513), (-30145599));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3628800.0d, (-0.3359937911718539d), 1010);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double[][] var22 = new double[][] { var19};
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var22);
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var31 = new double[] { 1.0d, 10.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double var37 = org.apache.commons.math.util.MathUtils.distance1(var32, var35);
    double var38 = org.apache.commons.math.util.MathUtils.distance1(var28, var32);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var41 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var32);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow((-989L), (-2));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1010, (-1911350515));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var7.tan();
    org.apache.commons.math.complex.Complex var9 = var8.acos();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var11 = var8.nthRoot(0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.exp();
    org.apache.commons.math.complex.Complex var18 = var12.subtract(var15);
    org.apache.commons.math.complex.Complex var19 = var15.exp();
    org.apache.commons.math.complex.Complex var20 = var19.exp();
    org.apache.commons.math.complex.Complex var21 = var20.sinh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException((-1911350515), 0);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)0.02191423518768043d, (java.lang.Number)(byte)(-1), false);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round((-1.0d), (-1911350515), 0);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-2), (-1795512867667309079L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1911350603, (-1911350515));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1911350603, 90);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-2));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(11013.232874703393d, (-1656171100), 1010);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var8 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.conjugate();
    java.lang.Object var10 = null;
    boolean var11 = var8.equals(var10);
    org.apache.commons.math.complex.Complex var12 = var8.sin();
    org.apache.commons.math.complex.Complex var13 = var8.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var18 = var13.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var19 = var4.add(var13);
    double var20 = var19.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 11901.05042145663d);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    boolean var13 = org.apache.commons.math.util.MathUtils.equals(var1, var7);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    boolean var20 = org.apache.commons.math.util.MathUtils.equals(var1, var17);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var26, (-1656171100));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test421() {}
//   public void test421() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var1 = null;
//     int[] var6 = new int[] { 1, 100, 0};
//     int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     java.lang.Object[] var8 = new java.lang.Object[] { var6};
//     org.apache.commons.math.exception.NotFiniteNumberException var9 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, (java.lang.Number)10, var8);
//     org.apache.commons.math.exception.NullArgumentException var10 = new org.apache.commons.math.exception.NullArgumentException(var0, var8);
//     java.lang.String var11 = var10.toString();
// 
//   }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1893909151162593279L), 1911350603);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8868003302922989569L);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(byte)100, (java.lang.Number)(-98L), false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, 100.0f, (-99));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round((-1.1909687824208959d), 786341969);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    double var4 = var3.getImaginary();
    org.apache.commons.math.complex.Complex var5 = var3.negate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-3.748403376781957E-9d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1147826214457093d, 3628800.0d, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(20.48290220493995d, 0.0d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)11013.232874703393d, (java.lang.Number)0.08338435247423098d, true);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the c