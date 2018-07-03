
import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(720L, 101000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100280L));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.5951947737947947d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(56.548667764616276d, 0.8996379399296266d, 0.21837132547595003d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(11, (-20));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-220));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.3674899999943206d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3674899999943206d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-2105540554), 13716);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2105526838));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(6.123233995736767E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-2105540554), 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1072694209, (-53));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.2178264933584275d, 56.548667764616276d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.2178264933584277d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.425947759839367E159d, 0.0d, (-220));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }


    double[] var2 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    org.apache.commons.math.util.MathUtils.checkOrder(var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var2);
    double[] var8 = new double[] { 0.0d, 1.0d};
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    org.apache.commons.math.util.MathUtils.checkOrder(var8);
    java.lang.Number var15 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var15, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = var17.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var18, false);
    boolean var23 = org.apache.commons.math.util.MathUtils.checkOrder(var8, var18, true, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var2, var18, true);
    double[] var29 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 1.0d);
    double[] var35 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.normalizeArray(var35, 1.0d);
    double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var37);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, (-2.5049299045672764d));
    double var41 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1.0d);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.6085980977425465d, 12.751137675608902d, 1.0077847355486111d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    int var23 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var27 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 1.0d);
    double[] var33 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var33, 1.0d);
    double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var35);
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var5, var35);
    double[] var42 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var42, 1.0d);
    double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, 1.5707963267948966d);
    int var47 = org.apache.commons.math.util.MathUtils.hash(var44);
    double[] var51 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.normalizeArray(var51, 1.0d);
    double[] var55 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 1.5707963267948966d);
    double[] var59 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 1.0d);
    double[] var65 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.normalizeArray(var65, 1.0d);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var67);
    double var69 = org.apache.commons.math.util.MathUtils.distance(var53, var67);
    double var70 = org.apache.commons.math.util.MathUtils.safeNorm(var53);
    int var71 = org.apache.commons.math.util.MathUtils.hash(var53);
    double var72 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var53);
    double var73 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var53);
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
    assertTrue(var22 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(2.220446049250313E-16d, 0.8071997601754675d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.220446049250313E-16d);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Float.POSITIVE_INFINITY);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.8378531015316313d, 1072694209, (-5));
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.7453292519943298d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-5.671281819617704d));

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }


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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.000015f, 100.000015f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.7632208604112913d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8395059254591507d);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1), (java.lang.Number)(-1.1503578729932837d), false);
    java.lang.Number var5 = var4.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-1.1503578729932837d)+ "'", var5.equals((-1.1503578729932837d)));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(3.7949724984003583d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9989894931045785d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }


    org.apache.commons.math.exception.NullArgumentException var1 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var2 = new org.apache.commons.math.exception.NullArgumentException();
    var1.addSuppressed((java.lang.Throwable)var2);
    org.apache.commons.math.exception.util.Localizable var4 = null;
    java.lang.Object[] var6 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var7 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var1, var4, var6);
    org.apache.commons.math.exception.NotFiniteNumberException var8 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var6);
    java.lang.String var9 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.apache.commons.math.exception.NotFiniteNumberException: 0 is not a finite number"+ "'", var9.equals("org.apache.commons.math.exception.NotFiniteNumberException: 0 is not a finite number"));

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(26214400, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.0023994079829557E21d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.984807753012208d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var9 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var8, (-2105526838));
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

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)0.0f, (-127), var3, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double[] var24 = org.apache.commons.math.util.MathUtils.normalizeArray(var22, 56.548667764616276d);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


    float[] var0 = null;
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
    float[] var20 = new float[] { };
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
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var37);
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var37);
    boolean var42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var37);
    
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
    assertNotNull(var20);
    
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
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-2114948001), (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2114948001));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(10L, (-110L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(12.751137675608902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 172472.05374275087d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(13716);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.048806645320670736d, 3.0023994079829557E21d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.0023994079829557E21d);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(2.99822295029797d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.0d);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1072694309, 101000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2073552671));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.04880666379108919d, 1.3517546257973585d, 1650129271);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(33, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 33);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.000015f, 10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-137), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 137);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    long var2 = org.apache.commons.math.util.FastMath.max(20L, 1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1000L);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, (-2.5049299045672764d));
    int var15 = org.apache.commons.math.util.MathUtils.hash(var11);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-2114948001));

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-2.5049299045672764d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test47"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(0.0d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test48"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.00001f, 2.0000002f, 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test49"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-1.7976931348623157E308d), 0.7680466558040403d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.7976931348623155E308d));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test50"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(202.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 202.0d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test51"); }


    java.lang.Number var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, var1, false);
    var3.setContext("", (java.lang.Object)10.000001f);
    java.lang.Number var7 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1079574528, (-1421439005));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test53"); }


    java.lang.Number var1 = null;
    java.lang.Number var4 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var4, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.8184464592320668d, var1, 3, var7, true);
    java.lang.Number var10 = var9.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test54"); }


    float var3 = org.apache.commons.math.util.MathUtils.round(2.0f, 12, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 2.0f);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test55"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(27262976, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.251278719471049E67d);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test56"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.8378531015316313d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.221096745241321d);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test57"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-34.06321903142893d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test58"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-0.5945153259264286d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5641161431069407d));

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test59"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(2.99822295029797d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test60"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test61"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(11013.232920103324d, 0.7632208604112913d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test62"); }


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
    org.apache.commons.math.stat.clustering.Cluster var30 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var29);
    int[] var33 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var34 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var33);
    boolean var36 = var34.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var37 = new float[] { };
    float[] var39 = new float[] { 100.0f};
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var37, var39);
    boolean var41 = var34.equals((java.lang.Object)var39);
    int[] var44 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var45 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var44);
    boolean var47 = var45.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var48 = new float[] { };
    float[] var50 = new float[] { 100.0f};
    boolean var51 = org.apache.commons.math.util.MathUtils.equals(var48, var50);
    boolean var52 = var45.equals((java.lang.Object)var50);
    double var53 = var34.distanceFrom(var45);
    int[] var56 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var57 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var56);
    double var58 = var45.distanceFrom(var57);
    int[] var59 = var57.getPoint();
    var30.addPoint((org.apache.commons.math.stat.clustering.Clusterable)var57);
    int[] var61 = var57.getPoint();
    
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
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test63"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test64"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(27262976, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test65"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var5, 0);
    int var15 = org.apache.commons.math.util.MathUtils.hash(var14);
    
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
    assertTrue(var15 == 1);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1464846667), 784635905);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test67"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(100L, 100997L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101097L);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test68"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(11, 1072694209);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test69"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(2.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test70"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.45185512475708767d), Double.POSITIVE_INFINITY, 5730.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test71"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    org.apache.commons.math.stat.clustering.Cluster var4 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var3);
    int[] var7 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var8 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var7);
    boolean var10 = var8.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var11 = new float[] { };
    float[] var13 = new float[] { 100.0f};
    boolean var14 = org.apache.commons.math.util.MathUtils.equals(var11, var13);
    boolean var15 = var8.equals((java.lang.Object)var13);
    int[] var18 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var19 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var18);
    boolean var21 = var19.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var22 = new float[] { };
    float[] var24 = new float[] { 100.0f};
    boolean var25 = org.apache.commons.math.util.MathUtils.equals(var22, var24);
    boolean var26 = var19.equals((java.lang.Object)var24);
    double var27 = var8.distanceFrom(var19);
    org.apache.commons.math.stat.clustering.Cluster var28 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var8);
    double var29 = var3.distanceFrom(var8);
    org.apache.commons.math.stat.clustering.Cluster var30 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var3);
    boolean var32 = var3.equals((java.lang.Object)2.0294796157150414d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test72"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(1.044582220834825d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1069.6521941348608d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test73"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(101000L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test74"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(128, 128);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test75"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 103);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test76"); }


    double[] var2 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    org.apache.commons.math.util.MathUtils.checkOrder(var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var2);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var2, 4.440892098500626E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test77"); }


    org.apache.commons.math.exception.NullArgumentException var0 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var1 = new org.apache.commons.math.exception.NullArgumentException();
    var0.addSuppressed((java.lang.Throwable)var1);
    org.apache.commons.math.exception.util.Localizable var3 = null;
    var1.addMessage(var3);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test78"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test79"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(114.22553209582011d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0577631898027287d);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test80"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Float.POSITIVE_INFINITY);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test81"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var7, (-23));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test82"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var5, true);
    org.apache.commons.math.exception.util.Localizable var8 = null;
    java.lang.Object[] var10 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var11 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var7, var8, var10);
    org.apache.commons.math.exception.MathIllegalArgumentException var12 = new org.apache.commons.math.exception.MathIllegalArgumentException(var1, var10);
    org.apache.commons.math.exception.util.Localizable var13 = null;
    int[] var16 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var17 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var16);
    boolean var19 = var17.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var20 = new float[] { };
    float[] var22 = new float[] { 100.0f};
    boolean var23 = org.apache.commons.math.util.MathUtils.equals(var20, var22);
    boolean var24 = var17.equals((java.lang.Object)var22);
    int[] var27 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var28 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var27);
    boolean var30 = var28.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var31 = new float[] { };
    float[] var33 = new float[] { 100.0f};
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var31, var33);
    boolean var35 = var28.equals((java.lang.Object)var33);
    double var36 = var17.distanceFrom(var28);
    int[] var39 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var40 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var39);
    double var41 = var28.distanceFrom(var40);
    org.apache.commons.math.exception.util.Localizable var42 = null;
    org.apache.commons.math.exception.util.Localizable var43 = null;
    org.apache.commons.math.exception.NullArgumentException var44 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var45 = new org.apache.commons.math.exception.NullArgumentException();
    var44.addSuppressed((java.lang.Throwable)var45);
    org.apache.commons.math.exception.util.Localizable var47 = null;
    java.lang.Object[] var49 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var50 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var44, var47, var49);
    org.apache.commons.math.exception.MathIllegalStateException var51 = new org.apache.commons.math.exception.MathIllegalStateException(var43, var49);
    org.apache.commons.math.exception.MathIllegalArgumentException var52 = new org.apache.commons.math.exception.MathIllegalArgumentException(var42, var49);
    boolean var53 = var28.equals((java.lang.Object)var49);
    var12.addMessage(var13, var49);
    org.apache.commons.math.exception.MathIllegalStateException var55 = new org.apache.commons.math.exception.MathIllegalStateException(var0, var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(7.6293945E-6f, (-220), 2146959360);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(26214400, (-2073552671));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test85"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.0d, 2.224316764644975E15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test86"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    double[] var5 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.0d);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.5707963267948966d);
    double[] var13 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 1.0d);
    double[] var19 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 1.0d);
    double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var21);
    double var23 = org.apache.commons.math.util.MathUtils.distance(var7, var21);
    java.lang.Object[] var24 = new java.lang.Object[] { var21};
    org.apache.commons.math.exception.NotFiniteNumberException var25 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)0.6085980977425464d, var24);
    java.lang.Object var27 = var25.getContext("org.apache.commons.math.exception.NumberIsTooSmallException: 100 is smaller than, or equal to, the minimum (0)");
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test87"); }


    float var2 = org.apache.commons.math.util.FastMath.max(9.536744E-7f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536744E-7f);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test88"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh((-0.8390387292223656d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3731335522128059d);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(100.0f, 11, (-1048576));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test90"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(0.0d, 0.8071997601754676d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test91"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)1.8378531015316315d, false);
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    org.apache.commons.math.exception.NullArgumentException var7 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var8 = new org.apache.commons.math.exception.NullArgumentException();
    var7.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math.exception.util.Localizable var10 = null;
    java.lang.Object[] var12 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var13 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var7, var10, var12);
    org.apache.commons.math.exception.MathIllegalStateException var14 = new org.apache.commons.math.exception.MathIllegalStateException(var6, var12);
    org.apache.commons.math.exception.MathIllegalArgumentException var15 = new org.apache.commons.math.exception.MathIllegalArgumentException(var5, var12);
    var4.addSuppressed((java.lang.Throwable)var15);
    boolean var17 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test92"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(2.4758800785707605E27d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test93"); }


    float var2 = org.apache.commons.math.util.FastMath.max(7.6293945E-6f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.6293945E-6f);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test94"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(2.0000002f, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0f);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test95"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)(-0.8203867151263053d));
    java.lang.Number var2 = var1.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + (-0.8203867151263053d)+ "'", var2.equals((-0.8203867151263053d)));

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test96"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)100L, true);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test97"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.4772471894121169d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4772471894121169d);

  }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test98"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var1 = null;
//     org.apache.commons.math.exception.NotPositiveException var3 = new org.apache.commons.math.exception.NotPositiveException(var1, (java.lang.Number)1);
//     org.apache.commons.math.exception.util.Localizable var4 = null;
//     java.lang.Number var5 = null;
//     java.lang.Object[] var7 = new java.lang.Object[] { false};
//     org.apache.commons.math.exception.NotFiniteNumberException var8 = new org.apache.commons.math.exception.NotFiniteNumberException(var5, var7);
//     org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)1, var4, var7);
//     org.apache.commons.math.exception.MathArithmeticException var10 = new org.apache.commons.math.exception.MathArithmeticException(var0, var7);
//     org.apache.commons.math.exception.MathRuntimeException var11 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var10);
// 
//   }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test99"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    int[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var9, 1048576);
    int[] var14 = new int[] { 100};
    int[] var18 = new int[] { (-1), 1, 1};
    int var19 = org.apache.commons.math.util.MathUtils.distance1(var14, var18);
    int[] var21 = new int[] { 100};
    int[] var25 = new int[] { (-1), 1, 1};
    int var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
    int[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var27, 201);
    int var30 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var31 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var14);
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 101);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test100"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.4772471894121169d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6116317731313965d);

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test101"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var5, true);
//     java.lang.Number var8 = var7.getArgument();
//     java.util.Set var9 = var7.getContextKeys();
//     java.util.List var12 = var1.cluster((java.util.Collection)var9, 1072694309, 0);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test102"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-274));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test103"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11013.232874703393d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test104"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.7320508075688774d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-6.1475331602966135d));

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test105"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-1100L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test106"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)100);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test107"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var7, true);
    org.apache.commons.math.exception.util.Localizable var10 = null;
    java.lang.Object[] var12 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var13 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var9, var10, var12);
    org.apache.commons.math.exception.MathIllegalArgumentException var14 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var12);
    org.apache.commons.math.exception.NullArgumentException var15 = new org.apache.commons.math.exception.NullArgumentException(var2, var12);
    org.apache.commons.math.exception.MathIllegalStateException var16 = new org.apache.commons.math.exception.MathIllegalStateException(var1, var12);
    org.apache.commons.math.exception.ConvergenceException var17 = new org.apache.commons.math.exception.ConvergenceException(var0, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test108"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(1249902593, 0);
    int var3 = var2.getDimension();
    int var4 = var2.getDimension();
    int var5 = var2.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test109"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100997L, 100897L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test110() {}
//   public void test110() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test110"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-1.7976931348623157E308d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test111"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 1.1189396031849526d, (-20));

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test112"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(4.463984075193098E74d, 202.019801009703d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test113"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(Float.POSITIVE_INFINITY, (-1.0f), 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test114"); }
// 
// 
//     double[] var0 = null;
//     double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
// 
//   }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test115"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(2.4758800785707605E27d, (-1320904712));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test116"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(2L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test117"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var1, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    var3.setContext("org.apache.commons.math.exception.NumberIsTooSmallException: 10 is smaller than, or equal to, the minimum (null)", (java.lang.Object)33);
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = var3.getDirection();
    boolean var9 = var3.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test118"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(784635905, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 784635905);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test119"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(3, 784635905);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test120"); }


    org.apache.commons.math.util.MathUtils.checkFinite(11013.232920103324d);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test121"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var5, true);
//     java.lang.Number var8 = var7.getArgument();
//     java.util.Set var9 = var7.getContextKeys();
//     java.util.List var12 = var1.cluster((java.util.Collection)var9, 0, (-137));
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test122"); }


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
    int[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var20 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var13);
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var22 = org.apache.commons.math.util.MathUtils.distance(var11, var21);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var21);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test123"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0f);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test124"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-2105540554), 112197732);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test125"); }


    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)3080657310641694891L);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test126"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)26214400, (java.lang.Number)(short)10, (-51));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test127"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-110L), 13716);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test128"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-137), 1048576);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test129"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(114.22553209582011d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test130"); }


    long var2 = org.apache.commons.math.util.FastMath.min(101097L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test131"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test132"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000001f);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test133"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-97.85618083027165d), 1.1555516045788385d, (-2105540607));

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test134"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test135"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.1189396031849528d, (java.lang.Number)127, true);
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.1189396031849528d+ "'", var4.equals(1.1189396031849528d));

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test136"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3211090992020036d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test137"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.21418410704948732d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.21585647627377405d));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test138"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 720L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test139"); }


    java.lang.Number var4 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var4, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var7, false);
    int var10 = var9.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-127));

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test140"); }


    double var2 = org.apache.commons.math.util.FastMath.min(172472.05374275087d, 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7320508075688772d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test141"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test142"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.42698353241267606d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7530151407913052d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test143"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(9.536744E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536744E-7f);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test144"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.3132616875182228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test145"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(101097L, 127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1089072938814656167L));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test146"); }


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
    org.apache.commons.math.exception.MathRuntimeException var68 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var3);
    
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

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test147"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(171.88733853924697d, 5.283185307179586d, 12.751137675608902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test148"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.0014256080284876886d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0014266246906762d);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test149"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(114.22553209582011d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test150"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test151"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)1.8378531015316315d, false);
    boolean var5 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test152"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.9750137443868097E32d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9587740463418231d);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test153"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.NullArgumentException var3 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var4 = new org.apache.commons.math.exception.NullArgumentException();
    var3.addSuppressed((java.lang.Throwable)var4);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var3, var6, var8);
    org.apache.commons.math.exception.NotFiniteNumberException var10 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)0.0d, var8);
    org.apache.commons.math.exception.MathArithmeticException var11 = new org.apache.commons.math.exception.MathArithmeticException(var1, var8);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.NotPositiveException var15 = new org.apache.commons.math.exception.NotPositiveException(var13, (java.lang.Number)1);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Number var17 = null;
    java.lang.Object[] var19 = new java.lang.Object[] { false};
    org.apache.commons.math.exception.NotFiniteNumberException var20 = new org.apache.commons.math.exception.NotFiniteNumberException(var17, var19);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)1, var16, var19);
    var11.addMessage(var12, var19);
    org.apache.commons.math.exception.NullArgumentException var23 = new org.apache.commons.math.exception.NullArgumentException(var0, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test154"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.984807753012208d, 26214400);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test155"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.041914822473389d);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test156"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var4 = null;
    java.lang.Number var5 = null;
    java.lang.Number var6 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var8 = new org.apache.commons.math.exception.NumberIsTooLargeException(var5, var6, false);
    java.lang.Throwable[] var9 = var8.getSuppressed();
    org.apache.commons.math.exception.MathIllegalStateException var10 = new org.apache.commons.math.exception.MathIllegalStateException(var4, (java.lang.Object[])var9);
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.NullArgumentException var13 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var14 = new org.apache.commons.math.exception.NullArgumentException();
    var13.addSuppressed((java.lang.Throwable)var14);
    org.apache.commons.math.exception.util.Localizable var16 = null;
    java.lang.Object[] var18 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var19 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var13, var16, var18);
    org.apache.commons.math.exception.MathIllegalStateException var20 = new org.apache.commons.math.exception.MathIllegalStateException(var12, var18);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var10, var11, var18);
    org.apache.commons.math.exception.NullArgumentException var22 = new org.apache.commons.math.exception.NullArgumentException(var3, var18);
    org.apache.commons.math.exception.NotFiniteNumberException var23 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, (java.lang.Number)1.1920929E-7f, var18);
    org.apache.commons.math.exception.NotFiniteNumberException var24 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)(-1048987), var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test157"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.5641161431069407d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test158"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(101.0099005048515d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.308341213899707d);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test159"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-31.884770305757485d), 1.2178264933584275d, (-1.7976931348623155E308d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test160"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, (-2.5049299045672764d));
    double[] var18 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 1.0d);
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 1.5707963267948966d);
    double[] var26 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0d);
    double[] var32 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 1.0d);
    double var35 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var34);
    double var36 = org.apache.commons.math.util.MathUtils.distance(var20, var34);
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var41 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.0d);
    double[] var45 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 0.8414709848078965d);
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var41);
    double var47 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var34);
    double[] var51 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.normalizeArray(var51, 1.0d);
    double[] var55 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 1.5707963267948966d);
    double[] var59 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 1.0d);
    double[] var65 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.normalizeArray(var65, 1.0d);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var67);
    double var69 = org.apache.commons.math.util.MathUtils.distance(var53, var67);
    double[] var71 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 2.718281828459045d);
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var71);
    
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
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test161"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(6, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 216);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test162"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.5188665760885071d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1408651579));

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test163"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(128, 2146959360);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test164"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(1249902593, 0);
    org.apache.commons.math.exception.MathRuntimeException var3 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var2);
    int var4 = var2.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test165"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test166() {}
//   public void test166() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test166"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.util.MathUtils.checkFinite(var0);
// 
//   }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test167"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(0.04882604308023237d, (-5));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0015258138462572615d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test168"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh((-0.5641161431069407d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.638850177028372d));

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test169"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test170"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 112197732, (-23));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test171"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.7853981633974482d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test172"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11013.232874703393d);

  }

  public void test173() {}
//   public void test173() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test173"); }
// 
// 
//     float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 1048576, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Float.NaN);
// 
//   }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test174"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(2.475880078570761E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.475880078570761E27d);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test175"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-0.8390387292223656d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test176"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.45185512475708767d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.42342272575462486d));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test177"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(112197732, 137);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test178"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.42698353241267606d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.532627422840287d);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test179"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    int var23 = org.apache.commons.math.util.MathUtils.hash(var5);
    java.lang.Number var28 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var28, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var31 = var30.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)(-1L), 10100, var31, true);
    org.apache.commons.math.exception.util.Localizable var34 = null;
    org.apache.commons.math.exception.util.Localizable var35 = null;
    org.apache.commons.math.exception.util.Localizable var36 = null;
    org.apache.commons.math.exception.NullArgumentException var37 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var38 = new org.apache.commons.math.exception.NullArgumentException();
    var37.addSuppressed((java.lang.Throwable)var38);
    org.apache.commons.math.exception.util.Localizable var40 = null;
    java.lang.Object[] var42 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var43 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var37, var40, var42);
    org.apache.commons.math.exception.MathIllegalStateException var44 = new org.apache.commons.math.exception.MathIllegalStateException(var36, var42);
    org.apache.commons.math.exception.MathIllegalArgumentException var45 = new org.apache.commons.math.exception.MathIllegalArgumentException(var35, var42);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var31, var34, var42);
    boolean var49 = org.apache.commons.math.util.MathUtils.checkOrder(var5, var31, false, false);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test180"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(4L, 20L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20L);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test181"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, (-1.0f), 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test182"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(2.0f, 0, 411);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test183"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(2.99822295029797d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.440892098500626E-16d);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(6.251278719471049E67d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0910539611462477E66d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test185"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.014686439244896978d);

  }

  public void test186() {}
//   public void test186() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test186"); }
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
//     double[] var24 = null;
//     double var25 = org.apache.commons.math.util.MathUtils.distance(var5, var24);
// 
//   }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test187"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(0.6085980977425464d, 1.3440585709080869E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6085980977425464d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test188"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.4327148186525578d, (-0.17074497917308024d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.17074497917308024d));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test189"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.99822295029797d, 0.8395059254591507d, 1072694309);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test190"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-23), 13716);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 13716);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test191"); }


    java.lang.Number var4 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var4, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)(-1L), 10100, var7, true);
    boolean var10 = var9.getStrict();
    boolean var11 = var9.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test192"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.048806645320670736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.22092226080834573d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test193"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.5951947737947947d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test194"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.5907092355160468d, 54.65449664743416d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0419427147941733E11d);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test195"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(10.000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.000002f);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test196"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(101097L, 101000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6587906502443145793L);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test197"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.984807753012208d, (-1.6490605123312343d), (-1464846667));

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test198"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.3731335522128059d, 0.22092226080834573d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test199"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm((-100280L), 101000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 253207000L);

  }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test200"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.000015f, 107);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test201"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.2178264933584275d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test202"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(3.9427276852482067E160d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test203"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.NullArgumentException var4 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var5 = new org.apache.commons.math.exception.NullArgumentException();
    var4.addSuppressed((java.lang.Throwable)var5);
    org.apache.commons.math.exception.util.Localizable var7 = null;
    java.lang.Object[] var9 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var10 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var4, var7, var9);
    org.apache.commons.math.exception.NullArgumentException var11 = new org.apache.commons.math.exception.NullArgumentException(var3, var9);
    org.apache.commons.math.exception.MathArithmeticException var12 = new org.apache.commons.math.exception.MathArithmeticException(var2, var9);
    org.apache.commons.math.exception.MathIllegalArgumentException var13 = new org.apache.commons.math.exception.MathIllegalArgumentException(var1, var9);
    org.apache.commons.math.exception.NullArgumentException var14 = new org.apache.commons.math.exception.NullArgumentException(var0, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test204"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.8395059254591507d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9162455595849568d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test205"); }


    double var2 = org.apache.commons.math.util.FastMath.max(5.308341213899707d, (-4.155521474243959d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.308341213899707d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test206"); }


    int var2 = org.apache.commons.math.util.FastMath.max(107, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 108);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test207"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)0.0349065850398866d, (java.lang.Number)4.9E-324d, true);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test208"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(4.648565284244929E-4d, (-1.1503578729932837d), 4.041914822473389d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test209"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.util.Localizable var5 = null;
    java.lang.Number var6 = null;
    java.lang.Number var7 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var9 = new org.apache.commons.math.exception.NumberIsTooLargeException(var6, var7, false);
    java.lang.Throwable[] var10 = var9.getSuppressed();
    org.apache.commons.math.exception.MathIllegalStateException var11 = new org.apache.commons.math.exception.MathIllegalStateException(var5, (java.lang.Object[])var10);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.NullArgumentException var14 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var15 = new org.apache.commons.math.exception.NullArgumentException();
    var14.addSuppressed((java.lang.Throwable)var15);
    org.apache.commons.math.exception.util.Localizable var17 = null;
    java.lang.Object[] var19 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var20 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var14, var17, var19);
    org.apache.commons.math.exception.MathIllegalStateException var21 = new org.apache.commons.math.exception.MathIllegalStateException(var13, var19);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var11, var12, var19);
    org.apache.commons.math.exception.NullArgumentException var23 = new org.apache.commons.math.exception.NullArgumentException(var4, var19);
    org.apache.commons.math.exception.NotFiniteNumberException var24 = new org.apache.commons.math.exception.NotFiniteNumberException(var2, (java.lang.Number)1.1920929E-7f, var19);
    org.apache.commons.math.exception.NotFiniteNumberException var25 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)7.791121986871369E72d, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test210"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb(100.00001f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.00001f);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test211"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.034920772952347814d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0006097921561312d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test212"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.lang.Number var2 = null;
    java.lang.Number var3 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var5 = new org.apache.commons.math.exception.NumberIsTooLargeException(var2, var3, false);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math.exception.MathIllegalStateException var7 = new org.apache.commons.math.exception.MathIllegalStateException(var1, (java.lang.Object[])var6);
    org.apache.commons.math.exception.util.Localizable var8 = null;
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.exception.NullArgumentException var10 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var11 = new org.apache.commons.math.exception.NullArgumentException();
    var10.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math.exception.util.Localizable var13 = null;
    java.lang.Object[] var15 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var16 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var10, var13, var15);
    org.apache.commons.math.exception.MathIllegalStateException var17 = new org.apache.commons.math.exception.MathIllegalStateException(var9, var15);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var7, var8, var15);
    org.apache.commons.math.exception.ConvergenceException var19 = new org.apache.commons.math.exception.ConvergenceException(var0, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test213"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(0.034920772952347814d, (-2.5045996724326973d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.034920772952347814d));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test214"); }


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

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test215"); }


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
    int var24 = org.apache.commons.math.util.MathUtils.hash(var5);
    
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
    assertTrue(var24 == (-2114948001));

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test216"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 101);
    int[] var13 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var14 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var13);
    boolean var16 = var14.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var17 = new float[] { };
    float[] var19 = new float[] { 100.0f};
    boolean var20 = org.apache.commons.math.util.MathUtils.equals(var17, var19);
    boolean var21 = var14.equals((java.lang.Object)var19);
    int[] var22 = var14.getPoint();
    int[] var24 = new int[] { 100};
    int[] var28 = new int[] { (-1), 1, 1};
    int var29 = org.apache.commons.math.util.MathUtils.distance1(var24, var28);
    int[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    int var31 = org.apache.commons.math.util.MathUtils.distance1(var22, var30);
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var22, (-1421439005));
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 90);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test217"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(107, (-2073552671));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test218"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-2105526838), 12);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test219"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(4.648565284244929E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02156053172870495d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test220"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.8184464592320668d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test221"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(2.0993497799750993d, 1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0993497799750993d);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test222"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(1.0006097921561312d, (-274));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test223"); }
// 
// 
//     org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var3, true);
//     org.apache.commons.math.exception.util.Localizable var6 = null;
//     java.lang.Object[] var8 = new java.lang.Object[] { (short)10};
//     org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var5, var6, var8);
//     var5.setContext("hi!", (java.lang.Object)1.4E-45f);
//     org.apache.commons.math.exception.util.Localizable var13 = null;
//     var5.addMessage(var13);
//     java.lang.Number var15 = var5.getArgument();
//     java.lang.String var16 = var5.toString();
// 
//   }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test224"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(4.440892098500626E-16d, 0.22092226080834573d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.057741831186217E-4d);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test225"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(0.42698353241267606d, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.42698353241267606d);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test226"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(56.548667764616276d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8102742483026484E24d);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test227"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var5, true);
    org.apache.commons.math.exception.util.Localizable var8 = null;
    java.lang.Object[] var10 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var11 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var7, var8, var10);
    org.apache.commons.math.exception.NotFiniteNumberException var12 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var10);
    org.apache.commons.math.exception.MathIllegalArgumentException var13 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var10);
    org.apache.commons.math.exception.util.Localizable var14 = null;
    var13.addMessage(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test228"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(101.0099005048515d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7629553409215413d);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test229"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.2440489289239585d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 71.27875313511335d);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test230"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 1.0038848218538872d);
    double[] var13 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 1.0d);
    double[] var19 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 1.0d);
    double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var21);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var15, 0);
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var7, var24);
    double[] var30 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 1.0d);
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 1.5707963267948966d);
    double[] var38 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 1.0d);
    double[] var44 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, 1.0d);
    double var47 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var46);
    double var48 = org.apache.commons.math.util.MathUtils.distance(var32, var46);
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 2.718281828459045d);
    double var51 = org.apache.commons.math.util.MathUtils.distance(var7, var32);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.9886482387824493d);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test231"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.0f, Float.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test232"); }


    float var2 = org.apache.commons.math.util.FastMath.max(1.0000001f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000001f);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test233"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(1.0000001f, Float.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000001f);

  }

  public void test234() {}
//   public void test234() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test234"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.scalb(Double.NaN, (-1048576));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(171.88733853924697d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5649786282570015d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test236"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.0014256080284880813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0014256075455974832d);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test237"); }


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
    org.apache.commons.math.exception.NumberIsTooSmallException var73 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, (java.lang.Number)1.4210854715202004E-14d, false);
    boolean var74 = var73.getBoundIsAllowed();
    java.lang.Number var75 = var73.getMin();
    var5.setContext("org.apache.commons.math.exception.DimensionMismatchException: 784,635,905 != -137", (java.lang.Object)var73);
    
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
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + 1.4210854715202004E-14d+ "'", var75.equals(1.4210854715202004E-14d));

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test238"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.3708024742879816d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.006471724050866895d);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test239"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.NullArgumentException var3 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var4 = new org.apache.commons.math.exception.NullArgumentException();
    var3.addSuppressed((java.lang.Throwable)var4);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var3, var6, var8);
    org.apache.commons.math.exception.MathIllegalStateException var10 = new org.apache.commons.math.exception.MathIllegalStateException(var2, var8);
    org.apache.commons.math.exception.MathIllegalArgumentException var11 = new org.apache.commons.math.exception.MathIllegalArgumentException(var1, var8);
    org.apache.commons.math.exception.NotFiniteNumberException var12 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)(-1.7976931348623157E308d), var8);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 1.5707963267948966d);
    double[] var25 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0d);
    double[] var31 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.normalizeArray(var31, 1.0d);
    double var34 = org.apache.commons.math.util.MathUtils.distanceInf(var27, var33);
    double var35 = org.apache.commons.math.util.MathUtils.distance(var19, var33);
    double var36 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    int var37 = org.apache.commons.math.util.MathUtils.hash(var19);
    double[] var41 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.0d);
    double[] var47 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var47, 1.0d);
    double var50 = org.apache.commons.math.util.MathUtils.distanceInf(var43, var49);
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var49);
    boolean var52 = org.apache.commons.math.util.MathUtils.equals(var19, var49);
    java.lang.Number var54 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var56 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var54, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var57 = var56.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var58 = var56.getDirection();
    boolean var61 = org.apache.commons.math.util.MathUtils.checkOrder(var19, var58, false, false);
    var12.setContext("hi!", (java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test240"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    int var8 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var12 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0d);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var14, 1.5707963267948966d);
    double[] var20 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 1.0d);
    double[] var26 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0d);
    double var29 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance(var14, var28);
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    int var32 = org.apache.commons.math.util.MathUtils.hash(var14);
    double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var14);
    double[] var36 = new double[] { 0.0d, 1.0d};
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    org.apache.commons.math.util.MathUtils.checkOrder(var36);
    java.lang.Number var43 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var45 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var43, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var46 = var45.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var48 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var46, false);
    boolean var51 = org.apache.commons.math.util.MathUtils.checkOrder(var36, var46, true, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var54 = org.apache.commons.math.util.MathUtils.checkOrder(var14, var46, false, true);
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
    assertTrue(var8 == (-2114948001));
    
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
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test241"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0038848218538874d, 5.283185307179586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test242"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-220));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test243"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(0.0d, 1.7453292519943298d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7453292519943298d);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test244"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-3.9550650838264265d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.726677038124988d);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test245"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.3708024742879816d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test246"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.014686439244896978d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test247"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(4.463984075193098E74d, 1.0056340903971724E30d, 26214400);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test248"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-0.45185512475708767d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test249"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-0.22534089083927233d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7755575615628914E-17d);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test250"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, var1, false);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getMin();
    java.lang.Number var6 = var3.getMin();
    org.apache.commons.math.exception.util.Localizable var7 = null;
    var3.addMessage(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test251"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, (-1.0d), 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test252"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test253"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(0.6961874372246237d, 4.440892098500626E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6961874372246237d);

  }

  public void test254() {}
//   public void test254() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test254"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log1p((-6.1475331602966135d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test255"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.1920929E-7f, (-528621567));

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test256"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.7320508075688772d, 1.2178264933584277d, 127);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test257"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-31.884770305757485d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test258"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-51), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-51));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test259"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-2.5045996724326973d), false);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test260"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test261"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.0077847355486111d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test262"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(101097L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test263"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.6941159641785049d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.12300730628485634d));

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test264"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test265"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test266"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(1048576);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test267"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.000015f, 1.1920929E-7f, 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test268"); }


    float var2 = org.apache.commons.math.util.FastMath.min(1.0000001f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.536743E-7f);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test269"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(7.791121986871369E72d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7912581369109106E36d);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test270"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(101000L, 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test271"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException((-738962168), 90);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test272"); }


    int var1 = org.apache.commons.math.util.FastMath.round(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test273"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(2L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8L));

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test274"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 2);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test275"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0f, 0.8390387292223656d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test276() {}
//   public void test276() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test276"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log((-3.9550650838264265d), 0.9989894931045785d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test277"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(54.65449664743416d, 1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test278"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.6116317731313965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.010981344852461d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test279"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1048576, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test280"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(7.6293945E-6f, 2.0f, (-1));

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test281"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(2.7755575615628914E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7755575615628914E-17d);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test282"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)(-23), false);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test283"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.6085980977425465d, (java.lang.Number)2.1609159201887137E-7d, 0);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test284"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(110L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 110L);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test285"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.5707963267948966d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test286"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-2105540607), (-1464846667));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test287"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.0077847355486111d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test288"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1048576), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1048576));

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test289"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11.000000000000002d);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test290"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1327242822));

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test291"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 1249902593);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test292"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(100997L, 253207000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test293"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(2.7912581369109106E36d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7912581369109106E36d);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test294"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-1048576), (-100280L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test295"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    int var23 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var27 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 1.0d);
    double[] var33 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var33, 1.0d);
    double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var35);
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var5, var35);
    double[] var42 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var42, 1.0d);
    double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, 1.5707963267948966d);
    int var47 = org.apache.commons.math.util.MathUtils.hash(var44);
    double[] var51 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.normalizeArray(var51, 1.0d);
    double[] var55 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 1.5707963267948966d);
    double[] var59 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 1.0d);
    double[] var65 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.normalizeArray(var65, 1.0d);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var67);
    double var69 = org.apache.commons.math.util.MathUtils.distance(var53, var67);
    double var70 = org.apache.commons.math.util.MathUtils.safeNorm(var53);
    int var71 = org.apache.commons.math.util.MathUtils.hash(var53);
    double var72 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var53);
    double var73 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var53);
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test296"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4758800785707605E27d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test297"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var3, true);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var5, var6, var8);
    var5.setContext("hi!", (java.lang.Object)1.4E-45f);
    org.apache.commons.math.exception.util.Localizable var13 = null;
    var5.addMessage(var13);
    java.lang.Number var15 = var5.getArgument();
    int var16 = var5.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (short)10+ "'", var15.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test298"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.6490605123312343d), false);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test299"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.21418410704948732d), 1.547657737556848d, 1072694209);

  }

  public void test300() {}
//   public void test300() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test300"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(9.536744E-7f, (-1048987));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test301"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(9.536744E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1368684E-13f);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test302"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, 10.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test303"); }


    double[] var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, (-220));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test304"); }


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
    int[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var11, 6);
    int[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var11, 101);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var25 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var24);
    int[] var27 = new int[] { 100};
    int[] var31 = new int[] { (-1), 1, 1};
    int var32 = org.apache.commons.math.util.MathUtils.distance1(var27, var31);
    int[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var27, 10);
    int[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var34);
    int[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    int[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var35, 1048576);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var39 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var35);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test305"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(4.440892098500626E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000000000000004d);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test306"); }


    java.lang.Object var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.lang.Object[] var2 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkNotNull(var0, var1, var2);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test307"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1421439005));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1421439005);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test308"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(11.000000000000002d, 0.22092226080834573d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5507151845940985d);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test309"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.034920772952347814d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test310"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-137), (-1320904712));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test311"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test312"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8390387292223656d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-48.073378032461434d));

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test313"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.1368684E-13f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test314"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)1.3132616875182228d, (java.lang.Number)(short)(-1), false);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.NullArgumentException var8 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var9 = new org.apache.commons.math.exception.NullArgumentException();
    var8.addSuppressed((java.lang.Throwable)var9);
    org.apache.commons.math.exception.util.Localizable var11 = null;
    java.lang.Object[] var13 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var14 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var8, var11, var13);
    org.apache.commons.math.exception.MathIllegalStateException var15 = new org.apache.commons.math.exception.MathIllegalStateException(var7, var13);
    org.apache.commons.math.exception.MathIllegalArgumentException var16 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var13);
    org.apache.commons.math.exception.NotFiniteNumberException var17 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)11, var13);
    var4.addSuppressed((java.lang.Throwable)var17);
    boolean var19 = var4.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var20 = null;
    var4.addMessage(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test315"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.1189396031849528d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.061605964172826d);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test316"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0f, 100.000015f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test317"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-0.638850177028372d), (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.6388501770283721d));

  }

  public void test318() {}
//   public void test318() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test318"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.scalb(Float.NaN, 128);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test319"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, (-1408651579));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test320"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)10L, (java.lang.Number)10.000001f, false);
    java.lang.Number var5 = var4.getMax();
    boolean var6 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.000001f+ "'", var5.equals(10.000001f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test321() {}
//   public void test321() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test321"); }
// 
// 
//     org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)1.5707963267948966d, 1072694209);
//     java.util.Set var4 = var3.getContextKeys();
//     int var5 = var3.getIndex();
//     java.lang.Number var6 = var3.getPrevious();
//     org.apache.commons.math.exception.util.Localizable var7 = null;
//     var3.addMessage(var7);
//     org.apache.commons.math.exception.MathRuntimeException var9 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var3);
// 
//   }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test322"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(10.0f, 1.0000000000000004d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999f);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test323"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)(-0.21418410704948732d));
    boolean var2 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test324"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = new java.lang.Object[] { Double.NEGATIVE_INFINITY};
    org.apache.commons.math.exception.NullArgumentException var3 = new org.apache.commons.math.exception.NullArgumentException(var0, var2);
    org.apache.commons.math.exception.util.Localizable var4 = null;
    var3.addMessage(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test325"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(2.7755575615628914E-17d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.7755575615628914E-17d);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test326"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var2, var5);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var6);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var6, 128);
    java.math.BigInteger var10 = null;
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 0L);
    java.math.BigInteger var13 = null;
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 0L);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var12, var15);
    java.math.BigInteger var17 = null;
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0L);
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var19, var22);
    java.math.BigInteger var24 = null;
    java.math.BigInteger var26 = org.apache.commons.math.util.MathUtils.pow(var24, 0L);
    java.math.BigInteger var27 = null;
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var27, 0L);
    java.math.BigInteger var30 = org.apache.commons.math.util.MathUtils.pow(var26, var29);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var23, var29);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var12, var23);
    java.math.BigInteger var34 = org.apache.commons.math.util.MathUtils.pow(var12, 6587906502443145793L);
    java.math.BigInteger var35 = org.apache.commons.math.util.MathUtils.pow(var9, var12);
    java.math.BigInteger var36 = null;
    java.math.BigInteger var38 = org.apache.commons.math.util.MathUtils.pow(var36, 0L);
    java.math.BigInteger var39 = null;
    java.math.BigInteger var41 = org.apache.commons.math.util.MathUtils.pow(var39, 0L);
    java.math.BigInteger var42 = org.apache.commons.math.util.MathUtils.pow(var38, var41);
    java.math.BigInteger var44 = org.apache.commons.math.util.MathUtils.pow(var41, 107);
    java.math.BigInteger var45 = null;
    java.math.BigInteger var47 = org.apache.commons.math.util.MathUtils.pow(var45, 0L);
    java.math.BigInteger var48 = null;
    java.math.BigInteger var50 = org.apache.commons.math.util.MathUtils.pow(var48, 0L);
    java.math.BigInteger var51 = org.apache.commons.math.util.MathUtils.pow(var47, var50);
    java.math.BigInteger var53 = org.apache.commons.math.util.MathUtils.pow(var50, 107);
    java.math.BigInteger var54 = org.apache.commons.math.util.MathUtils.pow(var41, var53);
    java.math.BigInteger var55 = org.apache.commons.math.util.MathUtils.pow(var12, var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
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

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test327"); }
// 
// 
//     org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var3, true);
//     org.apache.commons.math.exception.util.Localizable var6 = null;
//     java.lang.Object[] var8 = new java.lang.Object[] { (short)10};
//     org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var5, var6, var8);
//     var5.setContext("hi!", (java.lang.Object)1.4E-45f);
//     org.apache.commons.math.exception.util.Localizable var13 = null;
//     var5.addMessage(var13);
//     java.lang.Number var15 = var5.getArgument();
//     java.lang.Object var17 = var5.getContext("org.apache.commons.math.exception.MathRuntimeException: ");
//     java.lang.Number var18 = var5.getPrevious();
//     org.apache.commons.math.exception.MathRuntimeException var19 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var5);
// 
//   }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test328"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0f, 7.6293945E-6f, 100.00001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test329"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(2.4758800785707603E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 90);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test330"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-31.884770305757485d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715201997E-14d);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test331"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)1.8184464592320668d, var2, true);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test332"); }


    double var2 = org.apache.commons.math.util.FastMath.IEEEremainder(1.6132631621779496d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.38673683782205037d));

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test333"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(4.010981344852461d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 27.609565416409364d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test334"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.3132616875182228d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.796745936845351d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test335"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(4.648565284244929E-4d, 4.463984075193098E74d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.6485652842449295E-4d);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test336"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-2105526838), (java.lang.Number)7.791121986871369E72d, false);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test337"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(9.536744E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test338"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 10.000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test339"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(1.8378531015316315d, 0.0014256075455974832d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8378536544475763d);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test340"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, (-2.5049299045672764d));
    int var15 = org.apache.commons.math.util.MathUtils.hash(var11);
    double[] var19 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 1.0d);
    double[] var25 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, 1.0d);
    double var28 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var27);
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, (-2.5049299045672764d));
    double[] var34 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, 1.0d);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.5707963267948966d);
    double[] var42 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var42, 1.0d);
    double[] var48 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 1.0d);
    double var51 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var50);
    double var52 = org.apache.commons.math.util.MathUtils.distance(var36, var50);
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double[] var57 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var59 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 1.0d);
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 0.8414709848078965d);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var57);
    double var63 = org.apache.commons.math.util.MathUtils.distanceInf(var27, var50);
    double var64 = org.apache.commons.math.util.MathUtils.distance(var11, var27);
    double[] var65 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var27, 12);
    
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
    assertTrue(var15 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
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
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test341"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(26214400);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 26214400);

  }

  public void test342() {}
//   public void test342() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test342"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)1.3132616875182228d, (java.lang.Number)(short)(-1), false);
//     org.apache.commons.math.exception.util.Localizable var6 = null;
//     org.apache.commons.math.exception.util.Localizable var7 = null;
//     org.apache.commons.math.exception.NullArgumentException var8 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var9 = new org.apache.commons.math.exception.NullArgumentException();
//     var8.addSuppressed((java.lang.Throwable)var9);
//     org.apache.commons.math.exception.util.Localizable var11 = null;
//     java.lang.Object[] var13 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var14 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var8, var11, var13);
//     org.apache.commons.math.exception.MathIllegalStateException var15 = new org.apache.commons.math.exception.MathIllegalStateException(var7, var13);
//     org.apache.commons.math.exception.MathIllegalArgumentException var16 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var13);
//     org.apache.commons.math.exception.NotFiniteNumberException var17 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)11, var13);
//     var4.addSuppressed((java.lang.Throwable)var17);
//     java.lang.String var19 = var4.toString();
// 
//   }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test343"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0014266246906762d, 10.0d, 1.3674899999943206d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test344"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var9 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var8);
    java.lang.Number var14 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var16 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var14, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var17 = var16.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var17, false);
    org.apache.commons.math.exception.MathRuntimeException var20 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var19);
    java.util.Set var21 = var19.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var22 = var9.centroidOf((java.util.Collection)var21);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test345"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm((-1L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test346"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.9870266449903538d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9870266449903538d);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test347"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.048806645320670736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0011912807635959d);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test348"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-0.22534089083927233d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.22923414625677596d));

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test349"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(4.010981344852461d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test350"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6919903846336738d);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test351"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)1.1102230246251565E-16d);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test352"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var4 = null;
    org.apache.commons.math.exception.NullArgumentException var5 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var6 = new org.apache.commons.math.exception.NullArgumentException();
    var5.addSuppressed((java.lang.Throwable)var6);
    org.apache.commons.math.exception.util.Localizable var8 = null;
    java.lang.Object[] var10 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var11 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var5, var8, var10);
    org.apache.commons.math.exception.MathIllegalStateException var12 = new org.apache.commons.math.exception.MathIllegalStateException(var4, var10);
    org.apache.commons.math.exception.MathIllegalArgumentException var13 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var10);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)411, var2, var10);
    org.apache.commons.math.exception.MathArithmeticException var15 = new org.apache.commons.math.exception.MathArithmeticException(var0, var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test353"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.1189396031849526d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test354"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test355"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.1555516045788385d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.175774706343109d);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test356"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var5 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var5, true);
    org.apache.commons.math.exception.util.Localizable var8 = null;
    java.lang.Object[] var10 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var11 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var7, var8, var10);
    org.apache.commons.math.exception.NotFiniteNumberException var12 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var10);
    org.apache.commons.math.exception.NullArgumentException var13 = new org.apache.commons.math.exception.NullArgumentException(var0, var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test357"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(90);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test358"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, (-2.5049299045672764d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var14, 2146959360);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
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

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test359"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(7.610125138662288d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test360"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(2.0577631898027287d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test361"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080869E43d, 0.0d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test362"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(2.3743650728680885E40d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9851681077846736d));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test363"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.4327148186525578d, (-0.22534089083927233d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4327148186525578d);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test364"); }


    int var1 = org.apache.commons.math.util.FastMath.round(1.1368684E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test365"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(101000L, (-1089072938814656167L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1089072938814555167L));

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test366"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-2105526838), 1);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test367"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(2.1609159201887137E-7d, 0.5951947737947947d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0784780097701441E-4d);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test368"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(3.0023994079829557E21d, 0.04882604308023236d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test369"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(10.000002f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.000002f);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test370"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(3080657310641694891L, 4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3080657310641694895L);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test371"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test372"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1, 2146959360);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2146959360);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test373"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.6388501770283721d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5641161431069408d));

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test374"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb((-0.9851681077846736d), (-2073552671));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.0d));

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test375"); }
// 
// 
//     double[] var0 = null;
//     double[] var4 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 1.0d);
//     double[] var10 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var12 = org.apache.commons.math.util.MathUtils.normalizeArray(var10, 1.0d);
//     double var13 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var12);
//     double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double var15 = org.apache.commons.math.util.MathUtils.distance1(var0, var14);
// 
//   }

  public void test376() {}
//   public void test376() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test376"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.7632208604112913d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test377"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.0910539611462477E66d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9944278225911797d));

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test378"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(6587906502443145793L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test379"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double[] var15 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.normalizeArray(var15, 1.0d);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var17);
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var11, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var21 = org.apache.commons.math.util.MathUtils.distance1(var5, var20);
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test380"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)1.3132616875182228d, (java.lang.Number)(short)(-1), false);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.NullArgumentException var8 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var9 = new org.apache.commons.math.exception.NullArgumentException();
    var8.addSuppressed((java.lang.Throwable)var9);
    org.apache.commons.math.exception.util.Localizable var11 = null;
    java.lang.Object[] var13 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var14 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var8, var11, var13);
    org.apache.commons.math.exception.MathIllegalStateException var15 = new org.apache.commons.math.exception.MathIllegalStateException(var7, var13);
    org.apache.commons.math.exception.MathIllegalArgumentException var16 = new org.apache.commons.math.exception.MathIllegalArgumentException(var6, var13);
    org.apache.commons.math.exception.NotFiniteNumberException var17 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)11, var13);
    var4.addSuppressed((java.lang.Throwable)var17);
    boolean var19 = var4.getBoundIsAllowed();
    java.lang.Number var20 = var4.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (short)(-1)+ "'", var20.equals((short)(-1)));

  }

  public void test381() {}
//   public void test381() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test381"); }
// 
// 
//     double[] var0 = null;
//     double[] var4 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 1.0d);
//     boolean var7 = org.apache.commons.math.util.MathUtils.equals(var0, var6);
//     java.lang.Number var9 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var9, 101);
//     org.apache.commons.math.util.MathUtils.OrderDirection var12 = var11.getDirection();
//     org.apache.commons.math.util.MathUtils.checkOrder(var0, var12, false);
// 
//   }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test382"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test383() {}
//   public void test383() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test383"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 3080657310641694891L);
// 
//   }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test384"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.02156053172870495d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test385"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(7.6293945E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.629395E-6f);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test386"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.9989894931045785d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test387"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(2.833923755211775d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test388"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.8184464592320668d, 2.3743650728680885E40d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.658664120406279E-41d);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test389"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1072694209, (-2105540554));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test390() {}
//   public void test390() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test390"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(7.791121986871369E72d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test391"); }


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
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var5, 27262976);
    
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
    assertNotNull(var25);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test392"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.8996386380462555d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9653601483702346d);

  }

  public void test393() {}
//   public void test393() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test393"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(short)100);
//     org.apache.commons.math.exception.MathRuntimeException var3 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var2);
// 
//   }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test394"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test395"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test396"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(110L, 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 111100L);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test397"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-1089072938814555167L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test398"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)101.0099005048515d, (java.lang.Number)1.0038848218538874d, false);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test399"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.8102742483026484E24d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.985357734674177d);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test400"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)1.5707963267948966d, 1072694209);
    java.util.Set var4 = var3.getContextKeys();
    int var5 = var3.getIndex();
    java.lang.Number var6 = var3.getPrevious();
    org.apache.commons.math.exception.util.Localizable var7 = null;
    var3.addMessage(var7);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.exception.util.Localizable var10 = null;
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.Localizable var13 = null;
    java.lang.Number var14 = null;
    java.lang.Number var15 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var17 = new org.apache.commons.math.exception.NumberIsTooLargeException(var14, var15, false);
    java.lang.Throwable[] var18 = var17.getSuppressed();
    org.apache.commons.math.exception.MathIllegalStateException var19 = new org.apache.commons.math.exception.MathIllegalStateException(var13, (java.lang.Object[])var18);
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.util.Localizable var21 = null;
    org.apache.commons.math.exception.NullArgumentException var22 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var23 = new org.apache.commons.math.exception.NullArgumentException();
    var22.addSuppressed((java.lang.Throwable)var23);
    org.apache.commons.math.exception.util.Localizable var25 = null;
    java.lang.Object[] var27 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var28 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var22, var25, var27);
    org.apache.commons.math.exception.MathIllegalStateException var29 = new org.apache.commons.math.exception.MathIllegalStateException(var21, var27);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var19, var20, var27);
    org.apache.commons.math.exception.NullArgumentException var31 = new org.apache.commons.math.exception.NullArgumentException(var12, var27);
    org.apache.commons.math.exception.NotFiniteNumberException var32 = new org.apache.commons.math.exception.NotFiniteNumberException(var10, (java.lang.Number)1.1920929E-7f, var27);
    var3.addMessage(var9, var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var3.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1.5707963267948966d+ "'", var6.equals(1.5707963267948966d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test401"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 3.221096745241321d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.9E-324d);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test402"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(1.0f, (-0.22923414625677596d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.99999994f);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test403"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(100.00001f, 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.00001f);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test404"); }


    double[] var2 = new double[] { (-1.0d), 0.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[][] var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var2, var4);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test405"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-97.85618083027165d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.608179850748803d));

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test406"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(3080657310641694891L, 100897L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test407"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.17074497917308024d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test408"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test409() {}
//   public void test409() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test409"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos((-2.5049299045672764d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test410"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(1249902593, 0);
    int var3 = var2.getDimension();
    org.apache.commons.math.exception.util.Localizable var4 = null;
    java.lang.Number var5 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { false};
    org.apache.commons.math.exception.NotFiniteNumberException var8 = new org.apache.commons.math.exception.NotFiniteNumberException(var5, var7);
    java.lang.Number var9 = var8.getArgument();
    org.apache.commons.math.exception.util.Localizable var10 = null;
    org.apache.commons.math.exception.util.Localizable var11 = null;
    double[] var16 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 1.0d);
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 1.5707963267948966d);
    double[] var24 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.normalizeArray(var24, 1.0d);
    double[] var30 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 1.0d);
    double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var32);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var18, var32);
    java.lang.Object[] var35 = new java.lang.Object[] { var32};
    org.apache.commons.math.exception.NotFiniteNumberException var36 = new org.apache.commons.math.exception.NotFiniteNumberException(var11, (java.lang.Number)0.6085980977425464d, var35);
    var8.addMessage(var10, var35);
    org.apache.commons.math.exception.MathIllegalStateException var38 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var2, var4, var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test411"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.440892098500626E-16d);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test412"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(9.536743E-7f, (-738962168), (-2113899425));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test413"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test414"); }
// 
// 
//     double var3 = org.apache.commons.math.util.MathUtils.round(Double.NaN, 1072694209, (-2105540554));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Double.NaN);
// 
//   }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test415"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(3080657310641694891L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3080657310641694901L);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test416"); }


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
    int var25 = org.apache.commons.math.util.MathUtils.hash(var19);
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var19, 6);
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 0.0d);
    
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
    assertTrue(var25 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test417"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(100.000015f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.000015f);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test418"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(100.000015f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test419"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var8);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var8, 128);
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, var1, (java.lang.Number)var8, false);
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var16 = null;
    double[] var20 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 1.0d);
    double[] var24 = org.apache.commons.math.util.MathUtils.normalizeArray(var22, 1.5707963267948966d);
    double[] var28 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var28, 1.0d);
    double[] var34 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, 1.0d);
    double var37 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var36);
    double var38 = org.apache.commons.math.util.MathUtils.distance(var22, var36);
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 3.0d);
    double[] var45 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 1.0d);
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var47, 1.5707963267948966d);
    double[] var51 = org.apache.commons.math.util.MathUtils.normalizeArray(var49, 1.0038848218538872d);
    double[] var55 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.normalizeArray(var55, 1.0d);
    double[] var59 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 1.5707963267948966d);
    double[] var63 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var65 = org.apache.commons.math.util.MathUtils.normalizeArray(var63, 1.0d);
    double[] var69 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var71 = org.apache.commons.math.util.MathUtils.normalizeArray(var69, 1.0d);
    double var72 = org.apache.commons.math.util.MathUtils.distanceInf(var65, var71);
    double var73 = org.apache.commons.math.util.MathUtils.distance(var57, var71);
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var49, var57);
    double[][] var75 = new double[][] { var49};
    org.apache.commons.math.util.MathUtils.sortInPlace(var36, var75);
    org.apache.commons.math.exception.ConvergenceException var77 = new org.apache.commons.math.exception.ConvergenceException(var16, (java.lang.Object[])var75);
    org.apache.commons.math.exception.MathArithmeticException var78 = new org.apache.commons.math.exception.MathArithmeticException(var15, (java.lang.Object[])var75);
    var13.addMessage(var14, (java.lang.Object[])var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test420() {}
//   public void test420() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test420"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 2146959360);
// 
//   }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test421"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, (-2105540607));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2105540607);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test422"); }


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
    double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    java.lang.Number var26 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var26, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var28.getDirection();
    double[] var34 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, 1.0d);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.5707963267948966d);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 1.0038848218538872d);
    double[] var44 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, 1.0d);
    double[] var48 = org.apache.commons.math.util.MathUtils.normalizeArray(var46, 1.5707963267948966d);
    double[] var52 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 1.0d);
    double[] var58 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var60 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 1.0d);
    double var61 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var60);
    double var62 = org.apache.commons.math.util.MathUtils.distance(var46, var60);
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var46);
    double[] var67 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var69 = org.apache.commons.math.util.MathUtils.normalizeArray(var67, 1.0d);
    double[] var71 = org.apache.commons.math.util.MathUtils.normalizeArray(var69, 1.5707963267948966d);
    double[] var75 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var77 = org.apache.commons.math.util.MathUtils.normalizeArray(var75, 1.0d);
    double[] var81 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var83 = org.apache.commons.math.util.MathUtils.normalizeArray(var81, 1.0d);
    double var84 = org.apache.commons.math.util.MathUtils.distanceInf(var77, var83);
    double var85 = org.apache.commons.math.util.MathUtils.distance(var69, var83);
    double var86 = org.apache.commons.math.util.MathUtils.safeNorm(var83);
    int var87 = org.apache.commons.math.util.MathUtils.hash(var83);
    org.apache.commons.math.util.MathUtils.checkFinite(var83);
    boolean var89 = org.apache.commons.math.util.MathUtils.equals(var38, var83);
    double[][] var90 = new double[][] { var83};
    org.apache.commons.math.util.MathUtils.sortInPlace(var5, var30, var90);
    
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
    assertTrue(var24 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test423"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(110L, (-8L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 102L);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test424"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.5872139151569291d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test425"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(3080657310641694895L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3080657310641694895L);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test426"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test427"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 13716);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test428() {}
//   public void test428() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test428"); }
// 
// 
//     double[] var0 = null;
//     double[] var4 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 1.0d);
//     double[] var10 = new double[] { (-1.0d), (-1.0d), 1.0d};
//     double[] var12 = org.apache.commons.math.util.MathUtils.normalizeArray(var10, 1.0d);
//     double var13 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var12);
//     double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var6, 0);
//     double var16 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var6);
// 
//   }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test429"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.984807753012208d, 1.547657737556848d, 0.6961874372246237d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test430"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1048576), 112197732);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test431"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-784635895), (java.lang.Number)0.0d, false);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test432"); }


    float[] var1 = new float[] { 100.0f};
    float[] var2 = new float[] { };
    float[] var3 = new float[] { };
    float[] var5 = new float[] { 100.0f};
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var3, var5);
    float[] var7 = new float[] { };
    float[] var9 = new float[] { 100.0f};
    boolean var10 = org.apache.commons.math.util.MathUtils.equals(var7, var9);
    boolean var11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var7);
    float[] var12 = new float[] { };
    float[] var14 = new float[] { 100.0f};
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var12, var14);
    boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var12);
    float[] var17 = new float[] { };
    float[] var19 = new float[] { 100.0f};
    boolean var20 = org.apache.commons.math.util.MathUtils.equals(var17, var19);
    boolean var21 = org.apache.commons.math.util.MathUtils.equals(var12, var19);
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var19);
    float[] var23 = new float[] { };
    float[] var25 = new float[] { 100.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var23, var25);
    float[] var27 = new float[] { };
    float[] var29 = new float[] { 100.0f};
    boolean var30 = org.apache.commons.math.util.MathUtils.equals(var27, var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var27);
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var27);
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test433"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test434"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    int[] var2 = new int[] { 100};
    int[] var6 = new int[] { (-1), 1, 1};
    int var7 = org.apache.commons.math.util.MathUtils.distance1(var2, var6);
    int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var2, 10);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.NullArgumentException var15 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var16 = new org.apache.commons.math.exception.NullArgumentException();
    var15.addSuppressed((java.lang.Throwable)var16);
    org.apache.commons.math.exception.util.Localizable var18 = null;
    java.lang.Object[] var20 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var21 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var15, var18, var20);
    org.apache.commons.math.exception.NullArgumentException var22 = new org.apache.commons.math.exception.NullArgumentException(var14, var20);
    org.apache.commons.math.exception.MathArithmeticException var23 = new org.apache.commons.math.exception.MathArithmeticException(var13, var20);
    org.apache.commons.math.exception.MathIllegalArgumentException var24 = new org.apache.commons.math.exception.MathIllegalArgumentException(var12, var20);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var10, var11, var20);
    org.apache.commons.math.exception.MathIllegalStateException var26 = new org.apache.commons.math.exception.MathIllegalStateException(var0, var20);
    org.apache.commons.math.exception.util.Localizable var27 = null;
    var26.addMessage(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test435"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-5));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test436"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-0.9851681077846736d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test437"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-51));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test438"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.6085980977425464d, 12, (-220));
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test439"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.000002f, 100.0f, 0);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test440"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(10100, (-220));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test441"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(9.536744E-7f, 2.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test442"); }


    float var2 = org.apache.commons.math.util.FastMath.min(10.0f, 1.1368684E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1368684E-13f);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test443"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(253207000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 253207000L);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test444"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1320904712), 33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1320904712));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test445"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.08168132327233309d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0033377744245369d);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test446"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(100.00000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3440585709080869E43d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test447"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1100L), 110L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test448"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var8 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var6, true);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    java.lang.Object[] var11 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var12 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var8, var9, var11);
    org.apache.commons.math.exception.NotFiniteNumberException var13 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var11);
    org.apache.commons.math.exception.NotFiniteNumberException var14 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)1.0f, var11);
    org.apache.commons.math.exception.util.Localizable var15 = null;
    java.lang.Object[] var16 = null;
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var11, var15, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test449"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.6388501770283721d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1388863237);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test450"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 101);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var11 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var10);
    int[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var10, 26214400);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var14 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var10);
    int[] var16 = new int[] { 100};
    int[] var20 = new int[] { (-1), 1, 1};
    int var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var20);
    int[] var23 = new int[] { 100};
    int[] var27 = new int[] { (-1), 1, 1};
    int var28 = org.apache.commons.math.util.MathUtils.distance1(var23, var27);
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var29, 201);
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var33 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var16);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 101);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test451"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, Float.POSITIVE_INFINITY, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test452"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.0000002f, 100.0f, 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test453"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-2114948138), 1421439005);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1421439005);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test454"); }


    java.lang.Number var1 = null;
    java.lang.Number var4 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var4, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.8184464592320668d, var1, 3, var7, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = var9.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test455"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.999999f, 9.536744E-7f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test456"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 6, (-23));
    int var4 = var3.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-23));

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test457"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.4210854715201997E-14d, Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test458"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(101097L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test459"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100997L, 3080657310641694891L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3080657310641694891L);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test460"); }


    long var2 = org.apache.commons.math.util.FastMath.max(100897L, (-1100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100897L);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test461"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(5729.5779513082325d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test462"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test463"); }


    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)720.0d);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test464"); }


    int[] var2 = new int[] { 0, 100};
    int[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var2, 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test465"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test466"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, (java.lang.Number)1.4210854715202004E-14d, false);
    boolean var4 = var3.getBoundIsAllowed();
    org.apache.commons.math.exception.NotPositiveException var6 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)(-0.21418410704948732d));
    var3.addSuppressed((java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test467"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(Float.NaN, 1.1368684E-13f, 1.4E-45f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test468"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(4.440892098500626E-16d, 0.6085980977425464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6085980977425464d);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test469"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test470"); }


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
    java.lang.Number var29 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var31 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)10, var29, false);
    java.lang.String var32 = var31.toString();
    java.lang.Object var34 = var31.getContext("org.apache.commons.math.exception.MathRuntimeException: ");
    java.util.Set var35 = var31.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var36 = var26.centroidOf((java.util.Collection)var35);
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
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 10 is smaller than, or equal to, the minimum (null)"+ "'", var32.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 10 is smaller than, or equal to, the minimum (null)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test471"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(411);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test472"); }


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
    int var25 = org.apache.commons.math.util.MathUtils.hash(var19);
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var19, 6);
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, (-2.5049299045672764d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var27);
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
    assertTrue(var25 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test473"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var5);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test474"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.6475434656816703d, (-1327242822));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test475"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.034920772952347814d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.32685962843044d));

  }

  public void test476() {}
//   public void test476() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test476"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-0.9851681077846736d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test477"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.5907092355160468d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test478"); }


    float[] var0 = null;
    int[] var3 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var4 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var3);
    boolean var6 = var4.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var7 = new float[] { };
    float[] var9 = new float[] { 100.0f};
    boolean var10 = org.apache.commons.math.util.MathUtils.equals(var7, var9);
    boolean var11 = var4.equals((java.lang.Object)var9);
    boolean var12 = org.apache.commons.math.util.MathUtils.equals(var0, var9);
    float[] var13 = new float[] { };
    float[] var14 = new float[] { };
    float[] var16 = new float[] { 100.0f};
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var14, var16);
    float[] var18 = new float[] { };
    float[] var20 = new float[] { 100.0f};
    boolean var21 = org.apache.commons.math.util.MathUtils.equals(var18, var20);
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var18);
    float[] var23 = new float[] { };
    float[] var25 = new float[] { 100.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var23, var25);
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var23);
    float[] var28 = new float[] { };
    float[] var30 = new float[] { 100.0f};
    boolean var31 = org.apache.commons.math.util.MathUtils.equals(var28, var30);
    boolean var32 = org.apache.commons.math.util.MathUtils.equals(var23, var30);
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var30);
    float[] var34 = new float[] { };
    float[] var36 = new float[] { 100.0f};
    boolean var37 = org.apache.commons.math.util.MathUtils.equals(var34, var36);
    float[] var38 = new float[] { };
    float[] var40 = new float[] { 100.0f};
    boolean var41 = org.apache.commons.math.util.MathUtils.equals(var38, var40);
    boolean var42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var38);
    float[] var43 = new float[] { };
    float[] var45 = new float[] { 100.0f};
    boolean var46 = org.apache.commons.math.util.MathUtils.equals(var43, var45);
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var45);
    boolean var48 = org.apache.commons.math.util.MathUtils.equals(var30, var38);
    float[] var49 = new float[] { };
    float[] var51 = new float[] { 100.0f};
    boolean var52 = org.apache.commons.math.util.MathUtils.equals(var49, var51);
    boolean var53 = org.apache.commons.math.util.MathUtils.equals(var30, var51);
    boolean var54 = org.apache.commons.math.util.MathUtils.equals(var0, var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test479"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh((-5.671281819617704d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test480"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(26214400, 137);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1799.791983257381d);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test481"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.04323229440977d));

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test482"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 110L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 110L);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test483"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(100997L, 101097L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 202094L);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test484"); }


    double[] var5 = new double[] { 0.0d, 1.0d};
    double var6 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    org.apache.commons.math.util.MathUtils.checkOrder(var5);
    java.lang.Number var12 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var12, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var14.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var15, false);
    boolean var20 = org.apache.commons.math.util.MathUtils.checkOrder(var5, var15, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var22 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0038848218538872d, (java.lang.Number)(-1048987), (-137), var15, true);
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.exception.util.Localizable var25 = null;
    org.apache.commons.math.exception.util.Localizable var26 = null;
    org.apache.commons.math.exception.NullArgumentException var27 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var28 = new org.apache.commons.math.exception.NullArgumentException();
    var27.addSuppressed((java.lang.Throwable)var28);
    org.apache.commons.math.exception.util.Localizable var30 = null;
    java.lang.Object[] var32 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var33 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var27, var30, var32);
    org.apache.commons.math.exception.NullArgumentException var34 = new org.apache.commons.math.exception.NullArgumentException(var26, var32);
    org.apache.commons.math.exception.MathArithmeticException var35 = new org.apache.commons.math.exception.MathArithmeticException(var25, var32);
    org.apache.commons.math.exception.NotFiniteNumberException var36 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)10.0f, var32);
    var22.addMessage(var23, var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test485"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.0f, 0.0f, (-1048576));

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test486"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.3517546257973585d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test487"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-20));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 20);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test488"); }


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
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var38);
    double[] var43 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.normalizeArray(var43, 1.0d);
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 1.5707963267948966d);
    double[] var51 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.normalizeArray(var51, 1.0d);
    double[] var57 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var59 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 1.0d);
    double var60 = org.apache.commons.math.util.MathUtils.distanceInf(var53, var59);
    double var61 = org.apache.commons.math.util.MathUtils.distance(var45, var59);
    double var62 = org.apache.commons.math.util.MathUtils.safeNorm(var59);
    double[] var66 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var68 = org.apache.commons.math.util.MathUtils.normalizeArray(var66, 1.0d);
    double[] var70 = org.apache.commons.math.util.MathUtils.normalizeArray(var66, 0.8414709848078965d);
    boolean var71 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var66);
    boolean var72 = org.apache.commons.math.util.MathUtils.equals(var38, var66);
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var15, var38);
    double var74 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1.7320508075688772d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test489"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1799.791983257381d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.2552223130233284d);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test490"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test491"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.7320508075688774d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3160740129524926d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test492"); }


    org.apache.commons.math.util.MathUtils.checkFinite(2.7964147890663615d);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test493"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.034920772952347814d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test494"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-0.21418410704948732d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-12.271845372713846d));

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test495"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(20L, (-1100L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test496"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(101, 33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 68);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test497"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1421439005), (-5));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test498"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.7453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test499"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3246418194520043E174d);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test500"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var4, true);
    org.apache.commons.math.exception.util.Localizable var7 = null;
    java.lang.Object[] var9 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var10 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var6, var7, var9);
    org.apache.commons.math.exception.NullArgumentException var11 = new org.apache.commons.math.exception.NullArgumentException(var0, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
