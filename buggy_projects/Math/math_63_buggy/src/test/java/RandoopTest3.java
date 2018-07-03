
import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test1"); }


    long var1 = org.apache.commons.math.util.FastMath.round(4.06023871960563d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4L);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test2"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1715.0487709973513d, 0.6611860783039282d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1715.048770997351d);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test3"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(9.7703918159661E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999995226972568d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test4"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-0.6075672970622579d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test5"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1442072789), 1749763524);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072789));

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test6"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(71.87795598812559d, 815.7297363039102d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 813.2938222353167d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians((-2267.7598026864775d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-39.57987520125598d));

  }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test8"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(Float.NaN, 10.0f);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test9"); }


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
    int[] var51 = new int[] { 100, 100, 0};
    int[] var55 = new int[] { 10, 0, 1};
    int var56 = org.apache.commons.math.util.MathUtils.distance1(var51, var55);
    int var57 = org.apache.commons.math.util.MathUtils.distance1(var46, var55);
    int var58 = org.apache.commons.math.util.MathUtils.distance1(var16, var55);
    
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test10"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(59.517686583057106d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.102935662529541d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test11"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 9000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test12"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(4L, 72L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 72L);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test13"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1442072881));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test14"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(3.1622776601683795d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test15"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8094317870247442d, 1.0239010128918022d, (-0.14748086636738275d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test16"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-9.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-10.0d));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(100.4987562112089d, 0, (-1442072980));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test18"); }


    long var2 = org.apache.commons.math.util.FastMath.min(301L, 363181L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 301L);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test19"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(599254251, 100);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test20"); }


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
    org.apache.commons.math.exception.NonMonotonousSequenceException var37 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0239010128918027d, (java.lang.Number)209066259, 1000573857);
    var32.addSuppressed((java.lang.Throwable)var37);
    
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

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test21"); }


    long var1 = org.apache.commons.math.util.FastMath.round(23.624342922017817d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 24L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test22"); }


    long var2 = org.apache.commons.math.util.FastMath.max(2L, 5L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test23"); }


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
    int var43 = var5.getIndex();
    
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
    assertTrue(var43 == 100);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test24"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1997450891849582935L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test25"); }


    int var2 = org.apache.commons.math.util.FastMath.min(103570195, 900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test26"); }


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
    double[] var18 = new double[] { 100.0d, 0.0d};
    double var19 = org.apache.commons.math.util.MathUtils.distance(var8, var18);
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var22 = new double[] { 0.0d};
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    int var24 = org.apache.commons.math.util.MathUtils.hash(var22);
    double[] var26 = new double[] { 0.0d};
    double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var26);
    double[] var29 = new double[] { 0.0d};
    double[] var31 = new double[] { 100.0d};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var31);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var26, var29);
    double[] var35 = new double[] { 0.0d};
    double[] var37 = new double[] { 100.0d};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
    double var39 = org.apache.commons.math.util.MathUtils.distance(var29, var37);
    double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, 0.8575532158463934d);
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, 0.6480542736638855d);
    double[] var45 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, 1.0239010128918025d);
    org.apache.commons.math.util.MathUtils.OrderDirection var46 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var37, var46, true);
    double[] var50 = new double[] { 0.0d};
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double var52 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double var53 = org.apache.commons.math.util.MathUtils.distance(var37, var50);
    double[] var55 = new double[] { 0.0d};
    double var56 = org.apache.commons.math.util.MathUtils.safeNorm(var55);
    double[] var58 = new double[] { 0.0d};
    double[] var60 = new double[] { 100.0d};
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var58, var60);
    boolean var62 = org.apache.commons.math.util.MathUtils.equals(var55, var58);
    double[] var64 = new double[] { 0.0d};
    double[] var66 = new double[] { 100.0d};
    boolean var67 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var64, var66);
    double var68 = org.apache.commons.math.util.MathUtils.distance(var58, var66);
    double[] var70 = new double[] { 0.0d};
    double var71 = org.apache.commons.math.util.MathUtils.safeNorm(var70);
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var70);
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var66, var70);
    double var74 = org.apache.commons.math.util.MathUtils.distance1(var37, var66);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var22, var37);
    double var76 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var22);
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var22);
    double[] var79 = new double[] { 0.0d};
    double var80 = org.apache.commons.math.util.MathUtils.safeNorm(var79);
    double[] var82 = new double[] { 0.0d};
    double[] var84 = new double[] { 100.0d};
    boolean var85 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var82, var84);
    boolean var86 = org.apache.commons.math.util.MathUtils.equals(var79, var82);
    double[] var88 = new double[] { 0.0d};
    double[] var90 = new double[] { 100.0d};
    boolean var91 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var88, var90);
    double var92 = org.apache.commons.math.util.MathUtils.distance(var82, var90);
    int var93 = org.apache.commons.math.util.MathUtils.hash(var90);
    double var94 = org.apache.commons.math.util.MathUtils.safeNorm(var90);
    boolean var95 = org.apache.commons.math.util.MathUtils.equals(var3, var90);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == true);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test27"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(28.56098276152118d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test28"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0426302550738344E15d, 3.4473535081991327d, 1442072990);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test29"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.7840341610578332d, 0.4229072086738532d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3380415276415127d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test30"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(3.4473535081991327d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 31.417136994624613d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test31"); }


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
    org.apache.commons.math.util.MathUtils.OrderDirection var24 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var15, var24, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var33.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var34, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var15, var34, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var40 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-2267.7598026864775d), (java.lang.Number)8.140344062648719d, 1442072881, var34, false);
    
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
    assertNotNull(var34);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test32"); }


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
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var28, var33, true);
    
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

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.0907660374718036d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.044397451869643d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test34"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test35"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (-1997450891849582299L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test36"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-240026100));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test37"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(300L, 1997450891849581935L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test38"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1442072880), 1338502676);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test39"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NEGATIVE_INFINITY, (java.lang.Number)Double.NEGATIVE_INFINITY, 191, var3, false);
    int var6 = var5.getIndex();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    java.lang.Number var8 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + Double.NEGATIVE_INFINITY+ "'", var8.equals(Double.NEGATIVE_INFINITY));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test40"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1442073090, 1442072980);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test41"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NEGATIVE_INFINITY, (java.lang.Number)Double.NEGATIVE_INFINITY, 191, var9, false);
    var5.addSuppressed((java.lang.Throwable)var11);
    org.apache.commons.math.exception.NonMonotonousSequenceException var16 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.087077848795329E30d, (java.lang.Number)1.5612677191481816d, (-1));
    java.lang.Throwable[] var17 = var16.getSuppressed();
    int var18 = var16.getIndex();
    var11.addSuppressed((java.lang.Throwable)var16);
    java.lang.Number var20 = var11.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + Double.NEGATIVE_INFINITY+ "'", var20.equals(Double.NEGATIVE_INFINITY));

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test42"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.0426302550738344E15d, 0.2329783180169909d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948963d);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test43"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1774819148, 1325336842);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test44"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1862915923, (-1338502675));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1862915923);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test45"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(4628162069711240015L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(2.0878314150298527d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.366244656799464d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test47"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1150131614), 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 209);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test48"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(1715.048770997351d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test49"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test50"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(9.765621895592899E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.7656218955929E-4d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test51"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.8575532158463934d, 0.7856186626880235d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7856186626880235d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test52"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.7165256995489038d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3956233539558462d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test53"); }


    double[] var1 = new double[] { 0.0d};
    double[] var3 = new double[] { 100.0d};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
    double var5 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var7 = new double[] { 0.0d};
    double[] var9 = new double[] { 100.0d};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var9);
    double[] var12 = new double[] { 0.0d};
    double[] var14 = new double[] { 100.0d};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var14);
    double var16 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var12);
    double[] var18 = new double[] { 0.0d};
    double[] var20 = new double[] { 100.0d};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var20);
    double[] var23 = new double[] { 0.0d};
    double[] var25 = new double[] { 100.0d};
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var25);
    double var27 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var23);
    double[] var29 = new double[] { 0.0d};
    double[] var31 = new double[] { 100.0d};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var31);
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var31, 1.0239010128918022d);
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var20, var34);
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var9, var34);
    double[] var38 = new double[] { 0.0d};
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
    double[] var41 = new double[] { 0.0d};
    double[] var43 = new double[] { 100.0d};
    boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var43);
    boolean var45 = org.apache.commons.math.util.MathUtils.equals(var38, var41);
    boolean var46 = org.apache.commons.math.util.MathUtils.equals(var9, var38);
    org.apache.commons.math.util.MathUtils.OrderDirection var47 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var38, var47, false);
    double var50 = org.apache.commons.math.util.MathUtils.distance(var3, var38);
    double[] var54 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var55 = null;
    boolean var56 = org.apache.commons.math.util.MathUtils.equals(var54, var55);
    double var57 = org.apache.commons.math.util.MathUtils.distance(var38, var54);
    int var58 = org.apache.commons.math.util.MathUtils.hash(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1000573857));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test54"); }


    long var1 = org.apache.commons.math.util.FastMath.round(9.770394924923376E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test55"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.0907660374718036d, (-0.6953039533394731d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test56"); }


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
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 1442072881);
    
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

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test57"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.6893620967346501d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 645166613);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test58"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.5707963267948963d, 0.8808144024434078d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948963d);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test59"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.6918609160410639d, (-1800407107), 1325336842);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test60"); }


    long var2 = org.apache.commons.math.util.FastMath.min(900000L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test61"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100L, 4628162069711240015L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4628162069711239915L));

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test62"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.1241171695718353d, 0.9075620646965069d, 0.90674277906894d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test63"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test64"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(4, 1325336842);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1325336846);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test65"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-4628162069712139925L), 299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4628162069712140224L));

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test66"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.5716125779527041d, 2.817858031239898d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5087609069823038d);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test67"); }


    long var2 = org.apache.commons.math.util.FastMath.min(363181L, 910L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 910L);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test68"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(209066259);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test69"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(191, 1442073090);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test70"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-362790L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 362790L);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test71"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.7223986315263068d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.14122308539822798d));

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test72"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(141.4213562373095d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.998765863604859d));

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test73"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 31);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var12, 1442072990);
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)var12, (java.lang.Number)100.0d, (-1862915923));
    
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

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test74"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1722.57483263636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.452155804008459d);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test75"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round((-6.717254013985337d), 1442072980);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test76"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.2128331401446932d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2128331401446935d);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test77"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(52.47197555529855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5937383209845091d));

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test78"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1079574658, 645166613);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test79"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.013292325585375278d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.013291542785109842d);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test80"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
    java.lang.Number var6 = var5.getArgument();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var10, true);
    int var13 = var12.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var12.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var12.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1442072980), (java.lang.Number)1.1752011936438014d, 99, var19, false);
    java.lang.String var22 = var21.toString();
    var12.addSuppressed((java.lang.Throwable)var21);
    var5.addSuppressed((java.lang.Throwable)var12);
    boolean var25 = var12.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 98 and 99 are not decreasing (1.175 < -1,442,072,980)"+ "'", var22.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 98 and 99 are not decreasing (1.175 < -1,442,072,980)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test81"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-0.5937383209845091d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5634481422519111d));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test82"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test83"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 106.81415022205297d);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test84"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-62.76775642379764d), (java.lang.Number)71.87795598812558d, (-1122853665));

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test85"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715202004E-14d);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test86"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.030494020926757d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8004150648852755d);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test87"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.540289941871101d), 1.1641532182693481E-10d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test88"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(180L, 180L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 180L);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test89"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(26149032L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 130745160L);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test90"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(2.817858031239898d, 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.817858031239898d);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test91"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.742873525979806d);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test92"); }


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
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 9223372036854775807L);
    java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, 0L);
    
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

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test93"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.0013201168646786218d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0013201176315387993d);

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test94"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.07005479595293078d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test95"); }


    long var2 = org.apache.commons.math.util.FastMath.max(4628162069712140015L, 90L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4628162069712140015L);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test96"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.2412837662566061d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4.9E-324d));

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test97"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 15);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test98"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.9993356198097555d, 1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7732571287528397d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test99"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0359770329454867d, (-0.28308283934013667d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test100"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test101"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.6843418860808015E-14d);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test102"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1150131505), 1062207624);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test103"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.07549325845303248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0753501667826418d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test104"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(180L, (-892927039));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test105"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.2329783180169909d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2623541086902015d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test106"); }


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
    double[] var67 = new double[] { 0.0d};
    double[] var69 = new double[] { 100.0d};
    boolean var70 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var67, var69);
    boolean var71 = org.apache.commons.math.util.MathUtils.equals(var64, var67);
    double var72 = org.apache.commons.math.util.MathUtils.distance(var61, var67);
    
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
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1.0239010128918025d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test107"); }


    double[] var0 = null;
    double[] var2 = new double[] { 0.0d};
    double[] var4 = new double[] { 100.0d};
    boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
    double[] var7 = new double[] { 0.0d};
    double[] var9 = new double[] { 100.0d};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var9);
    double var11 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var7);
    double[] var13 = new double[] { 0.0d};
    double[] var15 = new double[] { 100.0d};
    boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var15);
    double[] var18 = new double[] { 0.0d};
    double[] var20 = new double[] { 100.0d};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var20);
    double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var18);
    double[] var24 = new double[] { 0.0d};
    double[] var26 = new double[] { 100.0d};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0239010128918022d);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var15, var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var29);
    boolean var32 = org.apache.commons.math.util.MathUtils.equals(var0, var29);
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
    double[] var55 = new double[] { 0.0d};
    double[] var57 = new double[] { 100.0d};
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var57);
    double[] var60 = new double[] { 0.0d};
    double[] var62 = new double[] { 100.0d};
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var60, var62);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var57, var60);
    double[] var65 = new double[] { };
    double[] var69 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var70 = null;
    boolean var71 = org.apache.commons.math.util.MathUtils.equals(var69, var70);
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var65, var69);
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var60, var69);
    double var74 = org.apache.commons.math.util.MathUtils.distance1(var53, var60);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var29, var60);
    double[] var77 = new double[] { 0.0d};
    double[] var79 = new double[] { 100.0d};
    boolean var80 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var77, var79);
    double[] var82 = org.apache.commons.math.util.MathUtils.normalizeArray(var79, 1.0239010128918022d);
    boolean var83 = org.apache.commons.math.util.MathUtils.equals(var60, var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1.0239010128918022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test108"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3.439274378162969E-29d, 0.6893620967346501d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test109"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.5110577526502573d, 0.5403023058681399d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test110"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(900);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test111"); }


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
    java.math.BigInteger var26 = org.apache.commons.math.util.MathUtils.pow(var4, var22);
    java.math.BigInteger var28 = org.apache.commons.math.util.MathUtils.pow(var22, 191);
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test112"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.4931702671658056d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9969886100596884d);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test113"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(82.50620747949382d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.1059839858034d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test114"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.31326168751822286d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3081632227560955d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test115"); }


    double[] var0 = new double[] { };
    double[] var4 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var4, var5);
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var4);
    double[] var10 = new double[] { 1.0d};
    org.apache.commons.math.util.MathUtils.checkOrder(var10);
    double[] var13 = new double[] { 0.0d};
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    double[] var16 = new double[] { 0.0d};
    double[] var18 = new double[] { 100.0d};
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var18);
    boolean var20 = org.apache.commons.math.util.MathUtils.equals(var13, var16);
    double[] var22 = new double[] { 0.0d};
    double[] var24 = new double[] { 100.0d};
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var24);
    double var26 = org.apache.commons.math.util.MathUtils.distance(var16, var24);
    double[] var28 = org.apache.commons.math.util.MathUtils.normalizeArray(var24, 0.8575532158463934d);
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var24, 0.6480542736638855d);
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var24, 1.0239010128918025d);
    double var33 = org.apache.commons.math.util.MathUtils.distance(var10, var32);
    double[] var34 = null;
    boolean var35 = org.apache.commons.math.util.MathUtils.equals(var32, var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var32);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.023901012891802464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test116"); }


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
    org.apache.commons.math.util.MathUtils.checkOrder(var6);
    
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

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test117"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1150131505), 299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 890345967);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test118"); }


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
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var28, 1.030494020926757d);
    
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

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test119"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(4.102935662529541d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 30.267105339009724d);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test120"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-3.193181872794057d), Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test121"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(31, 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test122"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.6893620967346501d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6893620967346502d);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test123"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test124"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(3.424868789200273E85d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.424868789200273E85d);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test125"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-3L), (-4628162069712140224L));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test126"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(4628162069712140015L, (-1442072990));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test127"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.4932167668855039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test128"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.6611860783039282d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6611860783039282d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.2412837662566061d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.24368848434477358d));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test130"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.07549325845303248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test131"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-0.28308283934013667d), 1.0359770329454867d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test132"); }


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
    java.math.BigInteger var79 = null;
    java.math.BigInteger var81 = org.apache.commons.math.util.MathUtils.pow(var79, 0L);
    java.math.BigInteger var83 = org.apache.commons.math.util.MathUtils.pow(var81, 0);
    java.math.BigInteger var84 = null;
    java.math.BigInteger var86 = org.apache.commons.math.util.MathUtils.pow(var84, 0L);
    java.math.BigInteger var88 = org.apache.commons.math.util.MathUtils.pow(var86, 0);
    java.math.BigInteger var89 = org.apache.commons.math.util.MathUtils.pow(var83, var86);
    java.math.BigInteger var91 = org.apache.commons.math.util.MathUtils.pow(var83, 364L);
    java.math.BigInteger var93 = org.apache.commons.math.util.MathUtils.pow(var91, 31);
    java.math.BigInteger var95 = org.apache.commons.math.util.MathUtils.pow(var91, 5L);
    java.math.BigInteger var96 = org.apache.commons.math.util.MathUtils.pow(var78, var91);
    
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
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test133"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(5.1059839858034d, 27.46905995280715d, 2.198408826999716d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test134"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(23.624342922017817d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.09686550795815E9d);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test135"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(28.56098276152118d, 2.0714456192932014E9d, 1000573857);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test136"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 4628162069712140015L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test137"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-4628162069711239915L), 6000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test138"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-37.13157410328371d), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-37.1315741033d));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test139"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1862915913), 2110066489);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test140"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.9697850179455104d, 11013.232874703393d, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test141"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.6075672970622578d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test142"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.1235453300558023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4324885616879247d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test143"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(2009326299, 99);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test144"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.6441187605840392d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6004940069530696d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test145"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-1862915913), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test146"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(9.770394924923376E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.770393370444163E-4d);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test147"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { 0.0d};
//     double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
//     double[] var5 = new double[] { 0.0d};
//     double[] var7 = new double[] { 100.0d};
//     boolean var8 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var7);
//     double[] var10 = new double[] { 0.0d};
//     double[] var12 = new double[] { 100.0d};
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var10);
//     double[] var16 = new double[] { 0.0d};
//     double[] var18 = new double[] { 100.0d};
//     boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var18);
//     double[] var21 = new double[] { 0.0d};
//     double[] var23 = new double[] { 100.0d};
//     boolean var24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var23);
//     double var25 = org.apache.commons.math.util.MathUtils.distanceInf(var18, var21);
//     double[] var27 = new double[] { 0.0d};
//     double[] var29 = new double[] { 100.0d};
//     boolean var30 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var27, var29);
//     double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 1.0239010128918022d);
//     double var33 = org.apache.commons.math.util.MathUtils.distance1(var18, var32);
//     boolean var34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var32);
//     boolean var35 = org.apache.commons.math.util.MathUtils.equals(var2, var7);
//     double[] var37 = new double[] { 0.0d};
//     double var38 = org.apache.commons.math.util.MathUtils.safeNorm(var37);
//     double[] var40 = new double[] { 0.0d};
//     double[] var42 = new double[] { 100.0d};
//     boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var42);
//     boolean var44 = org.apache.commons.math.util.MathUtils.equals(var37, var40);
//     double[] var46 = new double[] { 0.0d};
//     double[] var48 = new double[] { 100.0d};
//     boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var48);
//     double var50 = org.apache.commons.math.util.MathUtils.distance(var40, var48);
//     double[] var52 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 0.8575532158463934d);
//     double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var48);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var60 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
//     org.apache.commons.math.util.MathUtils.OrderDirection var61 = var60.getDirection();
//     org.apache.commons.math.exception.NonMonotonousSequenceException var63 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1L), (java.lang.Number)1150131505, 0, var61, true);
//     org.apache.commons.math.util.MathUtils.checkOrder(var2, var61, true);
//     double var66 = org.apache.commons.math.util.MathUtils.distance(var0, var2);
// 
//   }

  public void test148() {}
//   public void test148() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test148"); }
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
//     int[] var31 = new int[] { 100, 100, 0};
//     int[] var35 = new int[] { 10, 0, 1};
//     int var36 = org.apache.commons.math.util.MathUtils.distance1(var31, var35);
//     int var37 = org.apache.commons.math.util.MathUtils.distance1(var26, var35);
//     int var38 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var35);
//     int[] var39 = null;
//     double var40 = org.apache.commons.math.util.MathUtils.distance(var35, var39);
// 
//   }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test149"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(10.0f, 209066259);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test150"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.5430806348152437d, 0.7525718536044814d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.117031064755199d);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test151"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.1663477970454088d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test152"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1442072990), 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test153() {}
//   public void test153() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test153"); }
// 
// 
//     int[] var0 = null;
//     int[] var4 = new int[] { 100, 100, 0};
//     int[] var8 = new int[] { 10, 0, 1};
//     int var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var8);
//     int[] var13 = new int[] { 0, 100, 100};
//     int var14 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var13);
//     int[] var18 = new int[] { 100, 100, 0};
//     int[] var22 = new int[] { 10, 0, 1};
//     int var23 = org.apache.commons.math.util.MathUtils.distance1(var18, var22);
//     int[] var27 = new int[] { 100, 100, 0};
//     int[] var31 = new int[] { 10, 0, 1};
//     int var32 = org.apache.commons.math.util.MathUtils.distance1(var27, var31);
//     int var33 = org.apache.commons.math.util.MathUtils.distance1(var22, var31);
//     int var34 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var31);
//     int[] var38 = new int[] { 100, 100, 0};
//     int[] var42 = new int[] { 10, 0, 1};
//     int var43 = org.apache.commons.math.util.MathUtils.distance1(var38, var42);
//     int[] var47 = new int[] { 0, 100, 100};
//     int var48 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var47);
//     int var49 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var47);
//     int var50 = org.apache.commons.math.util.MathUtils.distance1(var0, var31);
// 
//   }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm((-801000L), 4628162069712140015L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test155"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.021167931572826714d, (java.lang.Number)(short)0, 0);
    int var4 = var3.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test156"); }


    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0);
    java.math.BigInteger var6 = null;
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var5, var8);
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var5, 364L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var5, 1532522787);
    java.math.BigInteger var16 = null;
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 0L);
    java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, 0);
    java.math.BigInteger var21 = null;
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var21, 0L);
    java.math.BigInteger var25 = org.apache.commons.math.util.MathUtils.pow(var23, 0);
    java.math.BigInteger var26 = null;
    java.math.BigInteger var28 = org.apache.commons.math.util.MathUtils.pow(var26, 0L);
    java.math.BigInteger var30 = org.apache.commons.math.util.MathUtils.pow(var28, 0);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var25, var28);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var18, var28);
    java.math.BigInteger var33 = org.apache.commons.math.util.MathUtils.pow(var5, var32);
    java.math.BigInteger var34 = null;
    java.math.BigInteger var36 = org.apache.commons.math.util.MathUtils.pow(var34, 0L);
    java.math.BigInteger var38 = org.apache.commons.math.util.MathUtils.pow(var36, 0);
    java.math.BigInteger var39 = org.apache.commons.math.util.MathUtils.pow(var5, var36);
    java.math.BigInteger var40 = null;
    java.math.BigInteger var42 = org.apache.commons.math.util.MathUtils.pow(var40, 0L);
    java.math.BigInteger var44 = org.apache.commons.math.util.MathUtils.pow(var42, 0);
    java.math.BigInteger var45 = null;
    java.math.BigInteger var47 = org.apache.commons.math.util.MathUtils.pow(var45, 0L);
    java.math.BigInteger var49 = org.apache.commons.math.util.MathUtils.pow(var47, 0);
    java.math.BigInteger var50 = org.apache.commons.math.util.MathUtils.pow(var44, var47);
    java.math.BigInteger var52 = org.apache.commons.math.util.MathUtils.pow(var44, 364L);
    java.math.BigInteger var54 = org.apache.commons.math.util.MathUtils.pow(var44, 1532522787);
    java.math.BigInteger var55 = null;
    java.math.BigInteger var57 = org.apache.commons.math.util.MathUtils.pow(var55, 0L);
    java.math.BigInteger var59 = org.apache.commons.math.util.MathUtils.pow(var57, 0);
    java.math.BigInteger var60 = null;
    java.math.BigInteger var62 = org.apache.commons.math.util.MathUtils.pow(var60, 0L);
    java.math.BigInteger var64 = org.apache.commons.math.util.MathUtils.pow(var62, 0);
    java.math.BigInteger var65 = null;
    java.math.BigInteger var67 = org.apache.commons.math.util.MathUtils.pow(var65, 0L);
    java.math.BigInteger var69 = org.apache.commons.math.util.MathUtils.pow(var67, 0);
    java.math.BigInteger var70 = org.apache.commons.math.util.MathUtils.pow(var64, var67);
    java.math.BigInteger var71 = org.apache.commons.math.util.MathUtils.pow(var57, var67);
    java.math.BigInteger var72 = org.apache.commons.math.util.MathUtils.pow(var44, var71);
    java.math.BigInteger var73 = null;
    java.math.BigInteger var75 = org.apache.commons.math.util.MathUtils.pow(var73, 0L);
    java.math.BigInteger var77 = org.apache.commons.math.util.MathUtils.pow(var75, 0);
    java.math.BigInteger var78 = org.apache.commons.math.util.MathUtils.pow(var44, var75);
    java.math.BigInteger var79 = org.apache.commons.math.util.MathUtils.pow(var39, var44);
    java.math.BigInteger var81 = org.apache.commons.math.util.MathUtils.pow(var39, 240026100);
    org.apache.commons.math.exception.NonMonotonousSequenceException var83 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1325336846, (java.lang.Number)var81, 900);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test157"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(191);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test158"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(600L, 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 540000L);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test159"); }


    long var2 = org.apache.commons.math.util.FastMath.max(10L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test160"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var11 = new double[] { 100.0d, 0.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance(var1, var11);
    double var13 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    double[] var15 = new double[] { 0.0d};
    double var16 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
    double[] var18 = new double[] { 0.0d};
    double[] var20 = new double[] { 100.0d};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var20);
    boolean var22 = org.apache.commons.math.util.MathUtils.equals(var15, var18);
    double[] var24 = new double[] { 0.0d};
    double[] var26 = new double[] { 100.0d};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
    double var28 = org.apache.commons.math.util.MathUtils.distance(var18, var26);
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 0.8575532158463934d);
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 0.6480542736638855d);
    double[] var34 = new double[] { 0.0d};
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var37 = new double[] { 0.0d};
    double[] var39 = new double[] { 100.0d};
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var39);
    double[] var42 = new double[] { 0.0d};
    double[] var44 = new double[] { 100.0d};
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var44);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var39, var42);
    double[] var48 = new double[] { 0.0d};
    double[] var50 = new double[] { 100.0d};
    boolean var51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var48, var50);
    double[] var53 = new double[] { 0.0d};
    double[] var55 = new double[] { 100.0d};
    boolean var56 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var53, var55);
    double var57 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var53);
    double[] var59 = new double[] { 0.0d};
    double[] var61 = new double[] { 100.0d};
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var61);
    double[] var64 = org.apache.commons.math.util.MathUtils.normalizeArray(var61, 1.0239010128918022d);
    double var65 = org.apache.commons.math.util.MathUtils.distance1(var50, var64);
    boolean var66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var64);
    boolean var67 = org.apache.commons.math.util.MathUtils.equals(var34, var39);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var34);
    double[] var69 = new double[] { };
    double[] var73 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var74 = null;
    boolean var75 = org.apache.commons.math.util.MathUtils.equals(var73, var74);
    boolean var76 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var69, var73);
    double var77 = org.apache.commons.math.util.MathUtils.distance1(var32, var73);
    boolean var78 = org.apache.commons.math.util.MathUtils.equals(var11, var73);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
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
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test161"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(9.765628104410654E-4d, 1.0239010128918027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.765628104410656E-4d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test162"); }


    int var2 = org.apache.commons.math.util.FastMath.max(280988690, (-1338502686));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 280988690);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test163"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.4210854715202004E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-13.847379800543134d));

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test164"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(0.0d, 2092604993, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test165"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.088670895972281d);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test166"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-0.09988797703726823d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test167"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 779659312);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test168"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test169"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.4932167668855039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5403023058681398d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test170"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.087077848795329E30d, (java.lang.Number)1.5612677191481816d, (-1));
    java.lang.Number var4 = var3.getPrevious();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1.5612677191481816d+ "'", var4.equals(1.5612677191481816d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test171"); }


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
    int[] var45 = new int[] { 0, 100, 100};
    int var46 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var45);
    int var47 = org.apache.commons.math.util.MathUtils.distance1(var21, var45);
    int var48 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var45);
    
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
    assertTrue(var46 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test172"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.5430806348152437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.543080634815244d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test173"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0239010128918027d, (java.lang.Number)209066259, 1000573857);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,000,573,856 and 1,000,573,857 are not strictly increasing (209,066,259 >= 1.024)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,000,573,856 and 1,000,573,857 are not strictly increasing (209,066,259 >= 1.024)"));

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test174"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-0.9555128079474305d), 0.9202834833604815d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9202834833604815d);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test175"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var8, 0.4229072086738532d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test176"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.888629048145898d, 645166613);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.9540564768473854E-148d));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test177"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    boolean var6 = var5.getStrict();
    java.lang.Number var7 = var5.getArgument();
    int var8 = var5.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.9067427790689399d+ "'", var7.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test178"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)15.104412573075516d, (-1442072990), var3, false);
    java.lang.Number var6 = var5.getArgument();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var10, true);
    int var13 = var12.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var12.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var12.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1442072980), (java.lang.Number)1.1752011936438014d, 99, var19, false);
    java.lang.String var22 = var21.toString();
    var12.addSuppressed((java.lang.Throwable)var21);
    var5.addSuppressed((java.lang.Throwable)var12);
    int var25 = var12.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 98 and 99 are not decreasing (1.175 < -1,442,072,980)"+ "'", var22.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 98 and 99 are not decreasing (1.175 < -1,442,072,980)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test179"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.0028618546426542d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test180"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 1150131505, 1952354100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test181"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-0.9545943990414509d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test182"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.7365279287428347d, 11.309098927782431d, (-39748084));

  }

  public void test183() {}
//   public void test183() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test183"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.7223986315263068d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test184"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(1000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test185"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-8305579194716910415L), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test186"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(4.06023871960563d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 56.98815233566068d);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test187"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.5210953054937474d, 0.016925941599661452d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test188"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-3.0591582231017654E-31d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test189() {}
//   public void test189() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test189"); }
// 
// 
//     int[] var0 = null;
//     int[] var3 = new int[] { 0, 100};
//     int[] var7 = new int[] { 100, 100, 0};
//     int[] var11 = new int[] { 10, 0, 1};
//     int var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var11);
//     int[] var16 = new int[] { 100, 100, 0};
//     int[] var20 = new int[] { 10, 0, 1};
//     int var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var20);
//     int var22 = org.apache.commons.math.util.MathUtils.distance1(var11, var20);
//     int[] var26 = new int[] { 100, 100, 0};
//     int[] var30 = new int[] { 10, 0, 1};
//     int var31 = org.apache.commons.math.util.MathUtils.distance1(var26, var30);
//     int[] var35 = new int[] { 100, 100, 0};
//     int[] var39 = new int[] { 10, 0, 1};
//     int var40 = org.apache.commons.math.util.MathUtils.distance1(var35, var39);
//     int var41 = org.apache.commons.math.util.MathUtils.distance1(var30, var39);
//     double var42 = org.apache.commons.math.util.MathUtils.distance(var20, var39);
//     double var43 = org.apache.commons.math.util.MathUtils.distance(var3, var39);
//     int[] var47 = new int[] { 100, 100, 0};
//     int[] var51 = new int[] { 10, 0, 1};
//     int var52 = org.apache.commons.math.util.MathUtils.distance1(var47, var51);
//     int[] var56 = new int[] { 0, 100, 100};
//     int var57 = org.apache.commons.math.util.MathUtils.distanceInf(var51, var56);
//     int var58 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var51);
//     int var59 = org.apache.commons.math.util.MathUtils.distance1(var0, var3);
// 
//   }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test190"); }


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
    int var92 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var46);
    
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
    assertTrue(var92 == 100);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test191"); }


    float var2 = org.apache.commons.math.util.MathUtils.round((-1.0f), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test192"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.3081632227560955d, 0.3678794411714424d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.3678794411714424d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test193"); }


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
    int var20 = org.apache.commons.math.util.MathUtils.hash(var16);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var4, var16);
    int var22 = org.apache.commons.math.util.MathUtils.hash(var4);
    
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
    assertTrue(var20 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 31);

  }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test194"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 645166613);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test195"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var5 = var3.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test196"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.6953039533394731d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1402088442));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test197"); }


    int var2 = org.apache.commons.math.util.FastMath.min(332746168, 1952354100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 332746168);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test198"); }


    long var1 = org.apache.commons.math.util.FastMath.round(2.0714456192932014E9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2071445619L);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test199"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(910L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test200"); }


    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0);
    java.math.BigInteger var6 = null;
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var5, var8);
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var5, 364L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 31);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var13, 1442072990);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 264L);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var31 = var30.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var31, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var35 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)3.1622776601683795d, (-240026100), var31, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var37 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)104.9439511105971d, (java.lang.Number)264L, 1079574658, var31, false);
    int var38 = var37.getIndex();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1079574658);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test201"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    double[] var11 = new double[] { 100.0d, 0.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance(var1, var11);
    int var13 = org.apache.commons.math.util.MathUtils.hash(var1);
    
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
    assertTrue(var13 == 31);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test202"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(5.551115123125783E-17d, (-0.1932414450926745d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test203"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.9999995226972568d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7615939555007868d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test204"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.8045664954399904d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.341504437027525d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test205"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(130745160L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test206() {}
//   public void test206() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test206"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos((-1.1752011936438014d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test207"); }


    long var2 = org.apache.commons.math.util.FastMath.min(900000L, 299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 299L);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test208"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1150131505), 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1150131505));

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test209"); }


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
    java.lang.Throwable[] var19 = var5.getSuppressed();
    java.lang.Number var20 = var5.getArgument();
    boolean var21 = var5.getStrict();
    boolean var22 = var5.getStrict();
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 0.9067427790689399d+ "'", var20.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test210"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1862915923), 1442072990);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 240083417);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test211"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1749763524, (-1338502675));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1338502675));

  }

  public void test212() {}
//   public void test212() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test212"); }
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
//     double[] var32 = new double[] { 0.0d};
//     double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
//     double[] var35 = new double[] { 0.0d};
//     double[] var37 = new double[] { 100.0d};
//     boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var37);
//     boolean var39 = org.apache.commons.math.util.MathUtils.equals(var32, var35);
//     boolean var40 = org.apache.commons.math.util.MathUtils.equals(var3, var32);
//     org.apache.commons.math.util.MathUtils.OrderDirection var41 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var32, var41, false);
//     double[] var45 = new double[] { 0.0d};
//     double[] var47 = new double[] { 100.0d};
//     boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var47);
//     double[] var50 = new double[] { 0.0d};
//     double[] var52 = new double[] { 100.0d};
//     boolean var53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var52);
//     double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var47, var50);
//     double[] var55 = new double[] { };
//     double[] var59 = new double[] { 0.0d, 10.0d, 0.0d};
//     double[] var60 = null;
//     boolean var61 = org.apache.commons.math.util.MathUtils.equals(var59, var60);
//     boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var59);
//     boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var59);
//     double[] var65 = new double[] { 0.0d};
//     double var66 = org.apache.commons.math.util.MathUtils.safeNorm(var65);
//     double[] var68 = new double[] { 0.0d};
//     double[] var70 = new double[] { 100.0d};
//     boolean var71 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var68, var70);
//     boolean var72 = org.apache.commons.math.util.MathUtils.equals(var65, var68);
//     double[] var74 = new double[] { 0.0d};
//     double[] var76 = new double[] { 100.0d};
//     boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var74, var76);
//     double var78 = org.apache.commons.math.util.MathUtils.distance(var68, var76);
//     double[] var80 = org.apache.commons.math.util.MathUtils.normalizeArray(var76, 0.8575532158463934d);
//     double[] var82 = org.apache.commons.math.util.MathUtils.normalizeArray(var76, 0.6480542736638855d);
//     double var83 = org.apache.commons.math.util.MathUtils.distance(var50, var76);
//     double var84 = org.apache.commons.math.util.MathUtils.distance(var32, var50);
//     double[] var85 = null;
//     double var86 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var85);
// 
//   }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test213"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.8280692718912938d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8280692718912938d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test214"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(9, 209066259);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1541839527));

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test215"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-5L), (-362790L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test216"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 362880L);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test217"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-0.7742028622880628d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8538956920093059d));

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test218"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test219"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
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
    org.apache.commons.math.util.MathUtils.OrderDirection var24 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var15, var24, true);
    double[] var28 = new double[] { 0.0d};
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double var31 = org.apache.commons.math.util.MathUtils.distance(var15, var28);
    double[] var33 = new double[] { 0.0d};
    double var34 = org.apache.commons.math.util.MathUtils.safeNorm(var33);
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
    boolean var66 = org.apache.commons.math.util.MathUtils.equals(var33, var38);
    double[] var68 = new double[] { 0.0d};
    double var69 = org.apache.commons.math.util.MathUtils.safeNorm(var68);
    double[] var71 = new double[] { 0.0d};
    double[] var73 = new double[] { 100.0d};
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var71, var73);
    boolean var75 = org.apache.commons.math.util.MathUtils.equals(var68, var71);
    double[] var77 = new double[] { 0.0d};
    double[] var79 = new double[] { 100.0d};
    boolean var80 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var77, var79);
    double var81 = org.apache.commons.math.util.MathUtils.distance(var71, var79);
    double[] var83 = org.apache.commons.math.util.MathUtils.normalizeArray(var79, 0.8575532158463934d);
    double var84 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var79);
    boolean var85 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var79);
    double var86 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
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
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 100.0d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test220"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.8293123178330185E145d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.8293123178330185E145d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test221"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.7656218955929E-4d, 1.3380415276415127d, (-1442072880));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test222"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07570930918522545d);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test223"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.013292325585375278d, 3.552713678800501E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test224"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(91L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 91L);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test225"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1079574658, (-39748084));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1119322742);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test226"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.8657694832396586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8657694832396586d);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test227"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, (-3.0591582231017654E-31d), 1325336842);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test228"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.7310309456440016E13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 17310309456440L);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test229"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-2.8977078164740466E154d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.8977078164740466E154d));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test230"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(9.7656218955929E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765618791188462E-4d);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test231"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.9E-324d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test232"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)3.16227766016838d, (java.lang.Number)2.0886708959722813d, 1532522787, var3, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0L, (java.lang.Number)(byte)1, 100, var9, true);
    var5.addSuppressed((java.lang.Throwable)var11);
    java.lang.Number var13 = var11.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var11.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + (byte)1+ "'", var13.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test233"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)9.765623447795783E-4d, (java.lang.Number)(-1338502686), (-1862915923));
    java.lang.Number var4 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1338502686)+ "'", var4.equals((-1338502686)));

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test234"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(9000L, 2071445619L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2071454619L);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test235"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-90L), 5L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-90L));

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test236"); }


    long var2 = org.apache.commons.math.util.FastMath.max(1997450891849581935L, (-1997450891849582300L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1997450891849581935L);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test237"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.2545069915963656d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5061094067782297d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test238"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0d), 0.9891443947774783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test239"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test240"); }


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
    int var83 = org.apache.commons.math.util.MathUtils.hash(var3);
    double[] var85 = new double[] { 0.0d};
    double var86 = org.apache.commons.math.util.MathUtils.safeNorm(var85);
    double[] var88 = new double[] { 0.0d};
    double[] var90 = new double[] { 100.0d};
    boolean var91 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var88, var90);
    boolean var92 = org.apache.commons.math.util.MathUtils.equals(var85, var88);
    double[] var95 = new double[] { 100.0d, 0.0d};
    double var96 = org.apache.commons.math.util.MathUtils.distance(var85, var95);
    double var97 = org.apache.commons.math.util.MathUtils.safeNorm(var85);
    boolean var98 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var85);
    
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
    assertTrue(var83 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test241"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.5765846055910384d), 0.7739443644448949d, 0.3678794411714424d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test242"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(Float.NaN, 951780243, (-1122853665));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test243() {}
//   public void test243() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test243"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(3.424868789200273E85d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test244"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(9.765628104410654E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765626552204957E-4d);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test245"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(31.417136994624613d, 1.4931702671658056d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5233048093098185d);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test246"); }


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
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    
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

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test247"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.6004940069530696d, 100, 209066259);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test248"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1122853665), (-1442072990));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 319219325);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test249"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(9.09686550795815E9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.2121200040413385E11d);

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test250"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(2.5091784786580567d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test251"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(2009326299, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test252"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.4036519709818725d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.40365197098187244d));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test253"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getPrevious();
    java.lang.Throwable[] var12 = var5.getSuppressed();
    java.lang.Number var13 = var5.getArgument();
    java.lang.Throwable[] var14 = var5.getSuppressed();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 0.9067427790689399d+ "'", var13.equals(0.9067427790689399d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test254"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-2084206212));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test255"); }


    float var2 = org.apache.commons.math.util.FastMath.min((-1.0f), (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test256"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(1.7182818284590453d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.697783723013432d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test257"); }


    double[] var0 = null;
    double[] var2 = new double[] { 0.0d};
    double[] var4 = new double[] { 100.0d};
    boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var4);
    double[] var7 = new double[] { 0.0d};
    double[] var9 = new double[] { 100.0d};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var9);
    double var11 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var7);
    double[] var13 = new double[] { 0.0d};
    double[] var15 = new double[] { 100.0d};
    boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var15);
    double[] var18 = new double[] { 0.0d};
    double[] var20 = new double[] { 100.0d};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var20);
    double var22 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var18);
    double[] var24 = new double[] { 0.0d};
    double[] var26 = new double[] { 100.0d};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var26, 1.0239010128918022d);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var15, var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var29);
    boolean var32 = org.apache.commons.math.util.MathUtils.equals(var0, var29);
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 0.8280692718912938d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test258"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(630998.0d, 0.9542985177860862d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test259"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh((-0.6153851395842559d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7175431063569018d));

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test260"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm((-362526L), (-361680L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 21853067280L);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test261"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(3.1622776601683795d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test262"); }


    long var2 = org.apache.commons.math.util.FastMath.max(0L, 6000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6000L);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test263"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.5403023058681398d, (-0.9910963653922334d), 1.4567874239310208d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test264"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0028673189548942d, 1.4923092020050719d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test265"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1150131604, (-1862915923));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-712784319));

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test266"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(31, (-712784319));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test267"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(2.877157801747449d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.440892098500626E-16d);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test268"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round((-3.193181872794057d), (-1000573857));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test269"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0038848218538872d);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test270"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.8528405944312073E25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.873325845048426d);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test271"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.7310309456440016E13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 13.238304831828195d);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test272"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(72L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test273"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8300687777682035d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test274"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.24368848434477358d), 0.004252766970684236d, (-0.7175431063569018d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test275"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.4923092020050719d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.40032472026011723d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test276"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.31326168751822286d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3132616875182229d);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test277"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(52.47197555529855d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test278"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0239010128918027d, (java.lang.Number)209066259, 1000573857);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.Number var5 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 209066259+ "'", var5.equals(209066259));

  }

  public void test279() {}
//   public void test279() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test279"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(2.198408826999716d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test280"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(9, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test281"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 1442072881);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test282"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.000441095849621d, (-0.8391851574885061d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.268761069435159d);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test283"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test284"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-4628162069711239915L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test285"); }


    double var1 = org.apache.commons.math.util.FastMath.asin((-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.1909687824216308d));

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test286"); }


    int[] var3 = new int[] { 100, 100, 0};
    int[] var7 = new int[] { 10, 0, 1};
    int var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    int[] var12 = new int[] { 100, 100, 0};
    int[] var16 = new int[] { 10, 0, 1};
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    int var18 = org.apache.commons.math.util.MathUtils.distance1(var7, var16);
    int[] var21 = new int[] { 1, 0};
    int[] var25 = new int[] { 100, 100, 0};
    int[] var29 = new int[] { 10, 0, 1};
    int var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var29);
    int[] var34 = new int[] { 0, 100, 100};
    int var35 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var34);
    int var36 = org.apache.commons.math.util.MathUtils.distance1(var21, var29);
    int[] var40 = new int[] { 100, 100, 0};
    int[] var44 = new int[] { 10, 0, 1};
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var40, var44);
    int[] var49 = new int[] { 100, 100, 0};
    int[] var53 = new int[] { 10, 0, 1};
    int var54 = org.apache.commons.math.util.MathUtils.distance1(var49, var53);
    int[] var58 = new int[] { 100, 100, 0};
    int[] var62 = new int[] { 10, 0, 1};
    int var63 = org.apache.commons.math.util.MathUtils.distance1(var58, var62);
    int var64 = org.apache.commons.math.util.MathUtils.distance1(var53, var62);
    int[] var68 = new int[] { 100, 100, 0};
    int[] var72 = new int[] { 10, 0, 1};
    int var73 = org.apache.commons.math.util.MathUtils.distance1(var68, var72);
    int[] var77 = new int[] { 100, 100, 0};
    int[] var81 = new int[] { 10, 0, 1};
    int var82 = org.apache.commons.math.util.MathUtils.distance1(var77, var81);
    int var83 = org.apache.commons.math.util.MathUtils.distance1(var72, var81);
    double var84 = org.apache.commons.math.util.MathUtils.distance(var62, var81);
    int var85 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var62);
    double var86 = org.apache.commons.math.util.MathUtils.distance(var29, var62);
    int var87 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var29);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 9);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test287"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Throwable[] var11 = var5.getSuppressed();
    int var12 = var5.getIndex();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test288"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(9.765621895592307E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765623447794969E-4d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test289"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.07585429432749323d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test290"); }


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
    org.apache.commons.math.util.MathUtils.OrderDirection var26 = var5.getDirection();
    java.lang.Throwable[] var27 = var5.getSuppressed();
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test291"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.9773508306736582d, 0.5087609069823038d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0908434474128648d);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test292"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(100.0d, 6.9882121507348245d, 1.0038848218538872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test293"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.149548905166106d, (java.lang.Number)Double.POSITIVE_INFINITY, 1079574559);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)0.7615941559557649d, 99, var10, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.5403023058681399d, (java.lang.Number)0.8808144024434078d, 900, var10, false);
    int var15 = var14.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 900);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test294"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(600L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test295"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1150131614, 645166613);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test296"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test297"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var4, var7);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var4, 364L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 31);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var12, 1442072990);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 264L);
    java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var16, 806443333668390665L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test298"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.9999995231628797d, 1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1752011936438014d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test299"); }


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
    double[] var35 = null;
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var35);
    
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
    assertTrue(var36 == false);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test300"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.044397451869643d, 0.03645418412529628d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.044397451869643d);

  }

  public void test301() {}
//   public void test301() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest3.test301"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(55.77510373313475d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test302"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.5233048093098185d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test303"); }


    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0);
    java.math.BigInteger var6 = null;
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 0L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var5, var8);
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var5, 364L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var5, 1532522787);
    java.math.BigInteger var16 = null;
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 0L);
    java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var18, 0);
    java.math.BigInteger var21 = null;
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var21, 0L);
    java.math.BigInteger var25 = org.apache.commons.math.util.MathUtils.pow(var23, 0);
    java.math.BigInteger var26 = org.apache.commons.math.util.MathUtils.pow(var20, var23);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var5, var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.2645189576252271d, (java.lang.Number)var23, 1749763524);
    java.lang.Number var30 = var29.getPrevious();
    java.lang.Number var31 = var29.getPrevious();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test304"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.07570930918522556d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07298026649035334d);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test305"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test306"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(1.0028618546426544d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1796220847273766d);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test307"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.5091784786580567d, 67.3340684745264d, 3.626860407847019d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test308"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-2.833489212424966E38d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.833489212424966E38d));

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test309"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.9773508306736582d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2132378342629361d);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test310"); }


    double var2 = org.apache.commons.math.util.FastMath.min(630999.4197775752d, 7.811243611393037E11d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 630999.4197775752d);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test311"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.07585429432749323d, 1.2777583356184021d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest3.test312"); }


    int var2 = org.apache.commons.math.util.FastMath.max(240083417, 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 240083417);

  }

}
