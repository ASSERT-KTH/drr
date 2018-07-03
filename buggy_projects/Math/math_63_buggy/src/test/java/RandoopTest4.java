
import junit.framework.*;

public class RandoopTest4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(9.346544339204282d, 1684284890, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test2"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-4299989999627030L), 3631948688846703104L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test3"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.3026147102431249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test5"); }


    long var2 = org.apache.commons.math.util.FastMath.min(7766279621452241928L, 420L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 420L);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test6"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.43493802874674664d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5448673186209498d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.sin((-1.5719961586063422d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9999992802018984d));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test8"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(4.6832988734568985d, 3628800.0d, (-1521136310));

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test9"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.8414709848079504d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test10"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var5);
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var9 = new double[] { };
    double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var9);
    double[] var11 = new double[] { };
    double var12 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    double var13 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var11);
    int var14 = org.apache.commons.math.util.MathUtils.hash(var9);
    double[] var15 = new double[] { };
    double var16 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
    double[] var17 = new double[] { };
    double var18 = org.apache.commons.math.util.MathUtils.safeNorm(var17);
    double var19 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var17);
    double[] var20 = null;
    boolean var21 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var15, var20);
    double var22 = org.apache.commons.math.util.MathUtils.distance(var9, var15);
    double[] var23 = new double[] { };
    double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var23);
    double[] var25 = new double[] { };
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var25);
    double[] var29 = new double[] { 100.0d};
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var23, var29);
    double var31 = org.apache.commons.math.util.MathUtils.distance(var9, var23);
    double[] var32 = new double[] { };
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[] var34 = new double[] { };
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var34);
    double[] var38 = new double[] { 100.0d};
    double var39 = org.apache.commons.math.util.MathUtils.distance1(var32, var38);
    boolean var40 = org.apache.commons.math.util.MathUtils.equals(var23, var32);
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var43 = org.apache.commons.math.util.MathUtils.normalizeArray(var23, 0.042336505768089686d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test11"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(419756874, 1019215773);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-599458899));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test12"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-4299999999999900L), 512L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4299999999999900L));

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test13"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1004373820, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test14"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 100000000000000L);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test15"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-888018845), 1684284890);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1684284890);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test16"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var5 = new double[] { };
    double var6 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double var9 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var7);
    int var10 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var11 = new double[] { };
    double var12 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    double[] var13 = new double[] { };
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    double var15 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var13);
    double[] var16 = null;
    boolean var17 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var16);
    boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var11);
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var11);
    int var20 = org.apache.commons.math.util.MathUtils.hash(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test17"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.9385717546218093E106d, 1019215872);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test18"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.6225174223365766d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test19"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    double[] var19 = new double[] { };
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double[] var21 = new double[] { };
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double var23 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var21);
    int var24 = org.apache.commons.math.util.MathUtils.hash(var19);
    double[] var25 = new double[] { };
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double[] var27 = new double[] { };
    double var28 = org.apache.commons.math.util.MathUtils.safeNorm(var27);
    double var29 = org.apache.commons.math.util.MathUtils.distanceInf(var25, var27);
    double[] var30 = null;
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var30);
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var25);
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var25);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var6, var25);
    double[] var35 = new double[] { };
    double var36 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    double[] var37 = new double[] { };
    double var38 = org.apache.commons.math.util.MathUtils.safeNorm(var37);
    double var39 = org.apache.commons.math.util.MathUtils.distanceInf(var35, var37);
    int var40 = org.apache.commons.math.util.MathUtils.hash(var35);
    double[] var41 = new double[] { };
    double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var41);
    double[] var43 = new double[] { };
    double var44 = org.apache.commons.math.util.MathUtils.safeNorm(var43);
    double var45 = org.apache.commons.math.util.MathUtils.distanceInf(var41, var43);
    double[] var46 = null;
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var41, var46);
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var41);
    boolean var49 = org.apache.commons.math.util.MathUtils.equals(var25, var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test20"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.2604564627058306d, 1.5533421480573115d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.2604564627058306d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test21"); }


    double[] var0 = new double[] { };
    double[] var1 = new double[] { };
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var3 = new double[] { };
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double var5 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var3);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var1);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double[] var9 = new double[] { };
    double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var9);
    double var11 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var9);
    double[] var12 = null;
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var12);
    double var14 = org.apache.commons.math.util.MathUtils.distance(var1, var7);
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test22"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-56885140), 9L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-18087936));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test23"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-0.30143902632218805d), 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.30143902632218805d));

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test24"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3.6661404377193025E21d, 0.0995037190209988d, 22026.465794806718d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test25"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.027712143770207958d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9996160431168271d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test26"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-18087936), 1603330122);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test27"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.0894547577451082d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1967802165);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test28"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1101379457);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test29"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(101.79088596476825d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test30"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (-2055472826581778431L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2055472826581778431L);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test31"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 1603330122);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test32"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(420L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.009769441191789432d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999522793889477d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test34"); }


    long var2 = org.apache.commons.math.util.FastMath.min(4299999999989900L, 420L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 420L);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test35"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(13, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test36"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1578339261));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test37"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(101.0d, 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 827392.0d);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test38"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-4299999999989900L), 3631948708846703094L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test39"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(18.651581895316685d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.6519900511698773d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test40"); }


    java.lang.Number var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var10 = var9.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var3, (java.lang.Number)1.4218932149930186d, 1076101120, var11, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1.5273476492283813d), (java.lang.Number)1.5430806348152437d, (-1), var11, false);
    int var16 = var15.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test41"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 372980732420685824L);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test42"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.8333747009457158d, (-1.4986562664576781d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test43"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(5.1510412321629778E18d, 45.0d, 1019215980);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test44"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(2.544443745170814E-14d, 2.349550553936472d, 0.017158961742888963d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test45"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1076101120, (-415290549));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1076101120);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(55.84475447093443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7623153243752321d);

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test47"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1699.169682815809d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test48"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var4 = var3.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var5 = var3.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var9, false);
    boolean var12 = var11.getStrict();
    java.lang.Throwable[] var13 = var11.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test49"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var11, false);
    java.lang.String var14 = var13.toString();
    var5.addSuppressed((java.lang.Throwable)var13);
    org.apache.commons.math.util.MathUtils.OrderDirection var16 = var13.getDirection();
    java.lang.Throwable[] var17 = var13.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var14.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test50"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.9973990341338582d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4986995170669291d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test51"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.47013969440533454d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.453010828061567d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test52"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-1.5707963267948966d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test53"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(3.552713678800501E-15d, Double.NaN, (-467146470));

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-1.055287372175112d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test55"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 1.5974630494818454d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test56"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(1.217652850343311d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5416614449118216d);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test57"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.8769815292078007d, (-1899993087));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test58"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1079574559, 13);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test59"); }


    java.lang.Number var0 = null;
    java.lang.Number var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var10 = var9.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var3, (java.lang.Number)1.4218932149930186d, 1076101120, var11, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, (java.lang.Number)3.6319486988467031E18d, 100, var11, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)7.2638973976934062E18d, (java.lang.Number)0.6483608274590866d, 0);
    var15.addSuppressed((java.lang.Throwable)var19);
    java.lang.String var21 = var19.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not strictly increasing (0.648 >= 7,263,897,397,693,406,200)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not strictly increasing (0.648 >= 7,263,897,397,693,406,200)"));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test60"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.5273476492283813d), 0.4205341233710355d, 3.7580604478174805E212d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test61"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.982793723247329d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test62"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-1.1447142425533319d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test63"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(2.6726963861657316d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04664735184474584d);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test64"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-0.003703853637917341d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.003703870575154885d));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test65"); }


    int var2 = org.apache.commons.math.util.FastMath.max(13, (-1502583500));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 13);

  }

  public void test66() {}
//   public void test66() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test66"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log1p((-17.328679513998633d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test67"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.7888664516031216d, (-17.328679513998633d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.0961003138207164d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test68"); }


    int[] var2 = new int[] { 10, 100};
    int[] var5 = new int[] { 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var5);
    int[] var9 = new int[] { 10, 100};
    int[] var12 = new int[] { 1, 1};
    int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var12);
    int[] var16 = new int[] { 10, 100};
    int[] var19 = new int[] { 1, 1};
    int var20 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var19);
    int var21 = org.apache.commons.math.util.MathUtils.distance1(var12, var16);
    int[] var24 = new int[] { 10, 100};
    int[] var27 = new int[] { 1, 1};
    int var28 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var27);
    int[] var31 = new int[] { 10, 100};
    int[] var34 = new int[] { 1, 1};
    int var35 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var34);
    int var36 = org.apache.commons.math.util.MathUtils.distance1(var27, var31);
    double var37 = org.apache.commons.math.util.MathUtils.distance(var16, var31);
    int[] var40 = new int[] { 10, 100};
    int[] var43 = new int[] { 1, 1};
    int var44 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var43);
    int[] var47 = new int[] { 10, 100};
    int[] var50 = new int[] { 1, 1};
    int var51 = org.apache.commons.math.util.MathUtils.distanceInf(var47, var50);
    int var52 = org.apache.commons.math.util.MathUtils.distance1(var43, var47);
    int[] var55 = new int[] { 10, 100};
    int[] var58 = new int[] { 1, 1};
    int var59 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var58);
    int[] var62 = new int[] { 10, 100};
    int[] var65 = new int[] { 1, 1};
    int var66 = org.apache.commons.math.util.MathUtils.distanceInf(var62, var65);
    int var67 = org.apache.commons.math.util.MathUtils.distance1(var58, var62);
    int var68 = org.apache.commons.math.util.MathUtils.distanceInf(var47, var62);
    int var69 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var47);
    int var70 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var47);
    int[] var73 = new int[] { 10, 100};
    int[] var76 = new int[] { 1, 1};
    int var77 = org.apache.commons.math.util.MathUtils.distanceInf(var73, var76);
    int[] var80 = new int[] { 10, 100};
    int[] var83 = new int[] { 1, 1};
    int var84 = org.apache.commons.math.util.MathUtils.distanceInf(var80, var83);
    int var85 = org.apache.commons.math.util.MathUtils.distance1(var76, var80);
    int[] var88 = new int[] { (-1), (-1)};
    int var89 = org.apache.commons.math.util.MathUtils.distanceInf(var80, var88);
    int var90 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var88);
    int[] var93 = new int[] { 10, 100};
    int[] var96 = new int[] { 1, 1};
    int var97 = org.apache.commons.math.util.MathUtils.distanceInf(var93, var96);
    int var98 = org.apache.commons.math.util.MathUtils.distance1(var88, var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == 112);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test69"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1070024521, (-1684284890));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-614260369));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test70"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1079574460), (java.lang.Number)0.027712143770207958d, 1019215980);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var7, true);
    java.lang.Number var10 = var9.getPrevious();
    java.lang.Throwable[] var11 = var9.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var15, true);
    java.lang.Number var18 = var17.getPrevious();
    var9.addSuppressed((java.lang.Throwable)var17);
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var21 = var9.toString();
    int var22 = var9.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10+ "'", var18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test71"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    int var19 = org.apache.commons.math.util.MathUtils.hash(var14);
    double[] var20 = new double[] { };
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
    double[] var25 = null;
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var14, var20);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double[] var30 = new double[] { };
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var30);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var20, var30);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var6, var20);
    double[] var35 = new double[] { };
    double var36 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    double[] var37 = new double[] { };
    double var38 = org.apache.commons.math.util.MathUtils.safeNorm(var37);
    double var39 = org.apache.commons.math.util.MathUtils.distanceInf(var35, var37);
    double[] var40 = null;
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var40);
    double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double[] var46 = new double[] { };
    double var47 = org.apache.commons.math.util.MathUtils.safeNorm(var46);
    double var48 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var46);
    int var49 = org.apache.commons.math.util.MathUtils.hash(var44);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double[] var52 = new double[] { };
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var52);
    double[] var55 = null;
    boolean var56 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var50, var55);
    double var57 = org.apache.commons.math.util.MathUtils.distance(var44, var50);
    double[] var58 = new double[] { };
    double var59 = org.apache.commons.math.util.MathUtils.safeNorm(var58);
    double[] var60 = new double[] { };
    double var61 = org.apache.commons.math.util.MathUtils.safeNorm(var60);
    double var62 = org.apache.commons.math.util.MathUtils.distanceInf(var58, var60);
    double[] var64 = new double[] { 100.0d};
    double var65 = org.apache.commons.math.util.MathUtils.distance1(var58, var64);
    double var66 = org.apache.commons.math.util.MathUtils.distance(var44, var58);
    double[] var67 = new double[] { };
    double var68 = org.apache.commons.math.util.MathUtils.safeNorm(var67);
    double[] var69 = new double[] { };
    double var70 = org.apache.commons.math.util.MathUtils.safeNorm(var69);
    double var71 = org.apache.commons.math.util.MathUtils.distanceInf(var67, var69);
    double[] var73 = new double[] { 100.0d};
    double var74 = org.apache.commons.math.util.MathUtils.distance1(var67, var73);
    boolean var75 = org.apache.commons.math.util.MathUtils.equals(var58, var67);
    boolean var76 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var58);
    double var77 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var35);
    double[] var78 = new double[] { };
    double var79 = org.apache.commons.math.util.MathUtils.safeNorm(var78);
    double[] var80 = new double[] { };
    double var81 = org.apache.commons.math.util.MathUtils.safeNorm(var80);
    double var82 = org.apache.commons.math.util.MathUtils.distanceInf(var78, var80);
    double[] var83 = null;
    boolean var84 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var78, var83);
    double[] var85 = new double[] { };
    double var86 = org.apache.commons.math.util.MathUtils.safeNorm(var85);
    double[] var87 = new double[] { };
    double var88 = org.apache.commons.math.util.MathUtils.safeNorm(var87);
    double var89 = org.apache.commons.math.util.MathUtils.distanceInf(var85, var87);
    double[] var90 = null;
    boolean var91 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var85, var90);
    boolean var92 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var83, var85);
    double var93 = org.apache.commons.math.util.MathUtils.distance(var20, var85);
    int var94 = org.apache.commons.math.util.MathUtils.hash(var85);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var85);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 1);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test72"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-1.3313065839541692E-40d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test73"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-1521136310));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test74"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.042336505768089686d, 0.0995037190209988d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test75"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-614260369));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test76"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.6592499138282774d, 0.0d, (-1752752639));

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test77"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var5 = new double[] { };
    double var6 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double var9 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var7);
    int var10 = org.apache.commons.math.util.MathUtils.hash(var5);
    double[] var11 = new double[] { };
    double var12 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    double[] var13 = new double[] { };
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    double var15 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var13);
    double[] var16 = null;
    boolean var17 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var11, var16);
    double var18 = org.apache.commons.math.util.MathUtils.distance(var5, var11);
    double[] var19 = new double[] { };
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double[] var21 = new double[] { };
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double var23 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var21);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var11, var21);
    double[] var26 = new double[] { 100.0d};
    int var27 = org.apache.commons.math.util.MathUtils.hash(var26);
    double[] var29 = new double[] { 100.0d};
    int var30 = org.apache.commons.math.util.MathUtils.hash(var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equals(var26, var29);
    int var32 = org.apache.commons.math.util.MathUtils.hash(var26);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var11, var26);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var0, var11);
    java.lang.Number var36 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1079574658, var36, 98);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var38.getDirection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var0, var39, true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test78"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.6225174223365766d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8636136441663946d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test79"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.7657701076249006d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3078128403687246d);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test80"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1527580980), (-1755643803));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 228062823);

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test81"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(10.0f, (-1578339261));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test82"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1082411609), 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test83"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(3.1805546814635168E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test84"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1967802165);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test85"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.7737756783403529d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.031376396754508d);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test86"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(43.42944819032518d, 1651916801);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test87"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(1.570705526935434d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999999958776927d);

  }

  public void test88() {}
//   public void test88() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test88"); }
// 
// 
//     double[] var0 = null;
//     java.lang.Number var1 = null;
//     org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
//     int var8 = var7.getIndex();
//     org.apache.commons.math.util.MathUtils.OrderDirection var9 = var7.getDirection();
//     org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var1, (java.lang.Number)1.4218932149930186d, 1076101120, var9, false);
//     org.apache.commons.math.util.MathUtils.checkOrder(var0, var9, false);
// 
//   }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test89"); }


    long var1 = org.apache.commons.math.util.FastMath.round(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800L);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test90"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(43L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test91"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.09934024875548192d, (-0.6683988304373829d), 0.375890375055407d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test92"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.982793723247329d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.754272742441042d));

  }

  public void test93() {}
//   public void test93() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test93"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (-351334276));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test94"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1.055287372175112d), (java.lang.Number)(-0.9912118879878864d), 1101379447);
    int var4 = var3.getIndex();
    java.lang.Number var5 = var3.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1101379447);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (-0.9912118879878864d)+ "'", var5.equals((-0.9912118879878864d)));

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test95"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1460812033), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1460812033);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test96"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.9913289158005998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test97"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test98"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-0.0037038367008656796d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.3368086899420177E-19d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test99"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(99.40824915468535d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4332363856803879d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test100"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1460812033);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1460812033);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test101"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(601873281, (-339709835));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test102"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.017453292519943295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.469446951953614E-18d);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test103"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, (-1899993087), (-599458899));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test104"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(2.8934439858858716d, 1.7763568394002505E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test105() {}
//   public void test105() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test105"); }
// 
// 
//     double[] var0 = new double[] { };
//     double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
//     double[] var2 = new double[] { };
//     double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
//     double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
//     int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
//     double[] var6 = new double[] { };
//     double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
//     double[] var8 = new double[] { };
//     double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
//     double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
//     double[] var11 = null;
//     boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var6);
//     double[] var14 = new double[] { };
//     double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
//     double[] var16 = new double[] { };
//     double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
//     double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
//     double[] var19 = new double[] { };
//     double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
//     double[] var21 = new double[] { };
//     double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
//     double var23 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var21);
//     double[] var25 = new double[] { 100.0d};
//     double var26 = org.apache.commons.math.util.MathUtils.distance1(var19, var25);
//     double var27 = org.apache.commons.math.util.MathUtils.distance1(var16, var19);
//     double var28 = org.apache.commons.math.util.MathUtils.distance1(var6, var16);
//     double[] var29 = null;
//     double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var29);
//     double[] var32 = org.apache.commons.math.util.MathUtils.normalizeArray(var29, 0.0995037190209988d);
// 
//   }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test106"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(7766279621452241928L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test107"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test108"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round((-0.01729991103029785d), (-415290549), 125);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test109"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1752752639), (-1074790369));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test110"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.09950371902099882d, 22.07935414151435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test111"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(1.3062009398075354d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7106366890357547d);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test112"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-351334276), 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1430908835));

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test113"); }


    long var2 = org.apache.commons.math.util.FastMath.max(2055472826581778431L, 4300000000362780L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2055472826581778431L);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test114"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.7046500830963349d, 735641601);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4093001661926698d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test115"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var10, true);
    java.lang.Number var13 = var12.getPrevious();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var18, false);
    java.lang.String var21 = var20.toString();
    var12.addSuppressed((java.lang.Throwable)var20);
    var6.addSuppressed((java.lang.Throwable)var20);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var28 = var27.getIndex();
    var6.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)11014.39717992353d, (java.lang.Number)100, 99, var30, false);
    boolean var33 = var32.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var32.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var38 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var40 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var38, true);
    java.lang.Number var41 = var40.getPrevious();
    java.lang.Throwable[] var42 = var40.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var46 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var48 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var46, true);
    java.lang.Number var49 = var48.getPrevious();
    var40.addSuppressed((java.lang.Throwable)var48);
    org.apache.commons.math.util.MathUtils.OrderDirection var54 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var56 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var54, true);
    java.lang.Number var57 = var56.getPrevious();
    java.lang.Throwable[] var58 = var56.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var62 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var64 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var62, false);
    java.lang.String var65 = var64.toString();
    var56.addSuppressed((java.lang.Throwable)var64);
    var40.addSuppressed((java.lang.Throwable)var64);
    org.apache.commons.math.util.MathUtils.OrderDirection var68 = var64.getDirection();
    var32.addSuppressed((java.lang.Throwable)var64);
    java.lang.Number var70 = var64.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 10+ "'", var41.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + 10+ "'", var49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + 10+ "'", var57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var65.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + (byte)1+ "'", var70.equals((byte)1));

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test116"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.22404021605361935d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.20215703980333646d);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test117"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(17.552285924044632d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0981229097947937E7d);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test118"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    double[] var20 = new double[] { 100.0d};
    double var21 = org.apache.commons.math.util.MathUtils.distance1(var14, var20);
    double var22 = org.apache.commons.math.util.MathUtils.distance(var0, var14);
    double[] var23 = null;
    double[] var24 = new double[] { };
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    double[] var26 = new double[] { };
    double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var26);
    double var28 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var26);
    boolean var29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var26);
    double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var26);
    double[] var31 = new double[] { };
    double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
    double[] var33 = new double[] { };
    double var34 = org.apache.commons.math.util.MathUtils.safeNorm(var33);
    double var35 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var33);
    int var36 = org.apache.commons.math.util.MathUtils.hash(var31);
    double[] var37 = new double[] { };
    double var38 = org.apache.commons.math.util.MathUtils.safeNorm(var37);
    double[] var39 = new double[] { };
    double var40 = org.apache.commons.math.util.MathUtils.safeNorm(var39);
    double var41 = org.apache.commons.math.util.MathUtils.distanceInf(var37, var39);
    double[] var42 = null;
    boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var42);
    double var44 = org.apache.commons.math.util.MathUtils.distance(var31, var37);
    double[] var45 = new double[] { };
    double var46 = org.apache.commons.math.util.MathUtils.safeNorm(var45);
    double[] var47 = new double[] { };
    double var48 = org.apache.commons.math.util.MathUtils.safeNorm(var47);
    double var49 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var47);
    double[] var51 = new double[] { 100.0d};
    double var52 = org.apache.commons.math.util.MathUtils.distance1(var45, var51);
    double var53 = org.apache.commons.math.util.MathUtils.distance(var31, var45);
    double[] var54 = new double[] { };
    double[] var55 = new double[] { };
    double var56 = org.apache.commons.math.util.MathUtils.safeNorm(var55);
    double[] var57 = new double[] { };
    double var58 = org.apache.commons.math.util.MathUtils.safeNorm(var57);
    double var59 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var57);
    int var60 = org.apache.commons.math.util.MathUtils.hash(var55);
    double[] var61 = new double[] { };
    double var62 = org.apache.commons.math.util.MathUtils.safeNorm(var61);
    double[] var63 = new double[] { };
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var63);
    double[] var66 = null;
    boolean var67 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var61, var66);
    double var68 = org.apache.commons.math.util.MathUtils.distance(var55, var61);
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var54, var61);
    double var70 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var61);
    double[] var71 = new double[] { };
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var71);
    double[] var73 = new double[] { };
    double var74 = org.apache.commons.math.util.MathUtils.safeNorm(var73);
    double var75 = org.apache.commons.math.util.MathUtils.distanceInf(var71, var73);
    int var76 = org.apache.commons.math.util.MathUtils.hash(var71);
    double[] var77 = new double[] { };
    double var78 = org.apache.commons.math.util.MathUtils.safeNorm(var77);
    double[] var79 = new double[] { };
    double var80 = org.apache.commons.math.util.MathUtils.safeNorm(var79);
    double var81 = org.apache.commons.math.util.MathUtils.distanceInf(var77, var79);
    double[] var82 = null;
    boolean var83 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var77, var82);
    double var84 = org.apache.commons.math.util.MathUtils.distance(var71, var77);
    double var85 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var77);
    double var86 = org.apache.commons.math.util.MathUtils.distance1(var0, var45);
    int var87 = org.apache.commons.math.util.MathUtils.hash(var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var45);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 1);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test119"); }


    long var2 = org.apache.commons.math.util.FastMath.min(4608L, 3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4608L);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test120"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(4.669133571586783d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3598112420042163d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test121"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1070024521, (-1074790369));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test122"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 101.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101.0d);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test123"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(5.1510412321629788E18d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test124"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1070025601, (-1502583401));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test125"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.460139105621001d);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test126"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1808.937484413248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test127"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var10, true);
    java.lang.Number var13 = var12.getPrevious();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var18, false);
    java.lang.String var21 = var20.toString();
    var12.addSuppressed((java.lang.Throwable)var20);
    var6.addSuppressed((java.lang.Throwable)var20);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var28 = var27.getIndex();
    var6.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var27.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-3.7028324101622514E165d), (java.lang.Number)192.89391713110956d, (-1527580980), var30, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test128"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var3.getDirection();
    int var7 = var3.getIndex();
    org.apache.commons.math.exception.NonMonotonousSequenceException var11 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1.055287372175112d), (java.lang.Number)(-0.9912118879878864d), 1101379447);
    var3.addSuppressed((java.lang.Throwable)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.3026147102431249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.302614710243125d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test130"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.966461711543166d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8228803611393988d);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test131"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-1.5d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test132() {}
//   public void test132() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test132"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.017452406545229723d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test133"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1521136321, (-647818379));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test134"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.013331781142787762d), 1.4711276743037347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test135"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance(var0, var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var0, 0.7357517089448554d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test136"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-30.771314328643022d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.1555321099749084E13d));

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test137"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 372980732420685824L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-372980732420685824L));

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test138"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(9.306852817378902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4637592732921716d);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test139"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-2.711549410413652d), (-0.5235987755983017d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.5235987755983017d));

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test140"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(98, 101);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test141"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-56885140), (-371654655));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test142"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.8333747009457158d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1008698662431307d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test143"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, 419756874);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test144"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(7766279621452241928L, 4300000000000000L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test145"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.7888664516031216d, 0.8333747009457158d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7685666771922315d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test146"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-2055472826581778431L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test147"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.3026147102431249d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test148"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)4.3368086899420177E-19d, (java.lang.Number)1.3246418194520043E174d, 1101379447);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test149"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.5d), 3.2451855365842673E32d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test150"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.49928614949910866d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6475447501750529d);

  }

  public void test151() {}
//   public void test151() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test151"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 419756874);
// 
//   }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test152"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(7766279631452241918L, (-2055472826581778431L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test153"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(101.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.308243189099001d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test154"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(3.031376396754508d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.0d);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test155"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round((-0.8067726647962681d), (-1460812033));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test156"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(1.3539956475483843E43d, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3539956475483843E43d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test157"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test158"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, (-4299989999627030L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4299989999627030L));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test159"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1079574460), 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test160"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-372980732420685833L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 372980732420685833L);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test161"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.0037038367008656796d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0037038197640463662d));

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test162"); }


    double var2 = org.apache.commons.math.util.FastMath.min(7.653571668725005d, 9.426890448884134E153d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.653571668725005d);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test163"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.4218932149930186d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1528669818503748d);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test164"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-614260369), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test165"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-2414495653486583483L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test166"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(8L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8L);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test167"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07011222389235412d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test168"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(10L, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test169"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-4591153855311649792L), (-10000000000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1024L);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test170"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1967802165, 1076101120);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test171"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.7888664516031216d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5815821519934332d);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test172"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.9913289158005998d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test173"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(10000000000L, 4608L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test174"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-0.07986046454281068d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4.575667568257209d));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test175"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.6265857884777791d), 0.999949237388157d, 1967802165);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test176"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.0047000900347975d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.78774269435562d);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test177"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, 1079574470);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test178"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(36.07140440247247d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6295647726415223d);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test179"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-14.750469787535078d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.420764326431392d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test180"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1967802165, 1521136321);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test181"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1101379457, (-351334276));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test182"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1004373820, (-3473340));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3473340));

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test183"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1460812033, (-3473340));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test184"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1272213992), (-1079574460));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1272213992));

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test185"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-351334276));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 351334276);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test186"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1079574668, (-1521136310));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test187"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1079574658, var1, 98);
    boolean var4 = var3.getStrict();
    java.lang.Number var5 = var3.getArgument();
    boolean var6 = var3.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1079574658+ "'", var5.equals(1079574658));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test188() {}
//   public void test188() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test188"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.026660402558999208d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test189"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    double[] var19 = new double[] { };
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double[] var21 = new double[] { };
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double var23 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var21);
    int var24 = org.apache.commons.math.util.MathUtils.hash(var19);
    double[] var25 = new double[] { };
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double[] var27 = new double[] { };
    double var28 = org.apache.commons.math.util.MathUtils.safeNorm(var27);
    double var29 = org.apache.commons.math.util.MathUtils.distanceInf(var25, var27);
    double[] var30 = null;
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var25, var30);
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var19, var25);
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var25);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var6, var25);
    double[] var35 = new double[] { };
    double var36 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    double[] var37 = new double[] { };
    double var38 = org.apache.commons.math.util.MathUtils.safeNorm(var37);
    double var39 = org.apache.commons.math.util.MathUtils.distanceInf(var35, var37);
    double[] var40 = new double[] { };
    double var41 = org.apache.commons.math.util.MathUtils.safeNorm(var40);
    boolean var42 = org.apache.commons.math.util.MathUtils.equals(var37, var40);
    boolean var43 = org.apache.commons.math.util.MathUtils.equals(var25, var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test190"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(4, 583320461);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test191"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(11206.740105132047d, 0.7717541676030321d, 1079574658);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test192"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(512L, 10000000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10000000000L);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test193"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.375890375055407d, 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.04695176520669263d);

  }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test194"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 1967802165);
// 
//   }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test195"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-134217727), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test196"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1521136310), 125);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test197"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(9, 1521136331);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test198"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1019215872, 1101379457);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test199"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.5486212505810175d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test200"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(4.9E-324d, 0.8414709848079504d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.9E-324d);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test201"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(22026.465794806718d, 5.919304407639753E9d, (-0.8067726647962681d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test202"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.7397529304363856d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test203"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(1080);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test204"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(9.346544339204282d, 0.042336505768089686d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test205"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(2127560705);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2127560705);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test206"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(339709747, 125);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 339709622);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test207"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.5545968900472615d), (-7.705764747520276E-20d), 0.24560975744090188d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test208"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1079574470), 98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test209"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(7.179503626599488E60d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.179503626599488E60d);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test210"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.2001027757885872d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.8108107129686453d);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test211"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(4.7763539779578176E-63d, 0.5448673186209498d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.776353977957818E-63d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test212"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    double var19 = org.apache.commons.math.util.MathUtils.distance1(var6, var16);
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test213"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(3.031376396754508d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4816398647359719d);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test214"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.20215703980333646d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4496187716314083d);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test215"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(3.552713678800501E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.52587890625E-5d);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test216"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.3078128403687246d, 0.16312797240275248d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.16312797240275248d);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test217"); }


    double var1 = org.apache.commons.math.util.FastMath.log(55.84475447093443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.022575599366318d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test218"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1390383.738728185d, (-1.055287372175112d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.290239764781304E-7d);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test219"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var6 = new double[] { 100.0d};
    double var7 = org.apache.commons.math.util.MathUtils.distance1(var0, var6);
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test220"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(4.6832988734568985d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.683298873456899d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test221"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-0.04229861514908033d), 0.6225174223365766d, (-1.055287372175112d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test222"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test223"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var0);
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var10 = new double[] { };
    double var11 = org.apache.commons.math.util.MathUtils.safeNorm(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var10);
    int var13 = org.apache.commons.math.util.MathUtils.hash(var8);
    int var14 = org.apache.commons.math.util.MathUtils.hash(var8);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var0, var8);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double[] var18 = new double[] { };
    double var19 = org.apache.commons.math.util.MathUtils.safeNorm(var18);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var18);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var18);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double[] var24 = new double[] { };
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    double var26 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var24);
    int var27 = org.apache.commons.math.util.MathUtils.hash(var22);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double[] var30 = new double[] { };
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var30);
    double[] var33 = null;
    boolean var34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var33);
    double var35 = org.apache.commons.math.util.MathUtils.distance(var22, var28);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double[] var38 = new double[] { };
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
    double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var38);
    int var41 = org.apache.commons.math.util.MathUtils.hash(var36);
    double[] var42 = new double[] { };
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var44);
    double[] var47 = null;
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var47);
    double var49 = org.apache.commons.math.util.MathUtils.distance(var36, var42);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double[] var52 = new double[] { };
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var52);
    double var55 = org.apache.commons.math.util.MathUtils.distance1(var42, var52);
    double var56 = org.apache.commons.math.util.MathUtils.distance1(var28, var42);
    double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var58 = new double[] { };
    double var59 = org.apache.commons.math.util.MathUtils.safeNorm(var58);
    double[] var60 = new double[] { };
    double var61 = org.apache.commons.math.util.MathUtils.safeNorm(var60);
    double var62 = org.apache.commons.math.util.MathUtils.distanceInf(var58, var60);
    int var63 = org.apache.commons.math.util.MathUtils.hash(var58);
    double[] var64 = new double[] { };
    double var65 = org.apache.commons.math.util.MathUtils.safeNorm(var64);
    double[] var66 = new double[] { };
    double var67 = org.apache.commons.math.util.MathUtils.safeNorm(var66);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var64, var66);
    double[] var69 = null;
    boolean var70 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var64, var69);
    double var71 = org.apache.commons.math.util.MathUtils.distance(var58, var64);
    double[] var72 = new double[] { };
    double var73 = org.apache.commons.math.util.MathUtils.safeNorm(var72);
    double[] var74 = new double[] { };
    double var75 = org.apache.commons.math.util.MathUtils.safeNorm(var74);
    double var76 = org.apache.commons.math.util.MathUtils.distanceInf(var72, var74);
    double[] var78 = new double[] { 100.0d};
    double var79 = org.apache.commons.math.util.MathUtils.distance1(var72, var78);
    double var80 = org.apache.commons.math.util.MathUtils.distance(var58, var72);
    double[] var81 = new double[] { };
    double[] var82 = new double[] { };
    double var83 = org.apache.commons.math.util.MathUtils.safeNorm(var82);
    double[] var84 = new double[] { };
    double var85 = org.apache.commons.math.util.MathUtils.safeNorm(var84);
    double var86 = org.apache.commons.math.util.MathUtils.distanceInf(var82, var84);
    int var87 = org.apache.commons.math.util.MathUtils.hash(var82);
    double[] var88 = new double[] { };
    double var89 = org.apache.commons.math.util.MathUtils.safeNorm(var88);
    double[] var90 = new double[] { };
    double var91 = org.apache.commons.math.util.MathUtils.safeNorm(var90);
    double var92 = org.apache.commons.math.util.MathUtils.distanceInf(var88, var90);
    double[] var93 = null;
    boolean var94 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var88, var93);
    double var95 = org.apache.commons.math.util.MathUtils.distance(var82, var88);
    boolean var96 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var81, var88);
    double var97 = org.apache.commons.math.util.MathUtils.distanceInf(var72, var88);
    double var98 = org.apache.commons.math.util.MathUtils.distance1(var42, var72);
    double var99 = org.apache.commons.math.util.MathUtils.distance1(var18, var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == 0.0d);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test224"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(2.8934439858858716d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 17.05538513813742d);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test225"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(17.552285924044632d, 17.05538513813742d, (-599458899));

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test226"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.0069607461956276d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6966215111753126d);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test227"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(43.1284181946612d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 43.12841819466121d);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test228"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(351334276);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 351334276);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test229"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(2.544443745170814E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.544443745170814E-14d);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test230"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.11847483697428918d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test231"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.8538544316640622d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test232"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(2.2737367544323206E-13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test233"); }


    double var1 = org.apache.commons.math.util.FastMath.rint((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test234"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-18087936));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.7657701076249006d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test236"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(735641601, 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test237"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.4816398647359719d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.481639864735972d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test238"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.9999931408046882d, (-98), 1684284890);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test239"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.6746455821618494d, (-0.5528489599319215d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.5528489599319215d));

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test240"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.09950371902099882d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1556083294);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test241"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.9372266209396999d, 5.919304407639753E9d, 1.1778057828090869d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test242"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var13, true);
    java.lang.Number var16 = var15.getPrevious();
    java.lang.Throwable[] var17 = var15.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var23 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var21, false);
    java.lang.String var24 = var23.toString();
    var15.addSuppressed((java.lang.Throwable)var23);
    var9.addSuppressed((java.lang.Throwable)var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var31 = var30.getIndex();
    var9.addSuppressed((java.lang.Throwable)var30);
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = var9.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var35 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.9385717546218093E106d, (java.lang.Number)4.50202336173618d, 1101379447, var33, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var37 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)100, (java.lang.Number)0.6295647726415223d, (-1502583500), var33, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10+ "'", var16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var24.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test243"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.47013969440533454d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 481.42304707106257d);

  }

  public void test244() {}
//   public void test244() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test244"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 1079574658);
// 
//   }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test245"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.042336505768089686d, 1.9404911749776285E9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.042336505768089686d);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test246"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1521136310), 1556083294);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test247"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)9.426890448884134E153d, (java.lang.Number)26.93702027099595d, 1019215773);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,019,215,772 and 1,019,215,773 are not strictly increasing (26.937 >= 9,426,890,448,884,134,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,019,215,772 and 1,019,215,773 are not strictly increasing (26.937 >= 9,426,890,448,884,134,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000)"));

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test248"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test249"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.9960122203784275d), 9.306852817378902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9960122203784275d));

  }

  public void test250() {}
//   public void test250() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test250"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(5.308243189099001d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test251() {}
//   public void test251() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test251"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.302614710243125d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test252"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1899993087), (-467146470));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1899993087));

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test253"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var0);
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var10 = new double[] { };
    double var11 = org.apache.commons.math.util.MathUtils.safeNorm(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var10);
    int var13 = org.apache.commons.math.util.MathUtils.hash(var8);
    int var14 = org.apache.commons.math.util.MathUtils.hash(var8);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var0, var8);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double[] var18 = new double[] { };
    double var19 = org.apache.commons.math.util.MathUtils.safeNorm(var18);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var18);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var18);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test254"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 101, 1460812033);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test255() {}
//   public void test255() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test255"); }
// 
// 
//     int[] var0 = null;
//     int[] var1 = null;
//     int var2 = org.apache.commons.math.util.MathUtils.distance1(var0, var1);
// 
//   }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test256"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(101);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test257"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.2885091796441545E8d, 2036.0573082347366d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test258"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(5730.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.0d));

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test259"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    java.lang.String var4 = var3.toString();
    boolean var5 = var3.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var6 = var3.getDirection();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var8.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test260"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.8964626379063775d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test261"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1527580980), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test262"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var2);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test263"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.009769441191789432d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test264"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-4299999999989900L), 8L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-34399999999919200L));

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test265"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(100000000000000L, 3631948698846703104L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3632048698846703104L);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test266"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(3.552713678800501E-15d, 10.306852817378902d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test267"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 1, 1521136321);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test268"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-371654655));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test269"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-647818379), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test270"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-2410195653486221123L), (-2410195653486221123L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2410195653486221123L));

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test271"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(8.653571668725002d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.053044982604793d);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test272"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(100.00000000000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test273"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.1102230246251565E-16d, 583320461);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.804810770435008E257d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test274"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.6966215111753126d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 232803866);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test275"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(101.79088596476825d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.057310254207794E43d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test276"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.1008698662431307d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.006780383466121d);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test277"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-1.3621933433466908d), (java.lang.Number)0, (-18087936));

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test278"); }


    long var2 = org.apache.commons.math.util.FastMath.min(7766279631452241920L, 100000000000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100000000000000L);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test279"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1556083294, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1556083402);

  }

  public void test280() {}
//   public void test280() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test280"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(100.0f, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test281"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1222173151), 372980732420685833L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1893163231));

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test282"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-2059772826581768331L), 9999999990L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2059772816581768341L));

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test283"); }


    double var1 = org.apache.commons.math.util.FastMath.log(2036.0573082347366d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.6187705247373145d);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test284"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.9830878452829971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test285"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.20215703980333646d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.19944744277937854d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test286"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.9999522793889477d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5430245552531479d);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test287"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-0.13094730829943166d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test288"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(1101379457, (-1430908835));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test289"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.3313065839541692E-40d), 3.031376396754508d, (-18087936));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test290"); }


    long var2 = org.apache.commons.math.util.FastMath.max(3632048698846703104L, (-2059772826581768331L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3632048698846703104L);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test291"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(5729.577951308233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5730.0d);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test292"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-56885140));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test293"); }


    double var2 = org.apache.commons.math.util.FastMath.min(100.0d, (-0.07986046454281068d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.07986046454281068d));

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test294"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.453010828061567d, (-0.9645439376170786d), 1.9278734210918875d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test295"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.9915078644584707d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test296"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 1684284890);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1684284890));

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test297"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1072693248);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test298"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(2L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test299"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.45434578226120304d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4901629850122834d);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test300"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.7032850100323763E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test301"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)10L, (java.lang.Number)(-1755643678), 0);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test302"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test303"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.1906899454435433d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test304"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(7.6187705247373145d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.7194271407477864d);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test305"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 1079574470, 583320461);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test306"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.1008698662431307d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test307"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = new double[] { };
//     double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     double[] var3 = new double[] { };
//     double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
//     double var5 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var3);
//     double[] var6 = null;
//     boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var6);
//     double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     boolean var9 = org.apache.commons.math.util.MathUtils.equals(var0, var1);
//     double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
// 
//   }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test308"); }


    java.lang.Number var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var13, true);
    java.lang.Number var16 = var15.getPrevious();
    java.lang.Throwable[] var17 = var15.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var23 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var21, false);
    java.lang.String var24 = var23.toString();
    var15.addSuppressed((java.lang.Throwable)var23);
    var9.addSuppressed((java.lang.Throwable)var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var31 = var30.getIndex();
    var9.addSuppressed((java.lang.Throwable)var30);
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = var30.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var30.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var3, (java.lang.Number)1521136321, 1019215980, var34, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.07011222389235412d, (java.lang.Number)0.25972082263993446d, 1101379457, var34, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10+ "'", var16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var24.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test309"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(2.006780383466121d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 114.98004638225366d);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test310"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test311"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(43.1284181946612d, 0.3026147102431249d, 2.232630319679133d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test312() {}
//   public void test312() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test312"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.pow((-0.29873692127031404d), 0.6483608274590866d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test313"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var10, true);
    java.lang.Number var13 = var12.getPrevious();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var18, false);
    java.lang.String var21 = var20.toString();
    var12.addSuppressed((java.lang.Throwable)var20);
    var6.addSuppressed((java.lang.Throwable)var20);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var28 = var27.getIndex();
    var6.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.09934024875548192d, (java.lang.Number)1019215980, 99, var30, false);
    int var33 = var32.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 99);

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test314"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(100.00736613927508d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4210854715202004E-14d);

  }

  public void test315() {}
//   public void test315() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test315"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(2.349550553936472d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test316"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.9898007759240806d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test317"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.027712142680348443d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.027708596922878654d);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test318"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test319"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1019215980, 1684284890);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test320"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    int var19 = org.apache.commons.math.util.MathUtils.hash(var14);
    double[] var20 = new double[] { };
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
    double[] var25 = null;
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var14, var20);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double[] var30 = new double[] { };
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var30);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var20, var30);
    double[] var34 = new double[] { };
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var36);
    int var39 = org.apache.commons.math.util.MathUtils.hash(var34);
    double[] var40 = new double[] { };
    double var41 = org.apache.commons.math.util.MathUtils.safeNorm(var40);
    double[] var42 = new double[] { };
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double var44 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var42);
    double[] var45 = null;
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var40, var45);
    double var47 = org.apache.commons.math.util.MathUtils.distance(var34, var40);
    double[] var48 = new double[] { };
    double var49 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var50);
    double var53 = org.apache.commons.math.util.MathUtils.distance1(var40, var50);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var50);
    int var55 = org.apache.commons.math.util.MathUtils.hash(var50);
    double var56 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var58 = org.apache.commons.math.util.MathUtils.normalizeArray(var50, 2.5444437451708134E-14d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test321"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-85.94366926962348d), 0.5532017491460262d, 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test322"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7763568394002505E-15d);

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test323"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(Double.NEGATIVE_INFINITY, 0.302614710243125d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.5707963267948966d));

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test324"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(7.179503626599488E60d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 140.1263358275275d);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test325"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1079574658);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1079574658);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test326"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(22.07935414151435d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 22.079354141514354d);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test327"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(5730.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.346617997883044d);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test328"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1079574470), (-3473340));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test329"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin((-1.4986562664576781d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test330"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-1.5719961586063422d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.511941457053524d);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test331"); }


    java.lang.Number var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var13, true);
    java.lang.Number var16 = var15.getPrevious();
    java.lang.Throwable[] var17 = var15.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var23 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var21, false);
    java.lang.String var24 = var23.toString();
    var15.addSuppressed((java.lang.Throwable)var23);
    var9.addSuppressed((java.lang.Throwable)var23);
    org.apache.commons.math.exception.NonMonotonousSequenceException var30 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var31 = var30.getIndex();
    var9.addSuppressed((java.lang.Throwable)var30);
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = var30.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var30.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var3, (java.lang.Number)1521136321, 1019215980, var34, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1808.937484413248d, (java.lang.Number)36.07140440247247d, (-1074790369), var34, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var42 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var46 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var48 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var46, true);
    java.lang.Number var49 = var48.getPrevious();
    java.lang.Throwable[] var50 = var48.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var54 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var56 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var54, false);
    java.lang.String var57 = var56.toString();
    var48.addSuppressed((java.lang.Throwable)var56);
    var42.addSuppressed((java.lang.Throwable)var56);
    org.apache.commons.math.util.MathUtils.OrderDirection var63 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var65 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var63, true);
    java.lang.Number var66 = var65.getPrevious();
    java.lang.Throwable[] var67 = var65.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var71 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var73 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var71, false);
    java.lang.String var74 = var73.toString();
    var65.addSuppressed((java.lang.Throwable)var73);
    var42.addSuppressed((java.lang.Throwable)var73);
    java.lang.Number var77 = var42.getPrevious();
    var38.addSuppressed((java.lang.Throwable)var42);
    java.lang.Number var79 = var42.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10+ "'", var16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var24.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + 10+ "'", var49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var57.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + 10+ "'", var66.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var74.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + (-1.0f)+ "'", var77.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + 1.4711276743037347d+ "'", var79.equals(1.4711276743037347d));

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test332"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.5533421480573115d, (-1502583401), (-56885140));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test333"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-0.754272742441042d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.754272742441042d));

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test334"); }


    double var2 = org.apache.commons.math.util.FastMath.min(8.729304787132461d, 0.9830878452829971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9830878452829971d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test335"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0000000000000997d, 1.4218932149930186d, 601873281);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test336"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-4299999999627020L), (-2059772826581768331L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2064072826581395351L));

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test337"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.5309649148733797d), 12.701624116069713d, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test338"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.lcm(228062823, 1072693248);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test339"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-1755643803), (-1755643678));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test340"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.0000000000000997d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6931471805599951d);

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test341"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(8.0d, 0.5436536017775284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5029439482393134d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test342"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1755643803));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test343"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.5430806348152437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4463520074491623d);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test344"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.7685666771922315d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3101750101808125d);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test345"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0069607461956276d, 1808.9374844784174d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test346"); }


    double[] var0 = null;
    double[] var1 = new double[] { };
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double[] var4 = new double[] { };
    double var5 = org.apache.commons.math.util.MathUtils.safeNorm(var4);
    double var6 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var4);
    int var7 = org.apache.commons.math.util.MathUtils.hash(var2);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var10 = new double[] { };
    double var11 = org.apache.commons.math.util.MathUtils.safeNorm(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var10);
    double[] var13 = null;
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var8, var13);
    double var15 = org.apache.commons.math.util.MathUtils.distance(var2, var8);
    boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var8);
    double[] var17 = new double[] { };
    double var18 = org.apache.commons.math.util.MathUtils.safeNorm(var17);
    double[] var19 = new double[] { };
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double var21 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var19);
    int var22 = org.apache.commons.math.util.MathUtils.hash(var17);
    double[] var23 = new double[] { };
    double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var23);
    double[] var25 = new double[] { };
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var25);
    double[] var28 = null;
    boolean var29 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance(var17, var23);
    double[] var31 = new double[] { };
    double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
    double[] var33 = new double[] { };
    double var34 = org.apache.commons.math.util.MathUtils.safeNorm(var33);
    double var35 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var33);
    double var36 = org.apache.commons.math.util.MathUtils.distance1(var23, var33);
    double var37 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var23);
    boolean var38 = org.apache.commons.math.util.MathUtils.equals(var0, var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test347"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var3, false);
    java.lang.String var6 = var5.toString();
    java.lang.Number var7 = var5.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = var5.getDirection();
    java.lang.String var9 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1521136321, (java.lang.Number)99, 1076101120, var13, true);
    java.lang.Number var16 = var15.getArgument();
    var5.addSuppressed((java.lang.Throwable)var15);
    java.lang.Number var18 = var15.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.5430806348152437d+ "'", var7.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var9.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 1521136321+ "'", var16.equals(1521136321));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 1521136321+ "'", var18.equals(1521136321));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test348"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.1778057828090869d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test349"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.7440203731483772d, 1603330122, 1019215872);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test350"); }


    float var2 = org.apache.commons.math.util.FastMath.min(10.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test351"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-0.4117531319495564d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.551115123125783E-17d);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test352"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(2.5087768644478907d, 0.999949237388157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5087768644478903d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test353"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(1.5528914555904665d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test354"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.4701396944053346d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1125663420637704d);

  }

  public void test355() {}
//   public void test355() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test355"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(Float.NaN, 10.0f);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test356"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(8L, 1460812033);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test357"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    java.lang.String var4 = var3.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var5 = var3.getDirection();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test358"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow((-4299999999627020L), (-2055472826581778435L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test359"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-92L), (-2055472826581778435L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test360"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1024L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test361"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.427898984972162d), 2.006780383466121d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test362"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.0037038197640463662d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.1547212438833835d));

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test363"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.04233649671419262d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1509641883));

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test364"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(4300000000000000L, (-4591153855311649792L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1024L);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test365"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1, 735641601);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test366"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-34399999999919200L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.9900372736850792d, (-1), (-351334276));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test368"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(4.7763539779578176E-63d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.7763539779578176E-63d);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test369"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.5486212505810175d, 1967802165);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.2046367127482624E-61d));

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test370"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(420L, 2127560705);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test371"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.5880372899139367d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.177933759221025d);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test372"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(1651916801);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test373"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.042311238570781805d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9991050130774393d);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test374"); }


    double var2 = org.apache.commons.math.util.FastMath.max((-0.11847483697428918d), 0.49928614949910866d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.49928614949910866d);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test375"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh((-0.6903789039490631d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8486793536069225d));

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test376"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(3.6319486988467031E18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test377"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(2.053044982604793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1175369159735251d);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test378"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(3632048698846703104L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3632048698846703104L);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test379"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(9223372036854775807L, 43L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test380"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.2001027757885872d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test381"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1527580980), 2127560705);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1527580980));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test382"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var4 = var3.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var5 = var3.getDirection();
    int var6 = var3.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test383"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(2.053044982604793d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test384"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-2.625667034778162d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2011264158);

  }

  public void test385() {}
//   public void test385() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test385"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-2.5989209175025785d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test386"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(420L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test387"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1430908835), (-1755643678));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test388"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.7696295903822673d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 44.09652731728625d);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test389"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    int var19 = org.apache.commons.math.util.MathUtils.hash(var14);
    double[] var20 = new double[] { };
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
    double[] var25 = null;
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var14, var20);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double[] var30 = new double[] { };
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var30);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var20, var30);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var6, var20);
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double[] var38 = new double[] { };
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
    double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var38);
    int var41 = org.apache.commons.math.util.MathUtils.hash(var36);
    double[] var42 = new double[] { };
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var44);
    double[] var47 = null;
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var47);
    double var49 = org.apache.commons.math.util.MathUtils.distance(var36, var42);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double[] var52 = new double[] { };
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var52);
    double[] var56 = new double[] { 100.0d};
    double var57 = org.apache.commons.math.util.MathUtils.distance1(var50, var56);
    double var58 = org.apache.commons.math.util.MathUtils.distance(var36, var50);
    double[] var59 = new double[] { };
    double[] var60 = new double[] { };
    double var61 = org.apache.commons.math.util.MathUtils.safeNorm(var60);
    double[] var62 = new double[] { };
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var62);
    int var65 = org.apache.commons.math.util.MathUtils.hash(var60);
    double[] var66 = new double[] { };
    double var67 = org.apache.commons.math.util.MathUtils.safeNorm(var66);
    double[] var68 = new double[] { };
    double var69 = org.apache.commons.math.util.MathUtils.safeNorm(var68);
    double var70 = org.apache.commons.math.util.MathUtils.distanceInf(var66, var68);
    double[] var71 = null;
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var66, var71);
    double var73 = org.apache.commons.math.util.MathUtils.distance(var60, var66);
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var66);
    double var75 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var66);
    double var76 = org.apache.commons.math.util.MathUtils.distance1(var20, var50);
    int var77 = org.apache.commons.math.util.MathUtils.hash(var20);
    double[] var78 = new double[] { };
    double var79 = org.apache.commons.math.util.MathUtils.safeNorm(var78);
    double[] var80 = new double[] { };
    double var81 = org.apache.commons.math.util.MathUtils.safeNorm(var80);
    double var82 = org.apache.commons.math.util.MathUtils.distanceInf(var78, var80);
    int var83 = org.apache.commons.math.util.MathUtils.hash(var78);
    double var84 = org.apache.commons.math.util.MathUtils.distance(var20, var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0.0d);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test390"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(481.42304707106257d, 9.346617997883044d, 0.7262470632772886d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test391"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1521136310));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test392"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, Double.NEGATIVE_INFINITY, 43.42944819032518d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test393"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.6966215111753126d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.012158339010227679d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test394"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-3473340), (-1079574470));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 130);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test395"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.026663562285575523d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9996445482827717d);

  }

  public void test396() {}
//   public void test396() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test396"); }
// 
// 
//     int[] var0 = null;
//     int[] var4 = new int[] { 100, 10, 0};
//     int var5 = org.apache.commons.math.util.MathUtils.distance1(var0, var4);
// 
//   }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test397"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(18.651581895316685d, 1.5974630494818454d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.1600915342063557d);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test398"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(2.2326303196791324d, 18.651581895316685d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.232630319679133d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test399"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var10, true);
    java.lang.Number var13 = var12.getPrevious();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var18, false);
    java.lang.String var21 = var20.toString();
    var12.addSuppressed((java.lang.Throwable)var20);
    var6.addSuppressed((java.lang.Throwable)var20);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var28 = var27.getIndex();
    var6.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)11014.39717992353d, (java.lang.Number)100, 99, var30, false);
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = var32.getDirection();
    boolean var34 = var32.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test400() {}
//   public void test400() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test400"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = new double[] { };
//     double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     double[] var3 = new double[] { };
//     double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
//     double var5 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var3);
//     double[] var6 = new double[] { };
//     double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
//     double[] var8 = new double[] { };
//     double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
//     double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
//     int var11 = org.apache.commons.math.util.MathUtils.hash(var6);
//     double[] var12 = new double[] { };
//     double var13 = org.apache.commons.math.util.MathUtils.safeNorm(var12);
//     double[] var14 = new double[] { };
//     double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
//     double var16 = org.apache.commons.math.util.MathUtils.distanceInf(var12, var14);
//     double[] var17 = null;
//     boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var12, var17);
//     boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var12);
//     boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var3, var12);
//     double[] var21 = new double[] { };
//     double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
//     double[] var23 = new double[] { };
//     double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var23);
//     double var25 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var23);
//     double[] var26 = new double[] { };
//     double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var26);
//     boolean var28 = org.apache.commons.math.util.MathUtils.equals(var23, var26);
//     double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var26);
//     double var30 = org.apache.commons.math.util.MathUtils.distance1(var3, var26);
//     double[] var31 = new double[] { };
//     double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
//     double var33 = org.apache.commons.math.util.MathUtils.distance(var26, var31);
//     double[] var34 = new double[] { };
//     double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
//     double[] var36 = new double[] { };
//     double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
//     double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var36);
//     double[] var39 = new double[] { };
//     double var40 = org.apache.commons.math.util.MathUtils.safeNorm(var39);
//     double[] var41 = new double[] { };
//     double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var41);
//     double var43 = org.apache.commons.math.util.MathUtils.distanceInf(var39, var41);
//     int var44 = org.apache.commons.math.util.MathUtils.hash(var39);
//     double[] var45 = new double[] { };
//     double var46 = org.apache.commons.math.util.MathUtils.safeNorm(var45);
//     double[] var47 = new double[] { };
//     double var48 = org.apache.commons.math.util.MathUtils.safeNorm(var47);
//     double var49 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var47);
//     double[] var50 = null;
//     boolean var51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var45, var50);
//     boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var45);
//     boolean var53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var45);
//     double[] var54 = new double[] { };
//     double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
//     double[] var56 = new double[] { };
//     double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var56);
//     double var58 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var56);
//     double[] var59 = new double[] { };
//     double var60 = org.apache.commons.math.util.MathUtils.safeNorm(var59);
//     boolean var61 = org.apache.commons.math.util.MathUtils.equals(var56, var59);
//     double var62 = org.apache.commons.math.util.MathUtils.safeNorm(var59);
//     double var63 = org.apache.commons.math.util.MathUtils.distance1(var36, var59);
//     double var64 = org.apache.commons.math.util.MathUtils.distance1(var31, var59);
//     double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var59);
// 
//   }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test401"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.13608433553687035d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test402"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.718281828459045d);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test403"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(7.755042652369133E24d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3192017467498949d);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test404"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.4119627100860633d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7440794359665133d));

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test405"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-415290549), 1521136331);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test406"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(99.40824915468535d, 0.5818529184041428d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99.40824915468534d);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test407"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-98));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test408"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.5707963267948963d, 1.8277564186494852E85d, 1.0000000000000997d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test409"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var11, true);
    java.lang.Number var14 = var13.getPrevious();
    var5.addSuppressed((java.lang.Throwable)var13);
    int var16 = var5.getIndex();
    java.lang.Number var17 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test410"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1079574668);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1079574668);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test411"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var10, true);
    java.lang.Number var13 = var12.getPrevious();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var18, false);
    java.lang.String var21 = var20.toString();
    var12.addSuppressed((java.lang.Throwable)var20);
    var6.addSuppressed((java.lang.Throwable)var20);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var28 = var27.getIndex();
    var6.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)11014.39717992353d, (java.lang.Number)100, 99, var30, false);
    boolean var33 = var32.getStrict();
    int var34 = var32.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 99);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test412"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-2055472826581778435L), (-4299989999999910L));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(339709622);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test414"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.07011222389235412d, (-0.5063656411097555d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.07011222389235412d);

  }

  public void test415() {}
//   public void test415() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test415"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(22.72239358477698d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test416"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.4798386836181619d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.461636082722018d);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test417"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(1.0047000900347975d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.09691659130134456d);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test418"); }


    int var2 = org.apache.commons.math.util.FastMath.min(101, (-1430908835));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1430908835));

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test419"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var7, true);
    java.lang.Number var10 = var9.getPrevious();
    java.lang.Throwable[] var11 = var9.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var15 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var15, false);
    java.lang.String var18 = var17.toString();
    var9.addSuppressed((java.lang.Throwable)var17);
    var3.addSuppressed((java.lang.Throwable)var17);
    org.apache.commons.math.exception.NonMonotonousSequenceException var24 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var25 = var24.getIndex();
    var3.addSuppressed((java.lang.Throwable)var24);
    org.apache.commons.math.util.MathUtils.OrderDirection var27 = var24.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var28 = var24.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var24.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var18.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test420"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var5);
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var10 = new double[] { };
    double var11 = org.apache.commons.math.util.MathUtils.safeNorm(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var10);
    int var13 = org.apache.commons.math.util.MathUtils.hash(var8);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    double[] var19 = null;
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var14, var19);
    double var21 = org.apache.commons.math.util.MathUtils.distance(var8, var14);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double[] var24 = new double[] { };
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    double var26 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var24);
    double[] var28 = new double[] { 100.0d};
    double var29 = org.apache.commons.math.util.MathUtils.distance1(var22, var28);
    double var30 = org.apache.commons.math.util.MathUtils.distance(var8, var22);
    double[] var31 = new double[] { };
    double[] var32 = new double[] { };
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[] var34 = new double[] { };
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var32, var34);
    int var37 = org.apache.commons.math.util.MathUtils.hash(var32);
    double[] var38 = new double[] { };
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
    double[] var40 = new double[] { };
    double var41 = org.apache.commons.math.util.MathUtils.safeNorm(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var40);
    double[] var43 = null;
    boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var38, var43);
    double var45 = org.apache.commons.math.util.MathUtils.distance(var32, var38);
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var31, var38);
    double var47 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var38);
    double[] var48 = new double[] { };
    double var49 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var50);
    int var53 = org.apache.commons.math.util.MathUtils.hash(var48);
    double[] var54 = new double[] { };
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
    double[] var56 = new double[] { };
    double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var56);
    double var58 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var56);
    double[] var59 = null;
    boolean var60 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var54, var59);
    double var61 = org.apache.commons.math.util.MathUtils.distance(var48, var54);
    double var62 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var54);
    boolean var63 = org.apache.commons.math.util.MathUtils.equals(var0, var22);
    double[] var64 = null;
    double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test421"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-1684284890));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test422"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.3192017467498949d, 0.0d, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test423"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.49928614949910866d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.40498909449773257d);

  }

  public void test424() {}
//   public void test424() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test424"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 1521136321);
// 
//   }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test425"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(0.6746455821618494d, 1684284890);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test426"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(9.346617997883044d, (-0.0d), (-467146470));

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test427"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1079574668, 339709747);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test428"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.5818529184041428d, 1.0003554938375268d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test429"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var11 = null;
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var6, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance(var0, var6);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var14, var16);
    int var19 = org.apache.commons.math.util.MathUtils.hash(var14);
    double[] var20 = new double[] { };
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
    double[] var25 = null;
    boolean var26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var20, var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var14, var20);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double[] var30 = new double[] { };
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var30);
    double var33 = org.apache.commons.math.util.MathUtils.distance1(var20, var30);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var6, var20);
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double[] var38 = new double[] { };
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
    double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var38);
    int var41 = org.apache.commons.math.util.MathUtils.hash(var36);
    double[] var42 = new double[] { };
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var44);
    double[] var47 = null;
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var47);
    double var49 = org.apache.commons.math.util.MathUtils.distance(var36, var42);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double[] var52 = new double[] { };
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var52);
    double[] var56 = new double[] { 100.0d};
    double var57 = org.apache.commons.math.util.MathUtils.distance1(var50, var56);
    double var58 = org.apache.commons.math.util.MathUtils.distance(var36, var50);
    double[] var59 = new double[] { };
    double[] var60 = new double[] { };
    double var61 = org.apache.commons.math.util.MathUtils.safeNorm(var60);
    double[] var62 = new double[] { };
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var62);
    int var65 = org.apache.commons.math.util.MathUtils.hash(var60);
    double[] var66 = new double[] { };
    double var67 = org.apache.commons.math.util.MathUtils.safeNorm(var66);
    double[] var68 = new double[] { };
    double var69 = org.apache.commons.math.util.MathUtils.safeNorm(var68);
    double var70 = org.apache.commons.math.util.MathUtils.distanceInf(var66, var68);
    double[] var71 = null;
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var66, var71);
    double var73 = org.apache.commons.math.util.MathUtils.distance(var60, var66);
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var59, var66);
    double var75 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var66);
    double var76 = org.apache.commons.math.util.MathUtils.distance1(var20, var50);
    int var77 = org.apache.commons.math.util.MathUtils.hash(var20);
    java.lang.Number var78 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var84 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var85 = var84.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var86 = var84.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var88 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var78, (java.lang.Number)1.4218932149930186d, 1076101120, var86, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var20, var86, false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test430"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-0.7638547928738363d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.46586713996720486d);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test431"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(112, (-98));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 784);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test432"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.8228803611393988d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.08466330242312409d));

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test433"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-614260369), 13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test434"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-1.5273476492283813d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.19441663462502d));

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test435"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(13L, (-2414495653486583483L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2414495653486583496L);

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test436"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-2.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.185039863261519d);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test437"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-2055472826581778431L), 372980732420685833L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2428453559002464264L));

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test438"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-0.13005011733123764d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9915553955522491d);

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test439"); }


    double[] var1 = new double[] { (-1.0d)};
    org.apache.commons.math.util.MathUtils.OrderDirection var2 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var1, var2, false);
    double[] var5 = new double[] { };
    double var6 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double var9 = org.apache.commons.math.util.MathUtils.distanceInf(var5, var7);
    double[] var11 = new double[] { 100.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var5, var11);
    int var13 = org.apache.commons.math.util.MathUtils.hash(var11);
    boolean var14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var11);
    double[] var16 = new double[] { 100.0d};
    int var17 = org.apache.commons.math.util.MathUtils.hash(var16);
    double[] var19 = new double[] { 100.0d};
    int var20 = org.apache.commons.math.util.MathUtils.hash(var19);
    boolean var21 = org.apache.commons.math.util.MathUtils.equals(var16, var19);
    int var22 = org.apache.commons.math.util.MathUtils.hash(var16);
    double[] var23 = null;
    boolean var24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var23);
    boolean var25 = org.apache.commons.math.util.MathUtils.equals(var11, var16);
    org.apache.commons.math.util.MathUtils.checkOrder(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test440"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(4300000000362780L, 7766279631452241919L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test441() {}
//   public void test441() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test441"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log((-0.0894547577451082d), (-0.027025482960377652d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test442"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.9997541430723863d, 1.455747413381806d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test443"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(125, (-34399999999919200L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test444"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)3.75806044781748E212d, (java.lang.Number)(-0.5545968900472615d), 1101379447);
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)7.38261378778625E9d, (java.lang.Number)1101379457, 0, var7, false);
    java.lang.Number var10 = var9.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 7.38261378778625E9d+ "'", var10.equals(7.38261378778625E9d));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test445"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round((-1.0460819186432146d), (-1074790369));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test446"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.7032850100323763E8d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7032850100323763E8d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test447"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(3628800.0d, 601873281);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3.834150389170204E276d));

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test448"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1578339261), (-1460812033));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-117527228));

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test449"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(2.718281828459045d, (-0.4119627100860633d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.7212043739881173d);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test450"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var10, true);
    java.lang.Number var13 = var12.getPrevious();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var18, false);
    java.lang.String var21 = var20.toString();
    var12.addSuppressed((java.lang.Throwable)var20);
    var6.addSuppressed((java.lang.Throwable)var20);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var28 = var27.getIndex();
    var6.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)11014.39717992353d, (java.lang.Number)100, 99, var30, false);
    boolean var33 = var32.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var34 = var32.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var38 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var40 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var38, true);
    java.lang.Number var41 = var40.getPrevious();
    java.lang.Throwable[] var42 = var40.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var46 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var48 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var46, true);
    java.lang.Number var49 = var48.getPrevious();
    var40.addSuppressed((java.lang.Throwable)var48);
    org.apache.commons.math.util.MathUtils.OrderDirection var54 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var56 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var54, true);
    java.lang.Number var57 = var56.getPrevious();
    java.lang.Throwable[] var58 = var56.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var62 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var64 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var62, false);
    java.lang.String var65 = var64.toString();
    var56.addSuppressed((java.lang.Throwable)var64);
    var40.addSuppressed((java.lang.Throwable)var64);
    org.apache.commons.math.util.MathUtils.OrderDirection var68 = var64.getDirection();
    var32.addSuppressed((java.lang.Throwable)var64);
    java.lang.Throwable[] var70 = var32.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 10+ "'", var41.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + 10+ "'", var49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + 10+ "'", var57.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var65.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test451"); }


    long var2 = org.apache.commons.math.util.FastMath.min(7766279621452241928L, 4299999999989900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4299999999989900L);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test452"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var6 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var10, true);
    java.lang.Number var13 = var12.getPrevious();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var18, false);
    java.lang.String var21 = var20.toString();
    var12.addSuppressed((java.lang.Throwable)var20);
    var6.addSuppressed((java.lang.Throwable)var20);
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var28 = var27.getIndex();
    var6.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var6.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.9385717546218093E106d, (java.lang.Number)4.50202336173618d, 1101379447, var30, true);
    boolean var33 = var32.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var21.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test453"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-1019215872));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test454"); }


    long var2 = org.apache.commons.math.util.FastMath.min(372980732420685833L, 512L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 512L);

  }

  public void test455() {}
//   public void test455() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test455"); }
// 
// 
//     int[] var2 = new int[] { 10, 100};
//     int[] var5 = new int[] { 1, 1};
//     int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var5);
//     int[] var9 = new int[] { 10, 100};
//     int[] var12 = new int[] { 1, 1};
//     int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var12);
//     int var14 = org.apache.commons.math.util.MathUtils.distance1(var5, var9);
//     int[] var17 = new int[] { 10, 100};
//     int[] var20 = new int[] { 1, 1};
//     int var21 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var20);
//     int[] var24 = new int[] { 10, 100};
//     int[] var27 = new int[] { 1, 1};
//     int var28 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var27);
//     int var29 = org.apache.commons.math.util.MathUtils.distance1(var20, var24);
//     double var30 = org.apache.commons.math.util.MathUtils.distance(var9, var24);
//     int[] var33 = new int[] { 10, 100};
//     int[] var36 = new int[] { 1, 1};
//     int var37 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var36);
//     int[] var40 = new int[] { 10, 100};
//     int[] var43 = new int[] { 1, 1};
//     int var44 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var43);
//     int var45 = org.apache.commons.math.util.MathUtils.distance1(var36, var40);
//     int[] var48 = new int[] { 10, 100};
//     int[] var51 = new int[] { 1, 1};
//     int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var51);
//     int[] var55 = new int[] { 10, 100};
//     int[] var58 = new int[] { 1, 1};
//     int var59 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var58);
//     int var60 = org.apache.commons.math.util.MathUtils.distance1(var51, var55);
//     int var61 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var55);
//     int var62 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var40);
//     int[] var63 = null;
//     int var64 = org.apache.commons.math.util.MathUtils.distance1(var24, var63);
// 
//   }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test456"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1556083402, 112);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test457"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(4.683298873456899d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 54.067713955055815d);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test458"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1L, (-2414495653486583483L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test459"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var3, false);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Number var7 = var5.getPrevious();
    java.lang.Number var8 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.5430806348152437d+ "'", var7.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (byte)1+ "'", var8.equals((byte)1));

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test460"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(2.5087768644478903d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5839118865795188d);

  }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test461"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(11206.740105132047d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test462"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(24.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.898979485566356d);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test463"); }


    long var2 = org.apache.commons.math.util.FastMath.max(7766279631452241918L, 3631948708846703094L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7766279631452241918L);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test464"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(5729.999999999999d, 0.8964626379063775d, 1019215872);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test465"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(45.80919935999207d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.923308930045134E19d);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test466"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(2.5087768644478903d, (-1079574457));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test467"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.0174532925199433d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.017454178629595116d);

  }

  public void test468() {}
//   public void test468() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test468"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log((-1.684074237062274E-4d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test469"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(328281L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 328281L);

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test470"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.9999931408046882d, 2.6881171418161356E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test471"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.0047000900347975d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.731088069460564d);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test472"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(7.2638973976934062E18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.26778926116797904E17d);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test473"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-2414495653486583483L), 2414495653486583496L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4828991306973166979L));

  }

  public void test474() {}
//   public void test474() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test474"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 3628800L);
// 
//   }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test475"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(101, 3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 155001857);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test476"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.7106366890357547d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test477"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-1430908835), 10000000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 980471809);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test478"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (-4828991306973166979L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test479() {}
//   public void test479() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test479"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log((-30.771314328643022d), 0.027719239916259047d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test480"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(0.9830878452829971d, 1076101120);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test481() {}
//   public void test481() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest4.test481"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(0.8139458196197328d, (-1.055287372175112d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test482"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.5436536017775284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test483"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.4514715880061752d, 1.5607203115782933d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5607203115782933d);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test484"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.43493802874674664d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test485"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test486"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.52587890625E-5d, 0.5532017491460262d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5258789062500003E-5d);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test487"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb((-1.5277095857476726d), 735641601);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3.055419171495345d));

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test488"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(1.460139105621001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.2693812623938325d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test489"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(11206.740105132047d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test490"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.8636136441663946d, 2.053044982604793d, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test491"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1680811550);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test492"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(1024L, 4300000000000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4300000000000000L);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test493"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-351334276), 351334276);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test494"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.906139250082463d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.43673093503638855d);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test495"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-34399999999919200L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test496"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(4, 43L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test497"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(4134230932605538814L, 2055472826581778431L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6189703759187317245L);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test498"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.26778926116797904E17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.26778926116797904E17d);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test499"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-3473340));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest4.test500"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1755643678), 1684284890);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

}
