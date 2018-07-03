
import junit.framework.*;

public class RandoopTest5 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test1"); }


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
    org.apache.commons.math.exception.NonMonotonousSequenceException var32 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-0.026660402558999208d), (java.lang.Number)0.7596162720678752d, 1, var30, true);
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
    assertTrue(var33 == 1);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test2"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 2.695161849999626E9d, (-1.6136270904587546d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test3() {}
//   public void test3() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test3"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 2127560705);
// 
//   }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(101.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.04987562112089d);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test5"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.9999931408046882d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.999997713596335d);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test6"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.09934024875548192d, 2.6519900511698773d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.09934024875548192d);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test7"); }


    long var2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (-34399999999919200L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-34399999999919200L));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test8"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(9.346544339204282d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.0d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test9"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(18.651581895316685d, (-1079574470));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.3759524655115848E18d);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test10"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(5.919304407E9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test11"); }


    long var2 = org.apache.commons.math.util.FastMath.min(2055472826581778431L, 5919304408L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5919304408L);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test12"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.8108107129686453d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.1154032598135535d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test13"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-56885140));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test14"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-1.2046367127482624E-61d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.2046367127482624E-61d));

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test15"); }


    double[] var1 = new double[] { 100.0d};
    int var2 = org.apache.commons.math.util.MathUtils.hash(var1);
    double[] var4 = new double[] { 100.0d};
    int var5 = org.apache.commons.math.util.MathUtils.hash(var4);
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var17 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var17, true);
    java.lang.Number var20 = var19.getPrevious();
    java.lang.Throwable[] var21 = var19.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var25 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var27 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var25, false);
    java.lang.String var28 = var27.toString();
    var19.addSuppressed((java.lang.Throwable)var27);
    var13.addSuppressed((java.lang.Throwable)var27);
    org.apache.commons.math.exception.NonMonotonousSequenceException var34 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var35 = var34.getIndex();
    var13.addSuppressed((java.lang.Throwable)var34);
    org.apache.commons.math.util.MathUtils.OrderDirection var37 = var13.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var39 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)11014.39717992353d, (java.lang.Number)100, 99, var37, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var4, var37, false);
    org.apache.commons.math.util.MathUtils.checkOrder(var4);
    java.lang.Number var43 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var49 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var53 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var55 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var53, true);
    java.lang.Number var56 = var55.getPrevious();
    java.lang.Throwable[] var57 = var55.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var61 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var63 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var61, false);
    java.lang.String var64 = var63.toString();
    var55.addSuppressed((java.lang.Throwable)var63);
    var49.addSuppressed((java.lang.Throwable)var63);
    org.apache.commons.math.exception.NonMonotonousSequenceException var70 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var71 = var70.getIndex();
    var49.addSuppressed((java.lang.Throwable)var70);
    org.apache.commons.math.util.MathUtils.OrderDirection var73 = var70.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var74 = var70.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var76 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var43, (java.lang.Number)1521136321, 1019215980, var74, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var77 = var76.getDirection();
    org.apache.commons.math.util.MathUtils.checkOrder(var4, var77, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10+ "'", var20.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var28.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + 10+ "'", var56.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var64.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test16"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(23.194631960850113d, 0.09950371902099882d, 2104456781);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test17"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 7766279631452241920L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-7766279631452241920L));

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test18"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(45.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test19"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(2.731088069460564d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 14.349579345573899d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test20"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var6 = new double[] { 100.0d};
    double var7 = org.apache.commons.math.util.MathUtils.distance1(var0, var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var10 = new double[] { };
    double var11 = org.apache.commons.math.util.MathUtils.safeNorm(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var10);
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
    double[] var29 = new double[] { 100.0d};
    int var30 = org.apache.commons.math.util.MathUtils.hash(var29);
    double[] var32 = new double[] { 100.0d};
    int var33 = org.apache.commons.math.util.MathUtils.hash(var32);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var29, var32);
    boolean var35 = org.apache.commons.math.util.MathUtils.equals(var20, var32);
    double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var20);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test21"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(2.301071078740414d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1608392023751657d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test22"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.09950371902099882d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test23"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-3.834150389170204E276d), 8.729304787132461d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test24"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(2.349550553936472d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9819573376899843d);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test25"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.7596162720678752d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7596162720678753d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test26"); }


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
    int var20 = org.apache.commons.math.util.MathUtils.hash(var2);
    int var21 = org.apache.commons.math.util.MathUtils.hash(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var2);
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
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test27"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.7596162720678752d, 0.5063656411097555d, 0.7888664516031222d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test28"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-0.042311238570781805d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.04228601655393018d));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test29"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.042311238570781805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.528472453491116d);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test30"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(3.552713678800501E-15d, 2.1579721453992367d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.584327322060981E-32d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test31"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(45.105269725210654d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test32"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test33"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(18.651581895316685d, 0.8320310533030781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 11.409717684086678d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test34"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-117527228));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test35"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.026663562285575523d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.141592653589793d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test36"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.6966215111753126d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8365293899300865d);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test37"); }


    int[] var2 = new int[] { 10, 100};
    int[] var5 = new int[] { 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var5);
    int[] var9 = new int[] { 10, 100};
    int[] var12 = new int[] { 1, 1};
    int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var12);
    int var14 = org.apache.commons.math.util.MathUtils.distance1(var5, var9);
    int[] var17 = new int[] { 10, 100};
    int[] var20 = new int[] { 1, 1};
    int var21 = org.apache.commons.math.util.MathUtils.distanceInf(var17, var20);
    int[] var24 = new int[] { 10, 100};
    int[] var27 = new int[] { 1, 1};
    int var28 = org.apache.commons.math.util.MathUtils.distanceInf(var24, var27);
    int var29 = org.apache.commons.math.util.MathUtils.distance1(var20, var24);
    double var30 = org.apache.commons.math.util.MathUtils.distance(var9, var24);
    int[] var33 = new int[] { 10, 100};
    int[] var36 = new int[] { 1, 1};
    int var37 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var36);
    double var38 = org.apache.commons.math.util.MathUtils.distance(var9, var33);
    int[] var41 = new int[] { 10, 100};
    int[] var44 = new int[] { 1, 1};
    int var45 = org.apache.commons.math.util.MathUtils.distanceInf(var41, var44);
    int[] var48 = new int[] { 10, 100};
    int[] var51 = new int[] { 1, 1};
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var51);
    int[] var55 = new int[] { 10, 100};
    int[] var58 = new int[] { 1, 1};
    int var59 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var58);
    int var60 = org.apache.commons.math.util.MathUtils.distance1(var51, var55);
    int[] var63 = new int[] { 10, 100};
    int[] var66 = new int[] { 1, 1};
    int var67 = org.apache.commons.math.util.MathUtils.distanceInf(var63, var66);
    int[] var70 = new int[] { 10, 100};
    int[] var73 = new int[] { 1, 1};
    int var74 = org.apache.commons.math.util.MathUtils.distanceInf(var70, var73);
    int var75 = org.apache.commons.math.util.MathUtils.distance1(var66, var70);
    int var76 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var70);
    double var77 = org.apache.commons.math.util.MathUtils.distance(var41, var70);
    double var78 = org.apache.commons.math.util.MathUtils.distance(var33, var41);
    
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
    assertTrue(var14 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test38"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.07986046454281068d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(2L, (-7766279631452241920L));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test40"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.78774269435562d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test41"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var11, true);
    java.lang.Number var14 = var13.getPrevious();
    var5.addSuppressed((java.lang.Throwable)var13);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var19, true);
    java.lang.Number var22 = var21.getPrevious();
    java.lang.Throwable[] var23 = var21.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var27 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var27, false);
    java.lang.String var30 = var29.toString();
    var21.addSuppressed((java.lang.Throwable)var29);
    var5.addSuppressed((java.lang.Throwable)var29);
    org.apache.commons.math.util.MathUtils.OrderDirection var33 = var29.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var37 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var39 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var37, true);
    java.lang.Number var40 = var39.getPrevious();
    java.lang.Throwable[] var41 = var39.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var45 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var47 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var45, false);
    java.lang.String var48 = var47.toString();
    var39.addSuppressed((java.lang.Throwable)var47);
    org.apache.commons.math.util.MathUtils.OrderDirection var50 = var47.getDirection();
    java.lang.Number var51 = var47.getArgument();
    boolean var52 = var47.getStrict();
    var29.addSuppressed((java.lang.Throwable)var47);
    int var54 = var29.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 10+ "'", var22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var30.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + 10+ "'", var40.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var48.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + (byte)1+ "'", var51.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test42"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-1.5277095857476726d), 43.12841819466121d, 0);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test43"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2.544443745170814E-14d, var1, (-88));
    int var4 = var3.getIndex();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-88));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -89 and -88 are not strictly increasing (null >= 0)"+ "'", var5.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -89 and -88 are not strictly increasing (null >= 0)"));

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test44"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var3, false);
    java.lang.String var6 = var5.toString();
    java.lang.Number var7 = var5.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var8 = var5.getDirection();
    java.lang.String var9 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.5430806348152437d+ "'", var7.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var9.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (byte)1+ "'", var11.equals((byte)1));

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test45"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.2552675050801465d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.5087768644478907d);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test46"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.0813472780114126d, (-1509641883));
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test47"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.3192017467498949d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test48"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.5974630494818454d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2034308213896047d);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test49"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.009769441191789432d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.009769441191789432d);

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test50"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.7717541676030321d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3128798741871328d);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test51"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-0.754272742441042d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test52"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-85.94366926962348d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-4924.209525017616d));

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test53"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.7596162720678753d, 4.804810770435008E257d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.7685666771922315d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2632279569926216d));

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test55"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(1.3539956475483843E43d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.3539956475483843E43d);

  }

  public void test56() {}
//   public void test56() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test56"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.6265857884777791d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test57"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(4.022575599366318d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test58"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(3.31782436554391E13d, 3.106574050857554E-62d, 0.1528669818503748d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test59"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.5444437451708134E-14d, 0.49928614949910866d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5444437451708134E-14d);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test60"); }


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
    java.lang.Throwable[] var21 = var3.getSuppressed();
    java.lang.String var22 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var18.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,521,136,320 and 1,521,136,321 are not strictly increasing (-1 >= 1.471)"+ "'", var22.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,521,136,320 and 1,521,136,321 are not strictly increasing (-1 >= 1.471)"));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test61"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.00000000000001d, 1.3539956475483843E43d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test62"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 362880L);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test63"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double[] var9 = new double[] { };
    double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var9);
    double var11 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var9);
    int var12 = org.apache.commons.math.util.MathUtils.hash(var7);
    double[] var13 = new double[] { };
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    double[] var15 = new double[] { };
    double var16 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var15);
    double[] var18 = null;
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var18);
    boolean var20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var13);
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var7);
    
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
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test64"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-431740927), 362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1283719167));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test65"); }


    int[] var2 = new int[] { 10, 100};
    int[] var5 = new int[] { 1, 1};
    int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var5);
    int[] var9 = new int[] { 10, 100};
    int[] var12 = new int[] { 1, 1};
    int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var12);
    int var14 = org.apache.commons.math.util.MathUtils.distance1(var5, var9);
    int[] var17 = new int[] { (-1), (-1)};
    int var18 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var17);
    int[] var21 = new int[] { 10, 100};
    int[] var24 = new int[] { 1, 1};
    int var25 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var24);
    int[] var28 = new int[] { 10, 100};
    int[] var31 = new int[] { 1, 1};
    int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var31);
    int var33 = org.apache.commons.math.util.MathUtils.distance1(var24, var28);
    int[] var36 = new int[] { (-1), (-1)};
    int var37 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var36);
    int[] var40 = new int[] { 10, 100};
    int[] var43 = new int[] { 1, 1};
    int var44 = org.apache.commons.math.util.MathUtils.distanceInf(var40, var43);
    int var45 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var40);
    int[] var48 = new int[] { 10, 100};
    int[] var51 = new int[] { 1, 1};
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var51);
    int[] var55 = new int[] { 10, 100};
    int[] var58 = new int[] { 1, 1};
    int var59 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var58);
    int var60 = org.apache.commons.math.util.MathUtils.distance1(var51, var55);
    double var61 = org.apache.commons.math.util.MathUtils.distance(var36, var51);
    double var62 = org.apache.commons.math.util.MathUtils.distance(var9, var51);
    
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
    assertTrue(var14 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 2.8284271247461903d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 99.40824915468535d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm((-4299989999627030L), 2414495653486583496L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test67"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(0.1528669818503748d, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test68"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 1, (-371654655));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test69"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-0.9645439376170786d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7673521361453202d));

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test70"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(601873281);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test71"); }


    double var2 = org.apache.commons.math.util.FastMath.min(1.0000000000000997d, 1.5706217938714693d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000000000000997d);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test72"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(0L, 7766279621452241928L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7766279621452241928L);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test73"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.009769441191789432d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.009769441191789434d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test74"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2((-0.013331781142787762d), (-3.055419171495345d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3.137229358149996d));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test75"); }


    double var2 = org.apache.commons.math.util.FastMath.pow((-0.07986046454281068d), 3.6319486988467031E18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test76"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(101, 339709747);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test77"); }


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
    double[] var23 = new double[] { };
    double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var23);
    double[] var25 = new double[] { };
    double var26 = org.apache.commons.math.util.MathUtils.safeNorm(var25);
    double var27 = org.apache.commons.math.util.MathUtils.distanceInf(var23, var25);
    double[] var29 = new double[] { 100.0d};
    double var30 = org.apache.commons.math.util.MathUtils.distance1(var23, var29);
    boolean var31 = org.apache.commons.math.util.MathUtils.equals(var14, var23);
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
    double[] var46 = new double[] { };
    double var47 = org.apache.commons.math.util.MathUtils.safeNorm(var46);
    double[] var48 = new double[] { };
    double var49 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    double var50 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var48);
    int var51 = org.apache.commons.math.util.MathUtils.hash(var46);
    double[] var52 = new double[] { };
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double[] var54 = new double[] { };
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
    double var56 = org.apache.commons.math.util.MathUtils.distanceInf(var52, var54);
    double[] var57 = null;
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var57);
    double var59 = org.apache.commons.math.util.MathUtils.distance(var46, var52);
    double[] var60 = new double[] { };
    double var61 = org.apache.commons.math.util.MathUtils.safeNorm(var60);
    double[] var62 = new double[] { };
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var62);
    double var65 = org.apache.commons.math.util.MathUtils.distance1(var52, var62);
    double var66 = org.apache.commons.math.util.MathUtils.distance1(var38, var52);
    double[] var67 = new double[] { };
    double var68 = org.apache.commons.math.util.MathUtils.safeNorm(var67);
    double[] var69 = new double[] { };
    double var70 = org.apache.commons.math.util.MathUtils.safeNorm(var69);
    double var71 = org.apache.commons.math.util.MathUtils.distanceInf(var67, var69);
    double[] var72 = new double[] { };
    double var73 = org.apache.commons.math.util.MathUtils.safeNorm(var72);
    boolean var74 = org.apache.commons.math.util.MathUtils.equals(var69, var72);
    double var75 = org.apache.commons.math.util.MathUtils.distance1(var52, var72);
    boolean var76 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var23, var72);
    
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
    assertTrue(var31 == true);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
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
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test78"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.4332363856803879d, 0.461636082722018d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.43323638568038797d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test79"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1502583401), 1019215980);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1019215980);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test80"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(5603.87009717805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test81"); }


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
    double[] var16 = new double[] { };
    double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var16);
    double[] var18 = new double[] { };
    double var19 = org.apache.commons.math.util.MathUtils.safeNorm(var18);
    double var20 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var18);
    int var21 = org.apache.commons.math.util.MathUtils.hash(var16);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double[] var24 = new double[] { };
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    double var26 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var24);
    double[] var27 = null;
    boolean var28 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var27);
    double var29 = org.apache.commons.math.util.MathUtils.distance(var16, var22);
    double[] var30 = new double[] { };
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double[] var32 = new double[] { };
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double var34 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var32);
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var22, var32);
    double var36 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var22);
    int var37 = org.apache.commons.math.util.MathUtils.hash(var22);
    
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
    assertTrue(var21 == 1);
    
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test82"); }


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
    double[] var16 = null;
    double var17 = org.apache.commons.math.util.MathUtils.distance1(var7, var16);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test83"); }


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
    double var27 = org.apache.commons.math.util.MathUtils.distance1(var14, var24);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double[] var30 = new double[] { };
    double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var30);
    double[] var33 = new double[] { };
    double var34 = org.apache.commons.math.util.MathUtils.safeNorm(var33);
    double[] var35 = new double[] { };
    double var36 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    double var37 = org.apache.commons.math.util.MathUtils.distanceInf(var33, var35);
    int var38 = org.apache.commons.math.util.MathUtils.hash(var33);
    double[] var39 = new double[] { };
    double var40 = org.apache.commons.math.util.MathUtils.safeNorm(var39);
    double[] var41 = new double[] { };
    double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var41);
    double var43 = org.apache.commons.math.util.MathUtils.distanceInf(var39, var41);
    double[] var44 = null;
    boolean var45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var44);
    boolean var46 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var33, var39);
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var39);
    double[] var48 = null;
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var39, var48);
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var39);
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var24);
    
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
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test84"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.0016504888083766d, 9.426890448884134E153d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0625460158253377E-154d);

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test85"); }


    double[] var1 = new double[] { 100.0d};
    int var2 = org.apache.commons.math.util.MathUtils.hash(var1);
    double[] var3 = new double[] { };
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var5 = new double[] { };
    double var6 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    double var7 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var5);
    double[] var9 = new double[] { 100.0d};
    double var10 = org.apache.commons.math.util.MathUtils.distance1(var3, var9);
    int var11 = org.apache.commons.math.util.MathUtils.hash(var9);
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var9);
    org.apache.commons.math.exception.NonMonotonousSequenceException var16 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var17 = var16.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = var16.getDirection();
    org.apache.commons.math.util.MathUtils.checkOrder(var1, var18, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test86"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-2055472826581778431L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2055472826581778431L);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test87"); }


    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.7037966541535084E73d, var1, 351334276);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test88"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.017454178629595116d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test89"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(5603.87009717805d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test90"); }


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
    java.lang.Throwable[] var21 = var3.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var22 = var3.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var18.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test91"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(23.194631960850113d, 7.755042652369133E24d, 2127560705);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test92"); }


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
    org.apache.commons.math.exception.NonMonotonousSequenceException var35 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.1752011936438014d, (java.lang.Number)(-35.595603494004564d), 1019215773, var33, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var37 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)8.653571668725004d, (java.lang.Number)(-0.027025482960377652d), 339709622, var33, false);
    
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

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test93"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.4557474133818058d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.169962950403329d);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test94"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-1.4814606358157307d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.08921690902981755d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test95"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var6 = new double[] { 100.0d};
    double var7 = org.apache.commons.math.util.MathUtils.distance1(var0, var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double[] var10 = new double[] { };
    double var11 = org.apache.commons.math.util.MathUtils.safeNorm(var10);
    double var12 = org.apache.commons.math.util.MathUtils.distanceInf(var8, var10);
    double var13 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var10);
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
    double var56 = org.apache.commons.math.util.MathUtils.distance(var10, var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var58 = org.apache.commons.math.util.MathUtils.normalizeArray(var50, 1.3128798741871328d);
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
    assertNotNull(var6);
    
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

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test96"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    int var5 = org.apache.commons.math.util.MathUtils.hash(var0);
    int var6 = org.apache.commons.math.util.MathUtils.hash(var0);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double[] var9 = new double[] { };
    double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var9);
    double var11 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var9);
    int var12 = org.apache.commons.math.util.MathUtils.hash(var7);
    double[] var13 = new double[] { };
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    double[] var15 = new double[] { };
    double var16 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
    double var17 = org.apache.commons.math.util.MathUtils.distanceInf(var13, var15);
    double[] var18 = null;
    boolean var19 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var13, var18);
    double var20 = org.apache.commons.math.util.MathUtils.distance(var7, var13);
    double[] var21 = new double[] { };
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
    boolean var36 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var28);
    double var37 = org.apache.commons.math.util.MathUtils.distance(var13, var21);
    double[] var38 = new double[] { };
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
    double[] var40 = new double[] { };
    double var41 = org.apache.commons.math.util.MathUtils.safeNorm(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var40);
    int var43 = org.apache.commons.math.util.MathUtils.hash(var38);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double[] var46 = new double[] { };
    double var47 = org.apache.commons.math.util.MathUtils.safeNorm(var46);
    double var48 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var46);
    double[] var49 = null;
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var44, var49);
    double var51 = org.apache.commons.math.util.MathUtils.distance(var38, var44);
    boolean var52 = org.apache.commons.math.util.MathUtils.equals(var21, var38);
    double[] var53 = null;
    double var54 = org.apache.commons.math.util.MathUtils.distance1(var21, var53);
    double var55 = org.apache.commons.math.util.MathUtils.distance1(var0, var21);
    
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
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
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
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.0d);
    
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
    assertTrue(var43 == 1);
    
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
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test97"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    java.lang.Number var8 = var5.getArgument();
    java.lang.Number var9 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 1.5430806348152437d+ "'", var8.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10+ "'", var9.equals(10));

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test98"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-34399999999919200L), 3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 800L);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test99"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-1.4986562664576781d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.498656266457678d));

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test100"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var3, false);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    java.lang.Number var8 = var5.getArgument();
    org.apache.commons.math.util.MathUtils.OrderDirection var12 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var14 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var12, false);
    java.lang.String var15 = var14.toString();
    java.lang.Number var16 = var14.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var17 = var14.getDirection();
    java.lang.String var18 = var14.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = var14.getDirection();
    var5.addSuppressed((java.lang.Throwable)var14);
    java.lang.Number var21 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (byte)1+ "'", var8.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var15.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 1.5430806348152437d+ "'", var16.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var18.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 1.5430806348152437d+ "'", var21.equals(1.5430806348152437d));

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test101"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(1651916801, (-4591153855311649792L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test102"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(2127560705, 1080);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test103"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.528472453491116d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.61321748817631d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test104"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getPrevious();
    int var12 = var5.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test105"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.lcm(100L, (-2410195653486221123L));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test106"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-0.8486793536069225d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.946777392151624d));

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test107"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.528472453491116d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9914406296801996d);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test108"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.3128798741871328d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test109"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.05744623554617932d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.05744623554617932d);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test110"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-1.684074237062274E-4d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.710505431213761E-20d);

  }

  public void test111() {}
//   public void test111() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test111"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round(10.0f, 784);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test112"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(2.0981229097947937E7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test113"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 0.6295647726415223d, 7.216410899571176E70d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test114"); }


    double var2 = org.apache.commons.math.util.FastMath.max(1.0069607461956287d, (-0.8486793536069225d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0069607461956287d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test115"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test116"); }
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
//     boolean var8 = org.apache.commons.math.util.MathUtils.equals(var3, var6);
//     double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
//     double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var6);
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test117"); }


    long var2 = org.apache.commons.math.util.FastMath.min(3631948708846703094L, 4608L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4608L);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test118"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(13, (-1578339261));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test119"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1019215980, 735641601);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test120"); }


    long var2 = org.apache.commons.math.util.FastMath.max(7766279631452241918L, 3631948698846703104L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7766279631452241918L);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test121"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1272213992), 1079574658);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test122"); }


    double[] var0 = null;
    double[] var2 = new double[] { (-1.0d)};
    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.util.MathUtils.checkOrder(var2, var3, false);
    double[] var6 = new double[] { };
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var8 = new double[] { };
    double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
    double var10 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var8);
    double[] var12 = new double[] { 100.0d};
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var6, var12);
    int var14 = org.apache.commons.math.util.MathUtils.hash(var12);
    boolean var15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var2, var12);
    boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test123"); }


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
    org.apache.commons.math.util.MathUtils.OrderDirection var21 = var3.getDirection();
    java.lang.String var22 = var3.toString();
    java.lang.Number var23 = var3.getPrevious();
    org.apache.commons.math.util.MathUtils.OrderDirection var27 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var27, true);
    java.lang.Number var30 = var29.getPrevious();
    java.lang.Throwable[] var31 = var29.getSuppressed();
    int var32 = var29.getIndex();
    boolean var33 = var29.getStrict();
    var3.addSuppressed((java.lang.Throwable)var29);
    java.lang.Number var35 = var29.getPrevious();
    java.lang.Number var36 = var29.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var18.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,521,136,320 and 1,521,136,321 are not strictly increasing (-1 >= 1.471)"+ "'", var22.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 1,521,136,320 and 1,521,136,321 are not strictly increasing (-1 >= 1.471)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0f)+ "'", var23.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 10+ "'", var35.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 1.5430806348152437d+ "'", var36.equals(1.5430806348152437d));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test124"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(23.61321748817631d, 351334276, (-117527228));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() {}
//   public void test125() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test125"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.05744623554617932d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test126"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.07986046454281069d), 0.4496187716314083d, 0.9997541430723863d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test127"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.7763568394002505E-15d, 45.80919935999207d, 0.017454178629595116d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test128"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1603330122, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1603330120);

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test129"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = new double[] { };
//     double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
//     double[] var3 = new double[] { };
//     double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
//     double var5 = org.apache.commons.math.util.MathUtils.distanceInf(var1, var3);
//     int var6 = org.apache.commons.math.util.MathUtils.hash(var1);
//     double[] var7 = new double[] { };
//     double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
//     double[] var9 = new double[] { };
//     double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var9);
//     double var11 = org.apache.commons.math.util.MathUtils.distanceInf(var7, var9);
//     double[] var12 = null;
//     boolean var13 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var12);
//     double var14 = org.apache.commons.math.util.MathUtils.distance(var1, var7);
//     double[] var15 = new double[] { };
//     double var16 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
//     double[] var17 = new double[] { };
//     double var18 = org.apache.commons.math.util.MathUtils.safeNorm(var17);
//     double var19 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var17);
//     double var20 = org.apache.commons.math.util.MathUtils.distance1(var7, var17);
//     int var21 = org.apache.commons.math.util.MathUtils.hash(var17);
//     double[] var22 = new double[] { };
//     double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
//     double[] var24 = new double[] { };
//     double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
//     double var26 = org.apache.commons.math.util.MathUtils.distanceInf(var22, var24);
//     double[] var27 = null;
//     boolean var28 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var27);
//     double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
//     double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
//     double[] var31 = new double[] { };
//     double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
//     double[] var33 = new double[] { };
//     double var34 = org.apache.commons.math.util.MathUtils.safeNorm(var33);
//     double var35 = org.apache.commons.math.util.MathUtils.distanceInf(var31, var33);
//     int var36 = org.apache.commons.math.util.MathUtils.hash(var31);
//     double[] var37 = new double[] { };
//     double var38 = org.apache.commons.math.util.MathUtils.safeNorm(var37);
//     double[] var39 = new double[] { };
//     double var40 = org.apache.commons.math.util.MathUtils.safeNorm(var39);
//     double var41 = org.apache.commons.math.util.MathUtils.distanceInf(var37, var39);
//     double[] var42 = null;
//     boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var42);
//     double var44 = org.apache.commons.math.util.MathUtils.distance(var31, var37);
//     double[] var45 = new double[] { };
//     double var46 = org.apache.commons.math.util.MathUtils.safeNorm(var45);
//     double[] var47 = new double[] { };
//     double var48 = org.apache.commons.math.util.MathUtils.safeNorm(var47);
//     double var49 = org.apache.commons.math.util.MathUtils.distanceInf(var45, var47);
//     double[] var51 = new double[] { 100.0d};
//     double var52 = org.apache.commons.math.util.MathUtils.distance1(var45, var51);
//     double var53 = org.apache.commons.math.util.MathUtils.distance(var31, var45);
//     double[] var54 = new double[] { };
//     double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
//     double[] var56 = new double[] { };
//     double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var56);
//     double var58 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var56);
//     double[] var60 = new double[] { 100.0d};
//     double var61 = org.apache.commons.math.util.MathUtils.distance1(var54, var60);
//     boolean var62 = org.apache.commons.math.util.MathUtils.equals(var45, var54);
//     boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var22, var45);
//     boolean var64 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var45);
//     double[] var65 = null;
//     boolean var66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var17, var65);
//     double var67 = org.apache.commons.math.util.MathUtils.distance1(var0, var65);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test130"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-0.5063656411097555d), 0.9999999847691293d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test131"); }


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
    double[] var21 = new double[] { 100.0d};
    int var22 = org.apache.commons.math.util.MathUtils.hash(var21);
    double[] var24 = new double[] { 100.0d};
    int var25 = org.apache.commons.math.util.MathUtils.hash(var24);
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var21, var24);
    int var27 = org.apache.commons.math.util.MathUtils.hash(var21);
    double var28 = org.apache.commons.math.util.MathUtils.distance1(var6, var21);
    double[] var29 = new double[] { };
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var29);
    double[] var31 = new double[] { };
    double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
    double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var31);
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
    boolean var47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var40);
    boolean var48 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var31, var40);
    double[] var49 = new double[] { };
    double var50 = org.apache.commons.math.util.MathUtils.safeNorm(var49);
    double[] var51 = new double[] { };
    double var52 = org.apache.commons.math.util.MathUtils.safeNorm(var51);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var51);
    double[] var54 = new double[] { };
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
    boolean var56 = org.apache.commons.math.util.MathUtils.equals(var51, var54);
    double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
    double var58 = org.apache.commons.math.util.MathUtils.distance1(var31, var54);
    double[] var59 = new double[] { };
    double var60 = org.apache.commons.math.util.MathUtils.safeNorm(var59);
    double var61 = org.apache.commons.math.util.MathUtils.distance(var54, var59);
    double[] var62 = new double[] { };
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double[] var64 = new double[] { };
    double var65 = org.apache.commons.math.util.MathUtils.safeNorm(var64);
    double var66 = org.apache.commons.math.util.MathUtils.distanceInf(var62, var64);
    double[] var67 = new double[] { };
    double var68 = org.apache.commons.math.util.MathUtils.safeNorm(var67);
    boolean var69 = org.apache.commons.math.util.MathUtils.equals(var64, var67);
    double var70 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var67);
    double var71 = org.apache.commons.math.util.MathUtils.distance1(var6, var54);
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
    
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
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
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
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
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test132"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(481.42304707106257d, 784);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 481.42304707106257d);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test133"); }


    double[] var0 = null;
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
    double[] var15 = new double[] { };
    double var16 = org.apache.commons.math.util.MathUtils.safeNorm(var15);
    double[] var17 = new double[] { };
    double var18 = org.apache.commons.math.util.MathUtils.safeNorm(var17);
    double var19 = org.apache.commons.math.util.MathUtils.distanceInf(var15, var17);
    int var20 = org.apache.commons.math.util.MathUtils.hash(var15);
    double[] var21 = new double[] { };
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double[] var23 = new double[] { };
    double var24 = org.apache.commons.math.util.MathUtils.safeNorm(var23);
    double var25 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var23);
    double[] var26 = null;
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var26);
    double var28 = org.apache.commons.math.util.MathUtils.distance(var15, var21);
    double[] var29 = new double[] { };
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var29);
    double[] var31 = new double[] { };
    double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
    double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var31);
    double var34 = org.apache.commons.math.util.MathUtils.distance1(var21, var31);
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var7, var21);
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
    boolean var49 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var42);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double[] var52 = new double[] { };
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double var54 = org.apache.commons.math.util.MathUtils.distanceInf(var50, var52);
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
    boolean var68 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var61);
    boolean var69 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var61);
    double var70 = org.apache.commons.math.util.MathUtils.distance1(var42, var61);
    double var71 = org.apache.commons.math.util.MathUtils.distance1(var21, var61);
    boolean var72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var61);
    
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
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
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
    assertTrue(var49 == true);
    
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
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test134"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(2.4463520074491623d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04269689719276073d);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test135"); }


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
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    java.lang.String var39 = var38.toString();
    boolean var40 = var38.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var41 = var38.getDirection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var11, var41, true);
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
    assertTrue("'" + var39 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var39.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test136"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.4496187716314083d, 0.6225174223365766d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.44961877163140834d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test137"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test138"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-17.328679513998633d), 1.5707963267948963d, (-371654655));

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test139"); }


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
    org.apache.commons.math.util.MathUtils.OrderDirection var24 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var26 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var24, true);
    java.lang.Number var27 = var26.getPrevious();
    java.lang.Throwable[] var28 = var26.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var32 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var34 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var32, false);
    java.lang.String var35 = var34.toString();
    var26.addSuppressed((java.lang.Throwable)var34);
    var3.addSuppressed((java.lang.Throwable)var34);
    java.lang.Number var38 = var3.getPrevious();
    java.lang.Throwable[] var39 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var18.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10+ "'", var27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var35.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + (-1.0f)+ "'", var38.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test140"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(5.3759524655115848E18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.08531930857079621d));

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test141"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(5.919304408E9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.391511602315843E11d);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test142"); }


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
    double[] var20 = new double[] { };
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
    int var25 = org.apache.commons.math.util.MathUtils.hash(var20);
    double[] var26 = new double[] { };
    double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var26);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var28);
    double[] var31 = null;
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance(var20, var26);
    double[] var34 = new double[] { };
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var36);
    double var39 = org.apache.commons.math.util.MathUtils.distance1(var26, var36);
    double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var36);
    double[] var41 = new double[] { };
    double var42 = org.apache.commons.math.util.MathUtils.safeNorm(var41);
    double[] var43 = new double[] { };
    double var44 = org.apache.commons.math.util.MathUtils.safeNorm(var43);
    double var45 = org.apache.commons.math.util.MathUtils.distanceInf(var41, var43);
    double[] var46 = new double[] { };
    double var47 = org.apache.commons.math.util.MathUtils.safeNorm(var46);
    double[] var48 = new double[] { };
    double var49 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    double var50 = org.apache.commons.math.util.MathUtils.distanceInf(var46, var48);
    int var51 = org.apache.commons.math.util.MathUtils.hash(var46);
    double[] var52 = new double[] { };
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double[] var54 = new double[] { };
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
    double var56 = org.apache.commons.math.util.MathUtils.distanceInf(var52, var54);
    double[] var57 = null;
    boolean var58 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var52, var57);
    double var59 = org.apache.commons.math.util.MathUtils.distance(var46, var52);
    double[] var60 = new double[] { };
    double var61 = org.apache.commons.math.util.MathUtils.safeNorm(var60);
    double[] var62 = new double[] { };
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var62);
    double[] var66 = new double[] { 100.0d};
    double var67 = org.apache.commons.math.util.MathUtils.distance1(var60, var66);
    double var68 = org.apache.commons.math.util.MathUtils.distance(var46, var60);
    double[] var69 = new double[] { };
    double[] var70 = new double[] { };
    double var71 = org.apache.commons.math.util.MathUtils.safeNorm(var70);
    double[] var72 = new double[] { };
    double var73 = org.apache.commons.math.util.MathUtils.safeNorm(var72);
    double var74 = org.apache.commons.math.util.MathUtils.distanceInf(var70, var72);
    int var75 = org.apache.commons.math.util.MathUtils.hash(var70);
    double[] var76 = new double[] { };
    double var77 = org.apache.commons.math.util.MathUtils.safeNorm(var76);
    double[] var78 = new double[] { };
    double var79 = org.apache.commons.math.util.MathUtils.safeNorm(var78);
    double var80 = org.apache.commons.math.util.MathUtils.distanceInf(var76, var78);
    double[] var81 = null;
    boolean var82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var76, var81);
    double var83 = org.apache.commons.math.util.MathUtils.distance(var70, var76);
    boolean var84 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var69, var76);
    double var85 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var76);
    double var86 = org.apache.commons.math.util.MathUtils.distance1(var41, var60);
    double var87 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var60);
    
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
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
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
    assertTrue(var39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0.0d);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
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
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0.0d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test143"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1222173151), 339709622);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 339709622);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test144"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(1.1607868102538825d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test145"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(0L, (-1509641883));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test146"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    org.apache.commons.math.exception.NonMonotonousSequenceException var7 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var11, true);
    java.lang.Number var14 = var13.getPrevious();
    java.lang.Throwable[] var15 = var13.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var19, false);
    java.lang.String var22 = var21.toString();
    var13.addSuppressed((java.lang.Throwable)var21);
    var7.addSuppressed((java.lang.Throwable)var21);
    org.apache.commons.math.exception.NonMonotonousSequenceException var28 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var29 = var28.getIndex();
    var7.addSuppressed((java.lang.Throwable)var28);
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.Number var32 = var7.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var22.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + (-1.0f)+ "'", var32.equals((-1.0f)));

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test147"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(2.5444437451708134E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5444437451708134E-14d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test148"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(5730.0d, 0.999997713596335d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test149"); }


    double var1 = org.apache.commons.math.util.FastMath.floor((-1.5273476492283813d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.0d));

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test150"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.8320310533030781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test151"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(0, (-1079574470));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test152"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
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
    var3.addSuppressed((java.lang.Throwable)var23);
    int var28 = var23.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var29 = var23.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var5.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10+ "'", var16.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var24.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test153"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.7440794359665133d), (-0.0d), 0.6225174223365766d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test154"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.4637592732921716d, 9, 125);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test155"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(2.467037317308563d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11.7874725274832d);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test156"); }


    java.lang.Number var0 = null;
    java.lang.Number var1 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var0, var1, (-339709747));
    java.lang.Number var4 = var3.getPrevious();
    java.lang.Number var5 = var3.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test157"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test158"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.43323638568038797d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 24.822616430988205d);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test159"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 7766279631452241920L);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test160"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.7106366890357547d, 0.8881815420301877d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test161"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(980471809, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 980471807);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test162"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-0.5528489599319215d), 46.635660216527285d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test163"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-3473340), (-1430908835));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3473340));

  }

  public void test164() {}
//   public void test164() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test164"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 155001857);
// 
//   }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test165"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(4300000000362780L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test166"); }


    int var2 = org.apache.commons.math.util.FastMath.max(112, 1101379447);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1101379447);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test167"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.6746455821618494d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.236336958847107d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test168"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(4299999999989900L, (-4299999999989900L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4299999999989900L);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test169"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(6.938893903907228E-18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.938893903907228E-18d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test170"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.5705654518541791d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6020307261875584d);

  }

  public void test171() {}
//   public void test171() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test171"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 7766279631452241919L);
// 
//   }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test172"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7182818284590453d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test173"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(2.5444437451708137E-14d, 1.236336958847107d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test174() {}
//   public void test174() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test174"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(99.40824915468535d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test175"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.1125663420637704d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test176"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    java.lang.String var4 = var3.toString();
    java.lang.Number var5 = var3.getPrevious();
    org.apache.commons.math.exception.NonMonotonousSequenceException var9 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.1616962253088402d, (java.lang.Number)1.4109062326334167d, 0);
    java.lang.String var10 = var9.toString();
    var3.addSuppressed((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 100+ "'", var5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not strictly increasing (1.411 >= 0.162)"+ "'", var10.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not strictly increasing (1.411 >= 0.162)"));

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test177"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.34654433920428d, 1.0813472780114126d, 22.079354141514354d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test178"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1019215872, 583320461);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 435895411);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test179"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1521136320);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test180"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-2428453559002464264L), 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test181"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(13L, 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3630258768790307633L);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test182"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(100000000000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test183"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 3631948714766007502L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test184"); }


    java.lang.Number var3 = null;
    java.lang.Number var6 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var13 = var12.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var12.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var16 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var6, (java.lang.Number)1.4218932149930186d, 1076101120, var14, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var18 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var3, (java.lang.Number)3.6319486988467031E18d, 100, var14, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var20 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.966461711543166d, (java.lang.Number)1019215773, 1079574668, var14, true);
    org.apache.commons.math.util.MathUtils.OrderDirection var24 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var26 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var24, true);
    java.lang.Number var27 = var26.getPrevious();
    java.lang.Throwable[] var28 = var26.getSuppressed();
    java.lang.Number var29 = var26.getArgument();
    var20.addSuppressed((java.lang.Throwable)var26);
    org.apache.commons.math.exception.NonMonotonousSequenceException var34 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    java.lang.String var35 = var34.toString();
    java.lang.Throwable[] var36 = var34.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var37 = var34.getDirection();
    int var38 = var34.getIndex();
    var20.addSuppressed((java.lang.Throwable)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10+ "'", var27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 1.5430806348152437d+ "'", var29.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"+ "'", var35.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 0 and 1 are not strictly increasing (100 >= 100)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test185"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1019215872));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test186"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1521136331, 1101379447);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 419756884);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test187"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.528472453491116d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 87.57502068704696d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test188"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.9830878452829971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5544554479094699d);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test189"); }


    double var2 = org.apache.commons.math.util.FastMath.min(2.6881171418161356E43d, 3.552713678800501E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.552713678800501E-15d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test190"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(5729.5779513082325d, (-0.982793723247329d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test191"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.09691659130134456d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test192"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(372980732420685824L, 2414495653486583496L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2787476385907269320L);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test193"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(0.9239911871450402d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0611969015762952d);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test194"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var11, true);
    java.lang.Number var14 = var13.getPrevious();
    var5.addSuppressed((java.lang.Throwable)var13);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var19, true);
    java.lang.Number var22 = var21.getPrevious();
    java.lang.Throwable[] var23 = var21.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var27 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var27, false);
    java.lang.String var30 = var29.toString();
    var21.addSuppressed((java.lang.Throwable)var29);
    var5.addSuppressed((java.lang.Throwable)var29);
    java.lang.Number var33 = var5.getPrevious();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 10+ "'", var22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var30.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 10+ "'", var33.equals(10));

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test195"); }


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
    java.lang.Number var21 = null;
    java.lang.Number var27 = null;
    java.lang.Number var30 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var37 = var36.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var38 = var36.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var40 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var30, (java.lang.Number)1.4218932149930186d, 1076101120, var38, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var42 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var27, (java.lang.Number)3.6319486988467031E18d, 100, var38, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var44 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.966461711543166d, (java.lang.Number)1019215773, 1079574668, var38, true);
    org.apache.commons.math.exception.NonMonotonousSequenceException var46 = new org.apache.commons.math.exception.NonMonotonousSequenceException(var21, (java.lang.Number)9.34654433920428d, 0, var38, true);
    var9.addSuppressed((java.lang.Throwable)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10+ "'", var18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test196"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.4496187716314083d, 1.177933759221025d, 980471809);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test197"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.017452406545229723d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.1321075567302254d);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test198"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(232803866);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test199"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)3.75806044781748E212d, (java.lang.Number)(-0.5545968900472615d), 1101379447);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)7.38261378778625E9d, (java.lang.Number)1101379457, 0, var13, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5607203115782933d, (java.lang.Number)4.3180842775472223E-78d, 0, var13, false);
    org.apache.commons.math.exception.NonMonotonousSequenceException var19 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(-0.13005011733123764d), (java.lang.Number)0.44961877163140834d, (-1521136310), var13, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test200"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-2410195653486220703L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test201"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1899993087), 1680811550);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1680811550);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test202"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(1.420764326431392d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test203"); }


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
    double[] var40 = new double[] { };
    double var41 = org.apache.commons.math.util.MathUtils.safeNorm(var40);
    boolean var42 = org.apache.commons.math.util.MathUtils.equals(var37, var40);
    double var43 = org.apache.commons.math.util.MathUtils.distance1(var20, var40);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double[] var46 = new double[] { };
    double var47 = org.apache.commons.math.util.MathUtils.safeNorm(var46);
    double var48 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var46);
    double[] var49 = new double[] { };
    double var50 = org.apache.commons.math.util.MathUtils.safeNorm(var49);
    double[] var51 = new double[] { };
    double var52 = org.apache.commons.math.util.MathUtils.safeNorm(var51);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var51);
    int var54 = org.apache.commons.math.util.MathUtils.hash(var49);
    double[] var55 = new double[] { };
    double var56 = org.apache.commons.math.util.MathUtils.safeNorm(var55);
    double[] var57 = new double[] { };
    double var58 = org.apache.commons.math.util.MathUtils.safeNorm(var57);
    double var59 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var57);
    double[] var60 = null;
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var60);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var49, var55);
    boolean var63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var46, var55);
    double[] var64 = new double[] { };
    double var65 = org.apache.commons.math.util.MathUtils.safeNorm(var64);
    double[] var66 = new double[] { };
    double var67 = org.apache.commons.math.util.MathUtils.safeNorm(var66);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var64, var66);
    double[] var69 = new double[] { };
    double var70 = org.apache.commons.math.util.MathUtils.safeNorm(var69);
    boolean var71 = org.apache.commons.math.util.MathUtils.equals(var66, var69);
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var69);
    double var73 = org.apache.commons.math.util.MathUtils.distance1(var46, var69);
    double var74 = org.apache.commons.math.util.MathUtils.distance1(var20, var46);
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
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
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
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
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
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
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.0d);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test204"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-2410195653486221123L), 362880L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 362880L);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test205"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.6212604802047773d), 3.469446951953614E-18d, (-1509641883));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test206"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.009769441191789434d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.09884048356715701d);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test207"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.2532779128890104d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.5018027695009355d);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test208"); }


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
    org.apache.commons.math.util.MathUtils.checkOrder(var1);
    
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

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test209"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.2552675050801465d, 9.346544339204282d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.13350398899060983d);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test210"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.0174532925199433d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.017606491205851577d);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test211"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.40498909449773257d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6363875348384289d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test212"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh((-0.8486793536069225d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6903789039490631d));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test213"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-10000000000L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-10000000000L));

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test214"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1076101120, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1076101120);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test215"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(3632048698846703104L, (-4828991306973166979L));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test216"); }


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
    int var37 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var31);
    double var38 = org.apache.commons.math.util.MathUtils.distance(var2, var31);
    int[] var41 = new int[] { 10, 100};
    int[] var44 = new int[] { 1, 1};
    int var45 = org.apache.commons.math.util.MathUtils.distanceInf(var41, var44);
    int[] var48 = new int[] { 10, 100};
    int[] var51 = new int[] { 1, 1};
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var51);
    int var53 = org.apache.commons.math.util.MathUtils.distance1(var44, var48);
    int[] var56 = new int[] { 10, 100};
    int[] var59 = new int[] { 1, 1};
    int var60 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var59);
    int[] var63 = new int[] { 10, 100};
    int[] var66 = new int[] { 1, 1};
    int var67 = org.apache.commons.math.util.MathUtils.distanceInf(var63, var66);
    int var68 = org.apache.commons.math.util.MathUtils.distance1(var59, var63);
    int var69 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var63);
    int var70 = org.apache.commons.math.util.MathUtils.distance1(var2, var63);
    
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
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test217"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var3, false);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Number var7 = var5.getPrevious();
    boolean var8 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = var5.getDirection();
    java.lang.Number var10 = var5.getArgument();
    boolean var11 = var5.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.5430806348152437d+ "'", var7.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (byte)1+ "'", var10.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test218"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.5839118865795188d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.02764447748228759d);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test219"); }


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
    java.lang.Number var21 = var17.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var18.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (byte)1+ "'", var21.equals((byte)1));

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test220"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.09884048356715701d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.09852048510976408d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test221"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-431740927), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-431740927));

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test222"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(6.2270208E9d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.79428031638948d);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test223"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(3628800.0d, (-1752752639), 1019215872);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test224"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1079574559);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test225"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.String var6 = var5.toString();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    boolean var8 = var5.getStrict();
    int var9 = var5.getIndex();
    java.lang.Throwable[] var10 = var5.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = var5.getDirection();
    int var12 = var5.getIndex();
    java.lang.Throwable[] var13 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test226() {}
//   public void test226() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test226"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 3631948714766007502L);
// 
//   }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test227"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-0.026663562285575523d), 6.2270208E9d, 0.8139458196197328d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test228"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.5311745462360802d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9922495525747608d);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test229"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.0069607461956276d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.006936632038840983d);

  }

  public void test230() {}
//   public void test230() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test230"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh((-0.08531930857079621d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test231"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(9.094947017729282E-13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.094947017729282E-13d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test232"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(3628800L, 372980732420685824L);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test233"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.43673093503638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0968924342555195d);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test234"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.46586713996720486d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test235"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(7766279631452241920L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test236() {}
//   public void test236() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test236"); }
// 
// 
//     int[] var2 = new int[] { 10, 100};
//     int[] var5 = new int[] { 1, 1};
//     int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var5);
//     int[] var9 = new int[] { 10, 100};
//     int[] var12 = new int[] { 1, 1};
//     int var13 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var12);
//     int var14 = org.apache.commons.math.util.MathUtils.distance1(var5, var9);
//     int[] var17 = new int[] { (-1), (-1)};
//     int var18 = org.apache.commons.math.util.MathUtils.distanceInf(var9, var17);
//     int[] var21 = new int[] { 10, 100};
//     int[] var24 = new int[] { 1, 1};
//     int var25 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var24);
//     int[] var28 = new int[] { 10, 100};
//     int[] var31 = new int[] { 1, 1};
//     int var32 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var31);
//     int var33 = org.apache.commons.math.util.MathUtils.distance1(var24, var28);
//     int[] var36 = new int[] { 10, 100};
//     int[] var39 = new int[] { 1, 1};
//     int var40 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var39);
//     int[] var43 = new int[] { 10, 100};
//     int[] var46 = new int[] { 1, 1};
//     int var47 = org.apache.commons.math.util.MathUtils.distanceInf(var43, var46);
//     int var48 = org.apache.commons.math.util.MathUtils.distance1(var39, var43);
//     int[] var51 = new int[] { 10, 100};
//     int[] var54 = new int[] { 1, 1};
//     int var55 = org.apache.commons.math.util.MathUtils.distanceInf(var51, var54);
//     int[] var58 = new int[] { 10, 100};
//     int[] var61 = new int[] { 1, 1};
//     int var62 = org.apache.commons.math.util.MathUtils.distanceInf(var58, var61);
//     int var63 = org.apache.commons.math.util.MathUtils.distance1(var54, var58);
//     double var64 = org.apache.commons.math.util.MathUtils.distance(var43, var58);
//     int var65 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var58);
//     int var66 = org.apache.commons.math.util.MathUtils.distance1(var17, var28);
//     int[] var67 = null;
//     double var68 = org.apache.commons.math.util.MathUtils.distance(var17, var67);
// 
//   }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test237"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.1616962253088402d, (java.lang.Number)1.4109062326334167d, 0);
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not strictly increasing (1.411 >= 0.162)"+ "'", var4.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not strictly increasing (1.411 >= 0.162)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test238"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-2414495653486583483L), (-10000000000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2414495643486583483L));

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test239"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(2127560705);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test240"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round((-1.0f), 735641601);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test241"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test242"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.04664735184474584d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test243"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.Number var6 = var5.getPrevious();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var11 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var11, false);
    java.lang.String var14 = var13.toString();
    var5.addSuppressed((java.lang.Throwable)var13);
    java.lang.Throwable[] var16 = var5.getSuppressed();
    int var17 = var5.getIndex();
    int var18 = var5.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var14.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test244"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)8.653571668725004d, (java.lang.Number)43.42944819032518d, (-1));
    org.apache.commons.math.util.MathUtils.OrderDirection var4 = var3.getDirection();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -2 and -1 are not strictly increasing (43.429 >= 8.654)"+ "'", var5.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -2 and -1 are not strictly increasing (43.429 >= 8.654)"));

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test245"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1967802165, 1004373820);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1004373820);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test246"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var3, false);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.Number var7 = var5.getPrevious();
    boolean var8 = var5.getStrict();
    java.lang.String var9 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.5430806348152437d+ "'", var7.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var9.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test247"); }


    double[] var0 = new double[] { };
    double var1 = org.apache.commons.math.util.MathUtils.safeNorm(var0);
    double[] var2 = new double[] { };
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double var4 = org.apache.commons.math.util.MathUtils.distanceInf(var0, var2);
    double[] var6 = new double[] { 100.0d};
    double var7 = org.apache.commons.math.util.MathUtils.distance1(var0, var6);
    int var8 = org.apache.commons.math.util.MathUtils.hash(var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var0);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test248"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var3, false);
    java.lang.String var6 = var5.toString();
    java.lang.Number var7 = var5.getPrevious();
    java.lang.Throwable[] var8 = var5.getSuppressed();
    boolean var9 = var5.getStrict();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.5430806348152437d+ "'", var7.equals(1.5430806348152437d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test249"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(0.4901629850122834d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.30965948788579784d));

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test250"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.027719239916259047d, 0.026657246199241372d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0108950878654719d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test251"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-4828991306973166979L), 3628800L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-4828991306973166979L));

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test252"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(3631948688846703104L, 4300000000000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3627648688846703104L);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test253"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-1.1447142425533319d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1581437514);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test254"); }


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
    double[] var20 = new double[] { };
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
    int var25 = org.apache.commons.math.util.MathUtils.hash(var20);
    double[] var26 = new double[] { };
    double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var26);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var28);
    double[] var31 = null;
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance(var20, var26);
    double[] var34 = new double[] { };
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var36);
    double var39 = org.apache.commons.math.util.MathUtils.distance1(var26, var36);
    double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var36);
    int var41 = org.apache.commons.math.util.MathUtils.hash(var36);
    double[] var42 = new double[] { };
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var44);
    int var47 = org.apache.commons.math.util.MathUtils.hash(var42);
    double[] var48 = new double[] { };
    double var49 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var50);
    double[] var53 = null;
    boolean var54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var48, var53);
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var48);
    double[] var56 = new double[] { };
    double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var56);
    double[] var58 = new double[] { };
    double var59 = org.apache.commons.math.util.MathUtils.safeNorm(var58);
    double var60 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var58);
    double[] var61 = new double[] { };
    double var62 = org.apache.commons.math.util.MathUtils.safeNorm(var61);
    double[] var63 = new double[] { };
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var63);
    double[] var67 = new double[] { 100.0d};
    double var68 = org.apache.commons.math.util.MathUtils.distance1(var61, var67);
    double var69 = org.apache.commons.math.util.MathUtils.distance1(var58, var61);
    double var70 = org.apache.commons.math.util.MathUtils.distance1(var48, var58);
    double[] var71 = new double[] { };
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var71);
    double[] var73 = new double[] { };
    double var74 = org.apache.commons.math.util.MathUtils.safeNorm(var73);
    double var75 = org.apache.commons.math.util.MathUtils.distanceInf(var71, var73);
    double var76 = org.apache.commons.math.util.MathUtils.distance(var48, var73);
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var48);
    double var78 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    
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
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
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
    assertTrue(var47 == 1);
    
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
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
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
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
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
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);

  }

  public void test255() {}
//   public void test255() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest5.test255"); }
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
//     double var19 = org.apache.commons.math.util.MathUtils.distance(var6, var12);
//     double[] var20 = new double[] { };
//     double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
//     double[] var22 = new double[] { };
//     double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
//     double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
//     double[] var26 = new double[] { 100.0d};
//     double var27 = org.apache.commons.math.util.MathUtils.distance1(var20, var26);
//     double var28 = org.apache.commons.math.util.MathUtils.distance(var6, var20);
//     double[] var29 = new double[] { };
//     double[] var30 = new double[] { };
//     double var31 = org.apache.commons.math.util.MathUtils.safeNorm(var30);
//     double[] var32 = new double[] { };
//     double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
//     double var34 = org.apache.commons.math.util.MathUtils.distanceInf(var30, var32);
//     int var35 = org.apache.commons.math.util.MathUtils.hash(var30);
//     double[] var36 = new double[] { };
//     double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
//     double[] var38 = new double[] { };
//     double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
//     double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var36, var38);
//     double[] var41 = null;
//     boolean var42 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var41);
//     double var43 = org.apache.commons.math.util.MathUtils.distance(var30, var36);
//     boolean var44 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var29, var36);
//     double var45 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var36);
//     double var46 = org.apache.commons.math.util.MathUtils.distance1(var1, var20);
//     double var47 = org.apache.commons.math.util.MathUtils.distance1(var0, var1);
// 
//   }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test256"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1074790369), 1521136320);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 446345951);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test257"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(3631948688846703104L, 1651916801);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test258"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-7766279631452241920L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7766279631452241920L);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test259"); }


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
    double[] var25 = new double[] { 100.0d};
    double var26 = org.apache.commons.math.util.MathUtils.distance1(var19, var25);
    double var27 = org.apache.commons.math.util.MathUtils.distance(var5, var19);
    double[] var28 = new double[] { };
    double[] var29 = new double[] { };
    double var30 = org.apache.commons.math.util.MathUtils.safeNorm(var29);
    double[] var31 = new double[] { };
    double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
    double var33 = org.apache.commons.math.util.MathUtils.distanceInf(var29, var31);
    int var34 = org.apache.commons.math.util.MathUtils.hash(var29);
    double[] var35 = new double[] { };
    double var36 = org.apache.commons.math.util.MathUtils.safeNorm(var35);
    double[] var37 = new double[] { };
    double var38 = org.apache.commons.math.util.MathUtils.safeNorm(var37);
    double var39 = org.apache.commons.math.util.MathUtils.distanceInf(var35, var37);
    double[] var40 = null;
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var35, var40);
    double var42 = org.apache.commons.math.util.MathUtils.distance(var29, var35);
    boolean var43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var35);
    double var44 = org.apache.commons.math.util.MathUtils.distanceInf(var19, var35);
    double var45 = org.apache.commons.math.util.MathUtils.distance1(var0, var19);
    double var46 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double[] var47 = new double[] { };
    double var48 = org.apache.commons.math.util.MathUtils.safeNorm(var47);
    double[] var49 = new double[] { };
    double var50 = org.apache.commons.math.util.MathUtils.safeNorm(var49);
    double var51 = org.apache.commons.math.util.MathUtils.distanceInf(var47, var49);
    int var52 = org.apache.commons.math.util.MathUtils.hash(var47);
    double[] var53 = new double[] { };
    double var54 = org.apache.commons.math.util.MathUtils.safeNorm(var53);
    double[] var55 = new double[] { };
    double var56 = org.apache.commons.math.util.MathUtils.safeNorm(var55);
    double var57 = org.apache.commons.math.util.MathUtils.distanceInf(var53, var55);
    double[] var58 = null;
    boolean var59 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var53, var58);
    double var60 = org.apache.commons.math.util.MathUtils.distance(var47, var53);
    double[] var61 = new double[] { };
    double[] var62 = new double[] { };
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double[] var64 = new double[] { };
    double var65 = org.apache.commons.math.util.MathUtils.safeNorm(var64);
    double var66 = org.apache.commons.math.util.MathUtils.distanceInf(var62, var64);
    int var67 = org.apache.commons.math.util.MathUtils.hash(var62);
    double[] var68 = new double[] { };
    double var69 = org.apache.commons.math.util.MathUtils.safeNorm(var68);
    double[] var70 = new double[] { };
    double var71 = org.apache.commons.math.util.MathUtils.safeNorm(var70);
    double var72 = org.apache.commons.math.util.MathUtils.distanceInf(var68, var70);
    double[] var73 = null;
    boolean var74 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var68, var73);
    double var75 = org.apache.commons.math.util.MathUtils.distance(var62, var68);
    boolean var76 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var61, var68);
    double var77 = org.apache.commons.math.util.MathUtils.distance(var53, var61);
    double var78 = org.apache.commons.math.util.MathUtils.distance(var19, var61);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
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
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test260"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.9996160431168271d, (-0.9912118879878863d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9912118879878863d));

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test261"); }


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
    double[] var11 = new double[] { 100.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var5, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var2, var5);
    int var14 = org.apache.commons.math.util.MathUtils.hash(var5);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test262"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1755643678));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test263"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(1.4218932149930186d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1924316395471142d);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test264"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(24.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5291537476963082d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test265"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(5.1510412321629778E18d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.1510412321629788E18d);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test266"); }


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
    int var33 = org.apache.commons.math.util.MathUtils.hash(var28);
    double[] var34 = new double[] { };
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var36);
    double[] var39 = null;
    boolean var40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var39);
    double var41 = org.apache.commons.math.util.MathUtils.distance(var28, var34);
    double[] var42 = new double[] { };
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var44);
    double var47 = org.apache.commons.math.util.MathUtils.distance1(var34, var44);
    double var48 = org.apache.commons.math.util.MathUtils.distance1(var20, var34);
    double[] var49 = new double[] { };
    double var50 = org.apache.commons.math.util.MathUtils.safeNorm(var49);
    double[] var51 = new double[] { };
    double var52 = org.apache.commons.math.util.MathUtils.safeNorm(var51);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var49, var51);
    int var54 = org.apache.commons.math.util.MathUtils.hash(var49);
    double[] var55 = new double[] { };
    double var56 = org.apache.commons.math.util.MathUtils.safeNorm(var55);
    double[] var57 = new double[] { };
    double var58 = org.apache.commons.math.util.MathUtils.safeNorm(var57);
    double var59 = org.apache.commons.math.util.MathUtils.distanceInf(var55, var57);
    double[] var60 = null;
    boolean var61 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var55, var60);
    boolean var62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var49, var55);
    double[] var63 = new double[] { };
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    double[] var65 = new double[] { };
    double var66 = org.apache.commons.math.util.MathUtils.safeNorm(var65);
    double var67 = org.apache.commons.math.util.MathUtils.distanceInf(var63, var65);
    double[] var68 = new double[] { };
    double var69 = org.apache.commons.math.util.MathUtils.safeNorm(var68);
    double[] var70 = new double[] { };
    double var71 = org.apache.commons.math.util.MathUtils.safeNorm(var70);
    double var72 = org.apache.commons.math.util.MathUtils.distanceInf(var68, var70);
    int var73 = org.apache.commons.math.util.MathUtils.hash(var68);
    double[] var74 = new double[] { };
    double var75 = org.apache.commons.math.util.MathUtils.safeNorm(var74);
    double[] var76 = new double[] { };
    double var77 = org.apache.commons.math.util.MathUtils.safeNorm(var76);
    double var78 = org.apache.commons.math.util.MathUtils.distanceInf(var74, var76);
    double[] var79 = null;
    boolean var80 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var74, var79);
    boolean var81 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var68, var74);
    boolean var82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var65, var74);
    double var83 = org.apache.commons.math.util.MathUtils.distance1(var55, var74);
    double var84 = org.apache.commons.math.util.MathUtils.distance1(var34, var74);
    double var85 = org.apache.commons.math.util.MathUtils.distance1(var0, var34);
    
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
    assertTrue(var33 == 1);
    
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
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.0d);
    
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
    assertTrue(var47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
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
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0.0d);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test267"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.026657246199241372d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.026657246199241372d);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test268"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.String var6 = var5.toString();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    boolean var8 = var5.getStrict();
    org.apache.commons.math.exception.NonMonotonousSequenceException var15 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.4711276743037347d, (java.lang.Number)(-1.0f), 1521136321);
    org.apache.commons.math.util.MathUtils.OrderDirection var19 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var21 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var19, true);
    java.lang.Number var22 = var21.getPrevious();
    java.lang.Throwable[] var23 = var21.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var27 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var27, false);
    java.lang.String var30 = var29.toString();
    var21.addSuppressed((java.lang.Throwable)var29);
    var15.addSuppressed((java.lang.Throwable)var29);
    org.apache.commons.math.exception.NonMonotonousSequenceException var36 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(short)100, (java.lang.Number)100, 1);
    int var37 = var36.getIndex();
    var15.addSuppressed((java.lang.Throwable)var36);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var15.getDirection();
    org.apache.commons.math.exception.NonMonotonousSequenceException var41 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)11014.39717992353d, (java.lang.Number)100, 99, var39, false);
    boolean var42 = var41.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var43 = var41.getDirection();
    org.apache.commons.math.util.MathUtils.OrderDirection var47 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var49 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var47, true);
    java.lang.Number var50 = var49.getPrevious();
    java.lang.Throwable[] var51 = var49.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var55 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var57 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var55, true);
    java.lang.Number var58 = var57.getPrevious();
    var49.addSuppressed((java.lang.Throwable)var57);
    org.apache.commons.math.util.MathUtils.OrderDirection var63 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var65 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var63, true);
    java.lang.Number var66 = var65.getPrevious();
    java.lang.Throwable[] var67 = var65.getSuppressed();
    org.apache.commons.math.util.MathUtils.OrderDirection var71 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var73 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)(byte)1, (java.lang.Number)1.5430806348152437d, 0, var71, false);
    java.lang.String var74 = var73.toString();
    var65.addSuppressed((java.lang.Throwable)var73);
    var49.addSuppressed((java.lang.Throwable)var73);
    org.apache.commons.math.util.MathUtils.OrderDirection var77 = var73.getDirection();
    var41.addSuppressed((java.lang.Throwable)var73);
    java.lang.Number var79 = var41.getArgument();
    var5.addSuppressed((java.lang.Throwable)var41);
    java.lang.Throwable[] var81 = var5.getSuppressed();
    java.lang.Number var82 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 10+ "'", var22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var30.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + 10+ "'", var50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + 10+ "'", var58.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + 10+ "'", var66.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"+ "'", var74.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points -1 and 0 are not decreasing (1.543 < 1)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + 11014.39717992353d+ "'", var79.equals(11014.39717992353d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + 1.5430806348152437d+ "'", var82.equals(1.5430806348152437d));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test269"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle((-2.19441663462502d), 0.5436536017775284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.19441663462502d));

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test270"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(45.80919935999207d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7995213565343409d);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test271"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)1.5430806348152437d, (java.lang.Number)10, 10, var3, true);
    java.lang.String var6 = var5.toString();
    java.lang.Throwable[] var7 = var5.getSuppressed();
    boolean var8 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = var5.getDirection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 9 and 10 are not strictly decreasing (10 <= 1.543)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test272"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(4.022575599366318d, (-0.02666356228557552d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.022575599366317d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test273"); }


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
    double[] var11 = new double[] { 100.0d};
    double var12 = org.apache.commons.math.util.MathUtils.distance1(var5, var11);
    double var13 = org.apache.commons.math.util.MathUtils.distance1(var2, var5);
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
    double[] var34 = new double[] { 100.0d};
    double var35 = org.apache.commons.math.util.MathUtils.distance1(var28, var34);
    double var36 = org.apache.commons.math.util.MathUtils.distance(var14, var28);
    double[] var37 = new double[] { };
    double[] var38 = new double[] { };
    double var39 = org.apache.commons.math.util.MathUtils.safeNorm(var38);
    double[] var40 = new double[] { };
    double var41 = org.apache.commons.math.util.MathUtils.safeNorm(var40);
    double var42 = org.apache.commons.math.util.MathUtils.distanceInf(var38, var40);
    int var43 = org.apache.commons.math.util.MathUtils.hash(var38);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double[] var46 = new double[] { };
    double var47 = org.apache.commons.math.util.MathUtils.safeNorm(var46);
    double var48 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var46);
    double[] var49 = null;
    boolean var50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var44, var49);
    double var51 = org.apache.commons.math.util.MathUtils.distance(var38, var44);
    boolean var52 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var37, var44);
    double var53 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var44);
    double[] var54 = new double[] { };
    double var55 = org.apache.commons.math.util.MathUtils.safeNorm(var54);
    double[] var56 = new double[] { };
    double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var56);
    double var58 = org.apache.commons.math.util.MathUtils.distanceInf(var54, var56);
    int var59 = org.apache.commons.math.util.MathUtils.hash(var54);
    double[] var60 = new double[] { };
    double var61 = org.apache.commons.math.util.MathUtils.safeNorm(var60);
    double[] var62 = new double[] { };
    double var63 = org.apache.commons.math.util.MathUtils.safeNorm(var62);
    double var64 = org.apache.commons.math.util.MathUtils.distanceInf(var60, var62);
    double[] var65 = null;
    boolean var66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var60, var65);
    double var67 = org.apache.commons.math.util.MathUtils.distance(var54, var60);
    double var68 = org.apache.commons.math.util.MathUtils.distanceInf(var28, var60);
    boolean var69 = org.apache.commons.math.util.MathUtils.equals(var5, var28);
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
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
    assertTrue(var43 == 1);
    
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
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);
    
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
    assertTrue(var59 == 1);
    
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
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test274"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(5919304408L, (-372980732420685833L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-372980726501381425L));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test275"); }


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
    double[] var20 = new double[] { };
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var22 = new double[] { };
    double var23 = org.apache.commons.math.util.MathUtils.safeNorm(var22);
    double var24 = org.apache.commons.math.util.MathUtils.distanceInf(var20, var22);
    int var25 = org.apache.commons.math.util.MathUtils.hash(var20);
    double[] var26 = new double[] { };
    double var27 = org.apache.commons.math.util.MathUtils.safeNorm(var26);
    double[] var28 = new double[] { };
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double var30 = org.apache.commons.math.util.MathUtils.distanceInf(var26, var28);
    double[] var31 = null;
    boolean var32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var26, var31);
    double var33 = org.apache.commons.math.util.MathUtils.distance(var20, var26);
    double[] var34 = new double[] { };
    double var35 = org.apache.commons.math.util.MathUtils.safeNorm(var34);
    double[] var36 = new double[] { };
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double var38 = org.apache.commons.math.util.MathUtils.distanceInf(var34, var36);
    double var39 = org.apache.commons.math.util.MathUtils.distance1(var26, var36);
    double var40 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var36);
    int var41 = org.apache.commons.math.util.MathUtils.hash(var36);
    double[] var42 = new double[] { };
    double var43 = org.apache.commons.math.util.MathUtils.safeNorm(var42);
    double[] var44 = new double[] { };
    double var45 = org.apache.commons.math.util.MathUtils.safeNorm(var44);
    double var46 = org.apache.commons.math.util.MathUtils.distanceInf(var42, var44);
    int var47 = org.apache.commons.math.util.MathUtils.hash(var42);
    double[] var48 = new double[] { };
    double var49 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    double[] var50 = new double[] { };
    double var51 = org.apache.commons.math.util.MathUtils.safeNorm(var50);
    double var52 = org.apache.commons.math.util.MathUtils.distanceInf(var48, var50);
    double[] var53 = null;
    boolean var54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var48, var53);
    boolean var55 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var42, var48);
    double[] var56 = new double[] { };
    double var57 = org.apache.commons.math.util.MathUtils.safeNorm(var56);
    double[] var58 = new double[] { };
    double var59 = org.apache.commons.math.util.MathUtils.safeNorm(var58);
    double var60 = org.apache.commons.math.util.MathUtils.distanceInf(var56, var58);
    double[] var61 = new double[] { };
    double var62 = org.apache.commons.math.util.MathUtils.safeNorm(var61);
    double[] var63 = new double[] { };
    double var64 = org.apache.commons.math.util.MathUtils.safeNorm(var63);
    double var65 = org.apache.commons.math.util.MathUtils.distanceInf(var61, var63);
    double[] var67 = new double[] { 100.0d};
    double var68 = org.apache.commons.math.util.MathUtils.distance1(var61, var67);
    double var69 = org.apache.commons.math.util.MathUtils.distance1(var58, var61);
    double var70 = org.apache.commons.math.util.MathUtils.distance1(var48, var58);
    double[] var71 = new double[] { };
    double var72 = org.apache.commons.math.util.MathUtils.safeNorm(var71);
    double[] var73 = new double[] { };
    double var74 = org.apache.commons.math.util.MathUtils.safeNorm(var73);
    double var75 = org.apache.commons.math.util.MathUtils.distanceInf(var71, var73);
    double var76 = org.apache.commons.math.util.MathUtils.distance(var48, var73);
    boolean var77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var36, var48);
    double var78 = org.apache.commons.math.util.MathUtils.safeNorm(var48);
    
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
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
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
    assertTrue(var47 == 1);
    
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
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.0d);
    
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
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.0d);
    
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
    assertTrue(var76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0.0d);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test276"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)2.8934439858858716d, (java.lang.Number)1.076584064879227E80d, 1019215872);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test277"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test278"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-4L), (-2428453559002464264L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4L);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest5.test279"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.7696295903822673d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

}
