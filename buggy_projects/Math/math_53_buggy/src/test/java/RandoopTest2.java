
import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test1"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.09966865249116202d, 0.0d, (-30145600));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test2"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var8 = var2.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var9 = var8.tan();
    org.apache.commons.math.complex.Complex var10 = var9.asin();
    org.apache.commons.math.complex.Complex var11 = var10.cos();
    org.apache.commons.math.complex.ComplexField var12 = var10.getField();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-30145589), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test4"); }


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
    int[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    int[] var27 = new int[] { 1, 100, 0};
    int[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double var29 = org.apache.commons.math.util.MathUtils.distance(var1, var27);
    int[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    int[] var33 = new int[] { (-1)};
    int[] var37 = new int[] { 1, 100, 0};
    int[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    int var39 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var38);
    int[] var41 = new int[] { (-1)};
    int[] var45 = new int[] { 1, 100, 0};
    int[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    int var47 = org.apache.commons.math.util.MathUtils.distanceInf(var41, var46);
    int var48 = org.apache.commons.math.util.MathUtils.distance1(var33, var41);
    int[] var50 = new int[] { (-1)};
    int[] var54 = new int[] { 1, 100, 0};
    int[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var54);
    int var56 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var55);
    int[] var58 = new int[] { (-1)};
    int[] var62 = new int[] { 1, 100, 0};
    int[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
    int var64 = org.apache.commons.math.util.MathUtils.distanceInf(var58, var63);
    int var65 = org.apache.commons.math.util.MathUtils.distance1(var50, var58);
    double var66 = org.apache.commons.math.util.MathUtils.distance(var33, var50);
    int[] var68 = org.apache.commons.math.util.MathUtils.copyOf(var33, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var69 = org.apache.commons.math.util.MathUtils.distance(var31, var33);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test5"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test6"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    org.apache.commons.math.util.MathUtils.checkOrder(var3);
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10.04987562112089d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test7"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var28 = var6.asin();
    org.apache.commons.math.complex.Complex var29 = var28.atan();
    boolean var30 = var28.isNaN();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test8"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(1378206651628553215L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test9"); }
// 
// 
//     double var3 = org.apache.commons.math.util.MathUtils.reduce((-0.21891713329967522d), Double.NEGATIVE_INFINITY, 0.09983374988500587d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Double.NaN);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test10"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(2.9999452757640324d, 1.5430806348152437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.39485088384753614d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test11"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test12"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow((-1378206651628543415L), (-30145589));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test13"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1118089298), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1118089300));

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test14"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 2007782533);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test15"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var41 = var35.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var42 = var32.add(var35);
    org.apache.commons.math.complex.Complex var43 = var32.acos();
    org.apache.commons.math.complex.Complex var46 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var47 = var46.conjugate();
    java.lang.Object var48 = null;
    boolean var49 = var46.equals(var48);
    org.apache.commons.math.complex.Complex var50 = var46.sqrt1z();
    org.apache.commons.math.complex.Complex var53 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var54 = var53.tanh();
    org.apache.commons.math.complex.Complex var55 = var53.exp();
    org.apache.commons.math.complex.Complex var56 = var55.acos();
    org.apache.commons.math.exception.util.Localizable var57 = null;
    org.apache.commons.math.exception.util.Localizable var58 = null;
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
    int[] var86 = new int[] { 1, 100, 0};
    int[] var87 = org.apache.commons.math.util.MathUtils.copyOf(var86);
    double var88 = org.apache.commons.math.util.MathUtils.distance(var60, var86);
    java.lang.Object[] var89 = new java.lang.Object[] { var88};
    org.apache.commons.math.exception.NullArgumentException var90 = new org.apache.commons.math.exception.NullArgumentException(var58, var89);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var56, var57, var89);
    org.apache.commons.math.complex.Complex var92 = var50.add(var56);
    boolean var93 = var43.equals((java.lang.Object)var56);
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
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
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test16"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 0.29755448666817674d, 869829230);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test17"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.acos();
    org.apache.commons.math.complex.Complex var8 = var7.atan();
    double var9 = var7.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2.9982726947086733d);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test18"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.acos();
    org.apache.commons.math.complex.Complex var5 = var3.multiply(1814400.000000139d);
    org.apache.commons.math.complex.Complex var7 = var5.multiply(4.3611853051969955d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test19"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test20"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1118089300));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test21"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)1.0d, var1, false);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test22"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var4, true);
    org.apache.commons.math.util.MathUtils.checkFinite(var3);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double var16 = org.apache.commons.math.util.MathUtils.distance1(var11, var14);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double var25 = org.apache.commons.math.util.MathUtils.distance1(var20, var23);
    double[][] var26 = new double[][] { var23};
    org.apache.commons.math.util.MathUtils.sortInPlace(var11, var26);
    double[] var30 = new double[] { 1.0d, 10.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var37 = var36.getDirection();
    boolean var40 = org.apache.commons.math.util.MathUtils.checkOrder(var31, var37, false, true);
    boolean var43 = org.apache.commons.math.util.MathUtils.checkOrder(var11, var37, true, false);
    boolean var44 = org.apache.commons.math.util.MathUtils.equals(var3, var11);
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
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
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.027339371326677953d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test23"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(35853.36506461688d, 0.025816509664474907d, (-2.2090209834105576d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test24"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-638805082), (-30145589));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 1656171100);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test26"); }


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
    int[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var1, 0);
    int[] var38 = new int[] { (-1)};
    int[] var42 = new int[] { 1, 100, 0};
    int[] var43 = org.apache.commons.math.util.MathUtils.copyOf(var42);
    int var44 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var43);
    int[] var46 = new int[] { (-1)};
    int[] var50 = new int[] { 1, 100, 0};
    int[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var51);
    int var53 = org.apache.commons.math.util.MathUtils.distance1(var38, var46);
    int[] var55 = new int[] { (-1)};
    int[] var59 = new int[] { 1, 100, 0};
    int[] var60 = org.apache.commons.math.util.MathUtils.copyOf(var59);
    int var61 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var60);
    int[] var63 = new int[] { (-1)};
    int[] var67 = new int[] { 1, 100, 0};
    int[] var68 = org.apache.commons.math.util.MathUtils.copyOf(var67);
    int var69 = org.apache.commons.math.util.MathUtils.distanceInf(var63, var68);
    int var70 = org.apache.commons.math.util.MathUtils.distance1(var55, var63);
    int[] var74 = new int[] { 1, 100, 0};
    int[] var75 = org.apache.commons.math.util.MathUtils.copyOf(var74);
    int var76 = org.apache.commons.math.util.MathUtils.distance1(var55, var74);
    double var77 = org.apache.commons.math.util.MathUtils.distance(var38, var55);
    int[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    int var79 = org.apache.commons.math.util.MathUtils.distance1(var36, var78);
    int[] var80 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test27"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-98L), 1566821946);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test28"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(101, 1904431168);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test29"); }


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
    boolean var20 = var19.isInfinite();
    org.apache.commons.math.complex.Complex var21 = var19.sinh();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.tanh();
    org.apache.commons.math.complex.Complex var26 = var24.exp();
    org.apache.commons.math.complex.Complex var27 = var24.cos();
    org.apache.commons.math.complex.Complex var28 = var27.cos();
    org.apache.commons.math.complex.Complex var29 = var19.divide(var27);
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test30"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    org.apache.commons.math.exception.NumberIsTooSmallException var6 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var1, (java.lang.Number)0.0d, true);
    boolean var7 = var6.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test31"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Float.NaN, 10.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test32"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var6 = var3.sin();
    double var7 = var6.getArgument();
    org.apache.commons.math.complex.Complex var10 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var11 = var10.tanh();
    org.apache.commons.math.complex.Complex var12 = var10.exp();
    org.apache.commons.math.complex.Complex var13 = var10.sqrt();
    org.apache.commons.math.complex.Complex var14 = var13.sqrt1z();
    org.apache.commons.math.complex.Complex var15 = var13.sinh();
    org.apache.commons.math.complex.Complex var16 = var15.sin();
    org.apache.commons.math.complex.Complex var17 = var6.pow(var16);
    org.apache.commons.math.complex.Complex var18 = var17.cosh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-2.276056593552136d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test33"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, 1.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test34"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var2.negate();
    org.apache.commons.math.complex.Complex var7 = var2.atan();
    org.apache.commons.math.complex.Complex var8 = var2.cos();
    java.lang.Object var9 = null;
    boolean var10 = var2.equals(var9);
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test35"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test36"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 786341969, 0);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test37"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-30145600));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test38"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(786341872, (-793020320));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1579362192);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test39"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(8812L, (-1795512867667299179L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1795512867667307991L);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test40"); }


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
    org.apache.commons.math.complex.Complex var16 = var15.conjugate();
    java.lang.Object var17 = null;
    boolean var18 = var15.equals(var17);
    org.apache.commons.math.complex.Complex var19 = var15.sqrt1z();
    org.apache.commons.math.complex.Complex var21 = var15.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var22 = var21.tan();
    org.apache.commons.math.complex.Complex var23 = var12.divide(var21);
    org.apache.commons.math.complex.Complex var24 = var12.sin();
    
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
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test41"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10L);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 1);
    java.lang.Number var13 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)var10, var13, 786341872);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test42"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1795512867667309079L), (java.lang.Number)30.48232336227865d, true);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test43"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-99), (-1911350513));
    java.lang.Number var4 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-99)+ "'", var4.equals((-99)));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test44"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-90));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test45"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(2007782533, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2007782532);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test46"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 0, 1911350603);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test47"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(224004970);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test48"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, (-1.3468724468673325d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test49"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(-469.2030354410471d));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test50"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    org.apache.commons.math.util.MathUtils.checkOrder(var3);
    
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

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test51"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var5.negate();
    org.apache.commons.math.complex.Complex var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.complex.Complex var10 = var8.divide(var9);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
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

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test52"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1911350515), 1566822045);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test53"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(15.104412573075516d, (-1118089300));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test54"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    int var4 = org.apache.commons.math.util.MathUtils.hash(var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var2);
    double[] var8 = new double[] { 1.0d, 10.0d};
    double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    boolean var11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var10);
    int var12 = org.apache.commons.math.util.MathUtils.hash(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-30145599));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test55"); }


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
    org.apache.commons.math.complex.Complex var38 = var36.sqrt1z();
    
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

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test56"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.log();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.acos();
    org.apache.commons.math.complex.Complex var12 = var2.pow(var7);
    org.apache.commons.math.complex.Complex var13 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var17 = var16.conjugate();
    org.apache.commons.math.complex.ComplexField var18 = var17.getField();
    org.apache.commons.math.complex.Complex var21 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var22 = var21.conjugate();
    java.lang.Object var23 = null;
    boolean var24 = var21.equals(var23);
    org.apache.commons.math.complex.Complex var25 = var21.sqrt1z();
    org.apache.commons.math.complex.Complex var28 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var29 = var28.conjugate();
    java.lang.Object var30 = null;
    boolean var31 = var28.equals(var30);
    org.apache.commons.math.complex.Complex var32 = var28.sqrt1z();
    org.apache.commons.math.complex.Complex var33 = var21.add(var28);
    org.apache.commons.math.complex.Complex var34 = var17.pow(var33);
    org.apache.commons.math.complex.Complex var35 = var33.sqrt1z();
    org.apache.commons.math.complex.Complex var36 = var33.cos();
    org.apache.commons.math.complex.Complex var37 = var2.subtract(var36);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test57"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(-332607061));

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test58"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test59"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(1579362192, 869829230);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test60"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sqrt1z();
    org.apache.commons.math.complex.Complex var8 = var2.multiply((-1.0d));
    double var9 = var8.getImaginary();
    org.apache.commons.math.complex.Complex var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.complex.Complex var11 = var8.pow(var10);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0d);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test61"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.09983374988500587d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.09999966934482496d);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test62"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    double var33 = var31.getArgument();
    org.apache.commons.math.complex.Complex var35 = var31.multiply(0.0d);
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-0.5573913107228545d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test63"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(90, 869829230);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test64"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.0d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test65"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.605170185988092d, (-2.2090209834105576d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test66"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.29755448666817674d, 8.4566787454165d, 11.180339887498949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test67"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(short)10, (java.lang.Number)0.09966865249116202d, true);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.09966865249116202d+ "'", var4.equals(0.09966865249116202d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0.09966865249116202d+ "'", var5.equals(0.09966865249116202d));

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test68"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 990L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, (-1378206651628543415L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test69"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-2));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test70"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    org.apache.commons.math.complex.Complex var15 = var14.tanh();
    org.apache.commons.math.complex.Complex var18 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var19 = var18.conjugate();
    java.lang.Object var20 = null;
    boolean var21 = var18.equals(var20);
    org.apache.commons.math.complex.Complex var22 = var18.sqrt1z();
    org.apache.commons.math.complex.Complex var23 = var14.divide(var18);
    org.apache.commons.math.complex.Complex var24 = var9.divide(var23);
    java.util.List var26 = var23.nthRoot(1);
    org.apache.commons.math.complex.Complex var27 = var6.multiply(var23);
    org.apache.commons.math.complex.Complex var28 = var6.asin();
    org.apache.commons.math.complex.Complex var29 = var28.sqrt();
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.exception.util.Localizable var32 = null;
    org.apache.commons.math.exception.util.Localizable var33 = null;
    org.apache.commons.math.exception.util.Localizable var35 = null;
    double[] var39 = new double[] { 1.0d, 10.0d};
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
    double[] var43 = new double[] { 1.0d, 10.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double var49 = org.apache.commons.math.util.MathUtils.distance1(var44, var47);
    double var50 = org.apache.commons.math.util.MathUtils.distance1(var40, var44);
    double[] var53 = new double[] { 1.0d, 10.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var53);
    double[] var57 = new double[] { 1.0d, 10.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    double var59 = org.apache.commons.math.util.MathUtils.distance1(var54, var57);
    double[] var62 = new double[] { 1.0d, 10.0d};
    double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
    double[] var66 = new double[] { 1.0d, 10.0d};
    double[] var67 = org.apache.commons.math.util.MathUtils.copyOf(var66);
    double var68 = org.apache.commons.math.util.MathUtils.distance1(var63, var66);
    double[][] var69 = new double[][] { var66};
    org.apache.commons.math.util.MathUtils.sortInPlace(var54, var69);
    org.apache.commons.math.util.MathUtils.sortInPlace(var40, var69);
    org.apache.commons.math.exception.NotFiniteNumberException var72 = new org.apache.commons.math.exception.NotFiniteNumberException(var35, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var69);
    org.apache.commons.math.exception.NotFiniteNumberException var73 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1814400.000000139d, (java.lang.Object[])var69);
    org.apache.commons.math.exception.NullArgumentException var74 = new org.apache.commons.math.exception.NullArgumentException(var33, (java.lang.Object[])var69);
    org.apache.commons.math.exception.NullArgumentException var75 = new org.apache.commons.math.exception.NullArgumentException(var32, (java.lang.Object[])var69);
    org.apache.commons.math.exception.NullArgumentException var76 = new org.apache.commons.math.exception.NullArgumentException(var31, (java.lang.Object[])var69);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var29, var30, (java.lang.Object[])var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test71"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1592.3470367561051d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 486708878);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test72"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080678E43d, 11576.453488438818d, (-1656171100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test73"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    int[] var44 = new int[] { 1, 100, 0};
    int[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    java.lang.Object[] var46 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NotFiniteNumberException var47 = new org.apache.commons.math.exception.NotFiniteNumberException(var39, (java.lang.Number)10, var46);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var38, var46);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    org.apache.commons.math.util.MathUtils.checkFinite(var49);
    double[] var52 = new double[] { (-1.0d)};
    double[] var54 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 0.027339371326677953d);
    double[] var57 = new double[] { 1.0d, 10.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    double[] var61 = new double[] { 1.0d, 10.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
    double var63 = org.apache.commons.math.util.MathUtils.distance1(var58, var61);
    boolean var64 = org.apache.commons.math.util.MathUtils.equals(var52, var58);
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 0.0d);
    boolean var67 = org.apache.commons.math.util.MathUtils.equals(var49, var66);
    org.apache.commons.math.util.MathUtils.checkOrder(var49);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test74"); }


    float[] var0 = null;
    float[] var1 = null;
    float[] var4 = new float[] { 0.0f, 10.0f};
    boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var4);
    float[] var6 = null;
    float[] var9 = new float[] { 0.0f, 10.0f};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var9);
    float[] var11 = null;
    float[] var14 = new float[] { 0.0f, 10.0f};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var14);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var6, var14);
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var4, var6);
    float[] var18 = null;
    float[] var21 = new float[] { 0.0f, 10.0f};
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var21);
    float[] var23 = null;
    float[] var26 = new float[] { 0.0f, 10.0f};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var26);
    float[] var28 = null;
    float[] var31 = new float[] { 0.0f, 10.0f};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var31);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var23, var31);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var21, var23);
    boolean var35 = org.apache.commons.math.util.MathUtils.equals(var4, var23);
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    float[] var39 = new float[] { (-1.0f), 1.0f};
    float[] var43 = new float[] { 1.0f, 10.0f, 0.0f};
    boolean var44 = org.apache.commons.math.util.MathUtils.equals(var39, var43);
    float[] var45 = null;
    float[] var48 = new float[] { 0.0f, 10.0f};
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var48);
    float[] var50 = null;
    float[] var53 = new float[] { 0.0f, 10.0f};
    boolean var54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var53);
    boolean var55 = org.apache.commons.math.util.MathUtils.equals(var45, var53);
    float[] var56 = null;
    float[] var59 = new float[] { 0.0f, 10.0f};
    boolean var60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var56, var59);
    float[] var61 = null;
    float[] var64 = new float[] { 0.0f, 10.0f};
    boolean var65 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var61, var64);
    float[] var66 = null;
    float[] var69 = new float[] { 0.0f, 10.0f};
    boolean var70 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var66, var69);
    boolean var71 = org.apache.commons.math.util.MathUtils.equals(var61, var69);
    boolean var72 = org.apache.commons.math.util.MathUtils.equals(var59, var61);
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var53, var59);
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var53);
    boolean var75 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var39);
    float[] var78 = new float[] { (-1.0f), 1.0f};
    float[] var82 = new float[] { 1.0f, 10.0f, 0.0f};
    boolean var83 = org.apache.commons.math.util.MathUtils.equals(var78, var82);
    boolean var84 = org.apache.commons.math.util.MathUtils.equals(var39, var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test75"); }


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
    boolean var38 = var37.isInfinite();
    org.apache.commons.math.complex.Complex var39 = var37.sqrt1z();
    org.apache.commons.math.complex.Complex var40 = var39.atan();
    boolean var41 = var40.isInfinite();
    
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
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test76"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.cos();
    org.apache.commons.math.complex.Complex var6 = var5.cos();
    org.apache.commons.math.complex.Complex var7 = var5.asin();
    boolean var8 = var5.isNaN();
    
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
    assertTrue(var8 == false);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test77"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var5 = var4.sin();
    org.apache.commons.math.complex.ComplexField var6 = var4.getField();
    org.apache.commons.math.complex.Complex var7 = var4.negate();
    org.apache.commons.math.complex.Complex var8 = var4.log();
    
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
    assertNotNull(var8);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test78"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.738774844045322d, 1.9984630277548983d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.738774844045322d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test79"); }


    float[] var0 = null;
    float[] var3 = new float[] { 0.0f, 10.0f};
    boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var3);
    float[] var5 = null;
    float[] var8 = new float[] { 0.0f, 10.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var8);
    float[] var10 = null;
    float[] var13 = new float[] { 0.0f, 10.0f};
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var10, var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var5, var13);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var3, var5);
    float[] var17 = null;
    float[] var20 = new float[] { 0.0f, 10.0f};
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var20);
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var17);
    float[] var23 = null;
    float[] var24 = null;
    float[] var27 = new float[] { 0.0f, 10.0f};
    boolean var28 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var27);
    float[] var29 = null;
    float[] var32 = new float[] { 0.0f, 10.0f};
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var32);
    float[] var34 = null;
    float[] var37 = new float[] { 0.0f, 10.0f};
    boolean var38 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var29, var37);
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var27, var29);
    float[] var41 = null;
    float[] var44 = new float[] { 0.0f, 10.0f};
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var44);
    float[] var46 = null;
    float[] var49 = new float[] { 0.0f, 10.0f};
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var49);
    float[] var51 = null;
    float[] var54 = new float[] { 0.0f, 10.0f};
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var51, var54);
    boolean var56 = org.apache.commons.math.util.MathUtils.equals(var46, var54);
    boolean var57 = org.apache.commons.math.util.MathUtils.equals(var44, var46);
    boolean var58 = org.apache.commons.math.util.MathUtils.equals(var27, var46);
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var27);
    float[] var62 = new float[] { (-1.0f), 1.0f};
    float[] var66 = new float[] { 1.0f, 10.0f, 0.0f};
    boolean var67 = org.apache.commons.math.util.MathUtils.equals(var62, var66);
    float[] var68 = null;
    float[] var71 = new float[] { 0.0f, 10.0f};
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var68, var71);
    float[] var73 = null;
    float[] var76 = new float[] { 0.0f, 10.0f};
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var73, var76);
    boolean var78 = org.apache.commons.math.util.MathUtils.equals(var68, var76);
    float[] var79 = null;
    float[] var82 = new float[] { 0.0f, 10.0f};
    boolean var83 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var79, var82);
    float[] var84 = null;
    float[] var87 = new float[] { 0.0f, 10.0f};
    boolean var88 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var84, var87);
    float[] var89 = null;
    float[] var92 = new float[] { 0.0f, 10.0f};
    boolean var93 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var89, var92);
    boolean var94 = org.apache.commons.math.util.MathUtils.equals(var84, var92);
    boolean var95 = org.apache.commons.math.util.MathUtils.equals(var82, var84);
    boolean var96 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var76, var82);
    boolean var97 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var62, var76);
    boolean var98 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var62);
    boolean var99 = org.apache.commons.math.util.MathUtils.equals(var17, var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == true);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test80"); }


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
    org.apache.commons.math.complex.Complex var20 = var4.tan();
    org.apache.commons.math.complex.Complex var21 = var4.sin();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.tanh();
    org.apache.commons.math.complex.Complex var26 = var24.exp();
    org.apache.commons.math.complex.Complex var27 = var26.acos();
    org.apache.commons.math.complex.Complex var28 = var27.sqrt();
    org.apache.commons.math.complex.Complex var29 = var28.tan();
    double var30 = var28.abs();
    org.apache.commons.math.complex.Complex var31 = var28.log();
    org.apache.commons.math.complex.Complex var32 = var28.sqrt1z();
    org.apache.commons.math.complex.Complex var33 = var4.add(var32);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test81"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    org.apache.commons.math.util.MathUtils.checkOrder(var7);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var25);
    double var28 = org.apache.commons.math.util.MathUtils.distance1(var18, var22);
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var22, 0.0d);
    boolean var31 = org.apache.commons.math.util.MathUtils.equals(var7, var22);
    int var32 = org.apache.commons.math.util.MathUtils.hash(var7);
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double[] var39 = new double[] { 1.0d, 10.0d};
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
    double var41 = org.apache.commons.math.util.MathUtils.distance1(var36, var39);
    double[] var44 = new double[] { 1.0d, 10.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    boolean var47 = org.apache.commons.math.util.MathUtils.equals(var36, var45);
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double[] var51 = new double[] { 1.0d, 10.0d};
    double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var51);
    double[] var55 = new double[] { 1.0d, 10.0d};
    double[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    double[] var59 = new double[] { 1.0d, 10.0d};
    double[] var60 = org.apache.commons.math.util.MathUtils.copyOf(var59);
    double var61 = org.apache.commons.math.util.MathUtils.distance1(var56, var59);
    double var62 = org.apache.commons.math.util.MathUtils.distance1(var52, var56);
    double[] var64 = new double[] { (-1.0d)};
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var64, 0.027339371326677953d);
    double[] var69 = new double[] { 1.0d, 10.0d};
    double[] var70 = org.apache.commons.math.util.MathUtils.copyOf(var69);
    double[] var73 = new double[] { 1.0d, 10.0d};
    double[] var74 = org.apache.commons.math.util.MathUtils.copyOf(var73);
    double var75 = org.apache.commons.math.util.MathUtils.distance1(var70, var73);
    boolean var76 = org.apache.commons.math.util.MathUtils.equals(var64, var70);
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var56, var64);
    double[] var79 = new double[] { (-1.0d)};
    double[] var81 = org.apache.commons.math.util.MathUtils.normalizeArray(var79, 0.027339371326677953d);
    double[] var83 = org.apache.commons.math.util.MathUtils.copyOf(var79, 99);
    double var84 = org.apache.commons.math.util.MathUtils.distanceInf(var64, var79);
    boolean var85 = org.apache.commons.math.util.MathUtils.equals(var45, var64);
    double var86 = org.apache.commons.math.util.MathUtils.distance(var7, var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test82"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var6, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var6, 10L);
    java.math.BigInteger var13 = org.apache.commons.math.util.MathUtils.pow(var11, 77651344L);
    java.math.BigInteger var14 = null;
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var14, 0L);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var20 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var11, (java.lang.Number)var16, true);
    org.apache.commons.math.exception.NotPositiveException var21 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test83"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var4, true);
    org.apache.commons.math.util.MathUtils.checkFinite(var3);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test84"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-9), 1125008633);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test85"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int[] var17 = new int[] { (-1)};
    int[] var21 = new int[] { 1, 100, 0};
    int[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    int var23 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var22);
    int var24 = org.apache.commons.math.util.MathUtils.distance1(var9, var17);
    int[] var28 = new int[] { 1, 100, 0};
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    int var30 = org.apache.commons.math.util.MathUtils.distance1(var9, var28);
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double var32 = org.apache.commons.math.util.MathUtils.distance(var1, var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var9, 1904431168);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test86"); }


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
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.conjugate();
    boolean var43 = var42.isNaN();
    org.apache.commons.math.complex.Complex var44 = var42.asin();
    double var45 = var44.getArgument();
    org.apache.commons.math.complex.Complex var46 = var44.exp();
    org.apache.commons.math.complex.Complex var47 = var46.tan();
    org.apache.commons.math.complex.Complex var48 = var47.acos();
    org.apache.commons.math.complex.Complex var49 = var36.subtract(var47);
    org.apache.commons.math.complex.Complex var52 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var53 = var52.conjugate();
    java.lang.Object var54 = null;
    boolean var55 = var52.equals(var54);
    org.apache.commons.math.complex.Complex var56 = var52.sqrt1z();
    org.apache.commons.math.complex.Complex var58 = var52.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var59 = var58.tan();
    org.apache.commons.math.complex.Complex var60 = var59.asin();
    org.apache.commons.math.complex.Complex var61 = var60.cos();
    org.apache.commons.math.complex.Complex var62 = var47.subtract(var61);
    java.lang.String var63 = var61.toString();
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "(1.3150669208559367, 0.14477639494736314)"+ "'", var63.equals("(1.3150669208559367, 0.14477639494736314)"));

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test87"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1074790369));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test88"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.0f);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1911350515), (-1686316699));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test90"); }


    float[] var0 = null;
    float[] var1 = null;
    float[] var4 = new float[] { 0.0f, 10.0f};
    boolean var5 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var4);
    float[] var6 = null;
    float[] var9 = new float[] { 0.0f, 10.0f};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var9);
    float[] var11 = null;
    float[] var14 = new float[] { 0.0f, 10.0f};
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var14);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var6, var14);
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var4, var6);
    float[] var18 = null;
    float[] var21 = new float[] { 0.0f, 10.0f};
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var18, var21);
    float[] var23 = null;
    float[] var26 = new float[] { 0.0f, 10.0f};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var26);
    float[] var28 = null;
    float[] var31 = new float[] { 0.0f, 10.0f};
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var31);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var23, var31);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var21, var23);
    boolean var35 = org.apache.commons.math.util.MathUtils.equals(var4, var23);
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    float[] var37 = null;
    float[] var40 = new float[] { 0.0f, 10.0f};
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var40);
    float[] var42 = null;
    float[] var45 = new float[] { 0.0f, 10.0f};
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var45);
    float[] var47 = null;
    float[] var50 = new float[] { 0.0f, 10.0f};
    boolean var51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var47, var50);
    boolean var52 = org.apache.commons.math.util.MathUtils.equals(var42, var50);
    boolean var53 = org.apache.commons.math.util.MathUtils.equals(var40, var42);
    float[] var57 = new float[] { 10.0f, 10.0f, (-1.0f)};
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var57);
    float[] var59 = null;
    float[] var62 = new float[] { 0.0f, 10.0f};
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var62);
    boolean var64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var57, var62);
    boolean var65 = org.apache.commons.math.util.MathUtils.equals(var0, var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test91"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 638805172, 99);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test92"); }


    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double[] var19 = new double[] { 1.0d, 10.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
    double var22 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var29.getDirection();
    int var31 = var29.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var32 = var29.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var34 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var32, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var35 = var34.getDirection();
    boolean var38 = org.apache.commons.math.util.MathUtils.checkOrder(var16, var35, false, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var40 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0d, (java.lang.Number)var5, 10, var35, false);
    org.apache.commons.math.exception.NotPositiveException var41 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test93"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)100L);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test94"); }


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
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var3, var11);
    org.apache.commons.math.exception.util.Localizable var18 = null;
    java.math.BigInteger var19 = null;
    java.math.BigInteger var21 = org.apache.commons.math.util.MathUtils.pow(var19, 0L);
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var21, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var26 = new org.apache.commons.math.exception.NumberIsTooSmallException(var18, (java.lang.Number)var23, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var28 = org.apache.commons.math.util.MathUtils.pow(var23, 10L);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var11, var28);
    java.math.BigInteger var31 = org.apache.commons.math.util.MathUtils.pow(var29, 1125008633);
    java.lang.Object[] var32 = null;
    org.apache.commons.math.exception.NotFiniteNumberException var33 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)1125008633, var32);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test95"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(-1.0d), (java.lang.Number)(-1.0d), true);
    java.lang.Number var5 = var4.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-1.0d)+ "'", var5.equals((-1.0d)));

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test96"); }


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
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double[] var33 = new double[] { 1.0d, 10.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var30, var33);
    double var36 = org.apache.commons.math.util.MathUtils.distance1(var7, var30);
    org.apache.commons.math.util.MathUtils.checkOrder(var30);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double[] var44 = new double[] { 1.0d, 10.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    double var46 = org.apache.commons.math.util.MathUtils.distance1(var41, var44);
    int var47 = org.apache.commons.math.util.MathUtils.hash(var44);
    double[] var50 = new double[] { 1.0d, 10.0d};
    double[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var51);
    org.apache.commons.math.exception.NonMonotonousSequenceException var56 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var57 = var56.getDirection();
    boolean var60 = org.apache.commons.math.util.MathUtils.checkOrder(var51, var57, false, true);
    double[][] var61 = new double[][] { var51};
    org.apache.commons.math.util.MathUtils.sortInPlace(var44, var61);
    double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    boolean var64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var63);
    
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
    assertTrue(var26 == 10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test97"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkFinite(Double.POSITIVE_INFINITY);
      fail("Expected exception of type org.apache.commons.math.exception.NotFiniteNumberException");
    } catch (org.apache.commons.math.exception.NotFiniteNumberException e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test98"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(869829230, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.6982923E8d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test99"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-1), (-332607061));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 332607061);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test100"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.0f, 1.0f, 1656171100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test101() {}
//   public void test101() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test101"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var3);
//     double[] var8 = new double[] { 1.0d, 10.0d};
//     double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
//     double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var15 = var14.getDirection();
//     boolean var18 = org.apache.commons.math.util.MathUtils.checkOrder(var9, var15, false, true);
//     double var19 = org.apache.commons.math.util.MathUtils.distance1(var3, var9);
//     double[] var20 = null;
//     double var21 = org.apache.commons.math.util.MathUtils.distance1(var9, var20);
// 
//   }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test102"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-2.276056593552136d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test103"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(8812L, (-1795512867667309079L));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test104"); }


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
    org.apache.commons.math.exception.util.Localizable var32 = null;
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double[] var39 = new double[] { 1.0d, 10.0d};
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
    double var41 = org.apache.commons.math.util.MathUtils.distance1(var36, var39);
    double[] var44 = new double[] { 1.0d, 10.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    double[] var48 = new double[] { 1.0d, 10.0d};
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    double var50 = org.apache.commons.math.util.MathUtils.distance1(var45, var48);
    double[][] var51 = new double[][] { var48};
    org.apache.commons.math.util.MathUtils.sortInPlace(var36, var51);
    double[] var55 = new double[] { 1.0d, 10.0d};
    double[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    org.apache.commons.math.exception.NonMonotonousSequenceException var61 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var62 = var61.getDirection();
    boolean var65 = org.apache.commons.math.util.MathUtils.checkOrder(var56, var62, false, true);
    boolean var68 = org.apache.commons.math.util.MathUtils.checkOrder(var36, var62, true, false);
    double[] var70 = org.apache.commons.math.util.MathUtils.copyOf(var36, 0);
    org.apache.commons.math.exception.util.Localizable var71 = null;
    org.apache.commons.math.exception.util.Localizable var72 = null;
    int[] var77 = new int[] { 1, 100, 0};
    int[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var77);
    java.lang.Object[] var79 = new java.lang.Object[] { var77};
    org.apache.commons.math.exception.NotFiniteNumberException var80 = new org.apache.commons.math.exception.NotFiniteNumberException(var72, (java.lang.Number)10, var79);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var36, var71, var79);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var28, var32, var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var83 = org.apache.commons.math.util.MathUtils.distance1(var7, var28);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test105"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var41 = var35.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var42 = var32.add(var35);
    org.apache.commons.math.complex.Complex var45 = new org.apache.commons.math.complex.Complex(3628800.0d, (-1.1909687824208959d));
    java.lang.String var46 = var45.toString();
    org.apache.commons.math.complex.Complex var49 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var50 = var49.conjugate();
    org.apache.commons.math.complex.Complex var51 = var50.tanh();
    org.apache.commons.math.complex.Complex var54 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var55 = var54.conjugate();
    java.lang.Object var56 = null;
    boolean var57 = var54.equals(var56);
    org.apache.commons.math.complex.Complex var58 = var54.sqrt1z();
    org.apache.commons.math.complex.Complex var59 = var50.divide(var54);
    java.lang.Object var60 = null;
    boolean var61 = var59.equals(var60);
    boolean var62 = var59.isNaN();
    org.apache.commons.math.complex.Complex var63 = var45.pow(var59);
    org.apache.commons.math.complex.Complex var64 = var42.multiply(var45);
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "(3628800.0, -1.1909687824208959)"+ "'", var46.equals("(3628800.0, -1.1909687824208959)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test106"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.144873561044819d, (-0.21891713329967522d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test107"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(1795512867667307991L, 8868003302922989569L);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test108"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    int[] var44 = new int[] { 1, 100, 0};
    int[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    java.lang.Object[] var46 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NotFiniteNumberException var47 = new org.apache.commons.math.exception.NotFiniteNumberException(var39, (java.lang.Number)10, var46);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var38, var46);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var49, 1566822045);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test109"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.027339371326677953d, 2.9999452757640324d, (-1656171100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test110"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 869829230);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test111"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(9801L, 6891033258142766080L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6891033258142775881L);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test112"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test113"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    int[] var44 = new int[] { 1, 100, 0};
    int[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    java.lang.Object[] var46 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NotFiniteNumberException var47 = new org.apache.commons.math.exception.NotFiniteNumberException(var39, (java.lang.Number)10, var46);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var38, var46);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    org.apache.commons.math.util.MathUtils.checkFinite(var49);
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var49);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 10.04987562112089d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test114"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10L);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var5, 100);
    org.apache.commons.math.exception.util.Localizable var13 = null;
    java.math.BigInteger var14 = null;
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var14, 0L);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var21 = new org.apache.commons.math.exception.NumberIsTooSmallException(var13, (java.lang.Number)var18, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var18, 10);
    java.math.BigInteger var24 = null;
    java.math.BigInteger var26 = org.apache.commons.math.util.MathUtils.pow(var24, 0L);
    java.math.BigInteger var28 = org.apache.commons.math.util.MathUtils.pow(var26, 990L);
    org.apache.commons.math.exception.util.Localizable var29 = null;
    java.math.BigInteger var30 = null;
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var30, 0L);
    java.math.BigInteger var34 = org.apache.commons.math.util.MathUtils.pow(var32, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var37 = new org.apache.commons.math.exception.NumberIsTooSmallException(var29, (java.lang.Number)var34, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var39 = org.apache.commons.math.util.MathUtils.pow(var34, 10L);
    java.math.BigInteger var40 = org.apache.commons.math.util.MathUtils.pow(var26, var34);
    org.apache.commons.math.exception.util.Localizable var41 = null;
    java.math.BigInteger var42 = null;
    java.math.BigInteger var44 = org.apache.commons.math.util.MathUtils.pow(var42, 0L);
    java.math.BigInteger var46 = org.apache.commons.math.util.MathUtils.pow(var44, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var49 = new org.apache.commons.math.exception.NumberIsTooSmallException(var41, (java.lang.Number)var46, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var51 = org.apache.commons.math.util.MathUtils.pow(var46, 10L);
    java.math.BigInteger var52 = org.apache.commons.math.util.MathUtils.pow(var34, var51);
    java.math.BigInteger var53 = org.apache.commons.math.util.MathUtils.pow(var23, var52);
    java.math.BigInteger var55 = org.apache.commons.math.util.MathUtils.pow(var52, 0L);
    org.apache.commons.math.exception.NonMonotonousSequenceException var57 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100, (java.lang.Number)0L, 1656171100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test115"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm((-1795512867667309079L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test116"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1010, 1010);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test117"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var13.getDirection();
    boolean var17 = org.apache.commons.math.util.MathUtils.checkOrder(var8, var14, false, true);
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var14, false);
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, (-1.5333870746439389d));
    double[] var23 = new double[] { (-1.0d)};
    double[] var25 = org.apache.commons.math.util.MathUtils.normalizeArray(var23, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.checkOrder(var23);
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double[] var32 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var35 = new double[] { 1.0d, 10.0d};
    double[] var36 = org.apache.commons.math.util.MathUtils.copyOf(var35);
    double[] var39 = new double[] { 1.0d, 10.0d};
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
    double var41 = org.apache.commons.math.util.MathUtils.distance1(var36, var39);
    double[] var44 = new double[] { 1.0d, 10.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    double[] var48 = new double[] { 1.0d, 10.0d};
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    double var50 = org.apache.commons.math.util.MathUtils.distance1(var45, var48);
    double[][] var51 = new double[][] { var48};
    org.apache.commons.math.util.MathUtils.sortInPlace(var36, var51);
    boolean var53 = org.apache.commons.math.util.MathUtils.equals(var32, var36);
    double[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    org.apache.commons.math.util.MathUtils.checkFinite(var36);
    boolean var57 = org.apache.commons.math.util.MathUtils.equals(var23, var36);
    double[] var60 = new double[] { 1.0d, 10.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var61);
    boolean var64 = org.apache.commons.math.util.MathUtils.equals(var21, var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test118"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-638805082), (-1074789359));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test119"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-2.0d), 3.170153879722701d, (-1074789359));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test120"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    int var4 = org.apache.commons.math.util.MathUtils.hash(var1);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var8 = new double[] { 1.0d, 10.0d};
    double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var16);
    double var19 = org.apache.commons.math.util.MathUtils.distance1(var9, var13);
    org.apache.commons.math.exception.NonMonotonousSequenceException var26 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var27 = var26.getDirection();
    int var28 = var26.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var26.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var31 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var29, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var32 = var31.getDirection();
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var13, var32, false, true);
    boolean var38 = org.apache.commons.math.util.MathUtils.checkOrder(var1, var32, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1074790369));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test121() {}
//   public void test121() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test121"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, (-332607061));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test122"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.conjugate();
    org.apache.commons.math.complex.Complex var8 = var7.tanh();
    org.apache.commons.math.complex.Complex var11 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var12 = var11.conjugate();
    java.lang.Object var13 = null;
    boolean var14 = var11.equals(var13);
    org.apache.commons.math.complex.Complex var15 = var11.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = var7.divide(var11);
    org.apache.commons.math.complex.Complex var19 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var20 = var19.tanh();
    org.apache.commons.math.complex.Complex var21 = var19.exp();
    org.apache.commons.math.complex.Complex var22 = var16.subtract(var19);
    org.apache.commons.math.complex.Complex var23 = var19.exp();
    org.apache.commons.math.complex.Complex var24 = var23.exp();
    org.apache.commons.math.complex.Complex var25 = var2.pow(var23);
    org.apache.commons.math.complex.Complex var26 = var2.log();
    org.apache.commons.math.complex.Complex var29 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var30 = var29.conjugate();
    java.lang.Object var31 = null;
    boolean var32 = var29.equals(var31);
    org.apache.commons.math.complex.Complex var33 = var29.sqrt1z();
    org.apache.commons.math.complex.Complex var36 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var37 = var36.conjugate();
    java.lang.Object var38 = null;
    boolean var39 = var36.equals(var38);
    org.apache.commons.math.complex.Complex var40 = var36.sqrt1z();
    org.apache.commons.math.complex.Complex var41 = var29.add(var36);
    org.apache.commons.math.complex.Complex var44 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var45 = var44.conjugate();
    java.lang.Object var46 = null;
    boolean var47 = var44.equals(var46);
    org.apache.commons.math.complex.Complex var48 = var44.sqrt1z();
    org.apache.commons.math.complex.Complex var51 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var52 = var51.conjugate();
    java.lang.Object var53 = null;
    boolean var54 = var51.equals(var53);
    org.apache.commons.math.complex.Complex var55 = var51.sqrt1z();
    org.apache.commons.math.complex.Complex var56 = var44.add(var51);
    org.apache.commons.math.complex.Complex var59 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var60 = var59.conjugate();
    boolean var61 = var60.isNaN();
    org.apache.commons.math.complex.Complex var62 = var60.asin();
    org.apache.commons.math.complex.Complex var63 = var51.divide(var60);
    org.apache.commons.math.complex.Complex var64 = var36.add(var63);
    org.apache.commons.math.complex.Complex var65 = var63.tanh();
    org.apache.commons.math.complex.Complex var68 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var69 = var68.conjugate();
    boolean var70 = var69.isNaN();
    org.apache.commons.math.complex.Complex var71 = var69.asin();
    double var72 = var71.getArgument();
    org.apache.commons.math.complex.Complex var73 = var71.exp();
    org.apache.commons.math.complex.Complex var74 = var73.tan();
    org.apache.commons.math.complex.Complex var75 = var74.acos();
    org.apache.commons.math.complex.Complex var76 = var63.subtract(var74);
    org.apache.commons.math.complex.Complex var79 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var80 = var79.conjugate();
    java.lang.Object var81 = null;
    boolean var82 = var79.equals(var81);
    org.apache.commons.math.complex.Complex var83 = var79.sqrt1z();
    org.apache.commons.math.complex.Complex var85 = var79.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var86 = var85.tan();
    org.apache.commons.math.complex.Complex var87 = var86.asin();
    org.apache.commons.math.complex.Complex var88 = var87.cos();
    org.apache.commons.math.complex.Complex var89 = var74.subtract(var88);
    boolean var90 = var2.equals((java.lang.Object)var89);
    org.apache.commons.math.complex.Complex var93 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var94 = var93.conjugate();
    java.lang.Object var95 = null;
    boolean var96 = var93.equals(var95);
    org.apache.commons.math.complex.Complex var97 = var93.sin();
    org.apache.commons.math.complex.Complex var98 = var89.add(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test123"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.29755448666817674d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test124"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt();
    org.apache.commons.math.complex.Complex var7 = var6.tan();
    double var8 = var6.abs();
    org.apache.commons.math.complex.Complex var9 = var6.log();
    double var10 = var6.getArgument();
    double var11 = var6.getArgument();
    
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
    assertTrue(var8 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.738774844045322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.738774844045322d);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test125"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    boolean var14 = org.apache.commons.math.util.MathUtils.equals(var3, var12);
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    org.apache.commons.math.exception.NonMonotonousSequenceException var22 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    boolean var23 = var22.getStrict();
    int var24 = var22.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var25 = var22.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2, (java.lang.Number)3.7168146928204138d, 0, var25, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var28 = var27.getDirection();
    org.apache.commons.math.util.MathUtils.checkOrder(var12, var28, false);
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var38.getDirection();
    int var40 = var38.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var41 = var38.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var43 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var41, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var12, var41, true);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test126"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-30145589), 90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1482551015));

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test127"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(8.655154728220008E12d, 1592.3470367561051d);
    org.apache.commons.math.complex.Complex var4 = var2.multiply(0.025816509664474907d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test128"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1686316699), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1686316699);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test129"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException(2007782533, (-30145600));

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test130"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1074790369), 786341970);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1861132339));

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test131"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var9 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var6, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var6, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)3.7168146928204138d, (java.lang.Number)990L, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test132"); }


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
    org.apache.commons.math.util.MathUtils.checkOrder(var6);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var28 = var27.getDirection();
    int var29 = var27.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var27.getDirection();
    org.apache.commons.math.util.MathUtils.checkOrder(var6, var30, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var34 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1911350513), (java.lang.Number)(-1482551015), 10, var30, true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test133"); }


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
    org.apache.commons.math.complex.Complex var38 = var37.atan();
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.tanh();
    org.apache.commons.math.complex.Complex var43 = var41.exp();
    org.apache.commons.math.complex.Complex var44 = var43.acos();
    org.apache.commons.math.complex.Complex var45 = var44.sqrt();
    org.apache.commons.math.complex.Complex var46 = var45.tan();
    org.apache.commons.math.complex.Complex var47 = var37.multiply(var46);
    org.apache.commons.math.complex.Complex var48 = var47.tan();
    org.apache.commons.math.complex.Complex var51 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var52 = var51.conjugate();
    org.apache.commons.math.complex.Complex var53 = var52.tanh();
    org.apache.commons.math.complex.Complex var56 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var57 = var56.conjugate();
    java.lang.Object var58 = null;
    boolean var59 = var56.equals(var58);
    org.apache.commons.math.complex.Complex var60 = var56.sqrt1z();
    org.apache.commons.math.complex.Complex var61 = var52.divide(var56);
    org.apache.commons.math.complex.Complex var64 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var65 = var64.tanh();
    org.apache.commons.math.complex.Complex var66 = var64.exp();
    org.apache.commons.math.complex.Complex var67 = var61.subtract(var64);
    org.apache.commons.math.complex.Complex var68 = var64.exp();
    org.apache.commons.math.complex.Complex var69 = var64.sqrt1z();
    org.apache.commons.math.complex.Complex var70 = var47.multiply(var64);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test134"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(0.09966865249116202d, Double.POSITIVE_INFINITY);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test135"); }


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
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double var31 = org.apache.commons.math.util.MathUtils.distance1(var26, var29);
    double[] var34 = new double[] { 1.0d, 10.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var34);
    double[] var38 = new double[] { 1.0d, 10.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    double var40 = org.apache.commons.math.util.MathUtils.distance1(var35, var38);
    double[][] var41 = new double[][] { var38};
    org.apache.commons.math.util.MathUtils.sortInPlace(var26, var41);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var46);
    org.apache.commons.math.exception.NonMonotonousSequenceException var51 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var52 = var51.getDirection();
    boolean var55 = org.apache.commons.math.util.MathUtils.checkOrder(var46, var52, false, true);
    boolean var58 = org.apache.commons.math.util.MathUtils.checkOrder(var26, var52, true, false);
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var26, (-1074789359));
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test136"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    int var9 = org.apache.commons.math.util.MathUtils.hash(var6);
    org.apache.commons.math.exception.NonMonotonousSequenceException var16 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var17 = var16.getDirection();
    int var18 = var16.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = var16.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var19, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var22 = var21.getDirection();
    boolean var25 = org.apache.commons.math.util.MathUtils.checkOrder(var6, var22, true, false);
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10.04987562112089d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test137"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-1893909151162593279L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test138"); }


    double[] var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var5 = null;
    double[] var9 = new double[] { 1.0d, 10.0d};
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    double[] var13 = new double[] { 1.0d, 10.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double var19 = org.apache.commons.math.util.MathUtils.distance1(var14, var17);
    double var20 = org.apache.commons.math.util.MathUtils.distance1(var10, var14);
    double[] var23 = new double[] { 1.0d, 10.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var24, var27);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distance1(var33, var36);
    double[][] var39 = new double[][] { var36};
    org.apache.commons.math.util.MathUtils.sortInPlace(var24, var39);
    org.apache.commons.math.util.MathUtils.sortInPlace(var10, var39);
    org.apache.commons.math.exception.NotFiniteNumberException var42 = new org.apache.commons.math.exception.NotFiniteNumberException(var5, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var39);
    org.apache.commons.math.exception.NotFiniteNumberException var43 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1814400.000000139d, (java.lang.Object[])var39);
    org.apache.commons.math.exception.NullArgumentException var44 = new org.apache.commons.math.exception.NullArgumentException(var3, (java.lang.Object[])var39);
    org.apache.commons.math.exception.MathArithmeticException var45 = new org.apache.commons.math.exception.MathArithmeticException(var2, (java.lang.Object[])var39);
    org.apache.commons.math.exception.NullArgumentException var46 = new org.apache.commons.math.exception.NullArgumentException(var1, (java.lang.Object[])var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var0, var39);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test139"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var1, 99);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1074790369));

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test140"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    double var13 = var12.getArgument();
    org.apache.commons.math.complex.Complex var15 = var12.multiply(1.429831645580333d);
    
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
    assertTrue(var13 == 0.19933730498232405d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test141"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1579362192, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1579362092);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test142"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm((-1795512867667309079L), 10L);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test143"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var5 = var4.log();
    double var6 = var5.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.715485085845448E-9d);

  }

  public void test144() {}
//   public void test144() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test144"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     double[] var4 = new double[] { 1.0d, 10.0d};
//     double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var4);
//     double[] var8 = new double[] { 1.0d, 10.0d};
//     double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
//     double[] var12 = new double[] { 1.0d, 10.0d};
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distance1(var9, var12);
//     double var15 = org.apache.commons.math.util.MathUtils.distance1(var5, var9);
//     double[] var18 = new double[] { 1.0d, 10.0d};
//     double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
//     double[] var22 = new double[] { 1.0d, 10.0d};
//     double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
//     double var24 = org.apache.commons.math.util.MathUtils.distance1(var19, var22);
//     double[] var27 = new double[] { 1.0d, 10.0d};
//     double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
//     double[] var31 = new double[] { 1.0d, 10.0d};
//     double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
//     double var33 = org.apache.commons.math.util.MathUtils.distance1(var28, var31);
//     double[][] var34 = new double[][] { var31};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var19, var34);
//     org.apache.commons.math.util.MathUtils.sortInPlace(var5, var34);
//     org.apache.commons.math.exception.NotFiniteNumberException var37 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)15.104412573075516d, (java.lang.Object[])var34);
//     java.lang.String var38 = var37.toString();
// 
//   }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test145"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var5.negate();
    org.apache.commons.math.complex.Complex var9 = var8.log();
    org.apache.commons.math.complex.Complex var10 = var9.tanh();
    org.apache.commons.math.complex.ComplexField var11 = var10.getField();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test146"); }


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
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var18);
    
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

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test147"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.0f, 0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test148"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(byte)1, (java.lang.Number)100.0f, true);
    boolean var4 = var3.getBoundIsAllowed();
    boolean var5 = var3.getBoundIsAllowed();
    boolean var6 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test149"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)1L);
    java.lang.Number var3 = var2.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 1L+ "'", var3.equals(1L));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test150"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    double var5 = var3.getArgument();
    org.apache.commons.math.complex.Complex var6 = var3.sin();
    double var7 = var6.getArgument();
    org.apache.commons.math.complex.Complex var10 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var11 = var10.tanh();
    org.apache.commons.math.complex.Complex var12 = var10.exp();
    org.apache.commons.math.complex.Complex var13 = var10.sqrt();
    org.apache.commons.math.complex.Complex var14 = var13.sqrt1z();
    org.apache.commons.math.complex.Complex var15 = var13.sinh();
    org.apache.commons.math.complex.Complex var16 = var15.sin();
    org.apache.commons.math.complex.Complex var17 = var6.pow(var16);
    org.apache.commons.math.exception.util.Localizable var18 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var22 = new org.apache.commons.math.exception.NumberIsTooLargeException(var18, (java.lang.Number)(byte)(-1), (java.lang.Number)0.0f, false);
    boolean var23 = var17.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-2.276056593552136d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test151"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.tanh();
    org.apache.commons.math.complex.Complex var10 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var11 = var10.conjugate();
    java.lang.Object var12 = null;
    boolean var13 = var10.equals(var12);
    org.apache.commons.math.complex.Complex var14 = var10.sqrt1z();
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    java.lang.Object var19 = null;
    boolean var20 = var17.equals(var19);
    org.apache.commons.math.complex.Complex var21 = var17.sqrt1z();
    org.apache.commons.math.complex.Complex var22 = var10.add(var17);
    org.apache.commons.math.complex.Complex var25 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var26 = var25.conjugate();
    java.lang.Object var27 = null;
    boolean var28 = var25.equals(var27);
    org.apache.commons.math.complex.Complex var29 = var25.sqrt1z();
    org.apache.commons.math.complex.Complex var32 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var33 = var32.conjugate();
    java.lang.Object var34 = null;
    boolean var35 = var32.equals(var34);
    org.apache.commons.math.complex.Complex var36 = var32.sqrt1z();
    org.apache.commons.math.complex.Complex var37 = var25.add(var32);
    org.apache.commons.math.complex.Complex var40 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var41 = var40.conjugate();
    boolean var42 = var41.isNaN();
    org.apache.commons.math.complex.Complex var43 = var41.asin();
    org.apache.commons.math.complex.Complex var44 = var32.divide(var41);
    org.apache.commons.math.complex.Complex var45 = var17.add(var44);
    org.apache.commons.math.complex.Complex var46 = var44.tanh();
    org.apache.commons.math.complex.Complex var49 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var50 = var49.conjugate();
    boolean var51 = var50.isNaN();
    org.apache.commons.math.complex.Complex var52 = var50.asin();
    double var53 = var52.getArgument();
    org.apache.commons.math.complex.Complex var54 = var52.exp();
    org.apache.commons.math.complex.Complex var55 = var54.tan();
    org.apache.commons.math.complex.Complex var56 = var55.acos();
    org.apache.commons.math.complex.Complex var57 = var44.subtract(var55);
    org.apache.commons.math.complex.Complex var58 = var7.pow(var57);
    org.apache.commons.math.complex.Complex var59 = var7.tanh();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test152"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test153"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.9982726947086733d, 1.0000000001700238d, (-0.19801980198019803d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test154"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-224004970));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test155"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(37.3535253695998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.344492948298422E15d);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test156"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.8968222924860055d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1778577355));

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test157"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.util.Localizable var7 = null;
    java.math.BigInteger var8 = null;
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0L);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var15 = new org.apache.commons.math.exception.NumberIsTooSmallException(var7, (java.lang.Number)var12, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var12, 10L);
    org.apache.commons.math.exception.NumberIsTooSmallException var19 = new org.apache.commons.math.exception.NumberIsTooSmallException(var1, (java.lang.Number)var4, (java.lang.Number)var17, false);
    double[] var21 = new double[] { (-1.0d)};
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var21, 0.027339371326677953d);
    double[] var26 = new double[] { 1.0d, 10.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var26);
    double[] var30 = new double[] { 1.0d, 10.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distance1(var27, var30);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var21, var27);
    double[] var36 = new double[] { 1.0d, 10.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
    double[] var40 = new double[] { 1.0d, 10.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var37, var40);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var46);
    boolean var48 = org.apache.commons.math.util.MathUtils.equals(var37, var46);
    double[] var51 = new double[] { 1.0d, 10.0d};
    double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var51);
    double[] var55 = new double[] { 1.0d, 10.0d};
    double[] var56 = org.apache.commons.math.util.MathUtils.copyOf(var55);
    double var57 = org.apache.commons.math.util.MathUtils.distance1(var52, var55);
    int var58 = org.apache.commons.math.util.MathUtils.hash(var55);
    double[] var61 = new double[] { 1.0d, 10.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
    double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
    org.apache.commons.math.exception.NonMonotonousSequenceException var67 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var68 = var67.getDirection();
    boolean var71 = org.apache.commons.math.util.MathUtils.checkOrder(var62, var68, false, true);
    double[][] var72 = new double[][] { var62};
    org.apache.commons.math.util.MathUtils.sortInPlace(var55, var72);
    org.apache.commons.math.util.MathUtils.sortInPlace(var37, var72);
    org.apache.commons.math.util.MathUtils.sortInPlace(var27, var72);
    org.apache.commons.math.exception.NotFiniteNumberException var76 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)var17, (java.lang.Object[])var72);
    org.apache.commons.math.exception.NumberIsTooSmallException var78 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)1.5374020457163808d, (java.lang.Number)var17, false);
    java.lang.Number var79 = var78.getMin();
    java.lang.Number var80 = var78.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test158"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    boolean var4 = var2.isInfinite();
    org.apache.commons.math.complex.Complex var5 = var2.sin();
    org.apache.commons.math.complex.Complex var6 = var5.log();
    org.apache.commons.math.complex.Complex var7 = var5.cos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test159"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var7 = var6.sin();
    double var8 = var6.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.5374020457163808d);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test160"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test161"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.738774844045322d, 1.5374020457163808d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.4205676191854462d));

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test162"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.5333870746439389d), (-1.114782621445709d), (-1482551015));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test163"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    org.apache.commons.math.util.MathUtils.checkFinite(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertTrue(var13 == 0.0d);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test164"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    boolean var13 = var7.isNaN();
    org.apache.commons.math.complex.Complex var16 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var17 = var16.conjugate();
    org.apache.commons.math.complex.Complex var18 = var17.tanh();
    org.apache.commons.math.complex.Complex var21 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var22 = var21.conjugate();
    java.lang.Object var23 = null;
    boolean var24 = var21.equals(var23);
    org.apache.commons.math.complex.Complex var25 = var21.sqrt1z();
    org.apache.commons.math.complex.Complex var26 = var17.divide(var21);
    org.apache.commons.math.complex.Complex var27 = var26.negate();
    org.apache.commons.math.complex.Complex var28 = var7.add(var26);
    org.apache.commons.math.complex.Complex var29 = var7.sin();
    org.apache.commons.math.complex.Complex var30 = var7.log();
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test165"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(3.170153879722701d, (-1.0d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test166"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var5 = null;
    java.lang.Object[] var7 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var8 = new org.apache.commons.math.exception.MathArithmeticException(var5, var7);
    org.apache.commons.math.exception.NotFiniteNumberException var9 = new org.apache.commons.math.exception.NotFiniteNumberException(var3, (java.lang.Number)0.0d, var7);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)(byte)0, var2, var7);
    org.apache.commons.math.exception.MathArithmeticException var11 = new org.apache.commons.math.exception.MathArithmeticException(var0, var7);
    org.apache.commons.math.exception.util.ExceptionContext var12 = var11.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test167"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-89L), 6891033258142766080L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-6891033258142766169L));

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test168"); }


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
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double[] var33 = new double[] { 1.0d, 10.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var30, var33);
    double var36 = org.apache.commons.math.util.MathUtils.distance1(var7, var30);
    double[] var38 = new double[] { (-1.0d)};
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 0.027339371326677953d);
    double[] var43 = new double[] { 1.0d, 10.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double var49 = org.apache.commons.math.util.MathUtils.distance1(var44, var47);
    boolean var50 = org.apache.commons.math.util.MathUtils.equals(var38, var44);
    double[] var53 = new double[] { 1.0d, 10.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var53);
    double[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var54);
    double var56 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var54);
    double var57 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var44);
    
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
    assertTrue(var26 == 10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test169"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(Float.NaN, 0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test170"); }


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
    org.apache.commons.math.complex.Complex var20 = var4.tanh();
    
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

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test171"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(8812L, 9900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1088L));

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test172"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.lang.Number var9 = null;
    java.math.BigInteger var10 = null;
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 0L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 990L);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var14, 0);
    double[] var20 = new double[] { 1.0d, 10.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double[] var24 = new double[] { 1.0d, 10.0d};
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var25, var28);
    double var31 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var38.getDirection();
    int var40 = var38.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var41 = var38.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var43 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var41, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var44 = var43.getDirection();
    boolean var47 = org.apache.commons.math.util.MathUtils.checkOrder(var25, var44, false, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var49 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var9, (java.lang.Number)0, (-99), var44, false);
    var8.addSuppressed((java.lang.Throwable)var49);
    java.lang.Throwable[] var51 = var49.getSuppressed();
    int var52 = var49.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-99));

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test173"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    org.apache.commons.math.exception.util.Localizable var4 = null;
    java.lang.Object[] var6 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var7 = new org.apache.commons.math.exception.MathArithmeticException(var4, var6);
    org.apache.commons.math.exception.MathIllegalArgumentException var8 = new org.apache.commons.math.exception.MathIllegalArgumentException(var3, var6);
    org.apache.commons.math.exception.MathIllegalArgumentException var9 = new org.apache.commons.math.exception.MathIllegalArgumentException(var2, var6);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)10.0d, var1, var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test174"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)3628800L, (java.lang.Number)(-332607061), false);
    java.lang.Number var5 = var4.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 3628800L+ "'", var5.equals(3628800L));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test175"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 100.0f, (-1861132339));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test176"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1911350515));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test177"); }


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
    double[] var27 = org.apache.commons.math.util.MathUtils.normalizeArray(var25, (-0.09966865249116202d));
    double[] var29 = new double[] { (-1.0d)};
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 0.027339371326677953d);
    double[] var34 = new double[] { 1.0d, 10.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var34);
    double[] var38 = new double[] { 1.0d, 10.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    double var40 = org.apache.commons.math.util.MathUtils.distance1(var35, var38);
    boolean var41 = org.apache.commons.math.util.MathUtils.equals(var29, var35);
    double var42 = org.apache.commons.math.util.MathUtils.distance1(var25, var35);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test178"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    boolean var13 = org.apache.commons.math.util.MathUtils.equals(var1, var7);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var16 = new double[] { (-1.0d)};
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 0.027339371326677953d);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var25);
    boolean var28 = org.apache.commons.math.util.MathUtils.equals(var16, var22);
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 0.0d);
    int var31 = org.apache.commons.math.util.MathUtils.hash(var16);
    org.apache.commons.math.complex.Complex var34 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var35 = var34.tanh();
    org.apache.commons.math.complex.Complex var38 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var39 = var38.acos();
    org.apache.commons.math.complex.Complex var40 = var34.multiply(var39);
    org.apache.commons.math.complex.Complex var41 = var40.sinh();
    org.apache.commons.math.complex.Complex var44 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var45 = var44.tanh();
    boolean var46 = var44.isInfinite();
    double var47 = var44.getReal();
    org.apache.commons.math.complex.Complex var48 = var44.sqrt1z();
    org.apache.commons.math.complex.Complex var49 = var41.add(var48);
    double[] var52 = new double[] { 1.0d, 10.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.copyOf(var52);
    double[] var56 = new double[] { 1.0d, 10.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    double[] var60 = new double[] { 1.0d, 10.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double var62 = org.apache.commons.math.util.MathUtils.distance1(var57, var60);
    double var63 = org.apache.commons.math.util.MathUtils.distance1(var53, var57);
    double[] var65 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, 0.0d);
    double[] var67 = org.apache.commons.math.util.MathUtils.normalizeArray(var57, (-0.21891713329967522d));
    boolean var68 = var41.equals((java.lang.Object)var67);
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var67);
    double var70 = org.apache.commons.math.util.MathUtils.distance1(var1, var67);
    org.apache.commons.math.exception.NonMonotonousSequenceException var74 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var75 = var74.getDirection();
    int var76 = var74.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var77 = var74.getDirection();
    org.apache.commons.math.util.MathUtils.checkOrder(var1, var77, false);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1074790369));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.9800984424273023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test179"); }


    org.apache.commons.math.util.MathUtils.checkFinite((-1.114782621445709d));

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test180"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(9900L, (-1795512867667299179L));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test181"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.tanh();
    org.apache.commons.math.complex.Complex var11 = var9.exp();
    org.apache.commons.math.complex.Complex var12 = var11.acos();
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.conjugate();
    java.lang.Object var17 = null;
    boolean var18 = var15.equals(var17);
    org.apache.commons.math.complex.Complex var19 = var15.sin();
    org.apache.commons.math.complex.Complex var20 = var15.acos();
    org.apache.commons.math.exception.NumberIsTooLargeException var24 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var25 = var20.equals((java.lang.Object)99L);
    org.apache.commons.math.complex.Complex var26 = var11.add(var20);
    boolean var27 = var26.isInfinite();
    org.apache.commons.math.complex.Complex var28 = var26.sinh();
    org.apache.commons.math.complex.Complex var31 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var32 = var31.conjugate();
    boolean var33 = var32.isNaN();
    double var34 = var32.getArgument();
    org.apache.commons.math.complex.Complex var37 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var38 = var37.tanh();
    org.apache.commons.math.complex.Complex var39 = var37.exp();
    org.apache.commons.math.complex.Complex var40 = var37.sqrt();
    java.lang.String var41 = var40.toString();
    org.apache.commons.math.complex.Complex var42 = var32.divide(var40);
    org.apache.commons.math.complex.Complex var45 = new org.apache.commons.math.complex.Complex((-1.0d), 0.10016239685295168d);
    org.apache.commons.math.complex.Complex var47 = var45.multiply(1.5582781295114951d);
    org.apache.commons.math.complex.Complex var48 = var47.exp();
    org.apache.commons.math.complex.Complex var49 = var48.acos();
    org.apache.commons.math.complex.Complex var50 = var40.multiply(var49);
    org.apache.commons.math.complex.Complex var51 = var26.divide(var50);
    org.apache.commons.math.complex.Complex var52 = var5.subtract(var26);
    org.apache.commons.math.complex.Complex var53 = var26.exp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "(3.166218219036781, -0.15791710027873845)"+ "'", var41.equals("(3.166218219036781, -0.15791710027873845)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test182"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    double[] var10 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var13 = new double[] { 1.0d, 10.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double var19 = org.apache.commons.math.util.MathUtils.distance1(var14, var17);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var26 = new double[] { 1.0d, 10.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var26);
    double var28 = org.apache.commons.math.util.MathUtils.distance1(var23, var26);
    double[][] var29 = new double[][] { var26};
    org.apache.commons.math.util.MathUtils.sortInPlace(var14, var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equals(var10, var14);
    double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    org.apache.commons.math.util.MathUtils.checkFinite(var14);
    boolean var35 = org.apache.commons.math.util.MathUtils.equals(var1, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var1, 224004970);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test183"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.715485085845448E-9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test184"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-0.11038096704629749d), (java.lang.Number)1795512867667309079L, true);
    boolean var4 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test185"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(0.39485088384753614d, (-1.3468724468673325d));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test186"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(3628800L, (-98L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-355622400L));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test187"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.complex.Complex var7 = var5.sinh();
    org.apache.commons.math.complex.Complex var8 = var5.negate();
    double var9 = var5.abs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(3.166218219036781, -0.15791710027873845)"+ "'", var6.equals("(3.166218219036781, -0.15791710027873845)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3.170153879722701d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test188"); }


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
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.conjugate();
    boolean var43 = var42.isNaN();
    org.apache.commons.math.complex.Complex var44 = var42.asin();
    double var45 = var44.getArgument();
    org.apache.commons.math.complex.Complex var46 = var44.exp();
    org.apache.commons.math.complex.Complex var47 = var46.tan();
    org.apache.commons.math.complex.Complex var48 = var47.acos();
    org.apache.commons.math.complex.Complex var49 = var36.subtract(var47);
    org.apache.commons.math.complex.Complex var52 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var53 = var52.conjugate();
    java.lang.Object var54 = null;
    boolean var55 = var52.equals(var54);
    org.apache.commons.math.complex.Complex var56 = var52.sqrt1z();
    org.apache.commons.math.complex.Complex var58 = var52.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var59 = var58.tan();
    org.apache.commons.math.complex.Complex var60 = var59.asin();
    org.apache.commons.math.complex.Complex var61 = var60.cos();
    org.apache.commons.math.complex.Complex var62 = var47.subtract(var61);
    java.lang.String var63 = var62.toString();
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.1147826214457093d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "(-1.9247129959689935, 1.1927534826389727)"+ "'", var63.equals("(-1.9247129959689935, 1.1927534826389727)"));

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test189"); }


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
    boolean var38 = var37.isInfinite();
    org.apache.commons.math.complex.Complex var39 = var37.sqrt1z();
    java.lang.String var40 = var39.toString();
    
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
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "(1.2029596275753391, 10.93510900602746)"+ "'", var40.equals("(1.2029596275753391, 10.93510900602746)"));

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test190"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.3440585709080678E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test191"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-1.4205676191854462d), 10.98019801980198d, 1.5582781295114951d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test192() {}
//   public void test192() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test192"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var6 = new double[] { 1.0d, 10.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
//     double[] var11 = new double[] { 1.0d, 10.0d};
//     double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     boolean var14 = org.apache.commons.math.util.MathUtils.equals(var3, var12);
//     org.apache.commons.math.util.MathUtils.OrderDirection var15 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var12, var15, false);
// 
//   }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test193"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(3.0055182757323147d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1785097455);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test194"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var15);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test195"); }


    int[] var1 = new int[] { (-1)};
    int[] var5 = new int[] { 1, 100, 0};
    int[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int var7 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var6);
    int[] var9 = new int[] { (-1)};
    int[] var13 = new int[] { 1, 100, 0};
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    int var15 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var14);
    int var16 = org.apache.commons.math.util.MathUtils.distance1(var1, var9);
    int[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    
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
    assertNotNull(var17);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test196"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1378206651628553216L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-30145589), 1911350603);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test198"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException(var0);
    java.lang.Number var2 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test199"); }


    org.apache.commons.math.util.MathUtils.checkFinite(3.0055182757323147d);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test200"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.144873561044819d, 4.605170185988092d, (-30145589));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test201"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.MathArithmeticException var2 = new org.apache.commons.math.exception.MathArithmeticException();
    org.apache.commons.math.exception.util.ExceptionContext var3 = var2.getContext();
    java.lang.Throwable[] var4 = var2.getSuppressed();
    org.apache.commons.math.exception.NotFiniteNumberException var5 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)35853.36506461688d, (java.lang.Object[])var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test202"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 869829230);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test203"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    org.apache.commons.math.complex.Complex var6 = var5.tan();
    double var7 = var6.getReal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 9.947392708686547E-4d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test204"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(786341870, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test205"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var22 = var19.sin();
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test206"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    int var36 = org.apache.commons.math.util.MathUtils.hash(var3);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-30145599));

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test207"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1686316699), (-1074790369));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-611526330));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test208"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt();
    org.apache.commons.math.complex.Complex var7 = var6.tan();
    double var8 = var6.abs();
    org.apache.commons.math.complex.Complex var9 = var6.log();
    double var10 = var6.getArgument();
    org.apache.commons.math.complex.Complex var13 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var14 = var13.conjugate();
    java.lang.Object var15 = null;
    boolean var16 = var13.equals(var15);
    org.apache.commons.math.complex.Complex var17 = var13.acos();
    org.apache.commons.math.complex.Complex var20 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var21 = var20.conjugate();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    org.apache.commons.math.complex.Complex var26 = var25.tanh();
    org.apache.commons.math.complex.Complex var29 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var30 = var29.conjugate();
    java.lang.Object var31 = null;
    boolean var32 = var29.equals(var31);
    org.apache.commons.math.complex.Complex var33 = var29.sqrt1z();
    org.apache.commons.math.complex.Complex var34 = var25.divide(var29);
    org.apache.commons.math.complex.Complex var35 = var20.divide(var34);
    java.util.List var37 = var34.nthRoot(1);
    org.apache.commons.math.complex.Complex var38 = var17.multiply(var34);
    org.apache.commons.math.complex.Complex var41 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var42 = var41.conjugate();
    org.apache.commons.math.complex.ComplexField var43 = var42.getField();
    org.apache.commons.math.complex.Complex var46 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var47 = var46.conjugate();
    java.lang.Object var48 = null;
    boolean var49 = var46.equals(var48);
    org.apache.commons.math.complex.Complex var50 = var46.sqrt1z();
    org.apache.commons.math.complex.Complex var53 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var54 = var53.conjugate();
    java.lang.Object var55 = null;
    boolean var56 = var53.equals(var55);
    org.apache.commons.math.complex.Complex var57 = var53.sqrt1z();
    org.apache.commons.math.complex.Complex var58 = var46.add(var53);
    org.apache.commons.math.complex.Complex var59 = var42.pow(var58);
    org.apache.commons.math.complex.Complex var60 = var34.pow(var42);
    org.apache.commons.math.complex.Complex var61 = var6.multiply(var42);
    org.apache.commons.math.complex.Complex var64 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var65 = var64.tanh();
    org.apache.commons.math.complex.Complex var66 = var64.exp();
    org.apache.commons.math.complex.Complex var67 = var66.acos();
    org.apache.commons.math.complex.Complex var68 = var67.sqrt();
    org.apache.commons.math.complex.Complex var69 = var68.tan();
    org.apache.commons.math.complex.Complex var70 = var6.pow(var69);
    
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
    assertTrue(var8 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.738774844045322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test209"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var7.tan();
    org.apache.commons.math.complex.Complex var9 = var8.acos();
    org.apache.commons.math.complex.Complex var10 = var8.conjugate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var12 = var8.nthRoot((-1118089298));
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test210"); }


    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.util.Localizable var3 = null;
    int[] var8 = new int[] { 1, 100, 0};
    int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    java.lang.Object[] var10 = new java.lang.Object[] { var8};
    org.apache.commons.math.exception.NotFiniteNumberException var11 = new org.apache.commons.math.exception.NotFiniteNumberException(var3, (java.lang.Number)10, var10);
    org.apache.commons.math.exception.NullArgumentException var12 = new org.apache.commons.math.exception.NullArgumentException(var2, var10);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)5.168402685733877d, var1, var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test211"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 1795512867667307991L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1795512867667307991L));

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test212"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-30145599), (-9));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-30145590));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test213"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var3 = new org.apache.commons.math.exception.MathArithmeticException(var0, var2);
    org.apache.commons.math.exception.util.ExceptionContext var4 = var3.getContext();
    org.apache.commons.math.exception.util.ExceptionContext var5 = var3.getContext();
    org.apache.commons.math.exception.util.ExceptionContext var6 = var3.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test214"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)(-1), var2, false);
    boolean var5 = var4.getBoundIsAllowed();
    java.lang.Number var6 = var4.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test215"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(869829230, 1785097455);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test216"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    org.apache.commons.math.complex.Complex var13 = var12.exp();
    org.apache.commons.math.complex.Complex var14 = var13.cos();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test217"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10L);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var5, 0);
    org.apache.commons.math.complex.Complex var15 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tanh();
    org.apache.commons.math.complex.Complex var17 = var15.log();
    org.apache.commons.math.complex.Complex var20 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var21 = var20.conjugate();
    java.lang.Object var22 = null;
    boolean var23 = var20.equals(var22);
    org.apache.commons.math.complex.Complex var24 = var20.acos();
    org.apache.commons.math.complex.Complex var25 = var15.pow(var20);
    org.apache.commons.math.complex.Complex var26 = var20.acos();
    double var27 = var26.getReal();
    org.apache.commons.math.complex.Complex var28 = var26.sqrt1z();
    org.apache.commons.math.exception.util.Localizable var30 = null;
    org.apache.commons.math.exception.util.Localizable var31 = null;
    org.apache.commons.math.exception.util.Localizable var33 = null;
    java.lang.Object[] var35 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var36 = new org.apache.commons.math.exception.MathArithmeticException(var33, var35);
    org.apache.commons.math.exception.NotFiniteNumberException var37 = new org.apache.commons.math.exception.NotFiniteNumberException(var31, (java.lang.Number)0.0d, var35);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)(byte)0, var30, var35);
    boolean var39 = var28.equals((java.lang.Object)var35);
    org.apache.commons.math.exception.NotFiniteNumberException var40 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)var12, var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.10016239685295168d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test218"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math.exception.MathArithmeticException var2 = new org.apache.commons.math.exception.MathArithmeticException(var0, var1);
    org.apache.commons.math.exception.util.ExceptionContext var3 = var2.getContext();
    org.apache.commons.math.exception.util.ExceptionContext var4 = var2.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test219"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var2.negate();
    boolean var7 = var2.isInfinite();
    java.lang.String var8 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(10.0, -1.0)"+ "'", var8.equals("(10.0, -1.0)"));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test220"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-3.748403376781957E-9d), (-1.5333870746439389d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test221"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(2007782532);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test222"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    org.apache.commons.math.complex.Complex var6 = var5.asin();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var15 = var9.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var16 = var15.tan();
    boolean var17 = var15.isInfinite();
    org.apache.commons.math.complex.Complex var18 = var5.divide(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test223"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(short)1, var1, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)10, (java.lang.Number)10.0d, (-1911350513));
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.Number var9 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test224"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1378206651628553216L);
    boolean var2 = var1.getBoundIsAllowed();
    boolean var3 = var1.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test225"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test226"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var5 = var4.sin();
    org.apache.commons.math.complex.Complex var6 = var4.acos();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    java.lang.Object var11 = null;
    boolean var12 = var9.equals(var11);
    org.apache.commons.math.complex.Complex var13 = var9.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var17 = var16.conjugate();
    java.lang.Object var18 = null;
    boolean var19 = var16.equals(var18);
    org.apache.commons.math.complex.Complex var20 = var16.sqrt1z();
    org.apache.commons.math.complex.Complex var21 = var9.add(var16);
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.sqrt1z();
    org.apache.commons.math.complex.Complex var31 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var32 = var31.conjugate();
    java.lang.Object var33 = null;
    boolean var34 = var31.equals(var33);
    org.apache.commons.math.complex.Complex var35 = var31.sqrt1z();
    org.apache.commons.math.complex.Complex var36 = var24.add(var31);
    org.apache.commons.math.complex.Complex var39 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var40 = var39.conjugate();
    boolean var41 = var40.isNaN();
    org.apache.commons.math.complex.Complex var42 = var40.asin();
    org.apache.commons.math.complex.Complex var43 = var31.divide(var40);
    org.apache.commons.math.complex.Complex var44 = var16.add(var43);
    double var45 = var43.getImaginary();
    double var46 = var43.getImaginary();
    org.apache.commons.math.complex.Complex var47 = var43.conjugate();
    org.apache.commons.math.complex.Complex var50 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var51 = var50.asin();
    org.apache.commons.math.complex.Complex var52 = var43.multiply(var51);
    org.apache.commons.math.complex.Complex var53 = var4.divide(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-0.19801980198019803d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-0.19801980198019803d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test227"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var7 = var6.sin();
    org.apache.commons.math.complex.ComplexField var8 = var6.getField();
    double var9 = var6.getArgument();
    org.apache.commons.math.complex.Complex var12 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var13 = var12.conjugate();
    java.lang.Object var14 = null;
    boolean var15 = var12.equals(var14);
    org.apache.commons.math.complex.Complex var16 = var12.acos();
    org.apache.commons.math.complex.Complex var19 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var20 = var19.conjugate();
    org.apache.commons.math.complex.Complex var23 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var24 = var23.conjugate();
    org.apache.commons.math.complex.Complex var25 = var24.tanh();
    org.apache.commons.math.complex.Complex var28 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var29 = var28.conjugate();
    java.lang.Object var30 = null;
    boolean var31 = var28.equals(var30);
    org.apache.commons.math.complex.Complex var32 = var28.sqrt1z();
    org.apache.commons.math.complex.Complex var33 = var24.divide(var28);
    org.apache.commons.math.complex.Complex var34 = var19.divide(var33);
    java.util.List var36 = var33.nthRoot(1);
    org.apache.commons.math.complex.Complex var37 = var16.multiply(var33);
    org.apache.commons.math.complex.Complex var40 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var41 = var40.conjugate();
    org.apache.commons.math.complex.ComplexField var42 = var41.getField();
    org.apache.commons.math.complex.Complex var45 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var46 = var45.conjugate();
    java.lang.Object var47 = null;
    boolean var48 = var45.equals(var47);
    org.apache.commons.math.complex.Complex var49 = var45.sqrt1z();
    org.apache.commons.math.complex.Complex var52 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var53 = var52.conjugate();
    java.lang.Object var54 = null;
    boolean var55 = var52.equals(var54);
    org.apache.commons.math.complex.Complex var56 = var52.sqrt1z();
    org.apache.commons.math.complex.Complex var57 = var45.add(var52);
    org.apache.commons.math.complex.Complex var58 = var41.pow(var57);
    org.apache.commons.math.complex.Complex var59 = var33.pow(var41);
    org.apache.commons.math.complex.Complex var60 = var6.divide(var33);
    org.apache.commons.math.complex.Complex var61 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.complex.Complex var62 = var6.multiply(var61);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.5374020457163808d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test228"); }


    double[] var0 = null;
    double[] var4 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var7 = new double[] { 1.0d, 10.0d};
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var8, var11);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double[] var20 = new double[] { 1.0d, 10.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double var22 = org.apache.commons.math.util.MathUtils.distance1(var17, var20);
    double[][] var23 = new double[][] { var20};
    org.apache.commons.math.util.MathUtils.sortInPlace(var8, var23);
    boolean var25 = org.apache.commons.math.util.MathUtils.equals(var4, var8);
    double[] var28 = new double[] { 1.0d, 10.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var29, var32);
    double[] var37 = new double[] { 1.0d, 10.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    double[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var29, var38);
    double[] var43 = new double[] { 1.0d, 10.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double var49 = org.apache.commons.math.util.MathUtils.distance1(var44, var47);
    int var50 = org.apache.commons.math.util.MathUtils.hash(var47);
    double[] var53 = new double[] { 1.0d, 10.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var53);
    double[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var54);
    org.apache.commons.math.exception.NonMonotonousSequenceException var59 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var60 = var59.getDirection();
    boolean var63 = org.apache.commons.math.util.MathUtils.checkOrder(var54, var60, false, true);
    double[][] var64 = new double[][] { var54};
    org.apache.commons.math.util.MathUtils.sortInPlace(var47, var64);
    org.apache.commons.math.util.MathUtils.sortInPlace(var29, var64);
    double var67 = org.apache.commons.math.util.MathUtils.distance1(var8, var29);
    boolean var68 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test229"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var6.getDirection();
    int var8 = var6.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var9, false);
    int var12 = var11.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test230"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(786341870);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test231"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(11900.950259059777d, (-469.2030354410471d), 1656171101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test232"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100L, (java.lang.Number)(short)10, 100, var3, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var5.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    java.lang.Number var9 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)10+ "'", var9.equals((short)10));

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test233"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 0.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test234"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)224004970, (java.lang.Number)1904431168, false);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test235"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 4.3611853051969955d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test236"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1579362192);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test237"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var41 = var35.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var42 = var32.add(var35);
    org.apache.commons.math.complex.Complex var43 = var32.acos();
    org.apache.commons.math.complex.Complex var46 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var47 = var46.tanh();
    org.apache.commons.math.complex.Complex var48 = var46.exp();
    org.apache.commons.math.complex.Complex var49 = var48.acos();
    org.apache.commons.math.complex.Complex var50 = var49.sqrt();
    org.apache.commons.math.complex.Complex var51 = var50.tan();
    double var52 = var50.abs();
    org.apache.commons.math.complex.Complex var53 = var50.log();
    org.apache.commons.math.complex.Complex var54 = var43.add(var53);
    org.apache.commons.math.complex.Complex var55 = var43.cosh();
    org.apache.commons.math.complex.Complex var56 = var43.sin();
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test238"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    org.apache.commons.math.util.MathUtils.checkOrder(var7);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var25);
    double var28 = org.apache.commons.math.util.MathUtils.distance1(var18, var22);
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var18, 2);
    double[] var32 = new double[] { (-1.0d)};
    double[] var34 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.027339371326677953d);
    double[] var37 = new double[] { 1.0d, 10.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    double[] var41 = new double[] { 1.0d, 10.0d};
    double[] var42 = org.apache.commons.math.util.MathUtils.copyOf(var41);
    double var43 = org.apache.commons.math.util.MathUtils.distance1(var38, var41);
    boolean var44 = org.apache.commons.math.util.MathUtils.equals(var32, var38);
    double[] var47 = new double[] { 1.0d, 10.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.copyOf(var47);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    double[] var50 = org.apache.commons.math.util.MathUtils.copyOf(var48);
    boolean var51 = org.apache.commons.math.util.MathUtils.equals(var32, var48);
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var32);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var30);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test239"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.5374020457163808d, (-2.0d), 332607061);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test240"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.5374020457163808d, (-769953791));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test241"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-98L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test242"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1111484299649056767L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1111484299649056767L));

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test243"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var5 = var4.sin();
    org.apache.commons.math.complex.Complex var6 = var4.cosh();
    org.apache.commons.math.complex.Complex var9 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var10 = var9.conjugate();
    org.apache.commons.math.complex.Complex var11 = var10.tanh();
    org.apache.commons.math.complex.Complex var14 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var15 = var14.conjugate();
    java.lang.Object var16 = null;
    boolean var17 = var14.equals(var16);
    org.apache.commons.math.complex.Complex var18 = var14.sqrt1z();
    org.apache.commons.math.complex.Complex var19 = var10.divide(var14);
    org.apache.commons.math.complex.Complex var22 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var23 = var22.tanh();
    org.apache.commons.math.complex.Complex var24 = var22.exp();
    org.apache.commons.math.complex.Complex var25 = var19.subtract(var22);
    org.apache.commons.math.complex.Complex var26 = var22.exp();
    org.apache.commons.math.complex.Complex var27 = var26.exp();
    double var28 = var26.getArgument();
    org.apache.commons.math.complex.Complex var31 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var32 = var31.conjugate();
    java.lang.Object var33 = null;
    boolean var34 = var31.equals(var33);
    org.apache.commons.math.complex.Complex var35 = var31.acos();
    org.apache.commons.math.complex.Complex var36 = var31.asin();
    org.apache.commons.math.complex.Complex var37 = var26.multiply(var36);
    org.apache.commons.math.complex.Complex var38 = var36.sqrt();
    org.apache.commons.math.complex.Complex var39 = var38.negate();
    org.apache.commons.math.complex.Complex var42 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var43 = var42.conjugate();
    java.lang.Object var44 = null;
    boolean var45 = var42.equals(var44);
    org.apache.commons.math.complex.Complex var46 = var42.sqrt1z();
    org.apache.commons.math.complex.Complex var48 = var42.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var49 = var39.add(var42);
    org.apache.commons.math.complex.Complex var50 = var39.acos();
    org.apache.commons.math.complex.Complex var53 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var54 = var53.tanh();
    org.apache.commons.math.complex.Complex var55 = var53.exp();
    org.apache.commons.math.complex.Complex var56 = var55.acos();
    org.apache.commons.math.complex.Complex var57 = var56.sqrt();
    org.apache.commons.math.complex.Complex var58 = var57.tan();
    double var59 = var57.abs();
    org.apache.commons.math.complex.Complex var60 = var57.log();
    org.apache.commons.math.complex.Complex var61 = var50.add(var60);
    org.apache.commons.math.complex.Complex var62 = var4.add(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test244"); }


    org.apache.commons.math.util.MathUtils.checkFinite(1.9984630277548983d);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test245"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(6891033258142766080L, 3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1280L);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test246"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(0.0d, 11013.232874703393d);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test247"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(8.4566787454165d, 0.39083465772316284d, (-2.99827269470867d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test248"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1656171100), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1656171098));

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test249"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var8 = new double[] { 1.0d, 10.0d};
    double[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    double[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = var14.getDirection();
    boolean var18 = org.apache.commons.math.util.MathUtils.checkOrder(var9, var15, false, true);
    double var19 = org.apache.commons.math.util.MathUtils.distance1(var3, var9);
    org.apache.commons.math.util.MathUtils.checkOrder(var3);
    org.apache.commons.math.util.MathUtils.checkFinite(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test250"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-0.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test251"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(990L, 1795512867667309079L);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test252"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1378206651628543415L), (-6891033258142766169L));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test253"); }


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
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test254"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(37.3535253695998d, (-2.99827269470867d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.34558647347771654d));

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test255"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce((-1.114782621445709d), (-0.9860778625231765d), 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.7181517288324102d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test256"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var3, 2);
    double[] var17 = new double[] { (-1.0d)};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 0.027339371326677953d);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var26 = new double[] { 1.0d, 10.0d};
    double[] var27 = org.apache.commons.math.util.MathUtils.copyOf(var26);
    double var28 = org.apache.commons.math.util.MathUtils.distance1(var23, var26);
    boolean var29 = org.apache.commons.math.util.MathUtils.equals(var17, var23);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    double[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    boolean var36 = org.apache.commons.math.util.MathUtils.equals(var17, var33);
    boolean var37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var15, var17);
    org.apache.commons.math.util.MathUtils.checkFinite(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test257"); }


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
    int[] var53 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var53, (-30145599));
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
    assertNotNull(var53);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test258"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var2 = null;
    org.apache.commons.math.exception.NotFiniteNumberException var3 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)(-1074789359), var2);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test259"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-332607061), (-1656171098));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test260() {}
//   public void test260() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test260"); }
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
//     int[] var38 = new int[] { 1, 100, 0};
//     int[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
//     int var40 = org.apache.commons.math.util.MathUtils.distance1(var19, var38);
//     int[] var42 = new int[] { (-1)};
//     int[] var46 = new int[] { 1, 100, 0};
//     int[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var46);
//     int var48 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var47);
//     int[] var50 = new int[] { (-1)};
//     int[] var54 = new int[] { 1, 100, 0};
//     int[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var54);
//     int var56 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var55);
//     int var57 = org.apache.commons.math.util.MathUtils.distance1(var42, var50);
//     int[] var61 = new int[] { 1, 100, 0};
//     int[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
//     int var63 = org.apache.commons.math.util.MathUtils.distance1(var42, var61);
//     int var64 = org.apache.commons.math.util.MathUtils.distance1(var19, var61);
//     int var65 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var19);
//     double var66 = org.apache.commons.math.util.MathUtils.distance(var0, var10);
// 
//   }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test261"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(10.04987562112089d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 201797753);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test262"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    double[] var4 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 0.025816509664474907d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test263"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.sqrt1z();
    org.apache.commons.math.complex.Complex var12 = var3.divide(var7);
    boolean var13 = var12.isInfinite();
    double var14 = var12.abs();
    org.apache.commons.math.complex.Complex var17 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var18 = var17.conjugate();
    org.apache.commons.math.complex.Complex var19 = var18.tanh();
    org.apache.commons.math.complex.Complex var22 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var23 = var22.conjugate();
    java.lang.Object var24 = null;
    boolean var25 = var22.equals(var24);
    org.apache.commons.math.complex.Complex var26 = var22.sqrt1z();
    org.apache.commons.math.complex.Complex var27 = var18.divide(var22);
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.conjugate();
    java.lang.Object var32 = null;
    boolean var33 = var30.equals(var32);
    org.apache.commons.math.complex.Complex var34 = var30.sqrt1z();
    org.apache.commons.math.complex.Complex var36 = var30.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var37 = var36.tan();
    org.apache.commons.math.complex.Complex var38 = var27.divide(var36);
    org.apache.commons.math.complex.Complex var39 = var36.log();
    org.apache.commons.math.complex.Complex var40 = var12.pow(var36);
    org.apache.commons.math.complex.Complex var43 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var44 = var43.conjugate();
    org.apache.commons.math.complex.Complex var45 = var44.tanh();
    java.lang.String var46 = var45.toString();
    org.apache.commons.math.complex.Complex var47 = var12.divide(var45);
    org.apache.commons.math.complex.Complex var50 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var51 = var50.conjugate();
    java.lang.Object var52 = null;
    boolean var53 = var50.equals(var52);
    org.apache.commons.math.complex.Complex var54 = var50.acos();
    org.apache.commons.math.complex.Complex var57 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var58 = var57.conjugate();
    org.apache.commons.math.complex.Complex var61 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var62 = var61.conjugate();
    org.apache.commons.math.complex.Complex var63 = var62.tanh();
    org.apache.commons.math.complex.Complex var66 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var67 = var66.conjugate();
    java.lang.Object var68 = null;
    boolean var69 = var66.equals(var68);
    org.apache.commons.math.complex.Complex var70 = var66.sqrt1z();
    org.apache.commons.math.complex.Complex var71 = var62.divide(var66);
    org.apache.commons.math.complex.Complex var72 = var57.divide(var71);
    java.util.List var74 = var71.nthRoot(1);
    org.apache.commons.math.complex.Complex var75 = var54.multiply(var71);
    org.apache.commons.math.complex.Complex var76 = var54.asin();
    boolean var77 = var12.equals((java.lang.Object)var76);
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "(1.000000001715485, 3.748403376781957E-9)"+ "'", var46.equals("(1.000000001715485, 3.748403376781957E-9)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test264"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.5430806348152437d, 0.0d, (-467.5220833456485d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test265"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math.complex.Complex var7 = var5.sinh();
    org.apache.commons.math.complex.Complex var8 = var7.sin();
    org.apache.commons.math.complex.ComplexField var9 = var8.getField();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test266"); }


    java.lang.Number var0 = null;
    java.math.BigInteger var4 = null;
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 0L);
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 990L);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0);
    double[] var14 = new double[] { 1.0d, 10.0d};
    double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var19, var22);
    double var25 = org.apache.commons.math.util.MathUtils.distance1(var15, var19);
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = var32.getDirection();
    int var34 = var32.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var35 = var32.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var37 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var35, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var38 = var37.getDirection();
    boolean var41 = org.apache.commons.math.util.MathUtils.checkOrder(var19, var38, false, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var43 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0d, (java.lang.Number)var8, 10, var38, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var45 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)9801000L, (-1074789359), var38, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test267"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-638805082));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test268"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    int[] var44 = new int[] { 1, 100, 0};
    int[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    java.lang.Object[] var46 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NotFiniteNumberException var47 = new org.apache.commons.math.exception.NotFiniteNumberException(var39, (java.lang.Number)10, var46);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var38, var46);
    double[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var3);
    org.apache.commons.math.util.MathUtils.checkFinite(var49);
    double[] var52 = new double[] { (-1.0d)};
    double[] var54 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 0.027339371326677953d);
    double[] var57 = new double[] { 1.0d, 10.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    double[] var61 = new double[] { 1.0d, 10.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var61);
    double var63 = org.apache.commons.math.util.MathUtils.distance1(var58, var61);
    boolean var64 = org.apache.commons.math.util.MathUtils.equals(var52, var58);
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 0.0d);
    boolean var67 = org.apache.commons.math.util.MathUtils.equals(var49, var66);
    double[] var69 = new double[] { (-1.0d)};
    double[] var71 = org.apache.commons.math.util.MathUtils.normalizeArray(var69, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.checkOrder(var69);
    double[] var73 = org.apache.commons.math.util.MathUtils.copyOf(var69);
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var66, var69);
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test269"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.complex.Complex var5 = var2.subtract(var4);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test270"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex((-1.0d), (-0.21891713329967522d));
    double var3 = var2.getImaginary();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.21891713329967522d));

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test271"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    double[] var3 = new double[] { (-1.0d)};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var5, var6, true);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    double[] var12 = new double[] { 1.0d, 10.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var16);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var25);
    double[][] var28 = new double[][] { var25};
    org.apache.commons.math.util.MathUtils.sortInPlace(var13, var28);
    double[] var32 = new double[] { 1.0d, 10.0d};
    double[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var38.getDirection();
    boolean var42 = org.apache.commons.math.util.MathUtils.checkOrder(var33, var39, false, true);
    boolean var45 = org.apache.commons.math.util.MathUtils.checkOrder(var13, var39, true, false);
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var13, 0);
    org.apache.commons.math.exception.util.Localizable var48 = null;
    org.apache.commons.math.exception.util.Localizable var49 = null;
    int[] var54 = new int[] { 1, 100, 0};
    int[] var55 = org.apache.commons.math.util.MathUtils.copyOf(var54);
    java.lang.Object[] var56 = new java.lang.Object[] { var54};
    org.apache.commons.math.exception.NotFiniteNumberException var57 = new org.apache.commons.math.exception.NotFiniteNumberException(var49, (java.lang.Number)10, var56);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var13, var48, var56);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var5, var9, var56);
    org.apache.commons.math.exception.NotFiniteNumberException var60 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)11901.05042145663d, var56);
    org.apache.commons.math.exception.util.ExceptionContext var61 = var60.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test272"); }


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
    org.apache.commons.math.complex.Complex var20 = var4.sinh();
    
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

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test273"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    int[] var3 = new int[] { (-1)};
    int[] var7 = new int[] { 1, 100, 0};
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    int var9 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var8);
    int[] var11 = new int[] { (-1)};
    int[] var15 = new int[] { 1, 100, 0};
    int[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    int var17 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var16);
    int var18 = org.apache.commons.math.util.MathUtils.distance1(var3, var11);
    java.lang.Object[] var19 = new java.lang.Object[] { var11};
    org.apache.commons.math.exception.MathIllegalArgumentException var20 = new org.apache.commons.math.exception.MathIllegalArgumentException(var1, var19);
    org.apache.commons.math.exception.NullArgumentException var21 = new org.apache.commons.math.exception.NullArgumentException(var0, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test274"); }


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
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var3, var11);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var3, 1010);
    org.apache.commons.math.exception.NumberIsTooSmallException var22 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var3, (java.lang.Number)1.5430806348152437d, false);
    org.apache.commons.math.exception.NumberIsTooLargeException var26 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(-1.0d), (java.lang.Number)99L, false);
    boolean var27 = var26.getBoundIsAllowed();
    java.lang.Number var28 = var26.getMax();
    var22.addSuppressed((java.lang.Throwable)var26);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 99L+ "'", var28.equals(99L));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test275"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.9800984424273023d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1464721939);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test276"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1125008633, 1010);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test277"); }


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
    org.apache.commons.math.util.MathUtils.checkOrder(var25);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var25);
    
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

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test278"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var10 = new double[] { 1.0d, 10.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var7, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 0.0d);
    double[] var18 = new double[] { 1.0d, 10.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var19, var22);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    boolean var30 = org.apache.commons.math.util.MathUtils.equals(var19, var28);
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test279"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(3.170153879722701d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11.88457549625186d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test280"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var41 = var35.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var42 = var32.add(var35);
    double var43 = var35.getImaginary();
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1.0d));

  }

  public void test281() {}
//   public void test281() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test281"); }
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
//     double[] var16 = new double[] { (-1.0d)};
//     double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 0.027339371326677953d);
//     double[] var21 = new double[] { 1.0d, 10.0d};
//     double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
//     double[] var25 = new double[] { 1.0d, 10.0d};
//     double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
//     double var27 = org.apache.commons.math.util.MathUtils.distance1(var22, var25);
//     boolean var28 = org.apache.commons.math.util.MathUtils.equals(var16, var22);
//     boolean var29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var8, var16);
//     double[] var31 = new double[] { (-1.0d)};
//     double[] var33 = org.apache.commons.math.util.MathUtils.normalizeArray(var31, 0.027339371326677953d);
//     double[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var31, 99);
//     double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var31);
//     double[] var39 = new double[] { 1.0d, 10.0d};
//     double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
//     double[] var43 = new double[] { 1.0d, 10.0d};
//     double[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var43);
//     double var45 = org.apache.commons.math.util.MathUtils.distance1(var40, var43);
//     int var46 = org.apache.commons.math.util.MathUtils.hash(var43);
//     double[] var49 = new double[] { 1.0d, 10.0d};
//     double[] var50 = org.apache.commons.math.util.MathUtils.copyOf(var49);
//     double[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var55 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var56 = var55.getDirection();
//     boolean var59 = org.apache.commons.math.util.MathUtils.checkOrder(var50, var56, false, true);
//     double[][] var60 = new double[][] { var50};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var43, var60);
//     double[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var43);
//     double[] var63 = org.apache.commons.math.util.MathUtils.copyOf(var62);
//     double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var62);
//     double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var31);
// 
//   }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test282"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(2.3097117106971785d, 786341969);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test283"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var6 = org.apache.commons.math.util.MathUtils.copyOf(var1, (-2));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test284"); }


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
    org.apache.commons.math.complex.Complex var21 = var19.sqrt1z();
    org.apache.commons.math.complex.Complex var22 = var19.tan();
    double var23 = var22.getArgument();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1.5434995020921998d));

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test285"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.acos();
    org.apache.commons.math.complex.Complex var9 = var7.multiply(0.02191423518768043d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test286"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1L), 1795512867667309078L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test287"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round((-0.11038096704629749d), (-1911350513), (-1778577355));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test288() {}
//   public void test288() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test288"); }
// 
// 
//     double[] var1 = new double[] { (-1.0d)};
//     double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
//     org.apache.commons.math.util.MathUtils.OrderDirection var4 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var3, var4, true);
//     org.apache.commons.math.util.MathUtils.checkFinite(var3);
//     double[] var10 = new double[] { 1.0d, 10.0d};
//     double[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var10);
//     double[] var14 = new double[] { 1.0d, 10.0d};
//     double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var14);
//     double var16 = org.apache.commons.math.util.MathUtils.distance1(var11, var14);
//     double[] var19 = new double[] { 1.0d, 10.0d};
//     double[] var20 = org.apache.commons.math.util.MathUtils.copyOf(var19);
//     double[] var23 = new double[] { 1.0d, 10.0d};
//     double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
//     double var25 = org.apache.commons.math.util.MathUtils.distance1(var20, var23);
//     double[][] var26 = new double[][] { var23};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var11, var26);
//     double[] var30 = new double[] { 1.0d, 10.0d};
//     double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var30);
//     double[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var37 = var36.getDirection();
//     boolean var40 = org.apache.commons.math.util.MathUtils.checkOrder(var31, var37, false, true);
//     boolean var43 = org.apache.commons.math.util.MathUtils.checkOrder(var11, var37, true, false);
//     boolean var44 = org.apache.commons.math.util.MathUtils.equals(var3, var11);
//     double[] var45 = null;
//     double var46 = org.apache.commons.math.util.MathUtils.distance1(var11, var45);
// 
//   }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test289"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round((-1.0d), (-769953791));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test290"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var2.sqrt();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt1z();
    org.apache.commons.math.complex.Complex var7 = var5.sinh();
    org.apache.commons.math.complex.Complex var8 = var7.sin();
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var13 = new org.apache.commons.math.exception.NumberIsTooSmallException(var9, (java.lang.Number)1.5430806348152437d, (java.lang.Number)0L, false);
    boolean var14 = var8.equals((java.lang.Object)1.5430806348152437d);
    org.apache.commons.math.complex.Complex var15 = var8.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = var8.log();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test291"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    double var33 = var31.getArgument();
    org.apache.commons.math.complex.Complex var34 = var31.cosh();
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-0.5573913107228545d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test292"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1911350603, 1686316699);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 607897427);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test293"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)3628800L, (java.lang.Number)(-332607061), false);
    boolean var5 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test294"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1118089300));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test295"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-90));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test296"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.sin();
    org.apache.commons.math.complex.Complex var7 = var2.acos();
    org.apache.commons.math.complex.Complex var8 = var7.atan();
    org.apache.commons.math.complex.Complex var10 = var7.multiply((-0.3359937911718539d));
    boolean var12 = var7.equals((java.lang.Object)(-1795512867667307991L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test297"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3.0055182757323147d, 1.5430806348152437d, (-1911350515));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test298"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(8.655154728221008E12d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test299"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    boolean var6 = var4.equals((java.lang.Object)(byte)0);
    org.apache.commons.math.complex.Complex var7 = var4.acos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test300"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var6 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var7 = var6.conjugate();
    org.apache.commons.math.complex.Complex var8 = var7.tanh();
    org.apache.commons.math.complex.Complex var11 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var12 = var11.conjugate();
    java.lang.Object var13 = null;
    boolean var14 = var11.equals(var13);
    org.apache.commons.math.complex.Complex var15 = var11.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = var7.divide(var11);
    org.apache.commons.math.complex.Complex var19 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var20 = var19.tanh();
    org.apache.commons.math.complex.Complex var21 = var19.exp();
    org.apache.commons.math.complex.Complex var22 = var16.subtract(var19);
    org.apache.commons.math.complex.Complex var23 = var19.exp();
    org.apache.commons.math.complex.Complex var24 = var23.exp();
    org.apache.commons.math.complex.Complex var25 = var2.pow(var23);
    org.apache.commons.math.complex.Complex var26 = var2.log();
    org.apache.commons.math.complex.Complex var27 = var26.asin();
    org.apache.commons.math.complex.Complex var28 = var27.cos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test301"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException((-611526330), 486708878);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test302"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var8 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)var5, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var5, 10L);
    org.apache.commons.math.exception.NotPositiveException var11 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)var5);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var17 = null;
    java.lang.Object[] var19 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var20 = new org.apache.commons.math.exception.MathArithmeticException(var17, var19);
    org.apache.commons.math.exception.NotFiniteNumberException var21 = new org.apache.commons.math.exception.NotFiniteNumberException(var15, (java.lang.Number)0.0d, var19);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)(byte)0, var14, var19);
    org.apache.commons.math.exception.NullArgumentException var23 = new org.apache.commons.math.exception.NullArgumentException(var12, var19);
    org.apache.commons.math.exception.NotFiniteNumberException var24 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)var5, var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test303"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8968222924860055d, (-0.3359937911718539d), (-1.5333870746439389d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test304"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(2007782533, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test305"); }


    org.apache.commons.math.util.MathUtils.checkFinite(0.09999966934482496d);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test306"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(0L, (-89L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test307"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, (-89L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8900L));

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test308"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 101);
    java.lang.Number var6 = null;
    java.math.BigInteger var7 = null;
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0L);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var9, 990L);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.math.BigInteger var13 = null;
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var13, 0L);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var20 = new org.apache.commons.math.exception.NumberIsTooSmallException(var12, (java.lang.Number)var17, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var17, 10L);
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var9, var17);
    org.apache.commons.math.exception.NumberIsTooLargeException var25 = new org.apache.commons.math.exception.NumberIsTooLargeException(var6, (java.lang.Number)var23, false);
    java.math.BigInteger var27 = org.apache.commons.math.util.MathUtils.pow(var23, 0L);
    java.math.BigInteger var28 = org.apache.commons.math.util.MathUtils.pow(var3, var23);
    org.apache.commons.math.exception.NumberIsTooLargeException var31 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)var23, (java.lang.Number)8.344492948298422E15d, true);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test309"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-9));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test310"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(1686316699);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test311"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1778577355), 607897427);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test312"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1785097455, (-1911350515));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test313"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    int var4 = var3.getIndex();
    java.lang.Number var5 = var3.getPrevious();
    org.apache.commons.math.exception.util.ExceptionContext var6 = var3.getContext();
    java.lang.Number var7 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0f+ "'", var5.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0f+ "'", var7.equals(1.0f));

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test314"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1686316699), 1280L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 915917825);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test315"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var10 = new org.apache.commons.math.exception.NumberIsTooSmallException(var2, (java.lang.Number)var7, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var7, 10L);
    org.apache.commons.math.exception.util.Localizable var13 = null;
    java.math.BigInteger var14 = null;
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var14, 0L);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var16, 990L);
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.util.Localizable var21 = null;
    java.lang.Object[] var23 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var24 = new org.apache.commons.math.exception.MathArithmeticException(var21, var23);
    org.apache.commons.math.exception.NotFiniteNumberException var25 = new org.apache.commons.math.exception.NotFiniteNumberException(var19, (java.lang.Number)0.0d, var23);
    org.apache.commons.math.exception.NotFiniteNumberException var26 = new org.apache.commons.math.exception.NotFiniteNumberException(var13, (java.lang.Number)990L, var23);
    org.apache.commons.math.exception.NotFiniteNumberException var27 = new org.apache.commons.math.exception.NotFiniteNumberException(var1, (java.lang.Number)var12, var23);
    org.apache.commons.math.exception.MathIllegalArgumentException var28 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test316"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.9800984424273023d, 0.9801980198019803d, 0.09966865249116202d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test317"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Float.NaN, 10.0f, (-198));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test318"); }


    float var2 = org.apache.commons.math.util.MathUtils.round((-0.0f), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test319"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm((-89L), 8868003302922989569L);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test320"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var2 = null;
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var4, 990L);
    org.apache.commons.math.exception.util.Localizable var7 = null;
    java.math.BigInteger var8 = null;
    java.math.BigInteger var10 = org.apache.commons.math.util.MathUtils.pow(var8, 0L);
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var15 = new org.apache.commons.math.exception.NumberIsTooSmallException(var7, (java.lang.Number)var12, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var12, 10L);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var4, var12);
    org.apache.commons.math.exception.NumberIsTooSmallException var20 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)3.2771640791509435d, (java.lang.Number)var12, true);
    boolean var21 = var20.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test321"); }


    org.apache.commons.math.util.MathUtils.checkFinite(0.39485088384753614d);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test322"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(638805172, (-1778577355));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test323"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)0, (java.lang.Number)(-0.0f), 0);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test324"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var6 = var5.log();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test325"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(5L, (-1088L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test326"); }


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
    org.apache.commons.math.complex.Complex var19 = var15.tan();
    
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

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test327"); }


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
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double var31 = org.apache.commons.math.util.MathUtils.distance1(var26, var29);
    double[] var34 = new double[] { 1.0d, 10.0d};
    double[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var34);
    double[] var38 = new double[] { 1.0d, 10.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    double var40 = org.apache.commons.math.util.MathUtils.distance1(var35, var38);
    double[][] var41 = new double[][] { var38};
    org.apache.commons.math.util.MathUtils.sortInPlace(var26, var41);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var46);
    org.apache.commons.math.exception.NonMonotonousSequenceException var51 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var52 = var51.getDirection();
    boolean var55 = org.apache.commons.math.util.MathUtils.checkOrder(var46, var52, false, true);
    boolean var58 = org.apache.commons.math.util.MathUtils.checkOrder(var26, var52, true, false);
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var26);
    double[] var63 = new double[] { 100.0d, 0.0d, (-1.0d)};
    org.apache.commons.math.exception.NonMonotonousSequenceException var70 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var71 = var70.getDirection();
    int var72 = var70.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var73 = var70.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var75 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var73, false);
    boolean var78 = org.apache.commons.math.util.MathUtils.checkOrder(var63, var73, false, false);
    boolean var81 = org.apache.commons.math.util.MathUtils.checkOrder(var26, var73, false, false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test328"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(3.170153879722701d, 1.9984630277548983d);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test329"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.9982726947086733d, 11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test330"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1911350603, (-90));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test331"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.cos();
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test332"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex((-0.09966865249116202d), 35853.36506461688d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test333"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0003737438906983d, 11013.232874703393d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test334"); }


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
    org.apache.commons.math.complex.Complex var21 = var19.sqrt1z();
    org.apache.commons.math.complex.Complex var22 = var19.cos();
    org.apache.commons.math.complex.Complex var23 = var19.atan();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test335"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-2.5469187218411187d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test336"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var7.tan();
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var8);
    
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

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test337"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.5573913107228545d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-222956394));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test338"); }


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
    org.apache.commons.math.exception.util.Localizable var19 = null;
    java.math.BigInteger var20 = null;
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var20, 0L);
    java.math.BigInteger var24 = org.apache.commons.math.util.MathUtils.pow(var22, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var27 = new org.apache.commons.math.exception.NumberIsTooSmallException(var19, (java.lang.Number)var24, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var29 = org.apache.commons.math.util.MathUtils.pow(var24, 10);
    java.lang.Object[] var30 = null;
    org.apache.commons.math.exception.NotFiniteNumberException var31 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)var24, var30);
    java.math.BigInteger var32 = org.apache.commons.math.util.MathUtils.pow(var3, var24);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test339"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(2L, 6891033258142775881L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6891033258142775883L);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test340"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1795512867667309079L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1795512867667309079L);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test341"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1904431168, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test342"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(2007782533);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test343"); }


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
    double var39 = var36.getImaginary();
    org.apache.commons.math.complex.Complex var40 = var36.conjugate();
    org.apache.commons.math.complex.Complex var43 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var44 = var43.asin();
    org.apache.commons.math.complex.Complex var45 = var36.multiply(var44);
    boolean var46 = var36.isNaN();
    
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
    assertTrue(var39 == (-0.19801980198019803d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test344"); }


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
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    org.apache.commons.math.util.MathUtils.checkFinite(var26);
    double[] var31 = new double[] { 100.0d, 0.0d, (-1.0d)};
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var38.getDirection();
    int var40 = var38.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var41 = var38.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var43 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var41, false);
    boolean var46 = org.apache.commons.math.util.MathUtils.checkOrder(var31, var41, false, false);
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var47);
    double[][] var49 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var47, var49);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test345"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt();
    org.apache.commons.math.complex.Complex var7 = var6.tan();
    double var8 = var6.abs();
    org.apache.commons.math.complex.Complex var9 = var6.log();
    double var10 = var6.getArgument();
    org.apache.commons.math.complex.Complex var11 = var6.conjugate();
    org.apache.commons.math.complex.Complex var12 = var6.cosh();
    
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
    assertTrue(var8 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.738774844045322d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test346"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    org.apache.commons.math.complex.Complex var4 = var3.tanh();
    org.apache.commons.math.complex.Complex var5 = var4.log();
    org.apache.commons.math.complex.Complex var7 = var5.multiply(1.1147826214457093d);
    org.apache.commons.math.complex.Complex var8 = var7.sqrt();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test347"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)9.947392708686547E-4d, (java.lang.Number)10.0d, false);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test348"); }


    double[] var1 = new double[] { (-1.0d)};
    double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.027339371326677953d);
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var3, var4, true);
    double[] var13 = new double[] { (-1.0d), (-1.0d), 100.0d};
    double[] var16 = new double[] { 1.0d, 10.0d};
    double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double[] var20 = new double[] { 1.0d, 10.0d};
    double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double var22 = org.apache.commons.math.util.MathUtils.distance1(var17, var20);
    double[] var25 = new double[] { 1.0d, 10.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double var31 = org.apache.commons.math.util.MathUtils.distance1(var26, var29);
    double[][] var32 = new double[][] { var29};
    org.apache.commons.math.util.MathUtils.sortInPlace(var17, var32);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var13, var17);
    double[] var37 = new double[] { 1.0d, 10.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
    double[] var41 = new double[] { 1.0d, 10.0d};
    double[] var42 = org.apache.commons.math.util.MathUtils.copyOf(var41);
    double var43 = org.apache.commons.math.util.MathUtils.distance1(var38, var41);
    double[] var46 = new double[] { 1.0d, 10.0d};
    double[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var46);
    double[] var50 = new double[] { 1.0d, 10.0d};
    double[] var51 = org.apache.commons.math.util.MathUtils.copyOf(var50);
    double var52 = org.apache.commons.math.util.MathUtils.distance1(var47, var50);
    double[][] var53 = new double[][] { var50};
    org.apache.commons.math.util.MathUtils.sortInPlace(var38, var53);
    double[] var57 = new double[] { 1.0d, 10.0d};
    double[] var58 = org.apache.commons.math.util.MathUtils.copyOf(var57);
    double[] var59 = org.apache.commons.math.util.MathUtils.copyOf(var58);
    org.apache.commons.math.exception.NonMonotonousSequenceException var63 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var64 = var63.getDirection();
    boolean var67 = org.apache.commons.math.util.MathUtils.checkOrder(var58, var64, false, true);
    boolean var70 = org.apache.commons.math.util.MathUtils.checkOrder(var38, var64, true, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var17, var64, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var74 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)101, (java.lang.Number)0L, 2, var64, false);
    boolean var77 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var64, false, true);
    double[] var80 = new double[] { 1.0d, 10.0d};
    double[] var81 = org.apache.commons.math.util.MathUtils.copyOf(var80);
    double[] var84 = new double[] { 1.0d, 10.0d};
    double[] var85 = org.apache.commons.math.util.MathUtils.copyOf(var84);
    double var86 = org.apache.commons.math.util.MathUtils.distance1(var81, var84);
    double[] var89 = new double[] { 1.0d, 10.0d};
    double[] var90 = org.apache.commons.math.util.MathUtils.copyOf(var89);
    double[] var91 = org.apache.commons.math.util.MathUtils.copyOf(var90);
    boolean var92 = org.apache.commons.math.util.MathUtils.equals(var81, var90);
    double[] var93 = org.apache.commons.math.util.MathUtils.copyOf(var90);
    org.apache.commons.math.util.MathUtils.checkOrder(var93);
    double var95 = org.apache.commons.math.util.MathUtils.distance1(var3, var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0.972660628673322d);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test349"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    int var4 = var3.getIndex();
    java.lang.Number var5 = var3.getPrevious();
    org.apache.commons.math.exception.util.ExceptionContext var6 = var3.getContext();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var3.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1.0f+ "'", var5.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test350"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt();
    org.apache.commons.math.complex.Complex var7 = var5.sqrt();
    org.apache.commons.math.complex.Complex var10 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var11 = var10.conjugate();
    java.lang.Object var12 = null;
    boolean var13 = var10.equals(var12);
    org.apache.commons.math.complex.Complex var14 = var10.acos();
    org.apache.commons.math.complex.Complex var15 = var14.sin();
    org.apache.commons.math.complex.Complex var16 = var15.asin();
    org.apache.commons.math.complex.Complex var17 = var7.subtract(var15);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test351"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (-224004970), 786341969);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test352"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.29755448666817674d, (-2.276056593552136d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.29755448666817674d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test353"); }


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
    boolean var19 = var18.isNaN();
    org.apache.commons.math.complex.Complex var20 = var18.asin();
    org.apache.commons.math.complex.Complex var21 = var9.divide(var18);
    org.apache.commons.math.complex.Complex var22 = var21.cos();
    org.apache.commons.math.complex.Complex var25 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var26 = var25.conjugate();
    org.apache.commons.math.complex.ComplexField var27 = var26.getField();
    org.apache.commons.math.complex.Complex var30 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var31 = var30.conjugate();
    java.lang.Object var32 = null;
    boolean var33 = var30.equals(var32);
    org.apache.commons.math.complex.Complex var34 = var30.sqrt1z();
    org.apache.commons.math.complex.Complex var37 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var38 = var37.conjugate();
    java.lang.Object var39 = null;
    boolean var40 = var37.equals(var39);
    org.apache.commons.math.complex.Complex var41 = var37.sqrt1z();
    org.apache.commons.math.complex.Complex var42 = var30.add(var37);
    org.apache.commons.math.complex.Complex var43 = var26.pow(var42);
    org.apache.commons.math.complex.Complex var44 = var42.sqrt1z();
    org.apache.commons.math.complex.Complex var45 = var22.subtract(var42);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test354"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1911350515), (-222956394));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2134306909));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test355"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1656171098), (-793020320));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test356"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2.0d, (java.lang.Number)(short)(-1), (-99), var3, false);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    int var7 = var5.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-99));

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test357"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(37.3535253695998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test358"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(915917825, (-1778577355));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test359"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(4.3611853051969955d, 1.5582781295114951d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.3611853051969955d);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test360"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.log();
    org.apache.commons.math.complex.Complex var7 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var8 = var7.conjugate();
    java.lang.Object var9 = null;
    boolean var10 = var7.equals(var9);
    org.apache.commons.math.complex.Complex var11 = var7.acos();
    org.apache.commons.math.complex.Complex var12 = var2.pow(var7);
    org.apache.commons.math.complex.Complex var13 = var7.acos();
    double var14 = var13.getReal();
    org.apache.commons.math.complex.Complex var15 = var13.sqrt1z();
    org.apache.commons.math.complex.Complex var16 = var13.conjugate();
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.10016239685295168d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test361"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1778577355));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test362"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var15 = new double[] { 1.0d, 10.0d};
    double[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var15);
    double[][] var18 = new double[][] { var15};
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var18);
    double[] var22 = new double[] { 1.0d, 10.0d};
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var22);
    double[] var24 = org.apache.commons.math.util.MathUtils.copyOf(var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var28.getDirection();
    boolean var32 = org.apache.commons.math.util.MathUtils.checkOrder(var23, var29, false, true);
    boolean var35 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var29, true, false);
    double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    org.apache.commons.math.exception.util.Localizable var38 = null;
    org.apache.commons.math.exception.util.Localizable var39 = null;
    int[] var44 = new int[] { 1, 100, 0};
    int[] var45 = org.apache.commons.math.util.MathUtils.copyOf(var44);
    java.lang.Object[] var46 = new java.lang.Object[] { var44};
    org.apache.commons.math.exception.NotFiniteNumberException var47 = new org.apache.commons.math.exception.NotFiniteNumberException(var39, (java.lang.Number)10, var46);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var3, var38, var46);
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 8.655154728220008E12d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var50, 224004970);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test363"); }
// 
// 
//     double[] var2 = new double[] { 1.0d, 10.0d};
//     double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
//     double[] var6 = new double[] { 1.0d, 10.0d};
//     double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
//     double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
//     double[] var11 = new double[] { 1.0d, 10.0d};
//     double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
//     double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     boolean var14 = org.apache.commons.math.util.MathUtils.equals(var3, var12);
//     double[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var22 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     boolean var23 = var22.getStrict();
//     int var24 = var22.getIndex();
//     org.apache.commons.math.util.MathUtils.OrderDirection var25 = var22.getDirection();
//     org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2, (java.lang.Number)3.7168146928204138d, 0, var25, true);
//     org.apache.commons.math.util.MathUtils.OrderDirection var28 = var27.getDirection();
//     org.apache.commons.math.util.MathUtils.checkOrder(var12, var28, false);
//     double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var12);
//     double[] var35 = new double[] { 1.0d, 1.0d, (-1.0d)};
//     double var36 = org.apache.commons.math.util.MathUtils.distance(var12, var35);
//     double[] var37 = null;
//     double var38 = org.apache.commons.math.util.MathUtils.distance1(var12, var37);
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test364"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test365"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(2L, (-989L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test366"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1795512867667309179L), 1656171100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3099108638587928815L));

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test367"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 990L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    double[] var13 = new double[] { 1.0d, 10.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var13);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double var23 = org.apache.commons.math.util.MathUtils.distance1(var18, var21);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var14, var18);
    org.apache.commons.math.exception.NonMonotonousSequenceException var31 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var32 = var31.getDirection();
    int var33 = var31.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var31.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)(-1911350515), 1, var34, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var37 = var36.getDirection();
    boolean var40 = org.apache.commons.math.util.MathUtils.checkOrder(var18, var37, false, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var42 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.0d, (java.lang.Number)var7, 10, var37, false);
    java.math.BigInteger var43 = null;
    java.math.BigInteger var45 = org.apache.commons.math.util.MathUtils.pow(var43, 0L);
    java.math.BigInteger var47 = org.apache.commons.math.util.MathUtils.pow(var45, 990L);
    org.apache.commons.math.exception.util.Localizable var48 = null;
    java.math.BigInteger var49 = null;
    java.math.BigInteger var51 = org.apache.commons.math.util.MathUtils.pow(var49, 0L);
    java.math.BigInteger var53 = org.apache.commons.math.util.MathUtils.pow(var51, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var56 = new org.apache.commons.math.exception.NumberIsTooSmallException(var48, (java.lang.Number)var53, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var58 = org.apache.commons.math.util.MathUtils.pow(var53, 10L);
    java.math.BigInteger var59 = org.apache.commons.math.util.MathUtils.pow(var45, var53);
    org.apache.commons.math.exception.util.Localizable var60 = null;
    java.math.BigInteger var61 = null;
    java.math.BigInteger var63 = org.apache.commons.math.util.MathUtils.pow(var61, 0L);
    java.math.BigInteger var65 = org.apache.commons.math.util.MathUtils.pow(var63, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var68 = new org.apache.commons.math.exception.NumberIsTooSmallException(var60, (java.lang.Number)var65, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var70 = org.apache.commons.math.util.MathUtils.pow(var65, 10L);
    java.math.BigInteger var71 = org.apache.commons.math.util.MathUtils.pow(var53, var70);
    java.math.BigInteger var72 = org.apache.commons.math.util.MathUtils.pow(var7, var71);
    org.apache.commons.math.exception.NumberIsTooSmallException var74 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)(short)0, (java.lang.Number)var7, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test368"); }


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
    boolean var19 = var18.isNaN();
    org.apache.commons.math.complex.Complex var20 = var18.asin();
    org.apache.commons.math.complex.Complex var21 = var9.divide(var18);
    double var22 = var9.getArgument();
    double var23 = var9.getImaginary();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-0.09966865249116202d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1.0d));

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test369"); }


    java.lang.Number var0 = null;
    java.math.BigInteger var1 = null;
    java.math.BigInteger var3 = org.apache.commons.math.util.MathUtils.pow(var1, 0L);
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 990L);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.math.BigInteger var7 = null;
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0L);
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var9, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var14 = new org.apache.commons.math.exception.NumberIsTooSmallException(var6, (java.lang.Number)var11, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var16 = org.apache.commons.math.util.MathUtils.pow(var11, 10L);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var3, var11);
    org.apache.commons.math.exception.NumberIsTooLargeException var19 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)var17, false);
    java.math.BigInteger var21 = org.apache.commons.math.util.MathUtils.pow(var17, 0L);
    java.math.BigInteger var23 = org.apache.commons.math.util.MathUtils.pow(var17, 2);
    org.apache.commons.math.exception.NotPositiveException var24 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)var23);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test370"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-30145600));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test371"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    java.lang.Object var4 = null;
    boolean var5 = var2.equals(var4);
    org.apache.commons.math.complex.Complex var6 = var2.acos();
    org.apache.commons.math.complex.Complex var7 = var6.sin();
    org.apache.commons.math.complex.ComplexField var8 = var6.getField();
    org.apache.commons.math.exception.util.Localizable var9 = null;
    org.apache.commons.math.exception.util.Localizable var10 = null;
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.lang.Object[] var14 = new java.lang.Object[] { 100.0d};
    org.apache.commons.math.exception.MathArithmeticException var15 = new org.apache.commons.math.exception.MathArithmeticException(var12, var14);
    org.apache.commons.math.exception.MathIllegalArgumentException var16 = new org.apache.commons.math.exception.MathIllegalArgumentException(var11, var14);
    org.apache.commons.math.exception.NullArgumentException var17 = new org.apache.commons.math.exception.NullArgumentException(var10, var14);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var8, var9, var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test372"); }


    double[] var2 = new double[] { 1.0d, 10.0d};
    double[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    double[] var6 = new double[] { 1.0d, 10.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double var8 = org.apache.commons.math.util.MathUtils.distance1(var3, var6);
    double[] var11 = new double[] { 1.0d, 10.0d};
    double[] var12 = org.apache.commons.math.util.MathUtils.copyOf(var11);
    double[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var12);
    boolean var14 = org.apache.commons.math.util.MathUtils.equals(var3, var12);
    double[] var17 = new double[] { 1.0d, 10.0d};
    double[] var18 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    double[] var21 = new double[] { 1.0d, 10.0d};
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var21);
    double var23 = org.apache.commons.math.util.MathUtils.distance1(var18, var21);
    int var24 = org.apache.commons.math.util.MathUtils.hash(var21);
    double[] var27 = new double[] { 1.0d, 10.0d};
    double[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var27);
    double[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    org.apache.commons.math.exception.NonMonotonousSequenceException var33 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var33.getDirection();
    boolean var37 = org.apache.commons.math.util.MathUtils.checkOrder(var28, var34, false, true);
    double[][] var38 = new double[][] { var28};
    org.apache.commons.math.util.MathUtils.sortInPlace(var21, var38);
    org.apache.commons.math.util.MathUtils.sortInPlace(var3, var38);
    org.apache.commons.math.exception.util.Localizable var42 = null;
    java.math.BigInteger var43 = null;
    java.math.BigInteger var45 = org.apache.commons.math.util.MathUtils.pow(var43, 0L);
    java.math.BigInteger var47 = org.apache.commons.math.util.MathUtils.pow(var45, 990L);
    org.apache.commons.math.exception.NumberIsTooSmallException var50 = new org.apache.commons.math.exception.NumberIsTooSmallException(var42, (java.lang.Number)var47, (java.lang.Number)30.48232336227865d, false);
    java.math.BigInteger var52 = org.apache.commons.math.util.MathUtils.pow(var47, 10);
    double[] var56 = new double[] { 1.0d, 10.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.copyOf(var56);
    double[] var60 = new double[] { 1.0d, 10.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double var62 = org.apache.commons.math.util.MathUtils.distance1(var57, var60);
    double[] var65 = new double[] { 1.0d, 10.0d};
    double[] var66 = org.apache.commons.math.util.MathUtils.copyOf(var65);
    double[] var69 = new double[] { 1.0d, 10.0d};
    double[] var70 = org.apache.commons.math.util.MathUtils.copyOf(var69);
    double var71 = org.apache.commons.math.util.MathUtils.distance1(var66, var69);
    double[][] var72 = new double[][] { var69};
    org.apache.commons.math.util.MathUtils.sortInPlace(var57, var72);
    double[] var76 = new double[] { 1.0d, 10.0d};
    double[] var77 = org.apache.commons.math.util.MathUtils.copyOf(var76);
    double[] var78 = org.apache.commons.math.util.MathUtils.copyOf(var77);
    org.apache.commons.math.exception.NonMonotonousSequenceException var82 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var83 = var82.getDirection();
    boolean var86 = org.apache.commons.math.util.MathUtils.checkOrder(var77, var83, false, true);
    boolean var89 = org.apache.commons.math.util.MathUtils.checkOrder(var57, var83, true, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var91 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)var52, 10, var83, false);
    boolean var94 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var83, false, false);
    double[] var96 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, (-0.5573913107228545d));
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test373"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-611526330), (-1911350513));

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test374"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round((-467.5220833456485d), (-1), 786341970);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test375"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    boolean var4 = var3.isNaN();
    org.apache.commons.math.complex.Complex var5 = var3.asin();
    double var6 = var5.getArgument();
    org.apache.commons.math.complex.Complex var7 = var5.exp();
    org.apache.commons.math.complex.Complex var8 = var5.negate();
    org.apache.commons.math.complex.Complex var9 = var8.log();
    org.apache.commons.math.complex.Complex var10 = var9.tanh();
    org.apache.commons.math.complex.Complex var11 = var10.exp();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test376"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.tanh();
    org.apache.commons.math.complex.Complex var4 = var2.exp();
    org.apache.commons.math.complex.Complex var5 = var4.acos();
    org.apache.commons.math.complex.Complex var6 = var5.sqrt();
    org.apache.commons.math.complex.Complex var7 = var6.tan();
    boolean var9 = var7.equals((java.lang.Object)(-1482551015));
    
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
    assertTrue(var9 == false);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test377"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(1125008633, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test378"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.19933730498232405d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.20066005354480254d);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test379"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-793020320), 1280L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test380"); }


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
    double var21 = var19.getArgument();
    org.apache.commons.math.complex.Complex var24 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var25 = var24.conjugate();
    java.lang.Object var26 = null;
    boolean var27 = var24.equals(var26);
    org.apache.commons.math.complex.Complex var28 = var24.acos();
    org.apache.commons.math.complex.Complex var29 = var24.asin();
    org.apache.commons.math.complex.Complex var30 = var19.multiply(var29);
    org.apache.commons.math.complex.Complex var31 = var29.sqrt();
    org.apache.commons.math.complex.Complex var32 = var31.negate();
    org.apache.commons.math.complex.Complex var35 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var36 = var35.conjugate();
    java.lang.Object var37 = null;
    boolean var38 = var35.equals(var37);
    org.apache.commons.math.complex.Complex var39 = var35.sqrt1z();
    org.apache.commons.math.complex.Complex var41 = var35.multiply((-1.0d));
    org.apache.commons.math.complex.Complex var42 = var32.add(var35);
    org.apache.commons.math.complex.Complex var43 = var32.acos();
    org.apache.commons.math.complex.Complex var46 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var47 = var46.tanh();
    org.apache.commons.math.complex.Complex var48 = var46.exp();
    org.apache.commons.math.complex.Complex var49 = var48.acos();
    org.apache.commons.math.complex.Complex var50 = var49.sqrt();
    org.apache.commons.math.complex.Complex var51 = var50.tan();
    double var52 = var50.abs();
    org.apache.commons.math.complex.Complex var53 = var50.log();
    org.apache.commons.math.complex.Complex var54 = var43.add(var53);
    org.apache.commons.math.complex.Complex var55 = var43.cosh();
    org.apache.commons.math.complex.Complex var56 = var55.sqrt();
    
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
    assertTrue(var21 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 3.2771640791509435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test381() {}
//   public void test381() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest2.test381"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.util.Localizable var2 = null;
//     java.math.BigInteger var3 = null;
//     java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
//     java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 990L);
//     org.apache.commons.math.exception.NumberIsTooSmallException var10 = new org.apache.commons.math.exception.NumberIsTooSmallException(var2, (java.lang.Number)var7, (java.lang.Number)30.48232336227865d, false);
//     java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var7, 10);
//     double[] var16 = new double[] { 1.0d, 10.0d};
//     double[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
//     double[] var20 = new double[] { 1.0d, 10.0d};
//     double[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var20);
//     double var22 = org.apache.commons.math.util.MathUtils.distance1(var17, var20);
//     double[] var25 = new double[] { 1.0d, 10.0d};
//     double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
//     double[] var29 = new double[] { 1.0d, 10.0d};
//     double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
//     double var31 = org.apache.commons.math.util.MathUtils.distance1(var26, var29);
//     double[][] var32 = new double[][] { var29};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var17, var32);
//     double[] var36 = new double[] { 1.0d, 10.0d};
//     double[] var37 = org.apache.commons.math.util.MathUtils.copyOf(var36);
//     double[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var37);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var42 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)1.0f, 0);
//     org.apache.commons.math.util.MathUtils.OrderDirection var43 = var42.getDirection();
//     boolean var46 = org.apache.commons.math.util.MathUtils.checkOrder(var37, var43, false, true);
//     boolean var49 = org.apache.commons.math.util.MathUtils.checkOrder(var17, var43, true, false);
//     org.apache.commons.math.exception.NonMonotonousSequenceException var51 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)var12, 10, var43, false);
//     java.lang.Number var52 = null;
//     org.apache.commons.math.exception.NumberIsTooSmallException var54 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)var12, var52, false);
//     org.apache.commons.math.exception.NotPositiveException var55 = new org.apache.commons.math.exception.NotPositiveException(var0, var52);
//     java.lang.String var56 = var55.toString();
// 
//   }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test382"); }


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
    double[] var25 = org.apache.commons.math.util.MathUtils.copyOf(var6);
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var25);
    double[] var29 = new double[] { 1.0d, 10.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    double[] var33 = new double[] { 1.0d, 10.0d};
    double[] var34 = org.apache.commons.math.util.MathUtils.copyOf(var33);
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var30, var33);
    double[] var38 = new double[] { 1.0d, 10.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    double[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var39);
    boolean var41 = org.apache.commons.math.util.MathUtils.equals(var30, var39);
    double var42 = org.apache.commons.math.util.MathUtils.distance(var26, var39);
    double[] var45 = new double[] { 1.0d, 10.0d};
    double[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var45);
    int var47 = org.apache.commons.math.util.MathUtils.hash(var45);
    int var48 = org.apache.commons.math.util.MathUtils.hash(var45);
    boolean var49 = org.apache.commons.math.util.MathUtils.equals(var26, var45);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-30145599));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test383"); }


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
    int[] var47 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    int[] var49 = org.apache.commons.math.util.MathUtils.copyOf(var43, 10);
    int[] var50 = org.apache.commons.math.util.MathUtils.copyOf(var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var52 = org.apache.commons.math.util.MathUtils.copyOf(var50, 786341970);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test384"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1074790369));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test385"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), (-1.0f), (-2134306909));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest2.test386"); }


    org.apache.commons.math.complex.Complex var2 = new org.apache.commons.math.complex.Complex(10.0d, (-1.0d));
    org.apache.commons.math.complex.Complex var3 = var2.conjugate();
    bo