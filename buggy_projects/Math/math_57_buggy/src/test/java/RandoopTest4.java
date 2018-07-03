
import junit.framework.*;

public class RandoopTest4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test1"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)0.0f, (-1), var3, false);
    java.lang.Number var6 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.0f+ "'", var6.equals(0.0f));

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test2"); }


    float var2 = org.apache.commons.math.util.FastMath.min(9.999999f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 9.999999f);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test3"); }


    java.lang.Number var0 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)107, (-1));

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test4"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)10L, (java.lang.Number)10.000001f, false);
    java.lang.Number var5 = var4.getMax();
    java.lang.Number var6 = var4.getMax();
    java.lang.Number var7 = var4.getMax();
    boolean var8 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.000001f+ "'", var5.equals(10.000001f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10.000001f+ "'", var6.equals(10.000001f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 10.000001f+ "'", var7.equals(10.000001f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test5"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var9 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var11 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 1.0d);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var11);
    double var13 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double[] var21 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 1.5707963267948966d);
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var19);
    double[] var23 = org.apache.commons.math.util.MathUtils.copyOf(var19);
    
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
    assertTrue(var13 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test6"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var2, var5);
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var6, 629500L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test7"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(0, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test8"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-2105540607), (-2105526838));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test9"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.9936116249145202d, 2.1609159195357108E-7d, 4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test10"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    
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

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test11"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.4E-45f, 10.000002f, 1072694209);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test12"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.701082578185993d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.193736479124303d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test13"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, (-274));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 274);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test14"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.45185512475708767d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7673610253912767d));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test15"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test16"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test17"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(2.718281828459045d, (-51));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.2071596293501608E-15d);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test18"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(9.536744E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536745E-7f);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test19"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)(short)(-1), (java.lang.Number)1.3132616875182228d, false);
    boolean var4 = var3.getBoundIsAllowed();
    boolean var5 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test20"); }


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
    org.apache.commons.math.exception.util.Localizable var61 = null;
    org.apache.commons.math.exception.util.Localizable var62 = null;
    java.lang.Number var63 = null;
    org.apache.commons.math.exception.util.Localizable var64 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var68 = new org.apache.commons.math.exception.NumberIsTooSmallException(var64, (java.lang.Number)11, (java.lang.Number)12, false);
    org.apache.commons.math.exception.util.Localizable var69 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var74 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var76 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var74, true);
    org.apache.commons.math.exception.util.Localizable var77 = null;
    java.lang.Object[] var79 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var80 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var76, var77, var79);
    org.apache.commons.math.exception.NotFiniteNumberException var81 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)1.0d, var79);
    var68.addMessage(var69, var79);
    org.apache.commons.math.exception.NotFiniteNumberException var83 = new org.apache.commons.math.exception.NotFiniteNumberException(var62, var63, var79);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var57, var61, var79);
    
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
    assertNotNull(var79);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test21"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(0.8996379399296266d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test22"); }


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
    int var33 = org.apache.commons.math.util.MathUtils.hash(var25);
    
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
    assertTrue(var33 == (-2114948001));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test23"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)(-1), (java.lang.Number)1.5707963267948966d, 1072694209);
    int var4 = var3.getIndex();
    java.lang.Object var6 = var3.getContext("(10,1)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test24"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(9.999999f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test25"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(7.629395E-6f, 2.0000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.629395E-6f);

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test26"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     java.lang.Number var3 = null;
//     org.apache.commons.math.exception.NumberIsTooSmallException var5 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)10, var3, false);
//     java.lang.String var6 = var5.toString();
//     java.lang.Object var8 = var5.getContext("org.apache.commons.math.exception.MathRuntimeException: ");
//     java.util.Set var9 = var5.getContextKeys();
//     java.util.List var12 = var1.cluster((java.util.Collection)var9, (-1), 0);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test27"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.017874927409903d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test28"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(629500L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 629500L);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test29"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(9.425947759839365E159d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test30"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var3, true);
    java.lang.Number var6 = var5.getArgument();
    int var7 = var5.getIndex();
    java.lang.Number var8 = var5.getPrevious();
    java.lang.Number var10 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var12 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)100, var10, false);
    boolean var13 = var12.getBoundIsAllowed();
    org.apache.commons.math.exception.util.Localizable var14 = null;
    var12.addMessage(var14);
    var5.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var17 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)10+ "'", var6.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 101+ "'", var8.equals(101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 100 and 101 are not strictly decreasing (101 <= 10)"+ "'", var17.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 100 and 101 are not strictly decreasing (101 <= 10)"));

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test31"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.0f, 7.629395E-6f, 100.000015f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test32"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.8065537826828393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6676847682009469d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test33"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1089072938814656167L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1089072938814656167L));

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test34"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.4210854715201997E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715201997E-14d);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test35"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(3.221096745241321d, 1000428124, 0);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test36"); }


    java.lang.Number var1 = null;
    java.lang.Number var4 = null;
    java.lang.Number var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var7, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.8184464592320668d, var4, 3, var10, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)3.2552223130233284d, var1, (-220), var13, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test37"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var8 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var6, true);
    org.apache.commons.math.exception.util.Localizable var9 = null;
    java.lang.Object[] var11 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var12 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var8, var9, var11);
    org.apache.commons.math.exception.MathIllegalArgumentException var13 = new org.apache.commons.math.exception.MathIllegalArgumentException(var2, var11);
    org.apache.commons.math.exception.NullArgumentException var14 = new org.apache.commons.math.exception.NullArgumentException(var1, var11);
    org.apache.commons.math.exception.MathIllegalArgumentException var15 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test38"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-51), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5100);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test39"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-34.06321903142893d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8803009413870497d));

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test40"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-4.155521474243959d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test41"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 1799.791983257381d, 112197732);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test42"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(2.0f, 10.000002f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0f);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test43"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(2.8741923671176875E13d, 0.6085980977425465d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.8741923671176875E13d);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test44"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.9910701224138282d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1614683465100502d);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test45"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(9.536744E-7f, (-43), (-1320904712));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test46"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(2003764205206896640L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2003764205206896640L);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test47"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.192093E-7f);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test48"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(201);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test49"); }


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
    float[] var21 = null;
    boolean var22 = org.apache.commons.math.util.MathUtils.equals(var0, var21);
    float[] var23 = new float[] { };
    float[] var25 = new float[] { 100.0f};
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var23, var25);
    float[] var27 = new float[] { };
    float[] var29 = new float[] { 100.0f};
    boolean var30 = org.apache.commons.math.util.MathUtils.equals(var27, var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var27);
    float[] var32 = new float[] { };
    float[] var34 = new float[] { 100.0f};
    boolean var35 = org.apache.commons.math.util.MathUtils.equals(var32, var34);
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var32);
    boolean var37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var32);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test50"); }


    double[] var2 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    org.apache.commons.math.util.MathUtils.checkOrder(var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var2);
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = null;
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    java.lang.Number var23 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var25 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var23, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var26 = var25.getDirection();
    double[] var30 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 1.0d);
    double[] var36 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0d);
    double var39 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var38);
    double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, (-2.5049299045672764d));
    double[] var45 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 1.0d);
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var47, 1.5707963267948966d);
    double[] var53 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var55 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 1.0d);
    double[] var59 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 1.0d);
    double var62 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var61);
    double var63 = org.apache.commons.math.util.MathUtils.distance(var47, var61);
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var61);
    double[] var68 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var70 = org.apache.commons.math.util.MathUtils.normalizeArray(var68, 1.0d);
    double[] var72 = org.apache.commons.math.util.MathUtils.normalizeArray(var68, 0.8414709848078965d);
    boolean var73 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var61, var68);
    double var74 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var61);
    double[][] var75 = new double[][] { var38};
    org.apache.commons.math.util.MathUtils.sortInPlace(var19, var26, var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var2, var7, var75);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1072694209);
    
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
    assertTrue(var21 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test51() {}
//   public void test51() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test51"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(5.308341213899707d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test52"); }


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
    double[] var36 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0d);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 1.5707963267948966d);
    double[] var42 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 1.0038848218538872d);
    double[] var46 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.normalizeArray(var46, 1.0d);
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 1.5707963267948966d);
    double[] var54 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var56 = org.apache.commons.math.util.MathUtils.normalizeArray(var54, 1.0d);
    double[] var60 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 1.0d);
    double var63 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var62);
    double var64 = org.apache.commons.math.util.MathUtils.distance(var48, var62);
    boolean var65 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var48);
    double var66 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var48);
    double[] var68 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 1.7629553409215413d);
    double[] var72 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var74 = org.apache.commons.math.util.MathUtils.normalizeArray(var72, 1.0d);
    double[] var78 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var80 = org.apache.commons.math.util.MathUtils.normalizeArray(var78, 1.0d);
    double var81 = org.apache.commons.math.util.MathUtils.distanceInf(var74, var80);
    double[] var83 = org.apache.commons.math.util.MathUtils.normalizeArray(var80, (-2.5049299045672764d));
    double[] var84 = org.apache.commons.math.util.MathUtils.copyOf(var83);
    boolean var85 = org.apache.commons.math.util.MathUtils.equals(var68, var84);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test53"); }


    float var1 = org.apache.commons.math.util.FastMath.signum((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test54"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-2105540607));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test55"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(720L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test56"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (-1048987));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1048987));

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test57"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-34.06321903142893d), 5.551115123125783E-17d, 2.0577631898027287d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test58"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(7.6293945E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.6293945E-6f);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test59"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.0d);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test60"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-1.6490605123312343d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.2747020414175934d));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test61"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.9886482387824493d, 1.5507151845940985d, 1388863237);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test62"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(3.2552223130233284d, 105.30122608279086d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 103.7861872278967d);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test63"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(103.7861872278967d, 18, 137);
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test64"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1920929E-7f);

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test65"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)11013.232874703393d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test66"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    org.apache.commons.math.stat.clustering.Cluster var4 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var3);
    boolean var6 = var3.equals((java.lang.Object)0.8071997601754675d);
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.exception.util.Localizable var8 = null;
    org.apache.commons.math.exception.NullArgumentException var9 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var10 = new org.apache.commons.math.exception.NullArgumentException();
    var9.addSuppressed((java.lang.Throwable)var10);
    org.apache.commons.math.exception.util.Localizable var12 = null;
    java.lang.Object[] var14 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var15 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var9, var12, var14);
    org.apache.commons.math.exception.NullArgumentException var16 = new org.apache.commons.math.exception.NullArgumentException(var8, var14);
    org.apache.commons.math.exception.ConvergenceException var17 = new org.apache.commons.math.exception.ConvergenceException(var7, var14);
    boolean var18 = var3.equals((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test67"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1079574528, (java.lang.Number)(byte)1, (-127), var3, false);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    var5.addMessage(var6);
    org.apache.commons.math.exception.util.Localizable var8 = null;
    java.lang.Object[] var9 = null;
    org.apache.commons.math.exception.MathIllegalStateException var10 = new org.apache.commons.math.exception.MathIllegalStateException(var8, var9);
    var5.addSuppressed((java.lang.Throwable)var10);
    boolean var12 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test68"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.21837132547595003d, (-2105540607), (-528621567));
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test69"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-2113899425));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2113899425);

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test70"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1650129271, (-1784634600));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test71"); }


    double var2 = org.apache.commons.math.util.FastMath.min(4.810477380965351d, 4.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.0d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test72"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(3080657310641694895L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test73"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(21.245416809709567d, 0.0d, 1024);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test74"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(411, 1249902593);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test75"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1089072938814555167L), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5238411258106940097L);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test76"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232874703393d, 0.048806645320670736d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 11013.232874703392d);

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test77"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(7.6293945E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-17));

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test78"); }


    double[] var5 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var5);
    org.apache.commons.math.util.MathUtils.checkOrder(var5);
    int var8 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var11 = new double[] { 0.0d, 1.0d};
    double var12 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    org.apache.commons.math.util.MathUtils.checkOrder(var11);
    java.lang.Number var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var18, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = var20.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var23 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var21, false);
    boolean var26 = org.apache.commons.math.util.MathUtils.checkOrder(var11, var21, true, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var5, var21, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-2114948138), (java.lang.Number)(-1048576), 1249902593, var21, true);
    java.lang.Number var31 = var30.getPrevious();
    java.lang.Number var32 = var30.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (-1048576)+ "'", var31.equals((-1048576)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + (-2114948138)+ "'", var32.equals((-2114948138)));

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test79"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(2003764205206896640L, 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test80"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 101);
    int[] var14 = new int[] { 0, 1, 1};
    double var15 = org.apache.commons.math.util.MathUtils.distance(var1, var14);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var16 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var14);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var17 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var14);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100.0d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test81"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(2146959360, 13716);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2146945644);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test82"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test83"); }


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
    int[] var31 = new int[] { 100};
    int[] var35 = new int[] { (-1), 1, 1};
    int var36 = org.apache.commons.math.util.MathUtils.distance1(var31, var35);
    int[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var31, 10);
    int[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var31, 101);
    int[] var44 = new int[] { 0, 1, 1};
    double var45 = org.apache.commons.math.util.MathUtils.distance(var31, var44);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var46 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var44);
    int[] var48 = new int[] { 100};
    int[] var52 = new int[] { (-1), 1, 1};
    int var53 = org.apache.commons.math.util.MathUtils.distance1(var48, var52);
    int[] var54 = org.apache.commons.math.util.MathUtils.copyOf(var52);
    int[] var56 = new int[] { 100};
    int[] var60 = new int[] { (-1), 1, 1};
    int var61 = org.apache.commons.math.util.MathUtils.distance1(var56, var60);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var62 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var60);
    double var63 = org.apache.commons.math.util.MathUtils.distance(var54, var60);
    int[] var64 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    int var65 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var64);
    int var66 = org.apache.commons.math.util.MathUtils.distance1(var28, var44);
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 10);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test84"); }


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
    double[] var42 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var44 = org.apache.commons.math.util.MathUtils.normalizeArray(var42, 1.0d);
    double var45 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var44);
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var44, (-2.5049299045672764d));
    int var48 = org.apache.commons.math.util.MathUtils.hash(var44);
    double[] var52 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 1.0d);
    double[] var58 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var60 = org.apache.commons.math.util.MathUtils.normalizeArray(var58, 1.0d);
    double var61 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var60);
    double[] var63 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, (-2.5049299045672764d));
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
    double[] var90 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var92 = org.apache.commons.math.util.MathUtils.normalizeArray(var90, 1.0d);
    double[] var94 = org.apache.commons.math.util.MathUtils.normalizeArray(var90, 0.8414709848078965d);
    boolean var95 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var83, var90);
    double var96 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var83);
    double var97 = org.apache.commons.math.util.MathUtils.distance(var44, var60);
    double[] var98 = org.apache.commons.math.util.MathUtils.copyOf(var60);
    double var99 = org.apache.commons.math.util.MathUtils.distance1(var7, var98);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-2114948001));
    
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
    assertNotNull(var63);
    
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
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == 1.7123889803846897d);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test85"); }


    float var2 = org.apache.commons.math.util.FastMath.max(100.0f, 7.629395E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test86"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(100.000015f, 2.0000002f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test87"); }


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
    org.apache.commons.math.stat.clustering.Clusterable var30 = var4.getCenter();
    org.apache.commons.math.stat.clustering.Clusterable var31 = var4.getCenter();
    java.util.List var32 = var4.getPoints();
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test88"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.9910701224138282d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8750450924606372d);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test89"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(990L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 980L);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test90"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1L), 980L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test91"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.7632208604112913d, 1.4711276743037347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test92"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-3.9550650838264265d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9992662556790163d));

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test93"); }


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
    int[] var32 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var33 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var32);
    boolean var35 = var33.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var36 = new float[] { };
    float[] var38 = new float[] { 100.0f};
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var36, var38);
    boolean var40 = var33.equals((java.lang.Object)var38);
    int[] var43 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var44 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var43);
    boolean var46 = var44.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var47 = new float[] { };
    float[] var49 = new float[] { 100.0f};
    boolean var50 = org.apache.commons.math.util.MathUtils.equals(var47, var49);
    boolean var51 = var44.equals((java.lang.Object)var49);
    double var52 = var33.distanceFrom(var44);
    var4.addPoint((org.apache.commons.math.stat.clustering.Clusterable)var33);
    int[] var55 = new int[] { 100};
    int[] var59 = new int[] { (-1), 1, 1};
    int var60 = org.apache.commons.math.util.MathUtils.distance1(var55, var59);
    int[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var59);
    int[] var62 = org.apache.commons.math.util.MathUtils.copyOf(var59);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var63 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var62);
    var4.addPoint((org.apache.commons.math.stat.clustering.Clusterable)var63);
    org.apache.commons.math.util.MathUtils.OrderDirection var68 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var70 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var68, true);
    org.apache.commons.math.exception.util.Localizable var71 = null;
    java.lang.Object[] var73 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var74 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var70, var71, var73);
    var70.setContext("hi!", (java.lang.Object)1.4E-45f);
    org.apache.commons.math.exception.util.Localizable var78 = null;
    var70.addMessage(var78);
    boolean var80 = var63.equals((java.lang.Object)var70);
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test94"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (-1048987));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test95"); }
// 
// 
//     int[] var1 = new int[] { 100};
//     int[] var5 = new int[] { (-1), 1, 1};
//     int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
//     int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var1);
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var8 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var1);
//     int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var1);
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var10 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var1);
//     int[] var13 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var14 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var13);
//     java.lang.String var15 = var14.toString();
//     int[] var16 = var14.getPoint();
//     double var17 = var10.distanceFrom(var14);
//     java.lang.String var18 = var14.toString();
//     int[] var21 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var22 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var21);
//     org.apache.commons.math.stat.clustering.Cluster var23 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var22);
//     java.util.List var24 = var23.getPoints();
//     int[] var27 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var28 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var27);
//     boolean var30 = var28.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
//     float[] var31 = new float[] { };
//     float[] var33 = new float[] { 100.0f};
//     boolean var34 = org.apache.commons.math.util.MathUtils.equals(var31, var33);
//     boolean var35 = var28.equals((java.lang.Object)var33);
//     int[] var38 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var39 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var38);
//     boolean var41 = var39.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
//     float[] var42 = new float[] { };
//     float[] var44 = new float[] { 100.0f};
//     boolean var45 = org.apache.commons.math.util.MathUtils.equals(var42, var44);
//     boolean var46 = var39.equals((java.lang.Object)var44);
//     double var47 = var28.distanceFrom(var39);
//     var23.addPoint((org.apache.commons.math.stat.clustering.Clusterable)var39);
//     org.apache.commons.math.stat.clustering.Clusterable var49 = var23.getCenter();
//     org.apache.commons.math.stat.clustering.Clusterable var50 = null;
//     var23.addPoint(var50);
//     java.util.List var52 = var23.getPoints();
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var53 = var14.centroidOf((java.util.Collection)var52);
// 
//   }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test96"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(3.0023994079829557E21d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.0023994079829557E21d);

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test97"); }
// 
// 
//     int[] var0 = null;
//     int[] var2 = new int[] { 100};
//     int[] var6 = new int[] { (-1), 1, 1};
//     int var7 = org.apache.commons.math.util.MathUtils.distance1(var2, var6);
//     int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var2, 10);
//     int[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var2, 101);
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var12 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var11);
//     int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var11, 26214400);
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var15 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var11);
//     int[] var18 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var19 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var18);
//     boolean var21 = var19.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
//     float[] var22 = new float[] { };
//     float[] var24 = new float[] { 100.0f};
//     boolean var25 = org.apache.commons.math.util.MathUtils.equals(var22, var24);
//     boolean var26 = var19.equals((java.lang.Object)var24);
//     int[] var27 = var19.getPoint();
//     int[] var29 = new int[] { 100};
//     int[] var33 = new int[] { (-1), 1, 1};
//     int var34 = org.apache.commons.math.util.MathUtils.distance1(var29, var33);
//     int[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var33);
//     int var36 = org.apache.commons.math.util.MathUtils.distance1(var27, var35);
//     int[] var38 = org.apache.commons.math.util.MathUtils.copyOf(var27, 6);
//     int[] var40 = org.apache.commons.math.util.MathUtils.copyOf(var27, 101);
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var41 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var40);
//     int[] var42 = var41.getPoint();
//     int var43 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var42);
//     int var44 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var42);
// 
//   }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test98"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var3, true);
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Object[] var8 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var5, var6, var8);
    var9.setContext("hi!", (java.lang.Object)201);
    int[] var15 = new int[] { 100};
    int[] var19 = new int[] { (-1), 1, 1};
    int var20 = org.apache.commons.math.util.MathUtils.distance1(var15, var19);
    int[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var15, 10);
    var9.setContext("", (java.lang.Object)var15);
    java.util.Set var24 = var9.getContextKeys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test99"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(3.2552223130233284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1141212491656983d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test100"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.694115964178505d, 0.3708024742879816d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.694115964178505d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test101"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.061605964172826d, 2.7912581369109106E36d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.7912581369109106E36d);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test102"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(3080657310641694901L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test103"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)27.609565416409364d, (java.lang.Number)10.0f, false);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test104"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(274);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 274);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test105"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-0.8803009413870497d), (-0.17364817766693053d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.765555903668065d));

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test106"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math.exception.MathArithmeticException var2 = new org.apache.commons.math.exception.MathArithmeticException(var0, var1);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test107"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.4327148186525578d);
    java.lang.Number var2 = var1.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test108"); }


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
    double[] var62 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var64 = org.apache.commons.math.util.MathUtils.normalizeArray(var62, 1.0d);
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var64, 1.5707963267948966d);
    double[] var70 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var72 = org.apache.commons.math.util.MathUtils.normalizeArray(var70, 1.0d);
    double[] var76 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var78 = org.apache.commons.math.util.MathUtils.normalizeArray(var76, 1.0d);
    double var79 = org.apache.commons.math.util.MathUtils.distanceInf(var72, var78);
    double var80 = org.apache.commons.math.util.MathUtils.distance(var64, var78);
    double var81 = org.apache.commons.math.util.MathUtils.safeNorm(var78);
    int var82 = org.apache.commons.math.util.MathUtils.hash(var78);
    double var83 = org.apache.commons.math.util.MathUtils.distanceInf(var52, var78);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var83);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.0d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test109"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)10.0d, (java.lang.Number)(short)100, true);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.String var5 = var3.toString();
    java.lang.Number var6 = var3.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.exception.NumberIsTooSmallException: 10 is smaller than the minimum (100)"+ "'", var5.equals("org.apache.commons.math.exception.NumberIsTooSmallException: 10 is smaller than the minimum (100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)100+ "'", var6.equals((short)100));

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test110"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.984807753012208d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test111"); }


    double[] var0 = null;
    double[] var4 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 1.0d);
    double[] var8 = org.apache.commons.math.util.MathUtils.normalizeArray(var6, 1.5707963267948966d);
    double[] var12 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0d);
    double[] var18 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var20 = org.apache.commons.math.util.MathUtils.normalizeArray(var18, 1.0d);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var20);
    double var22 = org.apache.commons.math.util.MathUtils.distance(var6, var20);
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var25 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 3.0d);
    double[] var26 = org.apache.commons.math.util.MathUtils.copyOf(var20);
    double[] var30 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 1.0d);
    boolean var33 = org.apache.commons.math.util.MathUtils.equals(var26, var30);
    double[] var37 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, 1.0d);
    double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var39, 1.5707963267948966d);
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.0038848218538872d);
    double[] var47 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var47, 1.0d);
    double[] var51 = org.apache.commons.math.util.MathUtils.normalizeArray(var49, 1.5707963267948966d);
    double[] var55 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var57 = org.apache.commons.math.util.MathUtils.normalizeArray(var55, 1.0d);
    double[] var61 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var63 = org.apache.commons.math.util.MathUtils.normalizeArray(var61, 1.0d);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var57, var63);
    double var65 = org.apache.commons.math.util.MathUtils.distance(var49, var63);
    boolean var66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var49);
    double var67 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var49);
    double[] var71 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var73 = org.apache.commons.math.util.MathUtils.normalizeArray(var71, 1.0d);
    double[] var77 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var79 = org.apache.commons.math.util.MathUtils.normalizeArray(var77, 1.0d);
    double var80 = org.apache.commons.math.util.MathUtils.distanceInf(var73, var79);
    double[] var82 = org.apache.commons.math.util.MathUtils.copyOf(var73, 0);
    double var83 = org.apache.commons.math.util.MathUtils.distance1(var49, var73);
    boolean var84 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
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
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test112"); }


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
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    int var27 = org.apache.commons.math.util.MathUtils.hash(var25);
    
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
    assertTrue(var26 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-2114948001));

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test113"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.4210854715202004E-14d, 0.8390387292223656d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.005504145418847763d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test114"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(90.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 90.0d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test115"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    java.lang.Number var3 = null;
    java.lang.Number var4 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var6 = new org.apache.commons.math.exception.NumberIsTooLargeException(var3, var4, false);
    java.lang.Throwable[] var7 = var6.getSuppressed();
    org.apache.commons.math.exception.MathIllegalStateException var8 = new org.apache.commons.math.exception.MathIllegalStateException(var2, (java.lang.Object[])var7);
    org.apache.commons.math.exception.NotFiniteNumberException var9 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)1.4E-45f, (java.lang.Object[])var7);
    org.apache.commons.math.exception.util.Localizable var10 = null;
    var9.addMessage(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test116"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(2.25913233442578E65d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test117"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.9653601483702346d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.6257331397181716d);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test118"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    double[] var5 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.0d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double var14 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var13);
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    java.lang.Number var17 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var17, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var20 = var19.getDirection();
    double[] var24 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var26 = org.apache.commons.math.util.MathUtils.normalizeArray(var24, 1.0d);
    double[] var30 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, 1.0d);
    double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var32);
    double[] var35 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, (-2.5049299045672764d));
    double[] var39 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var39, 1.0d);
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.5707963267948966d);
    double[] var47 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var47, 1.0d);
    double[] var53 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var55 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 1.0d);
    double var56 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var55);
    double var57 = org.apache.commons.math.util.MathUtils.distance(var41, var55);
    double var58 = org.apache.commons.math.util.MathUtils.safeNorm(var55);
    double[] var62 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var64 = org.apache.commons.math.util.MathUtils.normalizeArray(var62, 1.0d);
    double[] var66 = org.apache.commons.math.util.MathUtils.normalizeArray(var62, 0.8414709848078965d);
    boolean var67 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var62);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var55);
    double[][] var69 = new double[][] { var32};
    org.apache.commons.math.util.MathUtils.sortInPlace(var13, var20, var69);
    org.apache.commons.math.exception.NotFiniteNumberException var71 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)2.7755575615628914E-17d, (java.lang.Object[])var69);
    org.apache.commons.math.exception.MathArithmeticException var72 = new org.apache.commons.math.exception.MathArithmeticException(var0, (java.lang.Object[])var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.7320508075688772d);
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test119"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-23), 1010L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1064365457);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test120"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0254968762962444d, (-0.792954544873424d), 0.08168132327233309d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test121"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(2.7912581369109106E36d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5992731077654448E38d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test122"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.2440489289239585d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 21.088712888246285d);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test123"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.util.Localizable var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var6 = new org.apache.commons.math.exception.NumberIsTooSmallException(var2, (java.lang.Number)Double.NaN, (java.lang.Number)(byte)100, true);
    var6.setContext("", (java.lang.Object)127);
    java.lang.Object var11 = null;
    var6.setContext("", var11);
    java.lang.Throwable[] var13 = var6.getSuppressed();
    org.apache.commons.math.exception.MathIllegalStateException var14 = new org.apache.commons.math.exception.MathIllegalStateException(var1, (java.lang.Object[])var13);
    org.apache.commons.math.exception.MathIllegalArgumentException var15 = new org.apache.commons.math.exception.MathIllegalArgumentException(var0, (java.lang.Object[])var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test124"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(100.00001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test125"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.8803009413870497d), 1.2178264933584275d, 2.6257331397181716d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test126"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.6475434656816703d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test127"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.4185747908262327E29d, (java.lang.Number)0.0015258138462572615d, true);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test128"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(0.99999994f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test129"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)Double.NaN, (java.lang.Number)(short)1, true);
    org.apache.commons.math.exception.util.Localizable var4 = null;
    var3.addMessage(var4);
    java.lang.Number var6 = var3.getMin();
    org.apache.commons.math.exception.NotPositiveException var8 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)1.547657737556848d);
    var3.addSuppressed((java.lang.Throwable)var8);
    org.apache.commons.math.exception.util.Localizable var10 = null;
    org.apache.commons.math.exception.util.Localizable var11 = null;
    org.apache.commons.math.exception.util.Localizable var12 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.util.Localizable var16 = null;
    org.apache.commons.math.exception.NullArgumentException var17 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var18 = new org.apache.commons.math.exception.NullArgumentException();
    var17.addSuppressed((java.lang.Throwable)var18);
    org.apache.commons.math.exception.util.Localizable var20 = null;
    java.lang.Object[] var22 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var23 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var17, var20, var22);
    org.apache.commons.math.exception.MathIllegalStateException var24 = new org.apache.commons.math.exception.MathIllegalStateException(var16, var22);
    org.apache.commons.math.exception.MathIllegalArgumentException var25 = new org.apache.commons.math.exception.MathIllegalArgumentException(var15, var22);
    org.apache.commons.math.exception.NotFiniteNumberException var26 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)11, var22);
    org.apache.commons.math.exception.NotFiniteNumberException var27 = new org.apache.commons.math.exception.NotFiniteNumberException(var12, (java.lang.Number)1.3132616875182228d, var22);
    org.apache.commons.math.exception.MathArithmeticException var28 = new org.apache.commons.math.exception.MathArithmeticException(var11, var22);
    var3.addMessage(var10, var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)1+ "'", var6.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test130"); }


    float var2 = org.apache.commons.math.util.FastMath.max(1.0f, 1.192093E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test131() {}
//   public void test131() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test131"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-1.0579632353488144E31d), 2.1609159195357108E-7d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test132"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(8.528327880923975d, 1.343441528942036d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 17.805788324990203d);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test133"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)Double.NaN, (java.lang.Number)(byte)100, true);
    var4.setContext("", (java.lang.Object)127);
    boolean var8 = var4.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test134"); }


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
    double[] var37 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, 1.0d);
    double[] var43 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var45 = org.apache.commons.math.util.MathUtils.normalizeArray(var43, 1.0d);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var39, var45);
    double[] var48 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, (-2.5049299045672764d));
    double[] var52 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 1.0d);
    double[] var56 = org.apache.commons.math.util.MathUtils.normalizeArray(var54, 1.5707963267948966d);
    double[] var60 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 1.0d);
    double[] var66 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var68 = org.apache.commons.math.util.MathUtils.normalizeArray(var66, 1.0d);
    double var69 = org.apache.commons.math.util.MathUtils.distanceInf(var62, var68);
    double var70 = org.apache.commons.math.util.MathUtils.distance(var54, var68);
    double var71 = org.apache.commons.math.util.MathUtils.safeNorm(var68);
    double[] var73 = org.apache.commons.math.util.MathUtils.normalizeArray(var68, 3.0d);
    int var74 = org.apache.commons.math.util.MathUtils.hash(var68);
    boolean var75 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var48, var68);
    double var76 = org.apache.commons.math.util.MathUtils.distance1(var5, var48);
    double[] var80 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var82 = org.apache.commons.math.util.MathUtils.normalizeArray(var80, 1.0d);
    double[] var84 = org.apache.commons.math.util.MathUtils.normalizeArray(var82, 1.5707963267948966d);
    double[] var86 = org.apache.commons.math.util.MathUtils.normalizeArray(var84, 1.0038848218538872d);
    double var87 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var86);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10.514789713701829d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0.003884821853887166d);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test135"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(7.629395E-6f, 2.0f, (-2114948138));

  }

  public void test136() {}
//   public void test136() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test136"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var1 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0);
//     int[] var4 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var5 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var4);
//     boolean var7 = var5.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
//     float[] var8 = new float[] { };
//     float[] var10 = new float[] { 100.0f};
//     boolean var11 = org.apache.commons.math.util.MathUtils.equals(var8, var10);
//     boolean var12 = var5.equals((java.lang.Object)var10);
//     int[] var15 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var16 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var15);
//     boolean var18 = var16.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
//     float[] var19 = new float[] { };
//     float[] var21 = new float[] { 100.0f};
//     boolean var22 = org.apache.commons.math.util.MathUtils.equals(var19, var21);
//     boolean var23 = var16.equals((java.lang.Object)var21);
//     double var24 = var5.distanceFrom(var16);
//     int[] var27 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var28 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var27);
//     double var29 = var16.distanceFrom(var28);
//     org.apache.commons.math.exception.util.Localizable var30 = null;
//     org.apache.commons.math.exception.util.Localizable var31 = null;
//     org.apache.commons.math.exception.NullArgumentException var32 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var33 = new org.apache.commons.math.exception.NullArgumentException();
//     var32.addSuppressed((java.lang.Throwable)var33);
//     org.apache.commons.math.exception.util.Localizable var35 = null;
//     java.lang.Object[] var37 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var38 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var32, var35, var37);
//     org.apache.commons.math.exception.MathIllegalStateException var39 = new org.apache.commons.math.exception.MathIllegalStateException(var31, var37);
//     org.apache.commons.math.exception.MathIllegalArgumentException var40 = new org.apache.commons.math.exception.MathIllegalArgumentException(var30, var37);
//     boolean var41 = var16.equals((java.lang.Object)var37);
//     int[] var44 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var45 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var44);
//     boolean var47 = var45.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
//     float[] var48 = new float[] { };
//     float[] var50 = new float[] { 100.0f};
//     boolean var51 = org.apache.commons.math.util.MathUtils.equals(var48, var50);
//     boolean var52 = var45.equals((java.lang.Object)var50);
//     int[] var53 = var45.getPoint();
//     int[] var55 = new int[] { 100};
//     int[] var59 = new int[] { (-1), 1, 1};
//     int var60 = org.apache.commons.math.util.MathUtils.distance1(var55, var59);
//     int[] var61 = org.apache.commons.math.util.MathUtils.copyOf(var59);
//     int var62 = org.apache.commons.math.util.MathUtils.distance1(var53, var61);
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var63 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var61);
//     org.apache.commons.math.exception.util.Localizable var64 = null;
//     org.apache.commons.math.util.MathUtils.OrderDirection var69 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var71 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var69, true);
//     org.apache.commons.math.exception.util.Localizable var72 = null;
//     java.lang.Object[] var74 = new java.lang.Object[] { (short)10};
//     org.apache.commons.math.exception.MathIllegalStateException var75 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var71, var72, var74);
//     org.apache.commons.math.exception.NotFiniteNumberException var76 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var74);
//     org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var63, var64, var74);
//     double var78 = var16.distanceFrom(var63);
//     org.apache.commons.math.stat.clustering.Cluster var79 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var16);
//     int[] var82 = new int[] { 10, 1};
//     org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var83 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var82);
//     org.apache.commons.math.stat.clustering.Cluster var84 = new org.apache.commons.math.stat.clustering.Cluster((org.apache.commons.math.stat.clustering.Clusterable)var83);
//     var79.addPoint((org.apache.commons.math.stat.clustering.Clusterable)var83);
//     java.util.List var86 = var79.getPoints();
//     java.util.List var89 = var1.cluster((java.util.Collection)var86, 0, (-1048576));
// 
//   }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test137"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 720L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 720L);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test138"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-1.1503578729932837d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.1503578729932835d));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test139"); }


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
    double[] var39 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, 3.0d);
    int var40 = org.apache.commons.math.util.MathUtils.hash(var34);
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var14, var34);
    double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 4.338665864109181d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test140"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)0.9989894931045785d, (java.lang.Number)(-1.324434720954132E-39d), false);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test141"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.7123889803846897d, (-2105540603));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test142"); }


    int[] var2 = new int[] { 10, 1};
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var3 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var2);
    boolean var5 = var3.equals((java.lang.Object)Double.NEGATIVE_INFINITY);
    float[] var6 = new float[] { };
    float[] var8 = new float[] { 100.0f};
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var8);
    boolean var10 = var3.equals((java.lang.Object)var8);
    int[] var11 = var3.getPoint();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var15, true);
    org.apache.commons.math.exception.util.Localizable var18 = null;
    java.lang.Object[] var20 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var21 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var17, var18, var20);
    java.util.Set var22 = var21.getContextKeys();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var23 = var3.centroidOf((java.util.Collection)var22);
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test143"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var9 = org.apache.commons.math.util.MathUtils.copyOf(var8);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    int[] var12 = new int[] { 100};
    int[] var16 = new int[] { (-1), 1, 1};
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var18 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var16);
    int[] var19 = var18.getPoint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var20 = org.apache.commons.math.util.MathUtils.distance1(var9, var19);
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
    assertNotNull(var19);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test144"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException((-927604735), (-2105540607));

  }

  public void test145() {}
//   public void test145() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test145"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(27.609565416409364d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test146"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-274), 0);
    int var4 = var3.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test147"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(5.283185307179586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test148"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, Float.POSITIVE_INFINITY, 9.536745E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test149"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(4.011654465561662d, 27.609565416409364d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.3885353799693556d);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test150"); }


    long var2 = org.apache.commons.math.util.FastMath.min(518400L, 629500L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 518400L);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test151"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(3.4641016151377544d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 31.947745505884924d);

  }

  public void test152() {}
//   public void test152() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test152"); }
// 
// 
//     int[] var0 = null;
//     int[] var1 = org.apache.commons.math.util.MathUtils.copyOf(var0);
// 
//   }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test153"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math.exception.ConvergenceException var2 = new org.apache.commons.math.exception.ConvergenceException(var0, var1);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test154"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(103.7861872278967d, 2.220446049250313E-16d, (-53));

  }

  public void test155() {}
//   public void test155() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test155"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(1.4E-45f, (-51));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test156"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1024, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test157"); }


    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException((java.lang.Number)1.1189396031849528d, (java.lang.Number)127, true);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getMax();
    boolean var6 = var3.getBoundIsAllowed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 127+ "'", var5.equals(127));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test158"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int[] var9 = new int[] { 100};
    int[] var13 = new int[] { (-1), 1, 1};
    int var14 = org.apache.commons.math.util.MathUtils.distance1(var9, var13);
    int[] var15 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var16 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var9);
    int[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var9);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var18 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var17);
    int[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    int[] var21 = new int[] { 100};
    int[] var25 = new int[] { (-1), 1, 1};
    int var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
    int[] var28 = org.apache.commons.math.util.MathUtils.copyOf(var21, 10);
    int[] var29 = org.apache.commons.math.util.MathUtils.copyOf(var28);
    int[] var30 = org.apache.commons.math.util.MathUtils.copyOf(var29);
    int var31 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var17);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test159"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians((-0.8803009413870497d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.015364149835609636d));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test160"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(56.548667764616276d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.204364238465236E-15d));

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test161"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 12.566370614359172d);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test162"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(3L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3L);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test163"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(1.4E-45f, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test164"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var7 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    int[] var9 = new int[] { 100};
    int[] var13 = new int[] { (-1), 1, 1};
    int var14 = org.apache.commons.math.util.MathUtils.distance1(var9, var13);
    int[] var16 = org.apache.commons.math.util.MathUtils.copyOf(var9, 10);
    int[] var17 = org.apache.commons.math.util.MathUtils.copyOf(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance(var7, var17);
    int[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var7);
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var19, 12);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var22 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 101.0099005048515d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test165"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)6, (java.lang.Number)1000L, 10);
    java.lang.String var4 = var3.toString();
    org.apache.commons.math.exception.util.Localizable var5 = null;
    org.apache.commons.math.exception.util.Localizable var6 = null;
    org.apache.commons.math.exception.util.Localizable var7 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var12 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var12, true);
    org.apache.commons.math.exception.util.Localizable var15 = null;
    java.lang.Object[] var17 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var18 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var14, var15, var17);
    org.apache.commons.math.exception.NotFiniteNumberException var19 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100.0d, var17);
    org.apache.commons.math.exception.MathIllegalArgumentException var20 = new org.apache.commons.math.exception.MathIllegalArgumentException(var7, var17);
    org.apache.commons.math.exception.NullArgumentException var21 = new org.apache.commons.math.exception.NullArgumentException(var6, var17);
    org.apache.commons.math.exception.MathIllegalStateException var22 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var3, var5, var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly increasing (1,000 >= 6)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly increasing (1,000 >= 6)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test166"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(2.3885353799693556d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5168093159231608d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test167"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.7853981633974482d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.1932800507380152d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test168"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(101097L, (-11110000L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test169() {}
//   public void test169() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test169"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.9999999999999999d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test170"); }


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
    int var74 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var75 = null;
    boolean var76 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var75);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test171"); }


    double[] var4 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 1.0d);
    double[] var8 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 0.8414709848078965d);
    double[] var12 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var14 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, 1.0d);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var14, 1.5707963267948966d);
    double[] var18 = org.apache.commons.math.util.MathUtils.normalizeArray(var16, 1.0038848218538872d);
    double[] var22 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var24 = org.apache.commons.math.util.MathUtils.normalizeArray(var22, 1.0d);
    double[] var28 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var30 = org.apache.commons.math.util.MathUtils.normalizeArray(var28, 1.0d);
    double var31 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var30);
    double[] var33 = org.apache.commons.math.util.MathUtils.normalizeArray(var30, (-2.5049299045672764d));
    double[] var37 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var39 = org.apache.commons.math.util.MathUtils.normalizeArray(var37, 1.0d);
    double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var39, 1.5707963267948966d);
    double[] var45 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 1.0d);
    double[] var51 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var53 = org.apache.commons.math.util.MathUtils.normalizeArray(var51, 1.0d);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var47, var53);
    double var55 = org.apache.commons.math.util.MathUtils.distance(var39, var53);
    double var56 = org.apache.commons.math.util.MathUtils.safeNorm(var53);
    double[] var60 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 1.0d);
    double[] var64 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 0.8414709848078965d);
    boolean var65 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var53, var60);
    double var66 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var53);
    double[][] var67 = new double[][] { var30};
    org.apache.commons.math.util.MathUtils.sortInPlace(var18, var67);
    org.apache.commons.math.util.MathUtils.sortInPlace(var4, var67);
    org.apache.commons.math.exception.NotFiniteNumberException var70 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)3080657310641694895L, (java.lang.Object[])var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test172"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)114.22553209582011d, (java.lang.Number)1.3731335522128059d, true);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test173"); }


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
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var24);
    double[] var29 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 1.0d);
    double[] var35 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.normalizeArray(var35, 1.0d);
    double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var37);
    boolean var39 = org.apache.commons.math.util.MathUtils.equals(var24, var37);
    org.apache.commons.math.util.MathUtils.checkFinite(var24);
    double[] var41 = org.apache.commons.math.util.MathUtils.copyOf(var24);
    double[] var45 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var47 = org.apache.commons.math.util.MathUtils.normalizeArray(var45, 1.0d);
    double[] var49 = org.apache.commons.math.util.MathUtils.normalizeArray(var47, 1.5707963267948966d);
    double[] var53 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var55 = org.apache.commons.math.util.MathUtils.normalizeArray(var53, 1.0d);
    double[] var59 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var61 = org.apache.commons.math.util.MathUtils.normalizeArray(var59, 1.0d);
    double var62 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var61);
    double var63 = org.apache.commons.math.util.MathUtils.distance(var47, var61);
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var47);
    int var65 = org.apache.commons.math.util.MathUtils.hash(var47);
    double[] var69 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var71 = org.apache.commons.math.util.MathUtils.normalizeArray(var69, 1.0d);
    double[] var75 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var77 = org.apache.commons.math.util.MathUtils.normalizeArray(var75, 1.0d);
    double var78 = org.apache.commons.math.util.MathUtils.distanceInf(var71, var77);
    double var79 = org.apache.commons.math.util.MathUtils.safeNorm(var77);
    double[] var83 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var85 = org.apache.commons.math.util.MathUtils.normalizeArray(var83, 1.0d);
    double[] var87 = org.apache.commons.math.util.MathUtils.normalizeArray(var85, 1.5707963267948966d);
    boolean var88 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var77, var85);
    double var89 = org.apache.commons.math.util.MathUtils.distance(var47, var85);
    double var90 = org.apache.commons.math.util.MathUtils.distance(var24, var47);
    
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
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 3.4641016151377544d);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test174"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000001f, 1.193736479124303d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000002f);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test175"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double[] var22 = org.apache.commons.math.util.MathUtils.copyOf(var5);
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.util.MathUtils.OrderDirection var28 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var28, true);
    org.apache.commons.math.exception.MathRuntimeException var31 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var30);
    org.apache.commons.math.exception.util.Localizable var32 = null;
    double[] var36 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0d);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 1.5707963267948966d);
    double[] var42 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 1.0038848218538872d);
    double[] var46 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.normalizeArray(var46, 1.0d);
    double[] var52 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var54 = org.apache.commons.math.util.MathUtils.normalizeArray(var52, 1.0d);
    double var55 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var54);
    double[] var57 = org.apache.commons.math.util.MathUtils.normalizeArray(var54, (-2.5049299045672764d));
    double[] var61 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var63 = org.apache.commons.math.util.MathUtils.normalizeArray(var61, 1.0d);
    double[] var65 = org.apache.commons.math.util.MathUtils.normalizeArray(var63, 1.5707963267948966d);
    double[] var69 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var71 = org.apache.commons.math.util.MathUtils.normalizeArray(var69, 1.0d);
    double[] var75 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var77 = org.apache.commons.math.util.MathUtils.normalizeArray(var75, 1.0d);
    double var78 = org.apache.commons.math.util.MathUtils.distanceInf(var71, var77);
    double var79 = org.apache.commons.math.util.MathUtils.distance(var63, var77);
    double var80 = org.apache.commons.math.util.MathUtils.safeNorm(var77);
    double[] var84 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var86 = org.apache.commons.math.util.MathUtils.normalizeArray(var84, 1.0d);
    double[] var88 = org.apache.commons.math.util.MathUtils.normalizeArray(var84, 0.8414709848078965d);
    boolean var89 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var77, var84);
    double var90 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var77);
    double[][] var91 = new double[][] { var54};
    org.apache.commons.math.util.MathUtils.sortInPlace(var42, var91);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var30, var32, (java.lang.Object[])var91);
    org.apache.commons.math.exception.NotFiniteNumberException var94 = new org.apache.commons.math.exception.NotFiniteNumberException((java.lang.Number)100897L, (java.lang.Object[])var91);
    org.apache.commons.math.exception.MathIllegalStateException var95 = new org.apache.commons.math.exception.MathIllegalStateException(var23, (java.lang.Object[])var91);
    org.apache.commons.math.util.MathUtils.sortInPlace(var5, var91);
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test176"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.984807753012208d, 0.0014256065798175625d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.984807753012208d);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test177"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-11110000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test178"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.0033377744245369d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test179"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 2.3743650728680885E40d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test180"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.048826043080232286d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.048806663791089104d);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test181"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8065537826828393d, 1.0910539611462477E66d, 0);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test182"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(107, 2105540607);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test183"); }


    org.apache.commons.math.exception.NotPositiveException var1 = new org.apache.commons.math.exception.NotPositiveException((java.lang.Number)11013.232874703392d);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9944278225911797d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-56.97651726485877d));

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test185"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-48.073378032461434d), 0.0d, 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test186"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-0.5188665760885071d), 1069.6521941348608d, (-0.21418410704948732d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test187"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-17));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test188"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(2.7755575615628914E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test189"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(4.019162876747147d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.881784197001252E-16d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test190"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.6210281858639694d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8608403483158757d);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test191"); }


    float var2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test192"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.015364149835609636d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test193"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(32535647, (-55574528));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 88110175);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test194"); }


    org.apache.commons.math.exception.NumberIsTooSmallException var3 = new org.apache.commons.math.exception.NumberIsTooSmallException((java.lang.Number)Double.NaN, (java.lang.Number)(short)1, true);
    boolean var4 = var3.getBoundIsAllowed();
    java.lang.Number var5 = var3.getArgument();
    java.lang.Number var6 = var3.getMin();
    java.lang.Number var7 = var3.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + Double.NaN+ "'", var5.equals(Double.NaN));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)1+ "'", var6.equals((short)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)1+ "'", var7.equals((short)1));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test195"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)(-1.311003161106947d));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test196"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-16.556649761518965d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-7752318.989008357d));

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test197"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.08168132327233309d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test198() {}
//   public void test198() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test198"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-0.16991654217614283d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test199"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(1.1368684E-13f, (-5));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test200"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp((-0.9992662556790163d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9992662556790162d));

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test201"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(2.4758800785707605E27d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4758800785707605E27d);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test202"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot((-97.85618083027165d), (-0.638850177028372d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 97.85826616201369d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test203"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(9.536745E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1368684E-13f);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test204"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.0784780097701441E-4d, 3.9427276852482067E160d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0784780097701441E-4d);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test205"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(4.116890823728167d, (-7752318.989008357d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7752318.98900945d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test206"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(201);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 201);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test207"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-2105540554), 0);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test208"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-1.311003161106947d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.0d));

  }

  public void test209() {}
//   public void test209() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test209"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     java.lang.Number var1 = null;
//     java.lang.Number var2 = null;
//     org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var1, var2, false);
//     java.lang.Throwable[] var5 = var4.getSuppressed();
//     org.apache.commons.math.exception.MathIllegalStateException var6 = new org.apache.commons.math.exception.MathIllegalStateException(var0, (java.lang.Object[])var5);
//     org.apache.commons.math.exception.util.Localizable var7 = null;
//     org.apache.commons.math.exception.util.Localizable var8 = null;
//     org.apache.commons.math.exception.NullArgumentException var9 = new org.apache.commons.math.exception.NullArgumentException();
//     org.apache.commons.math.exception.NullArgumentException var10 = new org.apache.commons.math.exception.NullArgumentException();
//     var9.addSuppressed((java.lang.Throwable)var10);
//     org.apache.commons.math.exception.util.Localizable var12 = null;
//     java.lang.Object[] var14 = new java.lang.Object[] { 0.0f};
//     org.apache.commons.math.exception.MathIllegalStateException var15 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var9, var12, var14);
//     org.apache.commons.math.exception.MathIllegalStateException var16 = new org.apache.commons.math.exception.MathIllegalStateException(var8, var14);
//     org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var6, var7, var14);
//     org.apache.commons.math.exception.MathRuntimeException var18 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var6);
// 
//   }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test210"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 1.0842022E-19f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0842022E-19f);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test211"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-1L), 202094L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test212"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(68, (-2073552671));
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test213"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.6961874372246237d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.641297003398865d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test214"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.0349065850398866d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.034899500154676945d);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test215"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-1.04323229440977d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test216"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(9.094947E-13f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.094948E-13f);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test217"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(2.224316764644975E15d, 0.1687055344848627d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.2243167646449748E15d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test218"); }


    org.apache.commons.math.util.MathUtils.checkFinite(7.791121986871369E72d);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test219"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(Float.POSITIVE_INFINITY, 5100, 1039802467);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test220"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(7.6293945E-6f, 12, 100);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test221"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(Float.NaN, 100.000015f);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test222"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-137), (-738962168));
    int var4 = var3.getDimension();
    java.util.Set var5 = var3.getContextKeys();
    java.util.Set var6 = var3.getContextKeys();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-738962168));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test223"); }


    org.apache.commons.math.exception.DimensionMismatchException var2 = new org.apache.commons.math.exception.DimensionMismatchException((-927604735), 201);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test224"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 101);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var11 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var10);
    int[] var13 = org.apache.commons.math.util.MathUtils.copyOf(var10, 26214400);
    int[] var14 = org.apache.commons.math.util.MathUtils.copyOf(var10);
    
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
    assertNotNull(var14);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test225"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 0.8414709848078965d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test226"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-100L), 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test227"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.9756994461918105d, 1.5649786282570015d, 2105540607);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test228"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)10L, (java.lang.Number)10.000001f, false);
    boolean var5 = var4.getBoundIsAllowed();
    boolean var6 = var4.getBoundIsAllowed();
    java.lang.Object var8 = var4.getContext("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test229"); }


    double[] var0 = new double[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, 2113899425);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test230"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.99999994f));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test231"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1089072938814656167L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test232"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.8608403483158757d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test233"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15.104412573075516d);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test234"); }


    double[] var5 = new double[] { 0.0d, 1.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var5);
    org.apache.commons.math.util.MathUtils.checkOrder(var5);
    int var8 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var11 = new double[] { 0.0d, 1.0d};
    double var12 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    org.apache.commons.math.util.MathUtils.checkOrder(var11);
    java.lang.Number var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var18, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = var20.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var23 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)(-1), (java.lang.Number)100.0d, (-127), var21, false);
    boolean var26 = org.apache.commons.math.util.MathUtils.checkOrder(var11, var21, true, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var5, var21, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-2114948138), (java.lang.Number)(-1048576), 1249902593, var21, true);
    java.lang.Number var31 = var30.getPrevious();
    boolean var32 = var30.getStrict();
    int var33 = var30.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1072694209);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (-1048576)+ "'", var31.equals((-1048576)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1249902593);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test235"); }


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
    double[] var36 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0d);
    double[] var40 = org.apache.commons.math.util.MathUtils.normalizeArray(var38, 1.5707963267948966d);
    double[] var42 = org.apache.commons.math.util.MathUtils.normalizeArray(var40, 1.0038848218538872d);
    double[] var46 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var48 = org.apache.commons.math.util.MathUtils.normalizeArray(var46, 1.0d);
    double[] var50 = org.apache.commons.math.util.MathUtils.normalizeArray(var48, 1.5707963267948966d);
    double[] var54 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var56 = org.apache.commons.math.util.MathUtils.normalizeArray(var54, 1.0d);
    double[] var60 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var62 = org.apache.commons.math.util.MathUtils.normalizeArray(var60, 1.0d);
    double var63 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var62);
    double var64 = org.apache.commons.math.util.MathUtils.distance(var48, var62);
    boolean var65 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var48);
    double var66 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var48);
    double[] var70 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var72 = org.apache.commons.math.util.MathUtils.normalizeArray(var70, 1.0d);
    double[] var76 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var78 = org.apache.commons.math.util.MathUtils.normalizeArray(var76, 1.0d);
    double var79 = org.apache.commons.math.util.MathUtils.distanceInf(var72, var78);
    double[] var81 = org.apache.commons.math.util.MathUtils.copyOf(var72, 0);
    double var82 = org.apache.commons.math.util.MathUtils.distance1(var48, var72);
    double var83 = org.apache.commons.math.util.MathUtils.safeNorm(var72);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 1.7320508075688772d);

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test236"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy var1 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var2 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0, var1);
//     org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var8 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var6, true);
//     org.apache.commons.math.exception.MathRuntimeException var9 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var8);
//     java.util.Set var10 = var8.getContextKeys();
//     java.util.List var13 = var2.cluster((java.util.Collection)var10, 0, (-1327242822));
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test237"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1421439005, 2105540744);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test238"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot((-226.60853700280938d), 2.061605964172826d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 226.617914697195d);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test239"); }


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
    double[] var27 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var27, 1.0d);
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 1.5707963267948966d);
    double[] var35 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var37 = org.apache.commons.math.util.MathUtils.normalizeArray(var35, 1.0d);
    double[] var41 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var41, 1.0d);
    double var44 = org.apache.commons.math.util.MathUtils.distanceInf(var37, var43);
    double var45 = org.apache.commons.math.util.MathUtils.distance(var29, var43);
    double var46 = org.apache.commons.math.util.MathUtils.safeNorm(var43);
    int var47 = org.apache.commons.math.util.MathUtils.hash(var43);
    org.apache.commons.math.util.MathUtils.checkFinite(var43);
    int var49 = org.apache.commons.math.util.MathUtils.hash(var43);
    boolean var50 = org.apache.commons.math.util.MathUtils.equals(var23, var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var23);
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1.7320508075688772d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-2114948001));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test240"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 5.446861158663175E23d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.446861158663175E23d);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test241"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 7.629395E-6f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.629395E-6f);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test242"); }


    int[] var1 = new int[] { 100};
    int[] var5 = new int[] { (-1), 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distance1(var1, var5);
    int[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var1, 10);
    int[] var10 = org.apache.commons.math.util.MathUtils.copyOf(var1, 101);
    int[] var11 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    int[] var13 = new int[] { 100};
    int[] var17 = new int[] { (-1), 1, 1};
    int var18 = org.apache.commons.math.util.MathUtils.distance1(var13, var17);
    int[] var19 = org.apache.commons.math.util.MathUtils.copyOf(var17);
    int[] var21 = org.apache.commons.math.util.MathUtils.copyOf(var19, 201);
    double var22 = org.apache.commons.math.util.MathUtils.distance(var1, var21);
    int[] var24 = new int[] { 100};
    int[] var28 = new int[] { (-1), 1, 1};
    int var29 = org.apache.commons.math.util.MathUtils.distance1(var24, var28);
    int[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var24, 10);
    int[] var32 = org.apache.commons.math.util.MathUtils.copyOf(var31);
    int[] var33 = org.apache.commons.math.util.MathUtils.copyOf(var32);
    int[] var35 = org.apache.commons.math.util.MathUtils.copyOf(var32, 1048576);
    int var36 = org.apache.commons.math.util.MathUtils.distance1(var21, var35);
    int[] var38 = new int[] { 100};
    int[] var42 = new int[] { (-1), 1, 1};
    int var43 = org.apache.commons.math.util.MathUtils.distance1(var38, var42);
    int[] var44 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    org.apache.commons.math.stat.clustering.EuclideanIntegerPoint var45 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(var38);
    int[] var46 = org.apache.commons.math.util.MathUtils.copyOf(var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var47 = org.apache.commons.math.util.MathUtils.distance(var35, var38);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 101.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test243"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(1000L, (-100280L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2507000L);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test244"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, (-137), 1039802467);

  }

  public void test245() {}
//   public void test245() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test245"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy var1 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var2 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0, var1);
//     org.apache.commons.math.exception.util.Localizable var3 = null;
//     org.apache.commons.math.exception.DimensionMismatchException var6 = new org.apache.commons.math.exception.DimensionMismatchException(var3, (-137), (-738962168));
//     int var7 = var6.getDimension();
//     java.util.Set var8 = var6.getContextKeys();
//     java.util.List var11 = var2.cluster((java.util.Collection)var8, 411, (-927604735));
// 
//   }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test246"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1.0254968762962444d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1449988753);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test247"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.3440585709080678E43d, (java.lang.Number)0.0d, 100);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var7, true);
    org.apache.commons.math.exception.util.Localizable var10 = null;
    java.lang.Object[] var12 = new java.lang.Object[] { (short)10};
    org.apache.commons.math.exception.MathIllegalStateException var13 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var9, var10, var12);
    var3.addSuppressed((java.lang.Throwable)var13);
    java.lang.Number var15 = var3.getArgument();
    java.lang.Number var16 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1.3440585709080678E43d+ "'", var15.equals(1.3440585709080678E43d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 1.3440585709080678E43d+ "'", var16.equals(1.3440585709080678E43d));

  }

  public void test248() {}
//   public void test248() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test248"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(1.547657737556848d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test249() {}
//   public void test249() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test249"); }
// 
// 
//     java.util.Random var0 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy var1 = null;
//     org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer var2 = new org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer(var0, var1);
//     org.apache.commons.math.util.MathUtils.OrderDirection var6 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var8 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)10, (java.lang.Number)101, 101, var6, true);
//     org.apache.commons.math.exception.MathRuntimeException var9 = new org.apache.commons.math.exception.MathRuntimeException((java.lang.Throwable)var8);
//     java.util.Set var10 = var8.getContextKeys();
//     java.util.List var13 = var2.cluster((java.util.Collection)var10, (-1784634600), (-51));
// 
//   }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test250"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1064365457, 112197632);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test251"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(4L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test252"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(4, 137);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 548);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test253"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(101, 107);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test254"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.0011912807635959d, 103, 411);
      fail("Expected exception of type org.apache.commons.math.exception.MathRuntimeException");
    } catch (org.apache.commons.math.exception.MathRuntimeException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test255"); }


    org.apache.commons.math.util.MathUtils.checkFinite(1.1189396031849526d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test256"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)Double.NaN, (java.lang.Number)(byte)100, true);
    java.util.Set var5 = var4.getContextKeys();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test257"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)1.3132616875182228d, (java.lang.Number)(short)(-1), false);
    boolean var5 = var4.getBoundIsAllowed();
    java.lang.Number var6 = var4.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)(-1)+ "'", var6.equals((short)(-1)));

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test258"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(4L, 101000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 404000L);

  }

  public void test259() {}
//   public void test259() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test259"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-97.85618083027165d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test260"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.193736479124303d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test261"); }


    java.lang.Number var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var3 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, var1, false);
    java.lang.Number var4 = var3.getMax();
    java.lang.Number var5 = var3.getMax();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test262"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(3.865665416174347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1118628588));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test263"); }


    float var2 = org.apache.commons.math.util.FastMath.min(1.0842022E-19f, 1.1920929E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0842022E-19f);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test264"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1048576, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test265"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(6, 274);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 822);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test266"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-2.204364238465236E-15d), 10.017874927409903d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.017874927409903d);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test267"); }


    java.lang.Number var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.8414709848078965d, var7, 101);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100.0f, (java.lang.Number)(-1L), 10100, var10, true);
    org.apache.commons.math.exception.util.Localizable var13 = null;
    org.apache.commons.math.exception.util.Localizable var14 = null;
    org.apache.commons.math.exception.util.Localizable var15 = null;
    org.apache.commons.math.exception.NullArgumentException var16 = new org.apache.commons.math.exception.NullArgumentException();
    org.apache.commons.math.exception.NullArgumentException var17 = new org.apache.commons.math.exception.NullArgumentException();
    var16.addSuppressed((java.lang.Throwable)var17);
    org.apache.commons.math.exception.util.Localizable var19 = null;
    java.lang.Object[] var21 = new java.lang.Object[] { 0.0f};
    org.apache.commons.math.exception.MathIllegalStateException var22 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var16, var19, var21);
    org.apache.commons.math.exception.MathIllegalStateException var23 = new org.apache.commons.math.exception.MathIllegalStateException(var15, var21);
    org.apache.commons.math.exception.MathIllegalArgumentException var24 = new org.apache.commons.math.exception.MathIllegalArgumentException(var14, var21);
    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)var10, var13, var21);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2.0577631898027287d, (java.lang.Number)(-4.608179850748803d), 0, var10, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test268"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(11.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9999902065507035d));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test269"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var3 = null;
    java.math.BigInteger var5 = org.apache.commons.math.util.MathUtils.pow(var3, 0L);
    java.math.BigInteger var6 = org.apache.commons.math.util.MathUtils.pow(var2, var5);
    java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var5, 107);
    java.math.BigInteger var9 = null;
    java.math.BigInteger var11 = org.apache.commons.math.util.MathUtils.pow(var9, 0L);
    java.math.BigInteger var12 = null;
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 0L);
    java.math.BigInteger var15 = org.apache.commons.math.util.MathUtils.pow(var11, var14);
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var14, 107);
    java.math.BigInteger var18 = org.apache.commons.math.util.MathUtils.pow(var5, var17);
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)var5, (java.lang.Number)88110175, (-1327242822));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test270"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 253207000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test271"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(2.7755575615628914E-17d, 1.7453292519943298d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test272"); }


    double[] var3 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0d);
    double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var5, 1.5707963267948966d);
    double[] var11 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var11, 1.0d);
    double[] var17 = new double[] { (-1.0d), (-1.0d), 1.0d};
    double[] var19 = org.apache.commons.math.util.MathUtils.normalizeArray(var17, 1.0d);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance