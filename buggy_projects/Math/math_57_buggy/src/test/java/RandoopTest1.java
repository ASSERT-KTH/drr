
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1048576), 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.000015f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.6293945E-6f);

  }

  public void test4() {}
//   public void test4() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = org.apache.commons.math.util.MathUtils.copyOf(var0);
// 
//   }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100997L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100897L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(7.6293945E-6f, 1.1920929E-7f, 127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.8378531015316313d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2178264933584275d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(-0.21418410704948732d));

  }

  public void test10() {}
//   public void test10() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }
// 
// 
//     double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
//     double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
//     double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
//     double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
//     double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
//     double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
//     double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
//     double[] var23 = null;
//     double var24 = org.apache.commons.math.util.MathUtils.distance1(var5, var23);
// 
//   }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)6, (java.lang.Number)1000L, 10);
    java.lang.Number var4 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1000L+ "'", var4.equals(1000L));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    double var2 = org.apache.commons.math.util.FastMath.IEEEremainder(1.1102230246251565E-16d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1102230246251565E-16d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(0.0d, 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(11013.232920103324d, (-1.6490605123312343d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.1609159201887137E-7d);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.1555516045788385d, 1.8378531015316313d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8378531015316313d);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(100.000015f, 1079574528, (-1));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    float[] var0 = new float[] { };
    float[] var1 = new float[] { };
    float[] var3 = new float[] { 100.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equals(var1, var3);
    float[] var5 = new float[] { };
    float[] var7 = new float[] { 100.0f};
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var5, var7);
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var5);
    float[] var10 = new float[] { };
    float[] var12 = new float[] { 100.0f};
    boolean var13 = org.apache.commons.math.util.MathUtils.equals(var10, var12);
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var10);
    float[] var15 = new float[] { };
    float[] var17 = new float[] { 100.0f};
    boolean var18 = org.apache.commons.math.util.MathUtils.equals(var15, var17);
    boolean var19 = org.apache.commons.math.util.MathUtils.equals(var10, var17);
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var17);
    float[] var21 = new float[] { };
    float[] var23 = new float[] { 100.0f};
    boolean var24 = org.apache.commons.math.util.MathUtils.equals(var21, var23);
    float[] var25 = new float[] { };
    float[] var27 = new float[] { 100.0f};
    boolean var28 = org.apache.commons.math.util.MathUtils.equals(var25, var27);
    boolean var29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    float[] var30 = new float[] { };
    float[] var32 = new float[] { 100.0f};
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var30, var32);
    boolean var34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var30);
    float[] var35 = new float[] { };
    float[] var37 = new float[] { 100.0f};
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var35, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var30, var37);
    float[] var40 = new float[] { };
    float[] var41 = new float[] { };
    float[] var43 = new float[] { 100.0f};
    boolean var44 = org.apache.commons.math.util.MathUtils.equals(var41, var43);
    float[] var45 = new float[] { };
    float[] var47 = new float[] { 100.0f};
    boolean var48 = org.apache.commons.math.util.MathUtils.equals(var45, var47);
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var43, var45);
    float[] var50 = new float[] { };
    float[] var52 = new float[] { 100.0f};
    boolean var53 = org.apache.commons.math.util.MathUtils.equals(var50, var52);
    boolean var54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var43, var50);
    float[] var55 = new float[] { };
    float[] var57 = new float[] { 100.0f};
    boolean var58 = org.apache.commons.math.util.MathUtils.equals(var55, var57);
    boolean var59 = org.apache.commons.math.util.MathUtils.equals(var50, var57);
    boolean var60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var57);
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var57);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    boolean var5 = var3.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var9, true);
    org.apache.commons.math.exception.MathRuntimeException var12 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var11);
    java.util.Set var13 = var11.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var14 = var3.centroidOf((java.util.Collection)var13);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    int[] var12 = new int[] { 100};
    int[] var16 = new int[] { (-1), 1, 1};
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    int[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var19 = org.apache.commons.math.util.MathUtils.distance1(var10, var12);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-127));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0f);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(2.4758800785707605E27d, (-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.4758800785707603E27d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 7.6293945E-6f, 0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(101, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    float var2 = org.apache.commons.math.util.FastMath.min(10.000002f, 10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000001f);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    int var2 = org.apache.commons.math.util.FastMath.min(101, 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(100.00001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.6293945E-6f);

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos((-1.7976931348623157E308d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(5729.5779513082325d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5730.0d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-110L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-1.5222953029988104d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.1503578729932837d));

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test35"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(4.019162876747147d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 54.65449664743416d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test36"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2146959360);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test37"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(9.536743E-7f, 0.7632208604112913d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536744E-7f);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test38"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test39"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(5.283185307179586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test40"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.00001f, 10.000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test41"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-137), 26214400);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2105540607));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test42"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test43"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, var1, false);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getMin();
    double[] var10 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.normalizeArray(var10, 1.0d);
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.5707963267948966d);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var14, 1.0038848218538872d);
    double[] var20 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 1.0d);
    double[] var26 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0d);
    double var29 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var28);
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var28, (-2.5049299045672764d));
    double[] var35 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.normalizeArray(var35, 1.0d);
    double[] var39 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, 1.5707963267948966d);
    double[] var43 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.normalizeArray(var43, 1.0d);
    double[] var49 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var51 = org.apache.commons.math.util.MathUtils.normalizeArray(var49, 1.0d);
    double var52 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var51);
    double var53 = org.apache.commons.math.util.MathUtils.distance(var37, var51);
    double var54 = org.apache.commons.math.util.MathUtils.safeNorm(var51);
    double[] var58 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var60 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 1.0d);
    double[] var62 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 0.8414709848078965d);
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var51, var58);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var51);
    double[][] var65 = new double[][] { var28};
    org.apache.commons.math.util.MathUtils.sortInPlace(var16, var65);
    var3.setContext("", (java.lang.Object)var16);
    boolean var68 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test44() {}
//   public void test44() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test44"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var5, true);
//     org.apache.commons.math.exception.MathRuntimeException var8 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var7);
//     java.util.Set var9 = var7.getContextKeys();
//     java.util.List var12 = var1.cluster((java.util.Collection)var9, 10, 1249902593);
// 
//   }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test45"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(54.65449664743416d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 54.65449664743416d);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test46"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(7.6293945E-6f, (-1.0f), 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test47"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1L, 3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4L);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test48"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.45185512475708767d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8996386380462555d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test49"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(4.019162876747147d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0993497799750993d);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test50"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(100L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test51"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.718281828459045d, (-0.6276125002048193d), 1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test52"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var8 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var1);
    org.apache.commons.math.util.MathUtils.OrderDirection var12 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var12, true);
    java.lang.Number var15 = var14.getArgument();
    java.util.Set var16 = var14.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var17 = var8.centroidOf((java.util.Collection)var16);
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
    assertTrue("'" + var15 + "' != '" + (short)10+ "'", var15.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test53"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1072694209, 128);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-528621567));

  }

  public void test54() {}
//   public void test54() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test54"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.3674899999943206d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test55"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-528621567), (-2113899425));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test56"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-137), 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 411);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test57"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(201, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 201);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-2114948001), 2146959360);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test59"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.1555516045788385d, 9.425947759839367E159d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1555516045788385d);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test60"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 0.0f, 1079574528);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test61"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 0.0f, 2146959360);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test62"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1249902593, (-127));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test63"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.5707963267948966d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test64"); }


    long var2 = org.apache.commons.math.util.FastMath.min(4L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test65"); }


    int var1 = org.apache.commons.math.util.FastMath.round(100.000015f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test66"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test67"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(9.425947759839367E159d, 0.8414709848078965d, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test68"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(12.751137675608902d, 3.0d, 1.8378531015316313d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test69"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.0f, 9.536744E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test70"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080678E43d);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test71"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8414709848078965d, 69.77631824865468d, 11013.232920103324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test72"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test73"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.00001f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test74"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(5730.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test75() {}
//   public void test75() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test75"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(9.536743E-7f, (-2105540607));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test76"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test77"); }
// 
// 
//     double[] var0 = null;
//     double[] var4 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 1.0d);
//     double[] var8 = org.apache.commons.math.util.MathUtils.normalizeArray(var6, 1.5707963267948966d);
//     double[] var12 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0d);
//     double[] var18 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 1.0d);
//     double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var20);
//     double var22 = org.apache.commons.math.util.MathUtils.distance(var6, var20);
//     double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
//     int var24 = org.apache.commons.math.util.MathUtils.hash(var20);
//     org.apache.commons.math.util.MathUtils.checkFinite(var20);
//     double var26 = org.apache.commons.math.util.MathUtils.distance(var0, var20);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test78"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test79"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.3440585709080678E43d, 1.9750137443868097E32d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test80"); }
// 
// 
//     double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
//     double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
//     double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
//     double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
//     double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
//     double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
//     double[] var27 = new double[] { 0.0d, 1.0d};
//     double var28 = org.apache.commons.math.util.MathUtils.safeNorm(var27);
//     org.apache.commons.math.util.MathUtils.checkOrder(var27);
//     java.lang.Number var34 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var34, 101);
//     org.apache.commons.math.util.MathUtils.OrderDirection var37 = var36.getDirection();
//     org.apache.commons.math.exception.NonMonotonousSequenceException var39 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var37, false);
//     boolean var42 = org.apache.commons.math.util.MathUtils.checkOrder(var27, var37, true, false);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var44 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100, (java.lang.Number)Double.NEGATIVE_INFINITY, 1079574528, var37, false);
//     boolean var47 = org.apache.commons.math.util.MathUtils.checkOrder(var5, var37, false, false);
//     double[] var48 = null;
//     double var49 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var48);
// 
//   }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test81"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(6.123233995736767E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.123233995736767E-17d);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test82"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(5730.0d, 5729.5779513082325d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test83"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.1189396031849526d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.048806645320670736d);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test84"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(9.425947759839367E159d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test85"); }


    double[] var0 = null;
    double[][] var1 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var0, var1);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test86() {}
//   public void test86() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test86"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 101000L);
// 
//   }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test87"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(4.019162876747147d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6132631621779496d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test88"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 0.0f, 100.000015f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test89"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test90"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.1609159201887137E-7d, 171.88733853924697d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 169.6460035099404d);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test91"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.0993497799750993d, 0.7509157763716767d, 5730.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test92"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test93"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-31.884770305757485d), Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test94"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test95"); }
// 
// 
//     double var3 = org.apache.commons.math.util.MathUtils.round(Double.NaN, 784635905, (-2105540607));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Double.NaN);
// 
//   }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test96"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(3L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3L);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test97"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test98"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(12.751137675608902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test99"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.000001f);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test100"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(169.6460035099404d, 10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 169.6460035099404d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test101"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1249902593, 784635905);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test102"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.547657737556848d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2440489289239585d);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test103"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(2.99822295029797d, 69.77631824865468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.99822295029797d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test104"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8414709848078965d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test105"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(100997L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test106"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(10.000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test107"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(1.7320508075688774d, 0.04882604308023237d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7327388673665958d);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test108"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test109() {}
//   public void test109() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test109"); }
// 
// 
//     double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
//     double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
//     double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
//     double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
//     double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
//     double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
//     double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
//     int var23 = org.apache.commons.math.util.MathUtils.hash(var5);
//     double[] var27 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 1.0d);
//     double[] var33 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var33, 1.0d);
//     double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var35);
//     double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
//     boolean var38 = org.apache.commons.math.util.MathUtils.equals(var5, var35);
//     double[] var39 = null;
//     double var40 = org.apache.commons.math.util.MathUtils.distance(var35, var39);
// 
//   }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test110"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0f, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test111"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(26214400);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test112() {}
//   public void test112() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test112"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-0.6276125002048193d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test113"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test114"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5872139151569291d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test115"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(3, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 33);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test116"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.8378531015316315d);
    java.lang.Throwable[] var2 = var1.getSuppressed();
    boolean var3 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test117"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-53), 127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1421439005));

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test118"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test119"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(69.77631824865468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test120"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715202004E-14d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test121"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(6.123233995736766E-17d, 1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.123233995736766E-17d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test122"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(3, 411);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test123"); }


    float var3 = org.apache.commons.math.util.MathUtils.round(1.0f, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test124"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(784635905, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test125"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-2114948138));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test126"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 0.8414709848078965d);
    double[] var13 = new double[] { 0.0d, 1.0d};
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    org.apache.commons.math.util.MathUtils.checkOrder(var13);
    java.lang.Number var20 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var22 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var20, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var23 = var22.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var25 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var23, false);
    boolean var28 = org.apache.commons.math.util.MathUtils.checkOrder(var13, var23, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100, (java.lang.Number)Double.NEGATIVE_INFINITY, 1079574528, var23, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var33 = org.apache.commons.math.util.MathUtils.checkOrder(var7, var23, true, true);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test127"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-2.5049299045672764d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5945153259264286d));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test128"); }


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
    int var23 = org.apache.commons.math.util.MathUtils.hash(var19);
    org.apache.commons.math.util.MathUtils.checkFinite(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var19);
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
    assertTrue(var23 == (-2114948001));

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(11013.232920103324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.5045996724326973d));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test130"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.4711276743037347d, 1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4711276743037347d);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test131"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-0.45185512475708767d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test132"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test133"); }
// 
// 
//     double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
//     org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
//     boolean var9 = org.apache.commons.math.util.MathUtils.checkOrder(var5, var6, false, false);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test134"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(2.475880078570761E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4185747908262327E29d);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test135"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm((-2113899425), (-1048576));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test136"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(3L, 127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3080657310641694891L);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test137"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.16991654217614283d), 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test138() {}
//   public void test138() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test138"); }
// 
// 
//     int[] var0 = null;
//     int[] var2 = new int[] { 100};
//     int[] var6 = new int[] { (-1), 1, 1};
//     int var7 = org.apache.commons.math.util.MathUtils.distance1(var2, var6);
//     int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     int[] var10 = new int[] { 100};
//     int[] var14 = new int[] { (-1), 1, 1};
//     int var15 = org.apache.commons.math.util.MathUtils.distance1(var10, var14);
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var16 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var14);
//     double var17 = org.apache.commons.math.util.MathUtils.distance(var8, var14);
//     double var18 = org.apache.commons.math.util.MathUtils.distance(var0, var8);
// 
//   }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test139"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)Double.NaN, (java.lang.Number)(byte)100, true);
    var4.setContext("", (java.lang.Object)127);
    java.lang.Throwable[] var8 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test140"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1421439005));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test141"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1048576), 411);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1048987));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test142"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(69.77631824865468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0056340903971724E30d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test143"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(69.77631824865468d, 128);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.3743650728680885E40d);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test144"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-2.5049299045672764d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.08168132327233309d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test145"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test146"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.08168132327233309d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0014256080284880813d);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test147"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (-1100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1100L));

  }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test148"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.2440489289239585d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test149"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.1555516045788385d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7680466558040403d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test150"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var7 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var5);
    int[] var8 = var7.getPoint();
    int[] var11 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var12 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var11);
    boolean var14 = var12.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var15 = var7.distanceFrom(var12);
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test151"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(0L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test152"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(34.87010242033826d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test153"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.4185747908262327E29d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test154"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.0038848218538872d);
    double[] var13 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 1.0d);
    double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var15, 1.5707963267948966d);
    double[] var21 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var21, 1.0d);
    double[] var27 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 1.0d);
    double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var29);
    double var31 = org.apache.commons.math.util.MathUtils.distance(var15, var29);
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var15);
    double[] var36 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0d);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 1.5707963267948966d);
    double[] var44 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, 1.0d);
    double[] var50 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var52 = org.apache.commons.math.util.MathUtils.normalizeArray(var50, 1.0d);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var52);
    double var54 = org.apache.commons.math.util.MathUtils.distance(var38, var52);
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    int var56 = org.apache.commons.math.util.MathUtils.hash(var52);
    org.apache.commons.math.util.MathUtils.checkFinite(var52);
    boolean var58 = org.apache.commons.math.util.MathUtils.equals(var7, var52);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var7);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test155"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-528621567), 2146959360);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test156"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.03490658503988659d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test157"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(2.1609159201887137E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.648565284244929E-4d);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test158"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(69.77631824865468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test159"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-1100L), 3080657310641694891L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3080657310641694891L);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test160"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(9.999999f, (-1.0f), 10.000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test161"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test162"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(0.5872139151569291d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5872139151569291d);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test163"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(0.0d, (-127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test164"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-528621567), 1249902593);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-528621567));

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test165"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(127, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.224316764644975E15d);

  }

  public void test166() {}
//   public void test166() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test166"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy var1 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var2 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0, var1);
//     java.util.Collection var3 = null;
//     java.util.List var6 = var2.cluster(var3, (-2113899425), 201);
// 
//   }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test167"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(2.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0f);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test168"); }


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
    double[] var26 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0d);
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 0.8414709848078965d);
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var26, (-1421439005));
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
    assertTrue(var22 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test169"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test170"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.0038848218538874d, 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0077847355486111d);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test171"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(784635905);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test172"); }


    long var2 = org.apache.commons.math.util.FastMath.min(100997L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test173"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-23));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test174"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test175"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(128);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test176"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.7320508075688772d, 1.0d, 1.8184464592320668d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test177"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test178"); }


    org.apache.commons.math.exception.MathRuntimeException var0 = new org.apache.commons.math.exception.MathRuntimeException();
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, var2, false);
    boolean var5 = var4.getBoundIsAllowed();
    java.lang.Number var6 = var4.getMin();
    java.lang.Number var7 = var4.getMin();
    var0.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.apache.commons.math.exception.MathRuntimeException: "+ "'", var9.equals("org.apache.commons.math.exception.MathRuntimeException: "));

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test179"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-738962168), 1);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test180"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.000002f, 10.000001f, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test181"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)2.99822295029797d);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test182"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.4185747908262327E29d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6475434656816703d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test183"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(0.0d, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test184() {}
//   public void test184() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test184"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(2.0f, 101);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test185"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(720L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 720L);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test186"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.2440489289239585d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.21837132547595003d);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test187"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, var1, false);
    org.apache.commons.math.exception.MathRuntimeException var4 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var3);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test188"); }


    long var2 = org.apache.commons.math.util.FastMath.max(3080657310641694891L, 720L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3080657310641694891L);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test189"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 1.8378531015316313d, (-1.1503578729932837d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test190"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var5, 0);
    java.lang.Number var16 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var16, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = var18.getDirection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var22 = org.apache.commons.math.util.MathUtils.checkOrder(var14, var19, true, false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test191"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var5);
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

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test192"); }


    double[] var2 = new double[] { (-1.0d), 0.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test193"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-1100L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test194"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test195"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test196"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0f, 100.00000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test197"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.000002f, Float.NaN, (-528621567));

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test198"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(0.0d, 0.5872139151569291d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5872139151569291d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test199"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(107, (-1048576));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 112197632);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test200"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536743E-7f);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test201"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.0014256080284880813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0014256085113791702d);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test202"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.9E-324d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test203"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.21418410704948732d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test204"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.0f, 100.00001f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test205"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.4185747908262327E29d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5188665760885071d));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test206"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(101.0099005048515d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 102.0d);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test207"); }


    java.lang.Object var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.NullArgumentException var4 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var5 = new org.apache.commons.math.exception.NullArgumentException();
    var4.addSuppressed((java.lang.Throwable)var5);
    org.apache.commons.math.exception.util.Localizable var7 = null;
    java.lang.Object[] var9 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var10 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var4, var7, var9);
    org.apache.commons.math.exception.NotFiniteNumberException var11 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var9);
    org.apache.commons.math.exception.MathArithmeticException var12 = new org.apache.commons.math.exception.MathArithmeticException(var2, var9);
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.NotPositiveException var16 = new org.apache.commons.math.exception.NotPositiveException(var14, (java.lang.Number)1);
    org.apache.commons.math.exception.util.Localizable var17 = null;
    java.lang.Number var18 = null;
    java.lang.Object[] var20 = new java.lang.Object[] { false};
    org.apache.commons.math.exception.NotFiniteNumberException var21 = new org.apache.commons.math.exception.NotFiniteNumberException(var18, var20);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)1, var17, var20);
    var12.addMessage(var13, var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkNotNull(var0, var1, var20);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test208"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-2105540607), (-53));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2105540554));

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test209"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 1.2178264933584275d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test210"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test211"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.04880664532067082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04882602458781054d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test212"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test213"); }


    org.apache.commons.math.exception.NullArgumentException var1 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var2 = new org.apache.commons.math.exception.NullArgumentException();
    var1.addSuppressed((java.lang.Throwable)var2);
    org.apache.commons.math.exception.util.Localizable var4 = null;
    java.lang.Object[] var6 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var7 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var1, var4, var6);
    org.apache.commons.math.exception.NotFiniteNumberException var8 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var6);
    java.util.Set var9 = var8.getContextKeys();
    java.lang.Object var11 = var8.getContext("org.apache.commons.math.exception.NumberIsTooSmallException: 10 is smaller than, or equal to, the minimum (null)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test214"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 11, 1249902593);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test215"); }


    double[] var2 = new double[] { 0.0d, 1.0d};
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    org.apache.commons.math.util.MathUtils.checkOrder(var2);
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var10 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var8, true);
    org.apache.commons.math.exception.MathRuntimeException var11 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var10);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    double[] var16 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 1.0d);
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 1.5707963267948966d);
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 1.0038848218538872d);
    double[] var26 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0d);
    double[] var32 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 1.0d);
    double var35 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var34);
    double[] var37 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, (-2.5049299045672764d));
    double[] var41 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.0d);
    double[] var45 = org.apache.commons.math.util.MathUtils.normalizeArray(var43, 1.5707963267948966d);
    double[] var49 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var51 = org.apache.commons.math.util.MathUtils.normalizeArray(var49, 1.0d);
    double[] var55 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.normalizeArray(var55, 1.0d);
    double var58 = org.apache.commons.math.util.MathUtils.distanceInf(var51, var57);
    double var59 = org.apache.commons.math.util.MathUtils.distance(var43, var57);
    double var60 = org.apache.commons.math.util.MathUtils.safeNorm(var57);
    double[] var64 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var64, 1.0d);
    double[] var68 = org.apache.commons.math.util.MathUtils.normalizeArray(var64, 0.8414709848078965d);
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var57, var64);
    double var70 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var57);
    double[][] var71 = new double[][] { var34};
    org.apache.commons.math.util.MathUtils.sortInPlace(var22, var71);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var10, var12, (java.lang.Object[])var71);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var2, var71);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test216"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(128, 1079574528);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test217"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.1189396031849523d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8996379399296266d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test218"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.7327388673665958d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test219"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Throwable var2 = null;
    org.apache.commons.math.exception.MathRuntimeException var3 = new org.apache.commons.math.exception.MathRuntimeException(var2);
    org.apache.commons.math.exception.util.Localizable var4 = null;
    var3.addMessage(var4);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 11013.232920103324d};
    var3.addMessage(var6, var8);
    org.apache.commons.math.exception.NotFiniteNumberException var10 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)(-738962168), var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test220"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.6475434656816703d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0841394769769577d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test221"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1079574528, (-1421439005));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test222"); }


    long var2 = org.apache.commons.math.util.FastMath.max(1010L, 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1010L);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test223"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test224"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(100.0d, 1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0d);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test225"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb(0.0f, (-127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test226"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.999999f, 1.1920929E-7f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test227"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test228() {}
//   public void test228() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test228"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(5.283185307179586d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test229"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)Double.NaN, (java.lang.Number)(short)1, true);
    org.apache.commons.math.exception.util.Localizable var4 = null;
    var3.addMessage(var4);
    java.lang.Number var6 = var3.getMin();
    java.util.Set var7 = var3.getContextKeys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)1+ "'", var6.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test230"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-2105540607), (-1100L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test231"); }


    float[] var0 = new float[] { };
    float[] var2 = new float[] { 100.0f};
    boolean var3 = org.apache.commons.math.util.MathUtils.equals(var0, var2);
    float[] var4 = new float[] { };
    float[] var6 = new float[] { 100.0f};
    boolean var7 = org.apache.commons.math.util.MathUtils.equals(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
    float[] var9 = new float[] { };
    float[] var11 = new float[] { 100.0f};
    boolean var12 = org.apache.commons.math.util.MathUtils.equals(var9, var11);
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var11);
    float[] var14 = null;
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var14);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Object[] var17 = null;
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var15, var16, var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test232"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 1.8378531015316313d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test233"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test234"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.16991654217614283d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.17074497917308024d));

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test235"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1048576));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test236"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test237"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(10.000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test238"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.6132631621779496d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2L);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test239"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536743E-7f);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test240"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.7976931348623157E308d), 0.8996379399296266d, 26214400);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test241"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 101);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var11 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var10, (-2105540607));
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test242"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.2440489289239585d, 1.8378531015316313d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8378531015316313d);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test243"); }


    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)169.6460035099404d);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test244"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0014256085113791702d, 2.475880078570761E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test245"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(112197632, (-2105540607));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test246"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.8184464592320668d, 1.8184464592320668d, (-1421439005));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test247"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test248"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(11013.232920103324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test249"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1249902593, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test250"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test251"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test252"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.8996386380462555d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test253"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(4.019162876747147d, 1.7320508075688772d, 2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test254"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test255"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.00001f, 9.536743E-7f, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test256"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.048806645320670736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7964147890663615d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test257"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(100997L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test258"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.8378531015316315d, 1.3517546257973585d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3517546257973585d);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test259"); }


    java.lang.Number var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, var1, false);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NumberIsTooLargeException: null is larger than, or equal to, the maximum (null)"+ "'", var4.equals("org.apache.commons.math.exception.NumberIsTooLargeException: null is larger than, or equal to, the maximum (null)"));

  }

  public void test260() {}
//   public void test260() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test260"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 10L);
// 
//   }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test261"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-53));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test262"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)11, (java.lang.Number)12, false);
    boolean var5 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test263"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(101.0099005048515d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 202.019801009703d);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test264"); }


    double var2 = org.apache.commons.math.util.FastMath.max(2.4758800785707605E27d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.4758800785707605E27d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test265"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var8 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var1);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var10, 2146959360);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test266"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(33, (-1464846667));

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test267"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10, 784635905);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-784635895));

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test268"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(26214400, (-1048576));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 27262976);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test269"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(3.99168E7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.99168E7d);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test270"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 12, 1079574528);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test271"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(7.6293945E-6f, 9.536744E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test272"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100.00000000000001d, (java.lang.Number)1.1189396031849526d, true);
    java.lang.String var4 = var3.toString();
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.util.Localizable var8 = null;
    org.apache.commons.math.exception.NullArgumentException var9 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var10 = new org.apache.commons.math.exception.NullArgumentException();
    var9.addSuppressed((java.lang.Throwable)var10);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.lang.Object[] var14 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var15 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var9, var12, var14);
    org.apache.commons.math.exception.MathIllegalStateException var16 = new org.apache.commons.math.exception.MathIllegalStateException(var8, var14);
    org.apache.commons.math.exception.MathIllegalArgumentException var17 = new org.apache.commons.math.exception.MathIllegalArgumentException(var7, var14);
    org.apache.commons.math.exception.NotFiniteNumberException var18 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)(-1.7976931348623157E308d), var14);
    org.apache.commons.math.exception.MathArithmeticException var19 = new org.apache.commons.math.exception.MathArithmeticException(var5, var14);
    var3.addSuppressed((java.lang.Throwable)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 100 is smaller than the minimum (1.119)"+ "'", var4.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 100 is smaller than the minimum (1.119)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test273"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.04882604308023237d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.04882604308023236d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test274"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(784635905, (-127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test275"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.3132616875182228d, 1.8378531015316315d, 2146959360);

  }

  public void test276() {}
//   public void test276() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test276"); }
// 
// 
//     org.apache.commons.math.exception.NullArgumentException var0 = new org.apache.commons.math.exception.NullArgumentException();
//     double[] var5 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.0d);
//     double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.5707963267948966d);
//     double[] var13 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 1.0d);
//     double[] var19 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 1.0d);
//     double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var21);
//     double var23 = org.apache.commons.math.util.MathUtils.distance(var7, var21);
//     double[] var25 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 2.718281828459045d);
//     var0.setContext("(10,1)", (java.lang.Object)var7);
//     double[] var27 = null;
//     double var28 = org.apache.commons.math.util.MathUtils.distance(var7, var27);
// 
//   }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test277"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test278"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(26214400, 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test279"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test280"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test281"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test282"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(4.019162876747147d, (-1421439005));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test283() {}
//   public void test283() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test283"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.NullArgumentException var2 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var3 = new org.apache.commons.math.exception.NullArgumentException();
//     var2.addSuppressed((java.lang.Throwable)var3);
//     org.apache.commons.math.exception.util.Localizable var5 = null;
//     java.lang.Object[] var7 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var8 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var2, var5, var7);
//     org.apache.commons.math.exception.NotFiniteNumberException var9 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var7);
//     org.apache.commons.math.exception.MathArithmeticException var10 = new org.apache.commons.math.exception.MathArithmeticException(var0, var7);
//     org.apache.commons.math.exception.util.Localizable var11 = null;
//     org.apache.commons.math.exception.util.Localizable var12 = null;
//     org.apache.commons.math.exception.NotPositiveException var14 = new org.apache.commons.math.exception.NotPositiveException(var12, (java.lang.Number)1);
//     org.apache.commons.math.exception.util.Localizable var15 = null;
//     java.lang.Number var16 = null;
//     java.lang.Object[] var18 = new java.lang.Object[] { false};
//     org.apache.commons.math.exception.NotFiniteNumberException var19 = new org.apache.commons.math.exception.NotFiniteNumberException(var16, var18);
//     org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)1, var15, var18);
//     var10.addMessage(var11, var18);
//     org.apache.commons.math.exception.MathRuntimeException var22 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var10);
// 
//   }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test284"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-23));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test285"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.8996379399296266d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test286"); }


    float var3 = org.apache.commons.math.util.MathUtils.round(2.0f, (-1421439005), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Float.POSITIVE_INFINITY);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test287"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-31.884770305757485d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.155521474243959d));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test288"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-53), (java.lang.Number)0.7853981633974482d, false);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test289"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.4185747908262327E29d, (-1.7976931348623157E308d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4185747908262327E29d);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test290"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1048576), 10);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test291"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test292"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.000002f, (-1.0f), (-23));

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test293"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.3674899999943206d, (-0.16991654217614283d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test294"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(9.999999f, 1.4E-45f, 201);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test295"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, (-784635895));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test296"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.000001f, 10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000001f);

  }

  public void test297() {}
//   public void test297() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test297"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 4L);
// 
//   }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test298"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, (java.lang.Number)1.4210854715202004E-14d, false);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getMin();
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.4210854715202004E-14d+ "'", var5.equals(1.4210854715202004E-14d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (0)"+ "'", var6.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (0)"));

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test299"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, 0.0f, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test300"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, 1.0f, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test301"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(10.0d, (-1464846667), 10100);
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test302"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 27262976);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test303"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.0014256085113791702d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0014256080284876886d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test304"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-738962168));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test305"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-784635895));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test306"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-2114948138), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2114948138));

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test307"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1048987));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test308"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(3080657310641694891L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test309"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test310"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-0.5188665760885071d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5951947737947947d);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test311"); }


    int var1 = org.apache.commons.math.util.FastMath.round(2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test312"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.0f, 10.000002f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test313"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(2L, 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test314"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-1.7976931348623157E308d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test315"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test316"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.5872139151569291d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test317() {}
//   public void test317() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test317"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
//     java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var2, var3);
// 
//   }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test318"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(2.1609159201887137E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.1609159195357108E-7d);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test319"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(7.6293945E-6f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.6293945E-6f);

  }

  public void test320() {}
//   public void test320() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test320"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var0, 100997L);
// 
//   }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test321"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.IEEEremainder(2.718281828459045d, 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test322"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-110L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test323"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test324() {}
//   public void test324() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test324"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(3.99168E7d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test325"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.0014256085113791702d, 0.04882602458781054d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4607690665267697d);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test326"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.7964147890663615d, 0.04882604308023237d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.7964147890663615d);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test327"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-100L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test328() {}
//   public void test328() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test328"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-4.155521474243959d), 1.3132616875182228d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test329"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(101.0099005048515d, 1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3440585709080678E43d);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test330"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072694209, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test331"); }


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
    double[] var24 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 3.0d);
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double[] var29 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 1.0d);
    boolean var32 = org.apache.commons.math.util.MathUtils.equals(var25, var29);
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 12.751137675608902d);
    java.lang.Number var36 = null;
    java.lang.Number var39 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var41 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var39, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var42 = var41.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var44 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.8184464592320668d, var36, 3, var42, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var25, var42, false);
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test332"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1048576));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test333"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1, 10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test334"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)1010L, (java.lang.Number)7.6293945E-6f, false);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test335"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var3, true);
    org.apache.commons.math.exception.MathRuntimeException var6 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var5);
    org.apache.commons.math.exception.util.Localizable var7 = null;
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 1.5707963267948966d);
    double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var15, 1.0038848218538872d);
    double[] var21 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var21, 1.0d);
    double[] var27 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 1.0d);
    double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var29);
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, (-2.5049299045672764d));
    double[] var36 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0d);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 1.5707963267948966d);
    double[] var44 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, 1.0d);
    double[] var50 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var52 = org.apache.commons.math.util.MathUtils.normalizeArray(var50, 1.0d);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var52);
    double var54 = org.apache.commons.math.util.MathUtils.distance(var38, var52);
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double[] var59 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 1.0d);
    double[] var63 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 0.8414709848078965d);
    boolean var64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var59);
    double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var52);
    double[][] var66 = new double[][] { var29};
    org.apache.commons.math.util.MathUtils.sortInPlace(var17, var66);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var5, var7, (java.lang.Object[])var66);
    java.lang.Number var69 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + (short)10+ "'", var69.equals((short)10));

  }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test336"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-1.6490605123312343d), (java.lang.Number)1.9750137443868097E32d, false);
//     java.lang.String var5 = var4.toString();
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test337"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.7453292519943295d, 0.21837132547595003d, (-53));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test338"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 720.0d);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test339"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(2146959360);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test340"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(6.123233995736766E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.123233995736766E-17d);

  }

  public void test341() {}
//   public void test341() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test341"); }
// 
// 
//     int[] var1 = new int[] { 100};
//     int[] var5 = new int[] { (-1), 1, 1};
//     int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
//     int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var5);
//     int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var7, 201);
//     int[] var10 = null;
//     double var11 = org.apache.commons.math.util.MathUtils.distance(var9, var10);
// 
//   }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test342"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-137), 784635905);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test343"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(2146959360);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test344() {}
//   public void test344() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test344"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(169.6460035099404d, (-1.6490605123312343d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test345"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-110L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test346"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test347"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-1.6490605123312343d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test348"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(0.048806645320670736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-5));

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test349"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(108, (-1464846667));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test350"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(171.88733853924697d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.463984075193098E74d);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test351"); }


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
    int var23 = org.apache.commons.math.util.MathUtils.hash(var19);
    java.lang.Number var25 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var25, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var28 = var27.getDirection();
    double[] var32 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 1.0d);
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, 1.5707963267948966d);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0038848218538872d);
    double[] var42 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var42, 1.0d);
    double[] var48 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 1.0d);
    double var51 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var50);
    double[] var53 = org.apache.commons.math.util.MathUtils.normalizeArray(var50, (-2.5049299045672764d));
    double[] var57 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var59 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 1.0d);
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 1.5707963267948966d);
    double[] var65 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.normalizeArray(var65, 1.0d);
    double[] var71 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var73 = org.apache.commons.math.util.MathUtils.normalizeArray(var71, 1.0d);
    double var74 = org.apache.commons.math.util.MathUtils.distanceInf(var67, var73);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var59, var73);
    double var76 = org.apache.commons.math.util.MathUtils.safeNorm(var73);
    double[] var80 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var82 = org.apache.commons.math.util.MathUtils.normalizeArray(var80, 1.0d);
    double[] var84 = org.apache.commons.math.util.MathUtils.normalizeArray(var80, 0.8414709848078965d);
    boolean var85 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var73, var80);
    double var86 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var73);
    double[][] var87 = new double[][] { var50};
    org.apache.commons.math.util.MathUtils.sortInPlace(var38, var87);
    org.apache.commons.math.util.MathUtils.sortInPlace(var19, var28, var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var19);
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
    assertTrue(var23 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test352"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(108, 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 18);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test353"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0000002f);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test354"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.6085980977425465d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test355"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.1920929E-7f, (-2105540607));

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test356"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(112197632, 1072694209);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test357"); }


    float var2 = org.apache.commons.math.util.FastMath.min(1.1920929E-7f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1920929E-7f);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test358"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test359"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(100.0f, 10.0f, 112197632);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test360"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-1100L), (-110L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 110L);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test361"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.547657737556848d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test362"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(103, (-2105540607));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test363"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(11013.232920103324d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test364() {}
//   public void test364() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test364"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = null;
//     double var2 = org.apache.commons.math.util.MathUtils.distance1(var0, var1);
// 
//   }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test365"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(4.463984075193098E74d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.791121986871369E72d);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test366"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.6085980977425464d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test367"); }


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
    double var27 = var14.distanceFrom(var26);
    int[] var28 = var26.getPoint();
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var29 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var28);
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
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var40 = var29.centroidOf((java.util.Collection)var39);
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
    
    /