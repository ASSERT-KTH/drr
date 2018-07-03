
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1L), (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(100.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(var0, Double.NaN, 10.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    int var2 = org.apache.commons.math.util.FastMath.max(0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.999999999996666E-7d);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(10.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20.0d);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    float var2 = org.apache.commons.math.util.MathUtils.round(1.0f, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var2 = org.apache.commons.math.util.FastMath.min((-1.0d), 9.999999999996666E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0d));

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 0, (-1));
//     org.apache.commons.math.exception.util.Localizable var4 = null;
//     org.apache.commons.math.exception.util.Localizable var5 = null;
//     java.lang.Object[] var7 = new java.lang.Object[] { (-1.0d)};
//     org.apache.commons.math.exception.MathIllegalStateException var8 = new org.apache.commons.math.exception.MathIllegalStateException(var5, var7);
//     org.apache.commons.math.exception.MathIllegalStateException var9 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var3, var4, var7);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 1.0E-6d, 10.0d, 0.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


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

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb(0.0f, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(var0, Double.NaN, 10.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(10.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.0f);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0E-6d, 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(100.0d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, (-1.0f), 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.ceil(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0d);

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     double var0 = org.apache.commons.math.util.FastMath.random();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var0 == 0.6757925232032458d);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getMax();
    org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.solve(100, var4, 10.0d, 0.6757925232032458d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(1L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test31() {}
//   public void test31() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.sqrt((-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.718281828459045d);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.5d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.25d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(10.0f, 10.0f, (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.1752011936438014d));

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(10.099504938362077d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10341.893056882767d);

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    double var8 = org.apache.commons.math.util.MathUtils.linearCombination(100.0d, 1.0E-6d, 5.25d, 0.0d, 2.718281828459045d, 1.0d, 0.5d, 2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 4.077522742688568d);

  }

  public void test43() {}
//   public void test43() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }
// 
// 
//     double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(100L, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 363.7393755555636d);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test47() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-1L), 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test48() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }


    float var1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    org.apache.commons.math.exception.NullArgumentException var0 = new org.apache.commons.math.exception.NullArgumentException();

  }

  public void test50() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(1L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
    org.apache.commons.math.analysis.solvers.AllowedSolution var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(1, var4, 5.25d, Double.NaN, 1.0d, var8);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0471975511965979d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(10.099504938362077d, 1.0471975511965979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.153650708549716d);

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    int var2 = org.apache.commons.math.util.FastMath.min(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.atan(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    double var8 = org.apache.commons.math.util.MathUtils.linearCombination(0.0d, 20.0d, 0.0d, (-1.0d), (-1.1752011936438014d), 20.0d, 0.5d, 20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-13.504023872876028d));

  }

  public void test59() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-10L));

  }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter((-1.0f), 1.0471975511965979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.99999994f));

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialLog((-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(5.25d, 10.153650708549716d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test64() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }


    float var2 = org.apache.commons.math.util.FastMath.max((-1.0f), (-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.0f));

  }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)10341.893056882767d, (java.lang.Number)(-0.99999994f), false);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.AllowedSolution var1 = org.apache.commons.math.analysis.solvers.AllowedSolution.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.exception.util.LocalizedFormats var1 = org.apache.commons.math.exception.util.LocalizedFormats.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Object[] var1 = null;
    org.apache.commons.math.exception.NullArgumentException var2 = new org.apache.commons.math.exception.NullArgumentException(var0, var1);

  }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.apache.commons.math.util.Incrementor var0 = new org.apache.commons.math.util.Incrementor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.incrementCount();
      fail("Expected exception of type org.apache.commons.math.exception.MaxCountExceededException");
    } catch (org.apache.commons.math.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }


    double var1 = org.apache.commons.math.util.FastMath.acosh(10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.003173546455298d);

  }

  public void test71() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    double var2 = org.apache.commons.math.util.FastMath.IEEEremainder(1.0d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd((-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.6757925232032458d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1683693131));

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, 10341.893056882767d, 363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)(-1));

  }

  public void test77() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }


    org.apache.commons.math.util.Incrementor var0 = new org.apache.commons.math.util.Incrementor();
    var0.resetCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.incrementCount();
      fail("Expected exception of type org.apache.commons.math.exception.MaxCountExceededException");
    } catch (org.apache.commons.math.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getMin();
    org.apache.commons.math.analysis.UnivariateRealFunction var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.solve((-1), var3, 4.077522742688568d, 9.999999999996666E-7d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test80() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test81() {}
//   public void test81() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.asin(10.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial((-1));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test84() {}
//   public void test84() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }
// 
// 
//     double var4 = org.apache.commons.math.util.MathUtils.linearCombination(363.7393755555636d, 4.077522742688568d, 10.153650708549716d, Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 0.5d, 10.153650708549716d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(0, 10);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-13.504023872876028d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(5.25d, 10341.893056882767d, 0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 101);

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(5.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.0d);

  }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     org.apache.commons.math.exception.util.Localizable var0 = null;
//     java.lang.Object[] var2 = new java.lang.Object[] { (-1.0d)};
//     org.apache.commons.math.exception.MathIllegalStateException var3 = new org.apache.commons.math.exception.MathIllegalStateException(var0, var2);
//     org.apache.commons.math.exception.MathInternalError var4 = new org.apache.commons.math.exception.MathInternalError((java.lang.Throwable)var3);
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(5.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test94() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }


    double var1 = org.apache.commons.math.util.FastMath.sinh(9.999999999996666E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.999999999998333E-7d);

  }

  public void test95() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(20.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 19.999999999999996d);

  }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 4.9E-324d, 2.718281828459045d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }


    int[] var3 = new int[] { 10, 0, 0};
    int[] var5 = new int[] { (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var6 = org.apache.commons.math.util.MathUtils.distanceInf(var3, var5);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test98() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.0471975511965979d, 3.003173546455298d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test99() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }


    double var1 = org.apache.commons.math.util.FastMath.log(1.0471975511965979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.04611759718129058d);

  }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(10.099504938362077d, (-1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10.167649573305612d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 100.0f);

  }

  public void test102() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(10341.893056882767d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 13);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(1.0471975511965979d, 10341.893056882767d, 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0471975511965879d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(9.999999999996666E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.999995E-7d);

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    int var2 = org.apache.commons.math.util.FastMath.min(1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test108() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.0E-14d, 5.0d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(9.999999999998333E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000000000001666E-6d);

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(100.0d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100.0d);

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.apache.commons.math.exception.MaxCountExceededException var1 = new org.apache.commons.math.exception.MaxCountExceededException((java.lang.Number)10L);

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd((-10L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10L);

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 5.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.25d);

  }

  public void test114() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(1.0471975511965979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7320508075688776d);

  }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow(0L, 10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test116() {}
//   public void test116() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }
// 
// 
//     double var6 = org.apache.commons.math.util.MathUtils.linearCombination(1.0471975511965879d, 0.0d, 0.0d, Double.NaN, 4.077522742688568d, 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == Double.NaN);
// 
//   }

  public void test117() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(4.077522742688568d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 233.62484402466288d);

  }

  public void test118() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test119() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.5d, Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test120() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }


    int var1 = org.apache.commons.math.util.FastMath.round(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0f, 0.0f, (-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(10.167649573305612d, 10.0d, 19.999999999999996d);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    double var1 = org.apache.commons.math.util.MathUtils.sign(10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000000000001666E-6d);

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    float var2 = org.apache.commons.math.util.FastMath.max((-0.99999994f), (-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.99999994f));

  }

  public void test126() {}
//   public void test126() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.util.MathUtils.checkOrder(var0);
// 
//   }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(5.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 95.28575798851459d);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800.0d);

  }

  public void test129() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10L, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 11L);

  }

  public void test130() {}
//   public void test130() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }
// 
// 
//     double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
//     double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
//     double[] var8 = new double[] { 1.0d, 10.0d, 1.0d};
//     double var9 = org.apache.commons.math.util.MathUtils.safeNorm(var8);
//     double[][] var10 = new double[][] { var8};
//     org.apache.commons.math.util.MathUtils.sortInPlace(var3, var10);
//     org.apache.commons.math.util.MathUtils.OrderDirection var12 = null;
//     boolean var15 = org.apache.commons.math.util.MathUtils.checkOrder(var3, var12, true, true);
// 
//   }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5430806348152437d);

  }

  public void test133() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 14.142135623730951d, 0.0d, 9.999999999996666E-7d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb(10.0f, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5353012E31f);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 9.999999999998333E-7d, 5.25d, 9.999999999998333E-7d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test137() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(0.0f, 1, 10);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(2.718281828459045d, (-1.1752011936438014d), Double.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(20.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.689503868988906d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    double var2 = org.apache.commons.math.util.FastMath.atan2(4.077522742688568d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.5707963267948966d);

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, 2.5353012E31f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.solve(100, var4, 1.0d, 0.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter((-13.504023872876028d), 19.999999999999996d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-13.504023872876026d));

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.5430806348152437d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1555698629817919d);

  }

  public void test147() {}
//   public void test147() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }
// 
// 
//     java.lang.Class var0 = null;
//     java.lang.Enum var2 = java.lang.Enum.<java.lang.Enum>valueOf(var0, "");
// 
//   }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(9.999999999998333E-7d, 0.5d, 3.003173546455298d);

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 20.0d, 9.999995E-7d, 1.1555698629817919d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 10.0d, 1.5430806348152437d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, 0.0f, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10L, (-10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20L);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.0471975511965879d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.8496539082263332d);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter((-1.0f), 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.99999994f));

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1276259652063807d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(1.5707963267948966d, 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.120848029731079d);

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    long var2 = org.apache.commons.math.util.FastMath.max(10L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100L);

  }

  public void test159() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }


    int var2 = org.apache.commons.math.util.FastMath.max((-1), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-5d);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    java.lang.Throwable var0 = null;
    org.apache.commons.math.exception.MathInternalError var1 = new org.apache.commons.math.exception.MathInternalError(var0);

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-10L), 11L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100000000000L));

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(10, (-1683693131));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test165() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(13, 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 13);

  }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(2.5353012E31f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(9.999995E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.000001d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var2 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(0.0d, 10.0d);
    double var3 = var2.getAbsoluteAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var2.solve(0, var5, 1.0471975511965979d, 1.0E-14d, 3.689503868988906d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10.0d);

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, (-0.99999994f), 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(4.077522742688568d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.0d);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(1.1555698629817919d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.06279620701139618d);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000005000001665E-6d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6);

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(3.689503868988906d, (-13.504023872876028d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-3.689503868988906d));

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 5.25d, 0.0d, 0.5d, (-1));
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    double var1 = org.apache.commons.math.util.FastMath.cos(0.04611759718129058d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9989367720774853d);

  }

  public void test178() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 5.120848029731079d, 1.0E-5d, 4.9E-324d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-13.504023872876026d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 366178.68085772917d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    org.apache.commons.math.util.MathUtils.checkFinite(9.999999999998333E-7d);

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    int var2 = org.apache.commons.math.util.FastMath.max(100, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.99999994f), 10.0f, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    double var1 = org.apache.commons.math.util.FastMath.log(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    org.apache.commons.math.util.MathUtils.checkFinite(5.120848029731079d);

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7615941559557649d);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.7615941559557649d, 10.153650708549716d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1L));

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.solve((-1), var4, 9.999999999998333E-7d, 95.28575798851459d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(10.0f, 0, 101);
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.9E-324d);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000001f);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000001666E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.7295779513091865E-5d);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(0.0d, (-1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.0d));

  }

  public void test194() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(var0, (-3.689503868988906d), 1.0000000000001666E-6d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    org.apache.commons.math.util.MathUtils.checkFinite(1.7320508075688776d);

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    double var1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.5d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.POSITIVE_INFINITY);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    org.apache.commons.math.exception.TooManyEvaluationsException var1 = new org.apache.commons.math.exception.TooManyEvaluationsException((java.lang.Number)363.7393755555636d);

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator((-3.689503868988906d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test200() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0000005000001665E-6d, (-1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    float var2 = org.apache.commons.math.util.FastMath.min(100.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0f);

  }

  public void test202() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test203() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }


    int var2 = org.apache.commons.math.util.FastMath.min(13, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 13);

  }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb((-1.0f), 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-64.0f));

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(1.0000005000001665E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.1175823681357508E-22d);

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator((-100000000000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.6246841429488434d));

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    double var2 = org.apache.commons.math.util.MathUtils.round(3628800.0d, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3628800.0d);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.729577951308232E-13d);

  }

  public void test210() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }


    long var2 = org.apache.commons.math.util.FastMath.min(11L, (-10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-10L));

  }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.0d);

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-1.1752011936438014d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    double[] var7 = new double[] { 1.0d, 10.0d, 1.0d};
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double[] var10 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 10.0d);
    double[] var11 = new double[] { };
    double var12 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    boolean var13 = org.apache.commons.math.util.MathUtils.equals(var10, var11);
    org.apache.commons.math.exception.NonMonotonousSequenceException var17 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var18 = var17.getDirection();
    org.apache.commons.math.exception.TooManyEvaluationsException var20 = new org.apache.commons.math.exception.TooManyEvaluationsException((java.lang.Number)0);
    java.lang.Number var21 = var20.getMax();
    java.lang.Throwable[] var22 = var20.getSuppressed();
    org.apache.commons.math.exception.util.Localizable var23 = null;
    org.apache.commons.math.exception.util.Localizable var24 = null;
    org.apache.commons.math.exception.util.Localizable var26 = null;
    double[] var31 = new double[] { 1.0d, 10.0d, 1.0d};
    double var32 = org.apache.commons.math.util.MathUtils.safeNorm(var31);
    double[] var36 = new double[] { 1.0d, 10.0d, 1.0d};
    double var37 = org.apache.commons.math.util.MathUtils.safeNorm(var36);
    double[][] var38 = new double[][] { var36};
    org.apache.commons.math.util.MathUtils.sortInPlace(var31, var38);
    org.apache.commons.math.exception.MaxCountExceededException var40 = new org.apache.commons.math.exception.MaxCountExceededException(var26, (java.lang.Number)20.0d, (java.lang.Object[])var38);
    org.apache.commons.math.exception.NotFiniteNumberException var41 = new org.apache.commons.math.exception.NotFiniteNumberException(var24, (java.lang.Number)(short)10, (java.lang.Object[])var38);
    org.apache.commons.math.exception.MathIllegalStateException var42 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var20, var23, (java.lang.Object[])var38);
    org.apache.commons.math.util.MathUtils.sortInPlace(var11, var18, var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var44 = org.apache.commons.math.util.MathUtils.distanceInf(var2, var11);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 0+ "'", var21.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test214() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0f, 9.999995E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test215() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1683693131));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(5.729577951308232E-13d, 1.000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.729416448445517E-13d);

  }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    org.apache.commons.math.util.MathUtils.checkFinite(100.0d);

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var1 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(5.25d);
    double var2 = var1.getFunctionValueAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var1.solve(10, var4, 5.729577951308232E-13d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-15d);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    long var2 = org.apache.commons.math.util.MathUtils.gcd(10L, 11L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test221() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0f);

  }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    double var2 = org.apache.commons.math.util.FastMath.hypot(2.1175823681357508E-22d, 2.8496539082263332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.8496539082263332d);

  }

  public void test223() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    double var1 = org.apache.commons.math.util.FastMath.log(95.28575798851459d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.556880355510283d);

  }

  public void test225() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(1.0E-14d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(var0, 0.9989367720774853d, Double.NaN);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.536743E-7f);

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10);

  }

  public void test229() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }


    float var1 = org.apache.commons.math.util.FastMath.nextUp((-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.9999999f));

  }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.0d, 2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.718281828459045d);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.220446049250313E-16d);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    int var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(6, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 60);

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(1.0000000000001666E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    org.apache.commons.math.util.Incrementor var0 = new org.apache.commons.math.util.Incrementor();
    var0.resetCount();
    var0.setMaximalCount(0);
    int var4 = var0.getMaximalCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.incrementCount(1);
      fail("Expected exception of type org.apache.commons.math.exception.MaxCountExceededException");
    } catch (org.apache.commons.math.exception.MaxCountExceededException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(2.1175823681357508E-22d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.1175823681357508E-22d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.0000001f, (-1.0f), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(1.1276259652063807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.810205188138897d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, 10);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    double[] var0 = null;
    int var1 = org.apache.commons.math.util.MathUtils.hash(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    double var2 = org.apache.commons.math.util.MathUtils.log(0.7615941559557649d, 0.810205188138897d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7728082893375136d);

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test242() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(1.7320508075688776d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.03022998940390364d);

  }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.6757925232032458d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5162862015587667d);

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = org.apache.commons.math.util.MathUtils.pow((-1), (-1L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(0.04611759718129058d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0450857849269749d);

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.810205188138897d, 10.0d, Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(0.0d, Double.POSITIVE_INFINITY, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-100000000000L), 1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-99999999999L));

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var7);
    double[] var12 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var12);
    double[] var15 = org.apache.commons.math.util.MathUtils.normalizeArray(var12, (-13.504023872876028d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var16 = org.apache.commons.math.util.MathUtils.linearCombination(var7, var12);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    int var3 = var0.getEvaluations();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(6, var5, 5.7295779513091865E-5d, 1.5707963267948966d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-64.0f), 0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(5.25d, 1.0E-5d);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0f), 100.0f, 60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NonMonotonousSequenceException var5 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    org.apache.commons.math.exception.NotFiniteNumberException var7 = new org.apache.commons.math.exception.NotFiniteNumberException(var0, (java.lang.Number)6, (java.lang.Object[])var6);
    java.lang.Object[] var8 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var3, 100);
    org.apache.commons.math.exception.NonMonotonousSequenceException var12 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var13 = var12.getDirection();
    boolean var15 = var13.equals((java.lang.Object)100);
    int var16 = var13.ordinal();
    int var17 = var13.ordinal();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var3, var13, false);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(19.999999999999996d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4258259770489427E8d);

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.0000005000001665E-6d, 0.7728082893375136d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000005000001665E-6d);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    float var1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.apache.commons.math.util.Incrementor var0 = new org.apache.commons.math.util.Incrementor();
    var0.resetCount();
    var0.setMaximalCount(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.incrementCount();
      fail("Expected exception of type org.apache.commons.math.exception.MaxCountExceededException");
    } catch (org.apache.commons.math.exception.MaxCountExceededException e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(9.999999999998333E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.729577951307277E-5d);

  }

  public void test262() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }


    int var2 = org.apache.commons.math.util.MathUtils.subAndCheck(10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 11);

  }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(19.999999999999996d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.8516519440978855E8d);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(95.28575798851459d, 1.0471975511965879d, 366178.68085772917d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-64.0f), (-1.0f), 2.5353012E31f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    double[] var10 = new double[] { 1.0d, 10.0d, 1.0d};
    double var11 = org.apache.commons.math.util.MathUtils.safeNorm(var10);
    double[] var13 = org.apache.commons.math.util.MathUtils.normalizeArray(var10, 10.0d);
    double[] var14 = new double[] { };
    double var15 = org.apache.commons.math.util.MathUtils.safeNorm(var14);
    boolean var16 = org.apache.commons.math.util.MathUtils.equals(var13, var14);
    double[] var20 = new double[] { 1.0d, 10.0d, 1.0d};
    double var21 = org.apache.commons.math.util.MathUtils.safeNorm(var20);
    double[] var23 = org.apache.commons.math.util.MathUtils.normalizeArray(var20, 10.0d);
    double[] var24 = new double[] { };
    double var25 = org.apache.commons.math.util.MathUtils.safeNorm(var24);
    boolean var26 = org.apache.commons.math.util.MathUtils.equals(var23, var24);
    double[][] var27 = new double[][] { var24};
    org.apache.commons.math.util.MathUtils.sortInPlace(var14, var27);
    boolean var29 = org.apache.commons.math.util.MathUtils.equals(var3, var14);
    double[] var31 = org.apache.commons.math.util.MathUtils.copyOf(var3, 0);
    double[] var34 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var34);
    double[] var37 = org.apache.commons.math.util.MathUtils.normalizeArray(var34, (-13.504023872876028d));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var38 = org.apache.commons.math.util.MathUtils.distance(var3, var37);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    int var2 = org.apache.commons.math.util.FastMath.min((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    double var1 = org.apache.commons.math.util.FastMath.signum((-0.6246841429488434d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.791759469228055d);

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(233.62484402466288d, 0.0450857849269749d, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 5.729577951308232E-13d, 1.7320508075688776d, 100.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(var0, 0.0d, 0.7615941559557649d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(366178.68085772917d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.820766091346741E-11d);

  }

  public void test275() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(10.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)(-1683693131));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb(2.5353012E31f, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.5961484E34f);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(10L, (-10L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    long var1 = org.apache.commons.math.util.FastMath.round(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    double var1 = org.apache.commons.math.util.FastMath.log1p(1.791759469228055d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.026672031199051d);

  }

  public void test282() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb(0.0f, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    double[] var7 = new double[] { 1.0d, 10.0d, 1.0d};
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    double[] var10 = org.apache.commons.math.util.MathUtils.normalizeArray(var7, 10.0d);
    double[] var11 = new double[] { };
    double var12 = org.apache.commons.math.util.MathUtils.safeNorm(var11);
    boolean var13 = org.apache.commons.math.util.MathUtils.equals(var10, var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = org.apache.commons.math.util.MathUtils.linearCombination(var2, var11);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(1.000001d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.99168E7d);

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.1555698629817919d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test287() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }


    float var3 = org.apache.commons.math.util.MathUtils.round((-0.99999994f), 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-0.0f));

  }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(4.556880355510283d, Double.POSITIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4.556880355510284d);

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-15d);

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    long var2 = org.apache.commons.math.util.FastMath.max(20L, 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20L);

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 5.729577951308232E-13d, 4.077522742688568d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    double[] var2 = new double[] { 0.0d, 100.0d};
    org.apache.commons.math.util.MathUtils.checkFinite(var2);
    double[] var5 = org.apache.commons.math.util.MathUtils.normalizeArray(var2, (-13.504023872876028d));
    double[] var9 = new double[] { 1.0d, 10.0d, 1.0d};
    double var10 = org.apache.commons.math.util.MathUtils.safeNorm(var9);
    double[] var12 = org.apache.commons.math.util.MathUtils.normalizeArray(var9, 10.0d);
    double[] var13 = new double[] { };
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    boolean var15 = org.apache.commons.math.util.MathUtils.equals(var12, var13);
    double[] var19 = new double[] { 1.0d, 10.0d, 1.0d};
    double var20 = org.apache.commons.math.util.MathUtils.safeNorm(var19);
    double[] var22 = org.apache.commons.math.util.MathUtils.normalizeArray(var19, 10.0d);
    boolean var23 = org.apache.commons.math.util.MathUtils.equals(var12, var22);
    double var24 = org.apache.commons.math.util.MathUtils.distance1(var2, var22);
    double[] var28 = new double[] { 1.0d, 10.0d, 1.0d};
    double var29 = org.apache.commons.math.util.MathUtils.safeNorm(var28);
    double[] var31 = org.apache.commons.math.util.MathUtils.normalizeArray(var28, 10.0d);
    double[] var32 = new double[] { };
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    boolean var34 = org.apache.commons.math.util.MathUtils.equals(var31, var32);
    org.apache.commons.math.exception.NonMonotonousSequenceException var38 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var39 = var38.getDirection();
    org.apache.commons.math.exception.TooManyEvaluationsException var41 = new org.apache.commons.math.exception.TooManyEvaluationsException((java.lang.Number)0);
    java.lang.Number var42 = var41.getMax();
    java.lang.Throwable[] var43 = var41.getSuppressed();
    org.apache.commons.math.exception.util.Localizable var44 = null;
    org.apache.commons.math.exception.util.Localizable var45 = null;
    org.apache.commons.math.exception.util.Localizable var47 = null;
    double[] var52 = new double[] { 1.0d, 10.0d, 1.0d};
    double var53 = org.apache.commons.math.util.MathUtils.safeNorm(var52);
    double[] var57 = new double[] { 1.0d, 10.0d, 1.0d};
    double var58 = org.apache.commons.math.util.MathUtils.safeNorm(var57);
    double[][] var59 = new double[][] { var57};
    org.apache.commons.math.util.MathUtils.sortInPlace(var52, var59);
    org.apache.commons.math.exception.MaxCountExceededException var61 = new org.apache.commons.math.exception.MaxCountExceededException(var47, (java.lang.Number)20.0d, (java.lang.Object[])var59);
    org.apache.commons.math.exception.NotFiniteNumberException var62 = new org.apache.commons.math.exception.NotFiniteNumberException(var45, (java.lang.Number)(short)10, (java.lang.Object[])var59);
    org.apache.commons.math.exception.MathIllegalStateException var63 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var41, var44, (java.lang.Object[])var59);
    org.apache.commons.math.util.MathUtils.sortInPlace(var32, var39, var59);
    java.lang.Class var65 = var39.getDeclaringClass();
    double[][] var66 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.sortInPlace(var2, var39, var66);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 92.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + 0+ "'", var42.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(0.7615941559557649d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1102230246251565E-16d);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(10.167649573305612d, 1.000001d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.1676395733056122d);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    double var3 = var0.getMin();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.solve(60, var5, 5.729577951307277E-5d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(3.003173546455298d, 4.556880355510284d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.0031735464552987d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    long var1 = org.apache.commons.math.util.FastMath.round(5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5L);

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3628800.0d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.1102230246251565E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(5.729416448445517E-13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    double var2 = org.apache.commons.math.util.FastMath.nextAfter(0.06279620701139618d, 9.999999999996666E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.06279620701139617d);

  }

  public void test302() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }


    short var1 = org.apache.commons.math.util.MathUtils.sign((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    double var1 = org.apache.commons.math.util.FastMath.abs(0.06279620701139618d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.06279620701139618d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 5.0d, 363.7393755555636d, 0.5d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(var0, 5.820766091346741E-11d, 9.999995E-7d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    double var1 = org.apache.commons.math.util.FastMath.ulp(5.7295779513091865E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.776263578034403E-21d);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    double var1 = org.apache.commons.math.util.MathUtils.cosh(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter(0.0f, 1.7320508075688776d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.4E-45f);

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    org.apache.commons.math.util.Incrementor var0 = new org.apache.commons.math.util.Incrementor();
    var0.resetCount();
    var0.setMaximalCount(0);
    int var4 = var0.getMaximalCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.incrementCount();
      fail("Expected exception of type org.apache.commons.math.exception.MaxCountExceededException");
    } catch (org.apache.commons.math.exception.MaxCountExceededException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var7);
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var13.getDirection();
    org.apache.commons.math.exception.TooManyEvaluationsException var16 = new org.apache.commons.math.exception.TooManyEvaluationsException((java.lang.Number)0);
    java.lang.Number var17 = var16.getMax();
    java.lang.Throwable[] var18 = var16.getSuppressed();
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.util.Localizable var22 = null;
    double[] var27 = new double[] { 1.0d, 10.0d, 1.0d};
    double var28 = org.apache.commons.math.util.MathUtils.safeNorm(var27);
    double[] var32 = new double[] { 1.0d, 10.0d, 1.0d};
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[][] var34 = new double[][] { var32};
    org.apache.commons.math.util.MathUtils.sortInPlace(var27, var34);
    org.apache.commons.math.exception.MaxCountExceededException var36 = new org.apache.commons.math.exception.MaxCountExceededException(var22, (java.lang.Number)20.0d, (java.lang.Object[])var34);
    org.apache.commons.math.exception.NotFiniteNumberException var37 = new org.apache.commons.math.exception.NotFiniteNumberException(var20, (java.lang.Number)(short)10, (java.lang.Object[])var34);
    org.apache.commons.math.exception.MathIllegalStateException var38 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var16, var19, (java.lang.Object[])var34);
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var14, var34);
    java.lang.Class var40 = var14.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var42 = java.lang.Enum.<java.lang.Enum>valueOf(var40, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 0+ "'", var17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, Double.POSITIVE_INFINITY, 0.0d, 0.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-1683693131), (-1));
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.util.Localizable var1 = null;
    org.apache.commons.math.exception.TooManyEvaluationsException var3 = new org.apache.commons.math.exception.TooManyEvaluationsException((java.lang.Number)0);
    java.lang.Number var4 = var3.getMax();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.Object[] var6 = org.apache.commons.math.exception.util.ArgUtils.flatten((java.lang.Object[])var5);
    org.apache.commons.math.exception.NullArgumentException var7 = new org.apache.commons.math.exception.NullArgumentException(var1, (java.lang.Object[])var5);
    org.apache.commons.math.exception.MathArithmeticException var8 = new org.apache.commons.math.exception.MathArithmeticException(var0, (java.lang.Object[])var5);
    org.apache.commons.math.exception.util.ExceptionContext var9 = var8.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test314() {}
//   public void test314() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }
// 
// 
//     double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
//     double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
//     double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
//     double[] var7 = null;
//     double var8 = org.apache.commons.math.util.MathUtils.distanceInf(var6, var7);
// 
//   }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    double[] var2 = new double[] { 10.0d, 0.0d};
    double[] var6 = new double[] { 1.0d, 10.0d, 1.0d};
    double var7 = org.apache.commons.math.util.MathUtils.safeNorm(var6);
    double[] var9 = org.apache.commons.math.util.MathUtils.normalizeArray(var6, 10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = org.apache.commons.math.util.MathUtils.linearCombination(var2, var6);
      fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException");
    } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(2.8496539082263332d, 5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.8496539082263332d);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialLog(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 17.502307845873887d);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    double[] var2 = new double[] { 1.0d, 1.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.util.MathUtils.checkOrder(var2);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test320() {}
//   public void test320() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var0, 6);
// 
//   }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    float var2 = org.apache.commons.math.util.FastMath.scalb((-0.99999994f), 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8191.9995f));

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, (-3.689503868988906d), 92.5d, 0.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      float var3 = org.apache.commons.math.util.MathUtils.round(9.536743E-7f, 11, (-1683693131));
      fail("Expected exception of type org.apache.commons.math.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math.exception.MathIllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.5961484E34f, (-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    int var1 = org.apache.commons.math.util.FastMath.round((-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1));

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var7);
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var13.getDirection();
    org.apache.commons.math.exception.TooManyEvaluationsException var16 = new org.apache.commons.math.exception.TooManyEvaluationsException((java.lang.Number)0);
    java.lang.Number var17 = var16.getMax();
    java.lang.Throwable[] var18 = var16.getSuppressed();
    org.apache.commons.math.exception.util.Localizable var19 = null;
    org.apache.commons.math.exception.util.Localizable var20 = null;
    org.apache.commons.math.exception.util.Localizable var22 = null;
    double[] var27 = new double[] { 1.0d, 10.0d, 1.0d};
    double var28 = org.apache.commons.math.util.MathUtils.safeNorm(var27);
    double[] var32 = new double[] { 1.0d, 10.0d, 1.0d};
    double var33 = org.apache.commons.math.util.MathUtils.safeNorm(var32);
    double[][] var34 = new double[][] { var32};
    org.apache.commons.math.util.MathUtils.sortInPlace(var27, var34);
    org.apache.commons.math.exception.MaxCountExceededException var36 = new org.apache.commons.math.exception.MaxCountExceededException(var22, (java.lang.Number)20.0d, (java.lang.Object[])var34);
    org.apache.commons.math.exception.NotFiniteNumberException var37 = new org.apache.commons.math.exception.NotFiniteNumberException(var20, (java.lang.Number)(short)10, (java.lang.Object[])var34);
    org.apache.commons.math.exception.MathIllegalStateException var38 = new org.apache.commons.math.exception.MathIllegalStateException((java.lang.Throwable)var16, var19, (java.lang.Object[])var34);
    org.apache.commons.math.util.MathUtils.sortInPlace(var7, var14, var34);
    java.lang.Class var40 = var14.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var42 = java.lang.Enum.<java.lang.Enum>valueOf(var40, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 0+ "'", var17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test327() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }


    int var1 = org.apache.commons.math.util.FastMath.getExponent(9.999999999998333E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-20));

  }

  public void test328() {}
//   public void test328() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }
// 
// 
//     double var1 = org.apache.commons.math.util.MathUtils.sign(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test329() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, (-1.0f), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign(5L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    double var2 = org.apache.commons.math.util.FastMath.IEEEremainder(1.0E-15d, 3.0031735464552987d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-15d);

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(5.120848029731079d, 366178.68085772917d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.120848029731079d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NotPositiveException var2 = new org.apache.commons.math.exception.NotPositiveException(var0, (java.lang.Number)9.999999999996666E-7d);

  }

  public void test334() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(var0, 366178.68085772917d, (-3.689503868988906d));
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0d, 0.1676395733056122d, 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test336() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.04611759718129058d, 1.7320508075688776d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.8890842023750841d);

  }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyInterval(2.1175823681357508E-22d, 0.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(3.99168E7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.20650409444325754d);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    long var2 = org.apache.commons.math.util.FastMath.min(20L, (-99999999999L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-99999999999L));

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    double var1 = org.apache.commons.math.util.FastMath.atan((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.7853981633974483d));

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    double var2 = org.apache.commons.math.util.MathUtils.normalizeAngle(5.7295779513091865E-5d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.7295779513091865E-5d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(0.0450857849269749d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.868953928217433E-4d);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifySequence(1.0E-15d, 3.689503868988906d, 10.099504938362077d);

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(20L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    int var1 = org.apache.commons.math.util.MathUtils.hash(0.5162862015587667d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1677541321));

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(20.0d, 5.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 20.0d);

  }

  public void test347() {}
//   public void test347() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }
// 
// 
//     double[] var0 = null;
//     double[] var1 = null;
//     double var2 = org.apache.commons.math.util.MathUtils.linearCombination(var0, var1);
// 
//   }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((-20), (-1683693131));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    long var1 = org.apache.commons.math.util.MathUtils.sign((-100000000000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1L));

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(363.7393755555636d, 60, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var7);
    org.apache.commons.math.exception.NonMonotonousSequenceException var13 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var14 = var13.getDirection();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var17 = org.apache.commons.math.util.MathUtils.checkOrder(var6, var14, true, true);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(4.9E-324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.0000000000001666E-6d, 9.999999999996666E-7d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test354() {}
//   public void test354() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(5.729577951308232E-13d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    double var1 = org.apache.commons.math.util.FastMath.sin(14.142135623730951d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999876561221204d);

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, (-1.0d), 0.0d, 1.0471975511965879d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0f, 1.0f, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    float var2 = org.apache.commons.math.util.FastMath.max(0.0f, 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh((-0.6246841429488434d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.2015432366377217d);

  }

  public void test360() {}
//   public void test360() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }
// 
// 
//     java.math.BigInteger var0 = null;
//     java.math.BigInteger var1 = null;
//     java.math.BigInteger var2 = org.apache.commons.math.util.MathUtils.pow(var0, var1);
// 
//   }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(100.0f, (-0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100.0f));

  }

  public void test362() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }


    byte var1 = org.apache.commons.math.util.MathUtils.indicator((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test363() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(101, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp((-0.9999999f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.9604645E-8f);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-99999999999L), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.pow(1L, (-1L));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.util.MathUtils.factorialDouble((-20));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp((-100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.6293945E-6f);

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 364.0d);

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    long var1 = org.apache.commons.math.util.MathUtils.indicator(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1L);

  }

  public void test372() {}
//   public void test372() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }
// 
// 
//     float var2 = org.apache.commons.math.util.MathUtils.round((-0.0f), 60);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(1.0471975511965879d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9143566553928791d);

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 0.06279620701139618d, 364.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test375() {}
//   public void test375() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acosh(0.9999876561221204d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck((-10L), (-99999999999L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99999999989L);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test378() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals((-0.9999999f), 2.5961484E34f, 1.0000001f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    int var1 = org.apache.commons.math.util.MathUtils.sign(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    int var1 = org.apache.commons.math.util.FastMath.abs(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    double var3 = org.apache.commons.math.util.MathUtils.reduce(19.999999999999996d, 100.0d, 1.0000005000001665E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 19.999998999999498d);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)1);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    double var3 = var0.getMin();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    org.apache.commons.math.analysis.solvers.AllowedSolution var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve((-1683693131), var5, 2.1175823681357508E-22d, 1.0000005000001665E-6d, var8);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh(14.142135623730951d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 693140.8076470308d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    double var1 = org.apache.commons.math.util.FastMath.tanh(Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.0d));

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)10341.893056882767d, var2, true);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(19.999998999999498d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.34906583294556465d);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(0.9989367720774853d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9989367720774854d);

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    double var1 = org.apache.commons.math.util.FastMath.acos(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5707963267948966d);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 17.502307845873887d, 10.0d, 1.1276259652063807d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(5.120848029731079d, 6, 11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    double var2 = org.apache.commons.math.util.FastMath.max(0.7728082893375136d, 2.220446049250313E-16d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7728082893375136d);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    long var1 = org.apache.commons.math.util.FastMath.round(693140.8076470308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 693141L);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.util.MathUtils.round(1.0000000000001666E-6d, 0, (-1683693131));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 4.556880355510284d, (-1.1752011936438014d));
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    double var1 = org.apache.commons.math.util.FastMath.signum(19.999998999999498d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(10.099504938362077d, 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(0.0f, Float.NaN, Float.NaN);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    double var1 = org.apache.commons.math.util.FastMath.ceil(19.999999999999996d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 20.0d);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    float var1 = org.apache.commons.math.util.FastMath.abs(2.5353012E31f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.5353012E31f);

  }

  public void test401() {}
//   public void test401() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }
// 
// 
//     double var8 = org.apache.commons.math.util.MathUtils.linearCombination((-0.6246841429488434d), 1.026672031199051d, 5.729577951308232E-13d, (-13.504023872876028d), (-1.1752011936438014d), 4.8516519440978855E8d, Double.NEGATIVE_INFINITY, 7.868953928217433E-4d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == Double.NaN);
// 
//   }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(var0, 3.689503868988906d, (-1.0d));
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    double var1 = org.apache.commons.math.util.FastMath.toRadians(5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.08726646259971647d);

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    float var1 = org.apache.commons.math.util.FastMath.signum(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0f);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-1), 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6);

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck(11L, (-100000000000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1100000000000L));

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var8 = org.apache.commons.math.util.MathUtils.copyOf(var3, (-1677541321));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test408() {}
//   public void test408() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }
// 
// 
//     org.apache.commons.math.analysis.UnivariateRealFunction var1 = null;
//     org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver var2 = null;
//     org.apache.commons.math.analysis.solvers.AllowedSolution var6 = null;
//     double var7 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, var1, var2, 0.8890842023750841d, 0.0d, 5.0d, var6);
// 
//   }

  public void test409() {}
//   public void test409() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }
// 
// 
//     double var8 = org.apache.commons.math.util.MathUtils.linearCombination(Double.POSITIVE_INFINITY, 92.5d, 0.9989367720774854d, 100.0d, 0.0d, (-0.0d), 20.0d, 4.556880355510284d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == Double.NaN);
// 
//   }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(17.502307845873887d, 1.5707963267948966d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 89.67049349592865d);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    boolean var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isSequence(366178.68085772917d, 0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    long var2 = org.apache.commons.math.util.FastMath.max(1L, 5L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5L);

  }

  public void test413() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.verifyBracketing(var0, 19.999999999999996d, 1.0d);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test414() {}
//   public void test414() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }
// 
// 
//     double var2 = org.apache.commons.math.util.FastMath.nextAfter(Double.NaN, 0.34906583294556465d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    int[] var1 = new int[] { (-1)};
    int[] var2 = org.apache.commons.math.util.MathUtils.copyOf(var1);
    int[] var3 = org.apache.commons.math.util.MathUtils.copyOf(var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int[] var5 = org.apache.commons.math.util.MathUtils.copyOf(var3, (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    long var1 = org.apache.commons.math.util.FastMath.abs(693141L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 693141L);

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(2.718281828459045d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.7253825588523148d);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.isBracketing(var0, 0.9989367720774853d, (-1.1752011936438014d));
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(693140.8076470308d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 693140.8076470309d);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb(10.0d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10240.0d);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(1.7253825588523148d, 0.9143566553928791d, 5.729577951307277E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test422() {}
//   public void test422() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }
// 
// 
//     double var3 = org.apache.commons.math.util.MathUtils.reduce(233.62484402466288d, 0.0d, 1.791759469228055d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Double.NaN);
// 
//   }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(7.6293945E-6f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test424() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }


    double var2 = org.apache.commons.math.util.FastMath.copySign(1.791759469228055d, 1.0471975511965979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.791759469228055d);

  }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    double var1 = org.apache.commons.math.util.MathUtils.factorialDouble(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.332621544395286E157d);

  }

  public void test426() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 10);

  }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.6757925232032458d, 5.820766091346741E-11d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(14.142135623730951d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.418271175121957d);

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(5.25d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 300.8028424436822d);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
    org.apache.commons.math.analysis.solvers.AllowedSolution var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(6, var4, 89.67049349592865d, 1.5430806348152437d, var7);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    int var2 = org.apache.commons.math.util.MathUtils.gcd(6, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, 99999999989L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 99999999989L);

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm(6, 60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 60);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    double var1 = org.apache.commons.math.util.MathUtils.sinh((-0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var1 = org.apache.commons.math.util.MathUtils.factorial(101);
      fail("Expected exception of type org.apache.commons.math.exception.MathArithmeticException");
    } catch (org.apache.commons.math.exception.MathArithmeticException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(14.142135623730951d, 1.0471975511965979d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 16.025680805321816d);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    double var1 = org.apache.commons.math.util.FastMath.asinh(0.9999876561221204d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8813648585528526d);

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


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

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign((-100.0f), (-0.9999999f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-100.0f));

  }

  public void test440() {}
//   public void test440() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }
// 
// 
//     org.apache.commons.math.analysis.UnivariateRealFunction var1 = null;
//     org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var4 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(1.0E-6d, 9.999999999996666E-7d);
//     double var5 = var4.getRelativeAccuracy();
//     org.apache.commons.math.analysis.solvers.AllowedSolution var9 = null;
//     double var10 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide(1, var1, (org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver)var4, 0.0d, 0.7728082893375136d, 0.0d, var9);
// 
//   }

  public void test441() {}
//   public void test441() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }
// 
// 
//     double var1 = org.apache.commons.math.util.FastMath.acos(3628800.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    long var2 = org.apache.commons.math.util.FastMath.min((-1100000000000L), (-10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1100000000000L));

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt(0.9999876561221204d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999958853571098d);

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    double var1 = org.apache.commons.math.util.FastMath.toDegrees(0.9989367720774854d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 57.23486104046177d);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    long var2 = org.apache.commons.math.util.MathUtils.subAndCheck(99999999989L, (-1100000000000L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1199999999989L);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(0.7728082893375136d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1658400267911986d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    int var2 = org.apache.commons.math.util.MathUtils.lcm((-1683693131), (-1683693131));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1683693131);

  }

  public void test448() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }


    org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var0 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver();
    double var1 = var0.getAbsoluteAccuracy();
    double var2 = var0.getStartValue();
    double var3 = var0.getMax();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    org.apache.commons.math.analysis.solvers.AllowedSolution var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve((-1683693131), var5, 0.0d, 0.06279620701139617d, (-1.1752011936438014d), var9);
      fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException");
    } catch (org.apache.commons.math.exception.NullArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(19.999998999999498d, 0.6757925232032458d, 9.999999999998333E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(101, 1683693131);
      fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException");
    } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    org.apache.commons.math.exception.NotStrictlyPositiveException var1 = new org.apache.commons.math.exception.NotStrictlyPositiveException((java.lang.Number)7.868953928217433E-4d);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    double var2 = org.apache.commons.math.util.FastMath.min(14.142135623730951d, 363.7393755555636d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 14.142135623730951d);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    byte var1 = org.apache.commons.math.util.MathUtils.sign((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (byte)1);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(1.791759469228055d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.0d);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    double var2 = org.apache.commons.math.util.FastMath.pow(16.025680805321816d, 5.729416448445517E-13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0000000000015894d);

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.NumberIsTooLargeException var4 = new org.apache.commons.math.exception.NumberIsTooLargeException(var0, (java.lang.Number)11L, (java.lang.Number)(-0.99999994f), true);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    double var1 = org.apache.commons.math.util.FastMath.expm1(3.689503868988906d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 39.0249843945008d);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    double var1 = org.apache.commons.math.util.FastMath.exp(1.1555698629817919d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.1758326914467423d);

  }

  public void test459() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(0.0f, (-8191.9995f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(1.0E-5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test461() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }


    int var1 = org.apache.commons.math.util.MathUtils.indicator(60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    double var1 = org.apache.commons.math.util.FastMath.cbrt((-3.689503868988906d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1.5452164516951465d));

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      long var2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-20), (-1683693131));
      fail("Expected exception of type org.apache.commons.math.exception.NotPositiveException");
    } catch (org.apache.commons.math.exception.NotPositiveException e) {
      // Expected exception.
    }

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    double var1 = org.apache.commons.math.util.FastMath.atanh(9.999999999998333E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0000000000001666E-6d);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(10.167649573305612d, 0.06279620701139618d, (-20));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-99999999999L), 11L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1090513955541223425L);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    long var2 = org.apache.commons.math.util.MathUtils.pow((-1L), 20L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1L);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    double var2 = org.apache.commons.math.util.FastMath.scalb((-1.1752011936438014d), 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2406.812044582505d));

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    org.apache.commons.math.util.MathUtils.checkNotNull((java.lang.Object)(-100000000000L));

  }

  public void test470() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }


    boolean var2 = org.apache.commons.math.util.MathUtils.equals(9.536743E-7f, (-64.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    double var2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(101, 60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.386267435917276E28d);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    int var2 = org.apache.commons.math.util.MathUtils.pow(0, 693141L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test473() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }


    double var1 = org.apache.commons.math.util.FastMath.log10(300.8028424436822d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.4782819358151293d);

  }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    java.lang.Number var2 = null;
    org.apache.commons.math.exception.NumberIsTooSmallException var4 = new org.apache.commons.math.exception.NumberIsTooSmallException(var0, (java.lang.Number)0L, var2, true);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    long var2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-10L), 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0L);

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    double var1 = org.apache.commons.math.util.FastMath.floor(0.7728082893375136d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    org.apache.commons.math.util.MathUtils.checkFinite(1.0000000000001666E-6d);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    int var2 = org.apache.commons.math.util.MathUtils.addAndCheck(0, 1683693131);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1683693131);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    double var1 = org.apache.commons.math.util.FastMath.rint(3.0031735464552987d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.0d);

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    float var1 = org.apache.commons.math.util.FastMath.ulp((-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.9604645E-8f);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    double var1 = org.apache.commons.math.util.FastMath.tan(3628800.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.2736239505345667d));

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    double var1 = org.apache.commons.math.util.FastMath.asin(1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-15d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.0000001f, (-0.99999994f), (-0.99999994f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    org.apache.commons.math.exception.TooManyEvaluationsException var1 = new org.apache.commons.math.exception.TooManyEvaluationsException((java.lang.Number)0);
    java.lang.Number var2 = var1.getMax();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    java.lang.Number var4 = var1.getMax();
    org.apache.commons.math.exception.util.ExceptionContext var5 = var1.getContext();
    org.apache.commons.math.exception.util.Localizable var6 = null;
    java.lang.Number var7 = null;
    org.apache.commons.math.exception.NotPositiveException var8 = new org.apache.commons.math.exception.NotPositiveException(var6, var7);
    var1.addSuppressed((java.lang.Throwable)var8);
    java.lang.Number var10 = var8.getMin();
    java.lang.Number var11 = var8.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + 0+ "'", var2.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0+ "'", var10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0+ "'", var11.equals(0));

  }

  public void test485() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }


    double var1 = org.apache.commons.math.util.FastMath.nextUp(1.1276259652063807d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.127625965206381d);

  }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    double var1 = org.apache.commons.math.util.MathUtils.indicator(4.8516519440978855E8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    double var1 = org.apache.commons.math.util.FastMath.log(233.62484402466288d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.453716598144313d);

  }

  public void test488() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }


    double[] var3 = new double[] { 1.0d, 10.0d, 1.0d};
    double var4 = org.apache.commons.math.util.MathUtils.safeNorm(var3);
    double[] var6 = org.apache.commons.math.util.MathUtils.normalizeArray(var3, 10.0d);
    double[] var7 = new double[] { };
    double var8 = org.apache.commons.math.util.MathUtils.safeNorm(var7);
    boolean var9 = org.apache.commons.math.util.MathUtils.equals(var6, var7);
    double[] var13 = new double[] { 1.0d, 10.0d, 1.0d};
    double var14 = org.apache.commons.math.util.MathUtils.safeNorm(var13);
    double[] var16 = org.apache.commons.math.util.MathUtils.normalizeArray(var13, 10.0d);
    boolean var17 = org.apache.commons.math.util.MathUtils.equals(var6, var16);
    double[] var21 = new double[] { 1.0d, 10.0d, 1.0d};
    double var22 = org.apache.commons.math.util.MathUtils.safeNorm(var21);
    double[] var24 = org.apache.commons.math.util.MathUtils.normalizeArray(var21, 10.0d);
    boolean var25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(var16, var24);
    org.apache.commons.math.exception.NonMonotonousSequenceException var29 = new org.apache.commons.math.exception.NonMonotonousSequenceException((java.lang.Number)Double.NaN, (java.lang.Number)10.099504938362077d, 0);
    org.apache.commons.math.util.MathUtils.OrderDirection var30 = var29.getDirection();
    boolean var32 = var30.equals((java.lang.Object)100);
    int var33 = var30.ordinal();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var36 = org.apache.commons.math.util.MathUtils.checkOrder(var24, var30, true, true);
      fail("Expected exception of type org.apache.commons.math.exception.NonMonotonousSequenceException");
    } catch (org.apache.commons.math.exception.NonMonotonousSequenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10.099504938362077d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);

  }

  public void test489() {}
//   public void test489() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }
// 
// 
//     float var2 = org.apache.commons.math.util.FastMath.max(Float.NaN, 7.6293945E-6f);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Float.NaN);
// 
//   }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equals(19.999998999999498d, 10.099504938362077d, 19.999999999999996d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    long var2 = org.apache.commons.math.util.MathUtils.addAndCheck(10L, 100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 110L);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    float var2 = org.apache.commons.math.util.FastMath.copySign(0.0f, 9.536743E-7f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0f);

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    boolean var3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.0450857849269749d, 9.999999999998333E-7d, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    double var1 = org.apache.commons.math.util.FastMath.cosh(5.729577951308232E-13d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0d);

  }

  public void test495() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }


    double var6 = org.apache.commons.math.util.MathUtils.linearCombination(0.7615941559557649d, (-0.2736239505345667d), 3.689503868988906d, 5.25d, 693140.8076470309d, 2.8496539082263332d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1975230.5729674292d);

  }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    org.apache.commons.math.exception.util.Localizable var0 = null;
    org.apache.commons.math.exception.DimensionMismatchException var3 = new org.apache.commons.math.exception.DimensionMismatchException(var0, 0, 0);
    int var4 = var3.getDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test497() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }


    short var1 = org.apache.commons.math.util.MathUtils.indicator((short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (short)(-1));

  }

  public void test498() {}
//   public void test498() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }
// 
// 
//     org.apache.commons.math.analysis.UnivariateRealFunction var1 = null;
//     org.apache.commons.math.analysis.solvers.RegulaFalsiSolver var5 = new org.apache.commons.math.analysis.solvers.RegulaFalsiSolver(9.999999999996666E-7d, 10.099504938362077d, 4.077522742688568d);
//     org.apache.commons.math.analysis.solvers.AllowedSolution var9 = null;
//     double var10 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.forceSide((-1677541321), var1, (org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver)var5, (-0.2736239505345667d), (-0.6246841429488434d), 0.06279620701139617d, var9);
// 
//   }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    float var2 = org.apache.commons.math.util.FastMath.nextAfter((-8191.9995f), 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-8191.999f));

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    int var3 = org.apache.commons.math.util.MathUtils.compareTo(1.0471975511965879d, 9.999999999998333E-7d, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

}
