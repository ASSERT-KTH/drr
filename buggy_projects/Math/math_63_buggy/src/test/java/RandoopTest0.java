
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11013.232874703393d);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(11013.232874703393d, 10.0d, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9287285890885333d));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(100.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0d);

  }

  public void test7() {}
//   public void test7() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }
// 
// 
//     double var0 = org.apache.commons.math.util.FastMath.random();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == 0.9067427790689399d);
// 
//   }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10L);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(11013.232874703393d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 104.9439511105971d);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0d, (-0.9287285890885333d), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    int var1 = org.apache.commons.math.util.FastMath.round(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1752011936438014d);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    double var2 = org.apache.commons.math.util.MathUtils.round((-0.9287285890885333d), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test18() {}
//   public void test18() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }
// 
// 
//     double[] var3 = new double[] { 0.0d, 10.0d, 0.0d};
//     double[] var4 = null;
//     boolean var5 = org.apache.commons.math.util.MathUtils.equals(var3, var4);
//     double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, 0.0d);
// 
//   }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    double var1 = org.apache.commons.math.util.FastMath.cos((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5403023058681398d);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5612677191481816d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(0.9067427790689399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7365279287428347d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var4 = null;
    boolean var5 = org.apache.commons.math.util.MathUtils.equals(var3, var4);
    double[] var7 = new double[] { 0.0d};
    double[] var9 = new double[] { 100.0d};
    boolean var10 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var7, var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = org.apache.commons.math.util.MathUtils.distance1(var3, var7);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.0886708959722813d);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.5403023058681398d, 0.9067427790689399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5403023058681399d);

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    double var1 = org.apache.commons.math.util.FastMath.exp((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.36787944117144233d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals((-1.0d), 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.0d, 1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.705026843555238d);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(100L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.705026843555238d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6480542736638855d);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.149548905166106d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.7365279287428347d, 100, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test41() {}
//   public void test41() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.36787944117144233d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.36787944117144233d);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-1L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1150131505));

  }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.ulp(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0f));

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(100, (-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    double var1 = org.apache.commons.math.util.FastMath.abs((-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9287285890885333d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.705026843555238d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0239010128918022d);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test57() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test58() {}
//   public void test58() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.9287285890885333d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5707963267948966d));

  }

  public void test61() {}
//   public void test61() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 100);
// 
//   }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5872139151569291d));

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(10.0d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     int[] var2 = new int[] { (-1), 10};
//     int[] var3 = null;
//     int var4 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var3);
// 
//   }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    int var1 = org.apache.commons.math.util.FastMath.round(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8575532158463934d);

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.5403023058681399d, 0.9067427790689399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5722296646125027d);

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    double var2 = org.apache.commons.math.util.FastMath.max(Double.NEGATIVE_INFINITY, 104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 104.9439511105971d);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.log(11013.232874703393d, Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.5722296646125027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test76() {}
//   public void test76() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.5403023058681399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4932167668855039d);

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.9287285890885333d), 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9287285890885333d));

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1150131505), (-1150131505));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo((-0.9287285890885333d), 100.0d, (-1.5707963267948966d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    java.lang.Number var8 = var5.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.9067427790689399d+ "'", var8.equals(0.9067427790689399d));

  }

  public void test85() {}
//   public void test85() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.5403023058681399d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30.48232336227865d);

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.0f);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round((-1.0f), (-1), (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.5612677191481816d, 1, 191);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test92() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(100, 191);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(0L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     double[] var3 = new double[] { 0.0d, 10.0d, 0.0d};
//     double[] var4 = null;
//     boolean var5 = org.apache.commons.math.util.MathUtils.equals(var3, var4);
//     double[] var7 = new double[] { 0.0d};
//     double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
//     double var9 = org.apache.commons.math.util.MathUtils.distance1(var4, var7);
// 
//   }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1, (-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1150131505);

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(1.0d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8049487638684166d);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.8575532158463934d, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.087077848795329E30d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1150131505, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.332621544395286E157d);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    double[] var1 = new double[] { 0.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var3 = org.apache.commons.math.util.MathUtils.normalizeArray(var1, 0.4932167668855039d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(10, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.055287372175112d);

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.37623361672720984d);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1150131505), 191);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1909687824216308d);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(11013.232874703393d, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 11013.0d);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.0f);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    long var2 = org.apache.commons.math.util.FastMath.max(10L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1150131505));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    int var2 = org.apache.commons.math.util.FastMath.max(191, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 191);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.5612677191481816d, 1.1909687824216308d, 9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 0.0d, (-1150131505));

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.5403023058681399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.149548905166106d);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.5722296646125027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1442072990));

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.087077848795329E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-2.590337896729905d));

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.5722296646125027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.5403023058681399d, 0.5722296646125027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 363.7393755555636d);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(191, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 191);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    int var2 = org.apache.commons.math.util.FastMath.max(0, (-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.1622776601683795d);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 15.104412573075516d);

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-1442072990), 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.8575532158463934d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-1L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test142() {}
//   public void test142() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.cosh(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test143() {}
//   public void test143() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-0.5872139151569291d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.37623361672720984d, 0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.07563716874799481d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1752011936438014d);

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    float var1 = org.apache.commons.math.util.FastMath.abs((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.9E-324d, 0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    double var2 = org.apache.commons.math.util.FastMath.min(363.7393755555636d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test149() {}
//   public void test149() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(2.0886708959722813d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    double var2 = org.apache.commons.math.util.FastMath.min(0.9287285890885333d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(100.0f, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.0239010128918022d, 1.055287372175112d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0239010128918025d);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1), 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


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
    double[] var15 = new double[] { };
    double[] var19 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var20 = null;
    boolean var21 = org.apache.commons.math.util.MathUtils.equals(var19, var20);
    boolean var22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var15, var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var23 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var15);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    int var1 = org.apache.commons.math.util.FastMath.round((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(30.48232336227865d, 0.8575532158463934d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.479425538604203d);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.6480542736638855d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1150131505), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1150131505));

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(10, 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    long var2 = org.apache.commons.math.util.FastMath.min(2L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator((-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.9067427790689399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)0);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    float var2 = org.apache.commons.math.util.FastMath.max(10.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test176() {}
//   public void test176() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.5d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0L);

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    org.apache.commons.math.util.MathUtils.OrderDirection var9 = var5.getDirection();
    java.lang.Throwable[] var10 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"+ "'", var6.equals("org.apache.commons.math.exception.NonMonotonousSequenceException: points 99 and 100 are not decreasing (1.175 < 0.907)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    double var2 = org.apache.commons.math.util.FastMath.max(Double.NEGATIVE_INFINITY, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    double var3 = org.apache.commons.math.util.MathUtils.round(0.479425538604203d, 191, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.479425538604203d);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(11013.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 630998.4197775756d);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07570930918522539d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    long var2 = org.apache.commons.math.util.FastMath.max((-1L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.07570930918522539d, (-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.07570930918522539d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 630998.4197775758d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(30.48232336227865d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4840480658487383d);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.36787944117144233d, Double.NEGATIVE_INFINITY, 0);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-10));

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(99, 1150131505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1150131604);

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.9067427790689399d, 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9067427790689399d);

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(0.479425538604203d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4612695550331807d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.087077848795329E30d, 9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(30.48232336227865d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 8.655154728220008E12d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.5722296646125027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.168240001941272d);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.0239010128918025d, 630998.4197775758d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0239010128918027d);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 209);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(630998.4197775756d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 13.35506022199452d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(630998.4197775758d, 0.0d, 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.055287372175112d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6104464895571766d);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1.4840480658487383d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 280988690);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1442072990));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1442072990);

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    long var2 = org.apache.commons.math.util.FastMath.min(0L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(4.9E-324d, 0.705026843555238d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(100, 280988690);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(100L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 90L);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    long var1 = org.apache.commons.math.util.FastMath.round(1.1909687824216308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    double var1 = org.apache.commons.math.util.FastMath.atan(1.1752011936438014d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8657694832396586d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(15.104412573075516d, 1.4840480658487383d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5380419587163434d);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.8575532158463934d, 11013.232874703393d, 1.149548905166106d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1150131505, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(90L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 0.479425538604203d, 1079574559);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1442072990), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(99, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1532522787);

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Double.NaN, (-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 280988690);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    double[] var0 = new double[] { };
    double[] var4 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var4, var5);
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var4);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
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

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.705026843555238d, 630998.4197775758d, 8.655154728220008E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-10), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9287285890885334d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.8657694832396586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1752011936438014d);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(3.1622776601683795d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.16227766016838d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(9.332621544395286E157d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    org.apache.commons.math.util.MathUtils.OrderDirection var3 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)0.9067427790689399d, (java.lang.Number)1.1752011936438014d, 100, var3, false);
    java.lang.String var6 = var5.toString();
    org.apache.commons.math.util.MathUtils.OrderDirection var7 = var5.getDirection();
    int var8 = var5.getIndex();
    boolean var9 = var5.getStrict();
    org.apache.commons.math.util.MathUtils.OrderDirection var10 = var5.getDirection();
    java.lang.Number var11 = var5.getArgument();
    org.apache.commons.math.util.MathUtils.OrderDirection var12 = var5.getDirection();
    
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
    assertNull(var12);

  }

  public void test240() {}
//   public void test240() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(100.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(363.7393755555636d, 1.149548905166106d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log1p((-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.055287372175112d, (-0.5872139151569291d), 1442072990);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(2L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 99);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(13.35506022199452d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.372549507764957d);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(3.1622776601683795d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 23.624342922017807d);

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    float var2 = org.apache.commons.math.util.FastMath.max((-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(23.624342922017807d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(1150131604, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1150131604);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(30.48232336227865d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.552713678800501E-15d);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.5612677191481816d, 1.149548905166106d, 1150131505);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(10L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.149548905166106d, 0.5403023058681399d, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100, (-1442072990));
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.8657694832396586d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.699218330199179d);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0d, 2.372549507764957d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    long var1 = org.apache.commons.math.util.FastMath.round((-2.590337896729905d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-3L));

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1150131505), (-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1150131505);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.168240001941272d, (-1442072990), 1);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.4932167668855039d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1241171695718353d);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash((-0.5872139151569291d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1774819148);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1L), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test268() {}
//   public void test268() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(2L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2L);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test271() {}
//   public void test271() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }
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
//     double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var16, var17);
// 
//   }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.8049487638684166d, 4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8049487638684166d);

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.8575532158463934d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.3573856176314845d);

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-1L), 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1442072990), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072980));

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 1442072990);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(2.0886708959722813d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.0239010128918025d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7840341610578327d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.8049487638684166d, 0.7365279287428347d, 363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.1102230246251565E-16d, 1774819148, 99);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(104.9439511105971d, 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.29371928817332E59d);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.055287372175112d, 10, 1150131604);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test286() {}
//   public void test286() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.07570930918522539d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(100.0d, 0.7365279287428347d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var15);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
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

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 2.5380419587163434d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(3.1622776601683795d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5d);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1442072980), 99);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072881));

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 1532522787);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(630998.4197775758d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    double[] var3 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var4 = null;
    boolean var5 = org.apache.commons.math.util.MathUtils.equals(var3, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var7 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, Double.NaN);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(630998.4197775758d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 630998.0d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.1102230246251565E-16d, 1.7840341610578327d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.439274378162969E-29d);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.149548905166106d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test299() {}
//   public void test299() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(11013.232874703393d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7182818284590453d);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0d), 0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.699218330199179d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-3L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(8.655154728220008E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765625E-4d);

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(1774819148);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test307() {}
//   public void test307() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }
// 
// 
//     float var3 = org.apache.commons.math.util.MathUtils.round(100.0f, 191, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Float.NaN);
// 
//   }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(99, (-1442072990));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm((-3L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 300L);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(0.0f, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(1.7182818284590453d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.14695139943744212d));

  }

  public void test313() {}
//   public void test313() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.min(Float.NaN, Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.087077848795329E30d, (-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0870778487953289E30d);

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(0.705026843555238d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-0.14695139943744212d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.14748086636738275d));

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(1.168240001941272d, 1532522787);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-3L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(100L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.0870778487953289E30d, 9.765625E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.10022219450316257d));

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(1.5707963267948966d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948968d);

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-3L), 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-5L));

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9330920755982086d);

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.479425538604203d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 27.46905995280715d);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.6104464895571766d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2545069915963656d);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-5L), (-3L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test328() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    double[] var1 = new double[] { 0.0d};
    double var2 = org.apache.commons.math.util.MathUtils.safeNorm(var1);
    double[] var4 = new double[] { 0.0d};
    double[] var6 = new double[] { 100.0d};
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var4, var6);
    boolean var8 = org.apache.commons.math.util.MathUtils.equals(var1, var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var10 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, Double.NaN);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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

  }

  public void test330() {}
//   public void test330() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }
// 
// 
//     float var1 = org.apache.commons.math.util.FastMath.abs(Float.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Float.NaN);
// 
//   }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.5403023058681398d, 2.0886708959722813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5403023058681399d);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    int var1 = org.apache.commons.math.util.FastMath.abs((-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1150131505);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    long var2 = org.apache.commons.math.util.MathUtils.lcm(90L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900L);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(1.7182818284590453d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.877157801747449d);

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    int var2 = org.apache.commons.math.util.FastMath.max(209, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 209);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 815.7297363039102d);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.149548905166106d, 815.7297363039102d, 3.439274378162969E-29d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(90L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-90L));

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.07570930918522539d, (-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.0879311127268826E215d);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    float var2 = org.apache.commons.math.util.FastMath.min((-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(1.1909687824216308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2009326299);

  }

  public void test342() {}
//   public void test342() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.max(Float.NaN, 10.0f);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(300L, (-3L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 303L);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-0.14695139943744212d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-8.419694981306574d));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(3.439274378162969E-29d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.8645326993401346E-15d);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    long var1 = org.apache.commons.math.util.FastMath.abs((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.7840341610578327d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2128331401446932d);

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    double var1 = org.apache.commons.math.util.FastMath.tan((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5574077246549023d));

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.4612695550331807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4989227756918429d);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.0870778487953289E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-3.193181872794057d));

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1814400.000000139d);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.4229072086738532d);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    long var1 = org.apache.commons.math.util.FastMath.round(363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 364L);

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(23.624342922017807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1338502675));

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.9287285890885334d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6490605123312352d);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-0.10022219450316257d), (-0.9287285890885333d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.9287285890885333d));

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 1442072990);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    int var1 = org.apache.commons.math.util.FastMath.round(Float.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(2.5380419587163434d, (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow(0, (-90L));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.8575532158463934d, 1814400.000000139d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    long var2 = org.apache.commons.math.util.FastMath.min(900L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test366() {}
//   public void test366() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(15.104412573075516d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(209, 1442072990);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-10), 2009326299);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(209, 1150131604);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(630998.4197775758d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1641532182693481E-10d);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    org.apache.commons.math.exception.NonMonotonousSequenceException var3 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)900L, (java.lang.Number)(-1442072980), 1079574559);

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-90L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.4612695550331807d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.9067427790689399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6163140772864136d);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0, 280988690);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9756549932711598d);

  }

  public void test380() {}
//   public void test380() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
//     java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
//     java.math.BigInteger var5 = null;
//     java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
//     java.math.BigInteger var8 = org.apache.commons.math.util.MathUtils.pow(var4, var5);
// 
//   }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-1.5574077246549023d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1), (-1338502675));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1338502676));

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(300L, (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 299L);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.705026843555238d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7615941559557649d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.0239010128918022d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(9.765625E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765623447795783E-4d);

  }

  public void test388() {}
//   public void test388() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }
// 
// 
//     double[] var1 = new double[] { 0.0d};
//     double[] var3 = new double[] { 100.0d};
//     boolean var4 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var1, var3);
//     double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 1.0239010128918022d);
//     double[] var7 = null;
//     boolean var8 = org.apache.commons.math.util.MathUtils.equals(var3, var7);
//     double[] var9 = new double[] { };
//     double[] var13 = new double[] { 0.0d, 10.0d, 0.0d};
//     double[] var14 = null;
//     boolean var15 = org.apache.commons.math.util.MathUtils.equals(var13, var14);
//     boolean var16 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var9, var13);
//     double var17 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
//     double var18 = org.apache.commons.math.util.MathUtils.distance1(var7, var13);
// 
//   }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    java.math.BigInteger var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, (-1338502675));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(9.765623447795783E-4d, 15.104412573075516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.055287372175112d, 9.765625E-4d, 0.023901012891802464d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 280988690);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 280988690);

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1150131505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(1.1102230246251565E-16d, 1.4840480658487383d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.481044921481109E-17d);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1442072881), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072880));

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(299L, 2L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 301L);

  }

  public void test400() {}
//   public void test400() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.log10((-1.5574077246549023d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, (-1442072881));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072881));

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(2L, (-3L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


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
    double[] var21 = new double[] { 0.0d};
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double[] var24 = new double[] { 0.0d};
    double[] var26 = new double[] { 100.0d};
    boolean var27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var24, var26);
    boolean var28 = org.apache.commons.math.util.MathUtils.equals(var21, var24);
    double[] var30 = new double[] { 0.0d};
    double[] var32 = new double[] { 100.0d};
    boolean var33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var30, var32);
    double var34 = org.apache.commons.math.util.MathUtils.distance(var24, var32);
    double[] var36 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.8575532158463934d);
    double[] var38 = org.apache.commons.math.util.MathUtils.normalizeArray(var32, 0.6480542736638855d);
    double var39 = org.apache.commons.math.util.MathUtils.distance(var6, var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var41 = org.apache.commons.math.util.MathUtils.normalizeArray(var6, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 100.0d);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0f);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(0.4229072086738532d, (-1442072980), (-10));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.4612695550331807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1082845179605563d);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-1.5574077246549023d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.2261911708835171d));

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.5403023058681398d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.149548905166106d);

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1442072880), 1150131505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072880));

  }

  public void test410() {}
//   public void test410() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 1774819148);
// 
//   }

  public void test411() {}
//   public void test411() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.5707963267948968d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(9.765623447795783E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.765621895592899E-4d);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, 1150131604);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1079574559, (-1442072990));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, (-1442072881));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0d, 0.479425538604203d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1079574559);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    int var2 = org.apache.commons.math.util.FastMath.max(0, 1150131505);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1150131505);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


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
    boolean var14 = var5.getStrict();
    
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
    assertTrue(var14 == false);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3678794411714424d);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.07563716874799481d, 104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 7.207385928451561E-4d);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100, 9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 900);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.6163140772864136d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    java.math.BigInteger var0 = null;
    java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, 0L);
    java.math.BigInteger var4 = org.apache.commons.math.util.MathUtils.pow(var2, 0);
    java.math.BigInteger var5 = null;
    java.math.BigInteger var7 = org.apache.commons.math.util.MathUtils.pow(var5, 0L);
    java.math.BigInteger var9 = org.apache.commons.math.util.MathUtils.pow(var7, 0);
    java.math.BigInteger var10 = null;
    java.math.BigInteger var12 = org.apache.commons.math.util.MathUtils.pow(var10, 0L);
    java.math.BigInteger var14 = org.apache.commons.math.util.MathUtils.pow(var12, 0);
    java.math.BigInteger var15 = null;
    java.math.BigInteger var17 = org.apache.commons.math.util.MathUtils.pow(var15, 0L);
    java.math.BigInteger var19 = org.apache.commons.math.util.MathUtils.pow(var17, 0);
    java.math.BigInteger var20 = org.apache.commons.math.util.MathUtils.pow(var14, var17);
    java.math.BigInteger var21 = org.apache.commons.math.util.MathUtils.pow(var7, var17);
    java.math.BigInteger var22 = org.apache.commons.math.util.MathUtils.pow(var2, var7);
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test425() {}
//   public void test425() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }
// 
// 
//     double[] var1 = new double[] { 1.0d};
//     org.apache.commons.math.util.MathUtils.checkOrder(var1);
//     double[] var3 = null;
//     double var4 = org.apache.commons.math.util.MathUtils.distance(var1, var3);
// 
//   }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(7.481044921481109E-17d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.481044921481109E-17d);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.round(10.0d, 1774819148);
      fail("Expected exception of type java.lang.OutOfMemoryError");
    } catch (java.lang.OutOfMemoryError e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(5L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(104.9439511105971d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-240026100));

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var4, (-1.5707963267948966d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(0.5722296646125027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6441187605840392d);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.4932167668855039d, 2.877157801747449d, 0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-240026100), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-240026100));

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, 1079574559);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


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
    double[] var28 = new double[] { 0.0d};
    double[] var30 = new double[] { 100.0d};
    boolean var31 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var28, var30);
    double var32 = org.apache.commons.math.util.MathUtils.distanceInf(var25, var28);
    double[] var34 = new double[] { 0.0d};
    double[] var36 = new double[] { 100.0d};
    boolean var37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var34, var36);
    double[] var39 = org.apache.commons.math.util.MathUtils.normalizeArray(var36, 1.0239010128918022d);
    double var40 = org.apache.commons.math.util.MathUtils.distance1(var25, var39);
    boolean var41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var14, var39);
    org.apache.commons.math.util.MathUtils.checkOrder(var14);
    boolean var43 = org.apache.commons.math.util.MathUtils.equals(var6, var14);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 98.9760989871082d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1442072980), (-1150131505));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-291941475));

  }

  public void test438() {}
//   public void test438() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atanh(1.7840341610578327d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.1752011936438014d, 9.332621544395286E157d, 0.9287285890885333d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    int[] var2 = new int[] { 1, 0};
    int[] var6 = new int[] { 100, 100, 0};
    int[] var10 = new int[] { 10, 0, 1};
    int var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var10);
    int[] var15 = new int[] { 0, 100, 100};
    int var16 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var15);
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var2, var10);
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
    int[] var49 = new int[] { 0, 100, 100};
    int var50 = org.apache.commons.math.util.MathUtils.distanceInf(var44, var49);
    int var51 = org.apache.commons.math.util.MathUtils.distance1(var25, var49);
    int var52 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var25);
    
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
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 9);
    
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
    assertTrue(var50 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    double[] var0 = null;
    double[] var2 = new double[] { 0.0d};
    double var3 = org.apache.commons.math.util.MathUtils.safeNorm(var2);
    double[] var5 = new double[] { 0.0d};
    double[] var7 = new double[] { 100.0d};
    boolean var8 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var5, var7);
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var2, var5);
    double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var5);
    boolean var11 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(1L, (-90L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-89L));

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 1862915923);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1862915923));

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(2009326299, 303L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 209066259);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.5612677191481816d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    long var2 = org.apache.commons.math.util.FastMath.max(303L, 299L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 303L);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    double[] var0 = new double[] { };
    double[] var4 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var4, var5);
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    double[] var9 = new double[] { 1.0d};
    org.apache.commons.math.util.MathUtils.checkOrder(var9);
    double[] var12 = new double[] { 0.0d};
    double var13 = org.apache.commons.math.util.MathUtils.safeNorm(var12);
    double[] var15 = new double[] { 0.0d};
    double[] var17 = new double[] { 100.0d};
    boolean var18 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var15, var17);
    boolean var19 = org.apache.commons.math.util.MathUtils.equals(var12, var15);
    double[] var21 = new double[] { 0.0d};
    double[] var23 = new double[] { 100.0d};
    boolean var24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var21, var23);
    double var25 = org.apache.commons.math.util.MathUtils.distance(var15, var23);
    double[] var27 = org.apache.commons.math.util.MathUtils.normalizeArray(var23, 0.8575532158463934d);
    double[] var29 = org.apache.commons.math.util.MathUtils.normalizeArray(var23, 0.6480542736638855d);
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var23, 1.0239010128918025d);
    double var32 = org.apache.commons.math.util.MathUtils.distance(var9, var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var33 = org.apache.commons.math.util.MathUtils.distance(var4, var9);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0.023901012891802464d);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(11013.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 11013.0d);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(Float.NaN, 191, 209066259);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(1.5707963267948968d, 9.765621895592899E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.000441095849621d);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1442072881), 1774819148);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1774819148);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 364L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(9.765621895592899E-4d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, (-291941475), (-240026100));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0870778487953289E30d, 0.5403023058681399d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.37623361672720984d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.4567874239310208d);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(0.9330920755982086d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0d, 1.2128331401446932d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(9, 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(630998.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3043457015073627d);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign((-1.2261911708835171d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(104.9439511105971d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 52.47197555529855d);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh((-1.2261911708835171d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0326329306069673d));

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 209);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1532522787);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign((-1338502675));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    double var2 = org.apache.commons.math.util.MathUtils.scalb(0.9330920755982086d, (-1442072880));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.8628976317751614E-92d));

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    long var1 = org.apache.commons.math.util.FastMath.round(2.0886708959722813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2L);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(1.0870778487953289E30d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0870778487953289E30d);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    int var2 = org.apache.commons.math.util.FastMath.min(0, (-1442072880));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1442072880));

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    double[] var0 = new double[] { };
    double[] var4 = new double[] { 0.0d, 10.0d, 0.0d};
    double[] var5 = null;
    boolean var6 = org.apache.commons.math.util.MathUtils.equals(var4, var5);
    boolean var7 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var0, var4);
    double[] var9 = new double[] { 0.0d};
    double[] var11 = new double[] { 100.0d};
    boolean var12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var9, var11);
    double[] var14 = new double[] { 0.0d};
    double[] var16 = new double[] { 100.0d};
    boolean var17 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var14, var16);
    double var18 = org.apache.commons.math.util.MathUtils.distanceInf(var11, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var19 = org.apache.commons.math.util.MathUtils.distanceInf(var4, var11);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100.0d);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1862915923));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(13.35506022199452d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 315499.70988958d);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(10L, 1442072990);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow((-240026100), 300L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    int[] var2 = new int[] { 1, 0};
    int[] var6 = new int[] { 100, 100, 0};
    int[] var10 = new int[] { 10, 0, 1};
    int var11 = org.apache.commons.math.util.MathUtils.distance1(var6, var10);
    int[] var15 = new int[] { 0, 100, 100};
    int var16 = org.apache.commons.math.util.MathUtils.distanceInf(var10, var15);
    int var17 = org.apache.commons.math.util.MathUtils.distance1(var2, var10);
    int[] var21 = new int[] { 100, 100, 0};
    int[] var25 = new int[] { 10, 0, 1};
    int var26 = org.apache.commons.math.util.MathUtils.distance1(var21, var25);
    int[] var30 = new int[] { 100, 100, 0};
    int[] var34 = new int[] { 10, 0, 1};
    int var35 = org.apache.commons.math.util.MathUtils.distance1(var30, var34);
    int[] var39 = new int[] { 100, 100, 0};
    int[] var43 = new int[] { 10, 0, 1};
    int var44 = org.apache.commons.math.util.MathUtils.distance1(var39, var43);
    int var45 = org.apache.commons.math.util.MathUtils.distance1(var34, var43);
    int[] var49 = new int[] { 100, 100, 0};
    int[] var53 = new int[] { 10, 0, 1};
    int var54 = org.apache.commons.math.util.MathUtils.distance1(var49, var53);
    int[] var58 = new int[] { 100, 100, 0};
    int[] var62 = new int[] { 10, 0, 1};
    int var63 = org.apache.commons.math.util.MathUtils.distance1(var58, var62);
    int var64 = org.apache.commons.math.util.MathUtils.distance1(var53, var62);
    double var65 = org.apache.commons.math.util.MathUtils.distance(var43, var62);
    int var66 = org.apache.commons.math.util.MathUtils.distanceInf(var21, var43);
    int var67 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var43);
    
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
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 9);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 191);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
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
    assertTrue(var65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 9);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(900L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1000L);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1442072990));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    double var2 = org.apache.commons.math.util.FastMath.max(10.0d, 1.3573856176314845d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(0.07563716874799481d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.07549325845303248d);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(280988690, (-240026100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(1442072990, (-1442072980));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(9.765625E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999995231628797d);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.705026843555238d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.9882121507348245d);

  }

  public void test489() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.3678794411714424d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1940688187363215d);

  }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (-89L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(2.0886708959722813d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9697850179455104d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.0239010128918027d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7840341610578332d);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(100L, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(13.35506022199452d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 13.355060221994522d);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(951780243, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    int var2 = org.apache.commons.math.util.FastMath.max(1442072990, 951780243);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1442072990);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(300L, 900L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1200L);

  }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.705026843555238d, Double.POSITIVE_INFINITY, 13.355060221994522d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5574077246549023d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-89.2328896037985d));

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.36787944117144233d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.31326168751822286d);

  }

}
