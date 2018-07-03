
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }
// 
// 
//     double[] var0 = new double[] { };
//     java.lang.Object[] var3 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
//     double[] var5 = null;
//     double[] var7 = new double[] { };
//     java.lang.Object[] var10 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
//     double[] var14 = new double[] { };
//     java.lang.Object[] var17 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(var14, "hi!", var17);
//     org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var11, 100.0d, "", var17);
//     org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, var5, "", var17);
// 
//   }

  public void test2() {}
//   public void test2() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }
// 
// 
//     double var1 = org.apache.commons.math.special.Gamma.logGamma(0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 359.1342053695754d);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.0d, 10.0d, (-1.0d), 10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test6() {}
//   public void test6() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.0d, 0.0d, 1.0d, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.6449340668481562d);

  }

  public void test8() {}
//   public void test8() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP((-1.0d), 0.0d, 359.1342053695754d, 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-1.0d), 359.1342053695754d, 10.0d, 10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-1.0d), 359.1342053695754d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 179.0671026847877d);

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 179.0671026847877d, 0.0d, 179.0671026847877d, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test12() {}
//   public void test12() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(Double.NaN, (-1.0d), 10.0d, (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.analysis.solvers.BrentSolver var1 = new org.apache.commons.math.analysis.solvers.BrentSolver(var0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test14() {}
//   public void test14() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(179.0671026847877d, (-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.NEGATIVE_INFINITY);

  }

  public void test16() {}
//   public void test16() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }
// 
// 
//     double[] var3 = new double[] { };
//     java.lang.Object[] var6 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, "hi!", var6);
//     org.apache.commons.math.ConvergenceException var8 = new org.apache.commons.math.ConvergenceException("", var6);
//     org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var6);
//     double[] var10 = null;
//     org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, var10);
// 
//   }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 100.0d, (-1.0d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var3 = var0.inverseCumulativeProbability(Double.NaN);
    double var5 = var0.cumulativeProbability(179.0671026847877d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.inverseCumulativeProbability(359.1342053695754d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(10.0d, 359.1342053695754d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3.009780236492411E-139d);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(1.6449340668481562d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.3224670334240781d);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(359.1342053695754d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1751.8796585025225d);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 1.0d, 3.009780236492411E-139d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.special.Erf.erf(1751.8796585025225d);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var2 = null;
//     double var5 = var0.solve(var2, 3.009780236492411E-139d, 359.1342053695754d);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.setFunctionValueAccuracy(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(10.0d, 0.0d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test30() {}
//   public void test30() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(100.0d, (-1.0d), 1.0d, (-1));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.setRelativeAccuracy(Double.NEGATIVE_INFINITY);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.6449340668481562d, 1.0E-15d, 3.009780236492411E-139d, 0);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setMean(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.cumulativeProbability(0.0d, Double.NEGATIVE_INFINITY);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(179.0671026847877d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 748.2156829382444d);

  }

  public void test35() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test35"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(179.0671026847877d, 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test36() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test36"); }


    java.lang.Object[] var2 = null;
    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var2);

  }

  public void test37() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test37"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(1.0E-15d, 1751.8796585025225d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 875.9398292512612d);

  }

  public void test38() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test38"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory var0 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactory.newInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test39() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test39"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(179.0671026847877d, 1.0d, 3.009780236492411E-139d, 0);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test40"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.0d, 0.0d, 1751.8796585025225d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test41"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.0E-15d, 179.0671026847877d, Double.NaN, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.7066537273912313E-78d);

  }

  public void test42() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test42"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setFunctionValueAccuracy(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.solve(1751.8796585025225d, 1.0E-15d, 1.7066537273912313E-78d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test43"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test44"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test45"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var2 = var0.getMean();
    double var3 = var0.getMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation(Double.NEGATIVE_INFINITY);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test46() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test46"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 748.2156829382444d, 1.7066537273912313E-78d, 0.0d, 10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test47() {}
//   public void test47() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test47"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.0d, 179.0671026847877d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test48() {}
//   public void test48() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test48"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     int var5 = var0.getIterationCount();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.solve(1.6449340668481562d, Double.NaN, 748.2156829382444d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0);
// 
//   }

  public void test49() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test49"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(1.6449340668481562d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.10607177757202746d));

  }

  public void test50() {}
//   public void test50() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test50"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1751.8796585025225d, (-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test51() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test51"); }


    double var1 = org.apache.commons.math.special.Erf.erf((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.8427007929497151d));

  }

  public void test52() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test52"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 100.0d, Double.NaN, 1.0E-6d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test53"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.3224670334240781d, 3.9894228032189005E-8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9954022576147243d);

  }

  public void test54() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test54"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.0E-14d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9999999999999958d);

  }

  public void test55() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test55"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test56"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-0.8427007929497151d), 100.0d, 179.0671026847877d, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test57() {}
//   public void test57() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test57"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.0d, 748.2156829382444d, 0.0d, 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test58() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test58"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test59() {}
//   public void test59() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test59"); }
// 
// 
//     double[] var0 = null;
//     org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(var0);
// 
//   }

  public void test60() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test60"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test61"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.setRelativeAccuracy(Double.NEGATIVE_INFINITY);
    org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve(var6, 1.7066537273912313E-78d, (-0.10607177757202746d), 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test62() {}
//   public void test62() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test62"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(Double.NEGATIVE_INFINITY, 0.3413447444769936d, 1.7066537273912313E-78d, 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test63() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test63"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(3.9894228032189005E-8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 17.037034161334805d);

  }

  public void test64() {}
//   public void test64() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test64"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-0.8427007929497151d), 1.0E-15d, 179.0671026847877d, 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test65() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test65"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.251752586176186d);

  }

  public void test66() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test66"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.9954022576147243d, 3.9894228032189005E-8d, 3.9894228032189005E-8d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test67"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var7 = var0.cumulativeProbability(0.0d, 1.0E-6d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.inverseCumulativeProbability((-0.8427007929497151d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3.9894228032189005E-8d);

  }

  public void test68() {}
//   public void test68() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test68"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     int var1 = var0.getIterationCount();
//     var0.resetRelativeAccuracy();
//     double var5 = var0.solve(1.0E-15d, 1.0E-6d);
// 
//   }

  public void test69() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test69"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    double var5 = var0.getFunctionValueAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(0.9954022576147243d, (-0.8427007929497151d), 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0E-15d);

  }

  public void test70() {}
//   public void test70() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test70"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(179.0671026847877d, Double.NEGATIVE_INFINITY, 17.037034161334805d, 10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test71() {}
//   public void test71() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test71"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     int var1 = var0.getIterationCount();
//     var0.resetRelativeAccuracy();
//     double var5 = var0.solve(2.251752586176186d, Double.NaN);
// 
//   }

  public void test72() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test72"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    double var4 = var0.getRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0E-14d);

  }

  public void test73() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test73"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.9954022576147243d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8407834471420012d);

  }

  public void test74() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test74"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(2.251752586176186d, 2.251752586176186d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4113845551055769d);

  }

  public void test75() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test75"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(179.0671026847877d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5.184965762689011d);

  }

  public void test76() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test76"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.4113845551055769d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 6.923077132682409d);

  }

  public void test77() {}
//   public void test77() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test77"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(Double.NEGATIVE_INFINITY, 875.9398292512612d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test78() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test78"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.4113845551055769d, 6.923077132682409d, 0.5164072412623864d, 10);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test79"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.184965762689011d, 0.4113845551055769d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.7981751588972936d);

  }

  public void test80() {}
//   public void test80() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test80"); }
// 
// 
//     double var1 = org.apache.commons.math.special.Gamma.trigamma(Double.NaN);
// 
//   }

  public void test81() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test81"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 17.037034161334805d, 2.7981751588972936d, 5.184965762689011d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test82"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.4113845551055769d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.554312234475219E-14d));

  }

  public void test83() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test83"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.9954022576147243d, 2.7981751588972936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.06039482086827752d);

  }

  public void test84() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test84"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.0d, 0.8407834471420012d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test85"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.0E-15d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test86() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test86"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    var0.resetMaximalIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(var6, 0.0d, (-1.554312234475219E-14d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test87"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var14 = new double[] { };
    java.lang.Object[] var17 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(var14, "hi!", var17);
    java.lang.String var19 = var18.toString();
    var12.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var21 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var19.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: "+ "'", var21.equals("org.apache.commons.math.FunctionEvaluationException: "));

  }

  public void test88() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test88"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 3.009780236492411E-139d, 3.009780236492411E-139d, (-0.8427007929497151d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test89"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    java.lang.Object[] var14 = null;
    org.apache.commons.math.ConvergenceException var15 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var12, "hi!", var14);
    java.lang.String var16 = var15.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test90() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test90"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.0d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test91"); }


    double[] var1 = new double[] { };
    java.lang.Object[] var4 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(var1, "hi!", var4);
    double[] var8 = new double[] { };
    java.lang.Object[] var11 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(var8, "hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 100.0d, "", var11);
    double[] var14 = var13.getArgument();
    double[] var16 = new double[] { };
    java.lang.Object[] var19 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var16, "hi!", var19);
    double[] var23 = new double[] { };
    java.lang.Object[] var26 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(var23, "hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 100.0d, "", var26);
    double[] var29 = var28.getArgument();
    double[] var31 = new double[] { };
    java.lang.Object[] var34 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, "hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var29, "org.apache.commons.math.FunctionEvaluationException: hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(var14, "", var34);
    org.apache.commons.math.MathException var38 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", var34);
    java.lang.String var39 = var38.getPattern();
    double[] var42 = new double[] { };
    java.lang.Object[] var45 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(var42, "hi!", var45);
    double[] var49 = new double[] { };
    java.lang.Object[] var52 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException(var49, "hi!", var52);
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var46, 100.0d, "", var52);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var52);
    org.apache.commons.math.ConvergenceException var56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var55);
    org.apache.commons.math.MathException var57 = new org.apache.commons.math.MathException((java.lang.Throwable)var55);
    java.lang.Object[] var59 = null;
    org.apache.commons.math.ConvergenceException var60 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var55, "org.apache.commons.math.FunctionEvaluationException: ", var59);
    var38.addSuppressed((java.lang.Throwable)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!"+ "'", var39.equals("org.apache.commons.math.ConvergenceException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test92() {}
//   public void test92() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test92"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     int var5 = var0.getIterationCount();
//     int var6 = var0.getIterationCount();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.getFunctionValue();
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0);
// 
//   }

  public void test93() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test93"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-0.5772156677920679d));

  }

  public void test94() {}
//   public void test94() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test94"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.resetRelativeAccuracy();
//     var0.setAbsoluteAccuracy(1.0E-15d);
//     org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
//     double var9 = var0.solve(var5, (-0.5772156677920679d), 179.0671026847877d, 1.0E-14d);
// 
//   }

  public void test95() {}
//   public void test95() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test95"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.setFunctionValueAccuracy(100.0d);
//     var0.resetAbsoluteAccuracy();
//     var0.setMaximalIterationCount((-1));
//     var0.setFunctionValueAccuracy(1.0d);
//     var0.setRelativeAccuracy(17.037034161334805d);
//     org.apache.commons.math.analysis.UnivariateRealFunction var10 = null;
//     double var13 = var0.solve(var10, 0.3413447444769936d, 179.0671026847877d);
// 
//   }

  public void test96() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test96"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(Double.NEGATIVE_INFINITY, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == Double.NEGATIVE_INFINITY);

  }

  public void test97() {}
//   public void test97() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test97"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     var0.setRelativeAccuracy(0.0d);
//     org.apache.commons.math.analysis.UnivariateRealFunction var7 = null;
//     double var10 = var0.solve(var7, 0.4113845551055769d, 6.923077132682409d);
// 
//   }

  public void test98() {}
//   public void test98() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test98"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP((-0.8427007929497151d), 2.7981751588972936d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test99() {}
//   public void test99() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test99"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setRelativeAccuracy(0.0d);
//     var0.resetRelativeAccuracy();
//     var0.setMaximalIterationCount(10);
//     org.apache.commons.math.analysis.UnivariateRealFunction var7 = null;
//     double var10 = var0.solve(var7, (-1.0d), (-1.554312234475219E-14d));
// 
//   }

  public void test100() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test100"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var3 = var0.inverseCumulativeProbability(Double.NaN);
    var0.setMean(Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.cumulativeProbability(359.1342053695754d, 0.3413447444769936d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);

  }

  public void test101() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test101"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.8407834471420012d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7655789667475025d);

  }

  public void test102() {}
//   public void test102() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test102"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-0.5772156677920679d), 2.7981751588972936d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test103() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test103"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.5164072412623864d, 1751.8796585025225d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 876.1980328718925d);

  }

  public void test104() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test104"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(875.9398292512612d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5056.344403845019d);

  }

  public void test105() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test105"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.3413447444769936d, 0.9954022576147243d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9008515105459516d);

  }

  public void test106() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test106"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(0.7655789667475025d, 0.0d, 17.037034161334805d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test107"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.0E-14d, 0.9999999999999958d, 875.9398292512612d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test108() {}
//   public void test108() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test108"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setRelativeAccuracy(0.0d);
//     var0.resetRelativeAccuracy();
//     var0.setMaximalIterationCount(10);
//     var0.setAbsoluteAccuracy(0.0d);
//     double var9 = var0.getFunctionValueAccuracy();
//     double var12 = var0.solve(0.8407834471420012d, 0.9954022576147243d);
// 
//   }

  public void test109() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test109"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(0.03989422804014307d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-25.5797219793344d));

  }

  public void test110() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test110"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.039752825870340104d, 748.2156829382444d, 876.1980328718925d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test111"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    var0.resetMaximalIterationCount();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(0.0d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test112"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, (-0.5772156677920679d), 1.0E-6d, 0.7655789667475025d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test113() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test113"); }


    double[] var4 = new double[] { };
    java.lang.Object[] var7 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(var4, "hi!", var7);
    double[] var11 = new double[] { };
    java.lang.Object[] var14 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(var11, "hi!", var14);
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var8, 100.0d, "", var14);
    double[] var17 = new double[] { };
    java.lang.Object[] var20 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, "hi!", var20);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, var17);
    double[] var23 = new double[] { };
    java.lang.Object[] var26 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(var23, "hi!", var26);
    double[] var30 = new double[] { };
    java.lang.Object[] var33 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var30, "hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 100.0d, "", var33);
    double[] var36 = new double[] { };
    java.lang.Object[] var39 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(var36, "hi!", var39);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var35, var36);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, var36);
    double[] var43 = new double[] { };
    java.lang.Object[] var46 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(var43, "hi!", var46);
    double[] var50 = new double[] { };
    java.lang.Object[] var53 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(var50, "hi!", var53);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var47, 100.0d, "", var53);
    double[] var56 = new double[] { };
    java.lang.Object[] var59 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(var56, "hi!", var59);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var55, var56);
    var42.addSuppressed((java.lang.Throwable)var61);
    double[] var63 = new double[] { };
    java.lang.Object[] var66 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(var63, "hi!", var66);
    double[] var70 = new double[] { };
    java.lang.Object[] var73 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException(var70, "hi!", var73);
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var67, 100.0d, "", var73);
    double[] var76 = var75.getArgument();
    double[] var78 = new double[] { };
    java.lang.Object[] var81 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var82 = new org.apache.commons.math.FunctionEvaluationException(var78, "hi!", var81);
    org.apache.commons.math.FunctionEvaluationException var83 = new org.apache.commons.math.FunctionEvaluationException(var76, "org.apache.commons.math.FunctionEvaluationException: hi!", var81);
    double[] var88 = new double[] { };
    java.lang.Object[] var91 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(var88, "hi!", var91);
    org.apache.commons.math.ConvergenceException var93 = new org.apache.commons.math.ConvergenceException("", var91);
    org.apache.commons.math.FunctionEvaluationException var94 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var91);
    org.apache.commons.math.FunctionEvaluationException var95 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var42, var76, "hi!", var91);
    org.apache.commons.math.FunctionEvaluationException var96 = new org.apache.commons.math.FunctionEvaluationException(179.0671026847877d, "org.apache.commons.math.FunctionEvaluationException: hi!", var91);
    org.apache.commons.math.MaxIterationsExceededException var97 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: hi!", var91);
    int var98 = var97.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == (-1));

  }

  public void test114() {}
//   public void test114() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test114"); }
// 
// 
//     double var1 = org.apache.commons.math.special.Gamma.logGamma((-0.10607177757202746d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test115() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test115"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 748.2156829382444d, 0.7655789667475025d, 100.0d, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test116"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.resetAbsoluteAccuracy();
    var0.resetMaximalIterationCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.solve(1751.8796585025225d, (-25.5797219793344d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test117() {}
//   public void test117() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test117"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.getMean();
//     double var3 = var0.inverseCumulativeProbability(Double.NaN);
//     var0.setMean(Double.NaN);
//     double var7 = var0.cumulativeProbability(1751.8796585025225d);
//     double var8 = var0.getMean();
//     double var9 = var0.getStandardDeviation();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var9 == 1.0d);
// 
//   }

  public void test118() {}
//   public void test118() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test118"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9954022576147243d, (-25.5797219793344d), 0.8407834471420012d, 10);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test119() {}
//   public void test119() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test119"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.getMean();
//     var0.setStandardDeviation(10.0d);
//     double var4 = var0.getStandardDeviation();
//     double var5 = var0.getStandardDeviation();
//     java.lang.Double var6 = null;
//     double var7 = var0.density(var6);
// 
//   }

  public void test120() {}
//   public void test120() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test120"); }
// 
// 
//     double var1 = org.apache.commons.math.special.Gamma.logGamma(Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test121() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test121"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var7 = var0.cumulativeProbability(0.0d, 1.0E-6d);
    double var9 = var0.density((java.lang.Double)Double.NEGATIVE_INFINITY);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation((-0.5772156677920679d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3.9894228032189005E-8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test122() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test122"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.5164072412623864d, 0.27970750510912734d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5327658733095417d);

  }

  public void test123() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test123"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(1.0E-14d, (-0.8427007929497151d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.42135039647485256d));

  }

  public void test124() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test124"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.3224670334240781d, 6.923077132682409d, 359.1342053695754d, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test125"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.039752825870340104d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 634.3506282518232d);

  }

  public void test126() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test126"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, (-1.554312234475219E-14d), 875.9398292512612d, 875.9398292512612d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test127"); }


    java.lang.Object[] var1 = null;
    org.apache.commons.math.ConvergenceException var2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: ", var1);

  }

  public void test128() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test128"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.0E-6d, 179.0671026847877d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-2.0872192862952943E-14d));

  }

  public void test129() {}
//   public void test129() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test129"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     var0.resetAbsoluteAccuracy();
//     var0.setAbsoluteAccuracy(1751.8796585025225d);
//     double var9 = var0.solve((-0.42135039647485256d), 0.9954022576147243d);
// 
//   }

  public void test130() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test130"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 5056.344403845019d, 1751.8796585025225d, 10);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test131"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.06039482086827752d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.03019741043413876d);

  }

  public void test132() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test132"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.5327658733095417d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.431500626822654d);

  }

  public void test133() {}
//   public void test133() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test133"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     var0.resetFunctionValueAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
//     double var9 = var0.solve(var6, 4.431500626822654d, 5.184965762689011d);
// 
//   }

  public void test134() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test134"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    int var2 = var0.getMaximalIterationCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 100);

  }

  public void test135() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test135"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.9008515105459516d, 0.0d, 2.251752586176186d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);

  }

  public void test136() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test136"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.0E-15d, 100.0d, 0.3413447444769936d, 1);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test137() {}
//   public void test137() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test137"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.solve(0.27970750510912734d, (-0.5772156677920679d));
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test138() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test138"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var6 = var0.cumulativeProbability(3.9894228032189005E-8d, 10.0d);
    double var8 = var0.cumulativeProbability(0.4113845551055769d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.3413447444769936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5164072412623864d);

  }

  public void test139() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test139"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.setFunctionValueAccuracy(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test140() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test140"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(5.184965762689011d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.4603695834883132d);

  }

  public void test141() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test141"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test142() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test142"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    var0.resetRelativeAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve(var6, 0.0d, 359.1342053695754d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test143"); }


    double var1 = org.apache.commons.math.special.Erf.erf(2.7981751588972936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999241720413309d);

  }

  public void test144() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test144"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.5164072412623864d, 0.06039482086827752d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.28840103106533194d);

  }

  public void test145() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test145"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.0E-6d, 876.1980328718925d, 876.1980328718925d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test146"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.resetRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(3.9894228032189005E-8d, 0.03989422804014307d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test147"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.4113845551055769d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.43928890683727895d);

  }

  public void test148() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test148"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(0.28840103106533194d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-3.6498222936674862d));

  }

  public void test149() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test149"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, Double.NaN, (-0.42135039647485256d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test150"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.7066537273912313E-78d, 0.03989422804014307d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test151"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.28840103106533194d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.31662401614731683d);

  }

  public void test152() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test152"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(359.1342053695754d, 5.184965762689011d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var2.cumulativeProbability(100.0d, 0.9999999999999958d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test153"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.setFunctionValueAccuracy(10.0d);
    var0.setFunctionValueAccuracy(1.0E-14d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test154() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test154"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.3224670334240781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3516368094118156d);

  }

  public void test155() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test155"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.06039482086827752d, 0.0d, 4.431500626822654d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test156() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test156"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E12d);

  }

  public void test157() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test157"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, Double.NEGATIVE_INFINITY, 875.9398292512612d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test158"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(5056.344403845019d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9779089640879516E-4d);

  }

  public void test159() {}
//   public void test159() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test159"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.getMean();
//     double var3 = var0.inverseCumulativeProbability(Double.NaN);
//     var0.setMean(Double.NaN);
//     double var7 = var0.cumulativeProbability(1751.8796585025225d);
//     double var8 = var0.getStandardDeviation();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       var0.setStandardDeviation(0.0d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1.0d);
// 
//   }

  public void test160() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test160"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(4.431500626822654d, 0.31662401614731683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 2.3740623214849856d);

  }

  public void test161() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test161"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.06039482086827752d, 0.3516368094118156d, 359.1342053695754d, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test162"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(17.037034161334805d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test163() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test163"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetAbsoluteAccuracy();
    double var5 = var0.getRelativeAccuracy();
    int var6 = var0.getMaximalIterationCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(0.0d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test164() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test164"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var1 = org.apache.commons.math.special.Erf.erf(875.9398292512612d);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test165() {}
//   public void test165() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test165"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-3.6498222936674862d), 0.003989332476163577d, 1.0E12d, 100);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test166() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test166"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setMean(0.0d);
    var0.setStandardDeviation(100.0d);
    var0.setMean(0.3224670334240781d);
    var0.setMean(1.0E-6d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.inverseCumulativeProbability((-0.42135039647485256d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test167() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test167"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(17.037034161334805d, 0.9999999999999958d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.999999999999999d);

  }

  public void test168() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test168"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setFunctionValueAccuracy(1.0d);
    var0.setRelativeAccuracy(17.037034161334805d);
    var0.resetAbsoluteAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var11 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var15 = var0.solve(var11, 0.9008515105459516d, (-1.0d), 876.1980328718925d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test169"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    double var5 = var0.getFunctionValueAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(var6, 1.7066537273912313E-78d, Double.NEGATIVE_INFINITY);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0E-15d);

  }

  public void test170() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test170"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.3416382086016081d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 9.654109524008826d);

  }

  public void test171() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test171"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    var0.setStandardDeviation(1.7066537273912313E-78d);
    double var6 = var0.getStandardDeviation();
    double var8 = var0.inverseCumulativeProbability(0.9008515105459516d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.cumulativeProbability(0.03019741043413876d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.7066537273912313E-78d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5.291271612012925E-7d);

  }

  public void test172() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test172"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.3516368094118156d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.38101511654603265d);

  }

  public void test173() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test173"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-0.10607177757202746d), 0.0d, Double.NaN);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test174"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(0.8407834471420012d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.11456726670570161d);

  }

  public void test175() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test175"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 2.7981751588972936d, 3.9893912839872314E-8d, 3.009780236492411E-139d, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test176"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var15 = new double[] { };
    java.lang.Object[] var18 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var13, "org.apache.commons.math.FunctionEvaluationException: hi!", var18);
    double[] var21 = new double[] { };
    java.lang.Object[] var24 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var21, "hi!", var24);
    double[] var28 = new double[] { };
    java.lang.Object[] var31 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(var28, "hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, 100.0d, "", var31);
    double[] var34 = var33.getArgument();
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, var34);
    double[] var38 = new double[] { };
    java.lang.Object[] var41 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(var38, "hi!", var41);
    double[] var45 = new double[] { };
    java.lang.Object[] var48 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(var45, "hi!", var48);
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var42, 100.0d, "", var48);
    double[] var51 = new double[] { };
    java.lang.Object[] var54 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(var51, "hi!", var54);
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var50, var51);
    double[] var57 = new double[] { };
    java.lang.Object[] var60 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(var57, "hi!", var60);
    double[] var64 = new double[] { };
    java.lang.Object[] var67 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException(var64, "hi!", var67);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var61, 100.0d, "", var67);
    double[] var70 = new double[] { };
    java.lang.Object[] var73 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException(var70, "hi!", var73);
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var69, var70);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var50, var70);
    double[] var81 = new double[] { };
    java.lang.Object[] var84 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var85 = new org.apache.commons.math.FunctionEvaluationException(var81, "hi!", var84);
    org.apache.commons.math.ConvergenceException var86 = new org.apache.commons.math.ConvergenceException("", var84);
    org.apache.commons.math.FunctionEvaluationException var87 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var84);
    org.apache.commons.math.ConvergenceException var88 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var50, "org.apache.commons.math.FunctionEvaluationException: hi!", var84);
    org.apache.commons.math.FunctionEvaluationException var89 = new org.apache.commons.math.FunctionEvaluationException(Double.NEGATIVE_INFINITY, "org.apache.commons.math.ConvergenceException: hi!", var84);
    var35.addSuppressed((java.lang.Throwable)var89);
    org.apache.commons.math.MathException var91 = new org.apache.commons.math.MathException((java.lang.Throwable)var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test177() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test177"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    int var4 = var0.getIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(var5, (-0.10607177757202746d), 0.039752825870340104d, 0.43928890683727895d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test178() {}
//   public void test178() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test178"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     var0.setRelativeAccuracy(0.0d);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var0.getResult();
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test179() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test179"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(0.3224670334240781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0200623701800295d);

  }

  public void test180() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test180"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.0d, 6.923077132682409d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test181"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var15 = new double[] { };
    java.lang.Object[] var18 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var13, "org.apache.commons.math.FunctionEvaluationException: hi!", var18);
    double[] var21 = new double[] { };
    java.lang.Object[] var24 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var21, "hi!", var24);
    double[] var28 = new double[] { };
    java.lang.Object[] var31 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(var28, "hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, 100.0d, "", var31);
    double[] var34 = var33.getArgument();
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, var34);
    java.lang.String var36 = var20.getPattern();
    java.lang.String var37 = var20.toString();
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 0.0d);
    java.lang.Object[] var42 = null;
    org.apache.commons.math.MathException var43 = new org.apache.commons.math.MathException("", var42);
    double[] var45 = new double[] { };
    java.lang.Object[] var48 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(var45, "hi!", var48);
    double[] var52 = new double[] { };
    java.lang.Object[] var55 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(var52, "hi!", var55);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var49, 100.0d, "", var55);
    double[] var58 = var57.getArgument();
    double[] var59 = new double[] { };
    double[] var63 = new double[] { };
    java.lang.Object[] var66 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(var63, "hi!", var66);
    double[] var70 = new double[] { };
    java.lang.Object[] var73 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException(var70, "hi!", var73);
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var67, 100.0d, "", var73);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var73);
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var57, var59, "org.apache.commons.math.FunctionEvaluationException: hi!", var73);
    org.apache.commons.math.ConvergenceException var78 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var43, "org.apache.commons.math.FunctionEvaluationException: ", var73);
    org.apache.commons.math.ConvergenceException var79 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", var73);
    org.apache.commons.math.MathException var80 = new org.apache.commons.math.MathException((java.lang.Throwable)var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var36.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var37.equals("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test182() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test182"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 179.0671026847877d, 0.9999241720413309d, 1.7066537273912313E-78d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test183"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    double var5 = var0.getFunctionValueAccuracy();
    int var6 = var0.getIterationCount();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve(1751.8796585025225d, 0.3224670334240781d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test184() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test184"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.11456726670570161d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test185"); }


    org.apache.commons.math.MaxIterationsExceededException var1 = new org.apache.commons.math.MaxIterationsExceededException(1);

  }

  public void test186() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test186"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.03019741043413876d, 0.9008515105459516d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.008067065059848222d);

  }

  public void test187() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test187"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var2 = var0.getStandardDeviation();
    double var3 = var0.getMean();
    double var5 = var0.cumulativeProbability(100.0d);
    var0.setMean(6.923077132682409d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);

  }

  public void test188() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test188"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    double var4 = var0.getFunctionValueAccuracy();
    var0.resetMaximalIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(var6, 5.291271612012925E-7d, (-0.42135039647485256d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100.0d);

  }

  public void test189() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test189"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var7 = var0.cumulativeProbability(0.0d, 1.0E-6d);
    double var9 = var0.density((java.lang.Double)Double.NEGATIVE_INFINITY);
    var0.setMean(0.039752825870340104d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var0.cumulativeProbability(1.0E-14d, Double.NEGATIVE_INFINITY);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3.9894228032189005E-8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test190() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test190"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.resetAbsoluteAccuracy();
    double var4 = var0.getAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.solve(0.8407834471420012d, 0.27970750510912734d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0E-6d);

  }

  public void test191() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test191"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test192() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test192"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    int var3 = var0.getIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(var4, 0.9954022576147243d, 0.0d, 1751.8796585025225d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test193() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test193"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(875.9398292512612d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test194() {}
//   public void test194() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test194"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.setFunctionValueAccuracy(100.0d);
//     var0.resetAbsoluteAccuracy();
//     var0.setMaximalIterationCount((-1));
//     double var6 = var0.getRelativeAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var7 = null;
//     double var10 = var0.solve(var7, 0.0d, 0.03989404614609713d);
// 
//   }

  public void test195() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test195"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, (-0.5772156677920679d), 0.3224670334240781d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test196() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test196"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 3.9894228032189005E-8d, (-0.8427007929497151d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test197"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var5 = var0.getStandardDeviation();
    double var6 = var0.getMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.cumulativeProbability(0.43928890683727895d, 5.291271612012925E-7d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test198() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test198"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test199"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.43928890683727895d, 876.1980328718925d, 5056.344403845019d, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test200() {}
//   public void test200() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test200"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.setFunctionValueAccuracy(100.0d);
//     var0.setRelativeAccuracy(0.3224670334240781d);
//     double var5 = var0.getFunctionValueAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
//     double var9 = var0.solve(var6, (-7.654341059276559d), 1751.8796585025225d);
// 
//   }

  public void test201() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test201"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-3.6498222936674862d), 0.03989404614609713d, 0.5111616472147071d, 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test202() {}
//   public void test202() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test202"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-0.8427007929497151d), 10.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test203() {}
//   public void test203() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test203"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP((-1.554312234475219E-14d), 634.3506282518232d, 1.0d, 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test204() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test204"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var14 = new double[] { };
    java.lang.Object[] var17 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(var14, "hi!", var17);
    java.lang.String var19 = var18.toString();
    var12.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var21 = var12.getPattern();
    org.apache.commons.math.ConvergenceException var22 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var12);
    java.lang.Throwable var24 = null;
    double[] var31 = new double[] { };
    java.lang.Object[] var34 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, "hi!", var34);
    double[] var38 = new double[] { };
    java.lang.Object[] var41 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(var38, "hi!", var41);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var35, 100.0d, "", var41);
    double[] var44 = new double[] { };
    java.lang.Object[] var47 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(var44, "hi!", var47);
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, var44);
    double[] var50 = new double[] { };
    java.lang.Object[] var53 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(var50, "hi!", var53);
    double[] var57 = new double[] { };
    java.lang.Object[] var60 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(var57, "hi!", var60);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var54, 100.0d, "", var60);
    double[] var63 = new double[] { };
    java.lang.Object[] var66 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(var63, "hi!", var66);
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var62, var63);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, var63);
    double[] var74 = new double[] { };
    java.lang.Object[] var77 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(var74, "hi!", var77);
    org.apache.commons.math.ConvergenceException var79 = new org.apache.commons.math.ConvergenceException("", var77);
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var77);
    org.apache.commons.math.ConvergenceException var81 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var43, "org.apache.commons.math.FunctionEvaluationException: hi!", var77);
    org.apache.commons.math.FunctionEvaluationException var82 = new org.apache.commons.math.FunctionEvaluationException(Double.NEGATIVE_INFINITY, "org.apache.commons.math.ConvergenceException: hi!", var77);
    org.apache.commons.math.FunctionEvaluationException var83 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var77);
    double[] var88 = new double[] { };
    java.lang.Object[] var91 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(var88, "hi!", var91);
    org.apache.commons.math.ConvergenceException var93 = new org.apache.commons.math.ConvergenceException("", var91);
    org.apache.commons.math.FunctionEvaluationException var94 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var91);
    java.lang.Object[] var95 = var94.getArguments();
    org.apache.commons.math.ConvergenceException var96 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var83, "org.apache.commons.math.ConvergenceException: hi!", var95);
    org.apache.commons.math.MathException var97 = new org.apache.commons.math.MathException("hi!", var95);
    org.apache.commons.math.MathException var98 = new org.apache.commons.math.MathException(var24, "org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var95);
    org.apache.commons.math.ConvergenceException var99 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var12, "hi!", var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var19.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test205() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test205"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(0.3413447444769936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-3.0528818887772244d));

  }

  public void test206() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test206"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.setMaximalIterationCount(10);
    var0.setAbsoluteAccuracy(0.0d);
    var0.setAbsoluteAccuracy(0.5164072412623864d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var0.solve(0.3224670334240781d, (-0.10607177757202746d), 0.008067065059848222d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test207"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 2.3740623214849856d, 0.0d, (-0.10607177757202746d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test208"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(4.431500626822654d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.2530140607319138d);

  }

  public void test209() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test209"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(9.654109524008826d, 876.1980328718925d, 0.5327658733095417d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test210() {}
//   public void test210() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test210"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.0d, Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test211() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test211"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 2.3740623214849856d, 0.0d, 0.003989332476163577d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test212"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(3.009780236492411E-139d, 359.1342053695754d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.9999999999999569d);

  }

  public void test213() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test213"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.27970750510912734d, 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.13985375255456417d);

  }

  public void test214() {}
//   public void test214() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test214"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     var0.resetFunctionValueAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
//     double var9 = var0.solve(var6, 5.291271612012925E-7d, 0.2530140607319138d);
// 
//   }

  public void test215() {}
//   public void test215() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test215"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.0d, (-1.0d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test216() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test216"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.38101511654603265d, 1.0E-15d, 0.4113845551055769d, 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test217() {}
//   public void test217() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test217"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.0d, 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test218() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test218"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(5.184965762689011d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test219"); }


    double[] var5 = new double[] { };
    java.lang.Object[] var8 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(var5, "hi!", var8);
    double[] var12 = new double[] { };
    java.lang.Object[] var15 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(var12, "hi!", var15);
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, 100.0d, "", var15);
    double[] var18 = new double[] { };
    java.lang.Object[] var21 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, "hi!", var21);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var17, var18);
    double[] var24 = new double[] { };
    java.lang.Object[] var27 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(var24, "hi!", var27);
    double[] var31 = new double[] { };
    java.lang.Object[] var34 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, "hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 100.0d, "", var34);
    double[] var37 = new double[] { };
    java.lang.Object[] var40 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(var37, "hi!", var40);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, var37);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var17, var37);
    double[] var44 = new double[] { };
    java.lang.Object[] var47 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(var44, "hi!", var47);
    double[] var51 = new double[] { };
    java.lang.Object[] var54 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(var51, "hi!", var54);
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var48, 100.0d, "", var54);
    double[] var57 = new double[] { };
    java.lang.Object[] var60 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(var57, "hi!", var60);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var56, var57);
    var43.addSuppressed((java.lang.Throwable)var62);
    double[] var64 = new double[] { };
    java.lang.Object[] var67 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException(var64, "hi!", var67);
    double[] var71 = new double[] { };
    java.lang.Object[] var74 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException(var71, "hi!", var74);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var68, 100.0d, "", var74);
    double[] var77 = var76.getArgument();
    double[] var79 = new double[] { };
    java.lang.Object[] var82 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var83 = new org.apache.commons.math.FunctionEvaluationException(var79, "hi!", var82);
    org.apache.commons.math.FunctionEvaluationException var84 = new org.apache.commons.math.FunctionEvaluationException(var77, "org.apache.commons.math.FunctionEvaluationException: hi!", var82);
    double[] var89 = new double[] { };
    java.lang.Object[] var92 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var93 = new org.apache.commons.math.FunctionEvaluationException(var89, "hi!", var92);
    org.apache.commons.math.ConvergenceException var94 = new org.apache.commons.math.ConvergenceException("", var92);
    org.apache.commons.math.FunctionEvaluationException var95 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var92);
    org.apache.commons.math.FunctionEvaluationException var96 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, var77, "hi!", var92);
    org.apache.commons.math.MaxIterationsExceededException var97 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: hi!", var92);
    org.apache.commons.math.MathException var98 = new org.apache.commons.math.MathException("hi!", var92);
    org.apache.commons.math.MaxIterationsExceededException var99 = new org.apache.commons.math.MaxIterationsExceededException(0, "org.apache.commons.math.FunctionEvaluationException: hi!", var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test220() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test220"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetAbsoluteAccuracy();
    double var5 = var0.getRelativeAccuracy();
    var0.setRelativeAccuracy(2.251752586176186d);
    org.apache.commons.math.analysis.UnivariateRealFunction var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.solve(var8, 0.11456726670570161d, 0.5111616472147071d, 2.604699452203707d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0E-14d);

  }

  public void test221() {}
//   public void test221() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test221"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { };
//     java.lang.Object[] var5 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
//     double[] var9 = new double[] { };
//     java.lang.Object[] var12 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, "hi!", var12);
//     org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 100.0d, "", var12);
//     double[] var15 = var14.getArgument();
//     double[] var17 = new double[] { };
//     java.lang.Object[] var20 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, "hi!", var20);
//     org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var15, "org.apache.commons.math.FunctionEvaluationException: hi!", var20);
//     double[] var23 = new double[] { };
//     java.lang.Object[] var26 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(var23, "hi!", var26);
//     double[] var30 = new double[] { };
//     java.lang.Object[] var33 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var30, "hi!", var33);
//     org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 100.0d, "", var33);
//     double[] var36 = var35.getArgument();
//     org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, var36);
//     java.lang.String var38 = var22.getPattern();
//     java.lang.String var39 = var22.toString();
//     org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, 0.0d);
//     double[] var46 = new double[] { };
//     java.lang.Object[] var49 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(var46, "hi!", var49);
//     org.apache.commons.math.ConvergenceException var51 = new org.apache.commons.math.ConvergenceException("", var49);
//     org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var49);
//     java.lang.Object[] var53 = var52.getArguments();
//     org.apache.commons.math.ConvergenceException var54 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var22, "hi!", var53);
//     org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(var0, "org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var53);
// 
//   }

  public void test222() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test222"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.9999999999999569d, 6.923077132682409d, 0.5111616472147071d, (-1));
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test223() {}
//   public void test223() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test223"); }
// 
// 
//     double[] var0 = null;
//     double[] var3 = new double[] { };
//     java.lang.Object[] var6 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, "hi!", var6);
//     org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: hi!", var6);
//     org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(var0, "org.apache.commons.math.FunctionEvaluationException: hi!", var6);
// 
//   }

  public void test224() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test224"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.resetRelativeAccuracy();
    int var6 = var0.getMaximalIterationCount();
    var0.setFunctionValueAccuracy(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.solve(0.43928890683727895d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test225() {}
//   public void test225() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test225"); }
// 
// 
//     double[] var3 = new double[] { };
//     java.lang.Object[] var6 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, "hi!", var6);
//     double[] var10 = new double[] { };
//     java.lang.Object[] var13 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(var10, "hi!", var13);
//     org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 100.0d, "", var13);
//     org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var13);
//     org.apache.commons.math.ConvergenceException var17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var13);
//     java.lang.Throwable[] var18 = var17.getSuppressed();
//     java.lang.Throwable var19 = null;
//     var17.addSuppressed(var19);
// 
//   }

  public void test226() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test226"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    int var4 = var0.getIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(var5, 1.0E-15d, 0.5111616472147071d, 179.0671026847877d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test227() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test227"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.9954022576147243d, 2.251752586176186d, 1.0200623701800295d, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test228"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.8407834471420012d, 1.0200623701800295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.29249274169844586d);

  }

  public void test229() {}
//   public void test229() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test229"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.0200623701800295d, Double.NEGATIVE_INFINITY);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test230() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test230"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(875.9398292512612d, 0.3224670334240781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test231() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test231"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.resetMaximalIterationCount();
    var0.setMaximalIterationCount(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(876.1980328718925d, (-0.42135039647485256d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test232() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test232"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.setRelativeAccuracy(Double.NEGATIVE_INFINITY);
    org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve(var6, (-3.0528818887772244d), 1.7066537273912313E-78d, 179.0671026847877d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test233"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.7066537273912313E-78d, 0.8407834471420012d, 5056.344403845019d, (-1));
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test234"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(1.0E-14d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test235"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setMean(0.0d);
    var0.setStandardDeviation(100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test236() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test236"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.0200623701800295d, 0.0d, 0.8407834471420012d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test237"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(0.9999999999999569d);

  }

  public void test238() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test238"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.5111616472147071d, 2.604699452203707d, 0.8407834471420012d, (-1));
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test239"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(9.654109524008826d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 12.029336393018417d);

  }

  public void test240() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test240"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(5056.344403845019d);
    java.lang.Object[] var2 = var1.getArguments();
    java.lang.String var3 = var1.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "evaluation failed for argument = {0}"+ "'", var3.equals("evaluation failed for argument = {0}"));

  }

  public void test241() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test241"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var6 = var0.cumulativeProbability(3.9894228032189005E-8d, 10.0d);
    double var7 = var0.getMean();
    double var9 = var0.density((java.lang.Double)0.3416382086016081d);
    double var12 = var0.cumulativeProbability((-7.654341059276559d), 0.13985375255456417d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.3413447444769936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.039870953225837655d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.2835726304306584d);

  }

  public void test242() {}
//   public void test242() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test242"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.0d, (-1.7558518886337975d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test243() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test243"); }


    double[] var1 = new double[] { };
    java.lang.Object[] var4 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(var1, "hi!", var4);
    double[] var8 = new double[] { };
    java.lang.Object[] var11 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(var8, "hi!", var11);
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 100.0d, "", var11);
    double[] var14 = var13.getArgument();
    double[] var16 = new double[] { };
    java.lang.Object[] var19 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var16, "hi!", var19);
    double[] var23 = new double[] { };
    java.lang.Object[] var26 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(var23, "hi!", var26);
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, 100.0d, "", var26);
    double[] var29 = var28.getArgument();
    double[] var31 = new double[] { };
    java.lang.Object[] var34 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, "hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var29, "org.apache.commons.math.FunctionEvaluationException: hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(var14, "", var34);
    org.apache.commons.math.MathException var38 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", var34);
    java.lang.String var39 = var38.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!"+ "'", var39.equals("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!"));

  }

  public void test244() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test244"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.cumulativeProbability(100.0d, 0.43928890683727895d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test245() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test245"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(2.7981751588972936d, 0.9008515105459516d, 17.037034161334805d, (-1));
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test246"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    double var5 = var0.getFunctionValueAccuracy();
    int var6 = var0.getIterationCount();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(3.4603695834883132d);
    org.apache.commons.math.analysis.UnivariateRealFunction var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(var10, 0.3516368094118156d, (-0.5772156677920679d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test247() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test247"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-0.8427007929497151d), 179.0671026847877d, (-1.0d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test248"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    double var3 = var0.getAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0E-6d);

  }

  public void test249() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test249"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.5164072412623864d, 0.13985375255456417d, 1.0200623701800295d, 1);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test250"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(5056.344403845019d, 9.654109524008826d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test251() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test251"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    var0.setMaximalIterationCount(0);
    int var5 = var0.getIterationCount();
    var0.resetMaximalIterationCount();
    var0.resetRelativeAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.solve(var8, 0.7655789667475025d, 1.0E-15d, 2.7981751588972936d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test252() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test252"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.8413263972267939d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 2.1286932927217093d);

  }

  public void test253() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test253"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 1.0200623701800295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5100311850900148d);

  }

  public void test254() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test254"); }


    java.lang.Object[] var1 = null;
    org.apache.commons.math.ConvergenceException var2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var1);
    org.apache.commons.math.MathException var3 = new org.apache.commons.math.MathException((java.lang.Throwable)var2);

  }

  public void test255() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test255"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 1.0E12d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.0E11d);

  }

  public void test256() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test256"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    var0.resetMaximalIterationCount();
    var0.setRelativeAccuracy(1.7066537273912313E-78d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test257"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.resetMaximalIterationCount();
    double var4 = var0.getFunctionValueAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0E-15d);

  }

  public void test258() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test258"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    var0.setMaximalIterationCount(0);
    int var5 = var0.getIterationCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test259() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test259"); }


    java.lang.Object[] var1 = null;
    org.apache.commons.math.MathException var2 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", var1);

  }

  public void test260() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test260"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 2.604699452203707d, 1751.8796585025225d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test261() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test261"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 1.0E-6d, 0.43928890683727895d, 0.3224670334240781d, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test262() {}
//   public void test262() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test262"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-1.0d), 1.0E-15d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test263() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test263"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    double var3 = var0.getAbsoluteAccuracy();
    double var4 = var0.getRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0E-14d);

  }

  public void test264() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test264"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = new double[] { };
    java.lang.Object[] var16 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(var13, "hi!", var16);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var13);
    double[] var19 = new double[] { };
    java.lang.Object[] var22 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
    double[] var26 = new double[] { };
    java.lang.Object[] var29 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, "hi!", var29);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 100.0d, "", var29);
    double[] var32 = new double[] { };
    java.lang.Object[] var35 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, "hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var31, var32);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var32);
    double[] var39 = new double[] { };
    java.lang.Object[] var42 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(var39, "hi!", var42);
    double[] var46 = new double[] { };
    java.lang.Object[] var49 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(var46, "hi!", var49);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, 100.0d, "", var49);
    double[] var52 = new double[] { };
    java.lang.Object[] var55 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(var52, "hi!", var55);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var51, var52);
    var38.addSuppressed((java.lang.Throwable)var57);
    double[] var61 = new double[] { };
    java.lang.Object[] var64 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException(var61, "hi!", var64);
    double[] var68 = new double[] { };
    java.lang.Object[] var71 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(var68, "hi!", var71);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var65, 100.0d, "", var71);
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, 359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var71);
    org.apache.commons.math.ConvergenceException var75 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var38);
    double[] var76 = var38.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test265() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test265"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.999999999999999d, 100.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test266"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.999999999999999d, 1.0200623701800295d, 1.0E-6d, 0);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test267"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setMean(0.0d);
    var0.setStandardDeviation(100.0d);
    var0.setMean(0.3224670334240781d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.cumulativeProbability(10.0d, 0.9999241720413309d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test268() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test268"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    double var1 = var0.getRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var2 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-14d);

  }

  public void test269() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test269"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.13985375255456417d, 5.291271612012925E-7d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test270"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = new double[] { };
    java.lang.Object[] var16 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(var13, "hi!", var16);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var13);
    double[] var19 = new double[] { };
    java.lang.Object[] var22 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
    double[] var26 = new double[] { };
    java.lang.Object[] var29 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, "hi!", var29);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 100.0d, "", var29);
    double[] var32 = new double[] { };
    java.lang.Object[] var35 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, "hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var31, var32);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var32);
    double[] var40 = new double[] { };
    java.lang.Object[] var43 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(var40, "hi!", var43);
    double[] var47 = new double[] { };
    java.lang.Object[] var50 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(var47, "hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var44, 100.0d, "", var50);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException(var32, "", var50);
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(var32);
    org.apache.commons.math.MathException var55 = new org.apache.commons.math.MathException((java.lang.Throwable)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.ConvergenceException var56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var55);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test271() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test271"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint((-1.0d), 0.38101511654603265d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-0.30949244172698365d));

  }

  public void test272() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test272"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var14 = new double[] { };
    java.lang.Object[] var17 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(var14, "hi!", var17);
    java.lang.String var19 = var18.toString();
    var12.addSuppressed((java.lang.Throwable)var18);
    double[] var21 = new double[] { };
    java.lang.Object[] var24 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var21, "hi!", var24);
    double[] var28 = new double[] { };
    java.lang.Object[] var31 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(var28, "hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, 100.0d, "", var31);
    double[] var34 = var33.getArgument();
    double[] var39 = new double[] { };
    java.lang.Object[] var42 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(var39, "hi!", var42);
    org.apache.commons.math.ConvergenceException var44 = new org.apache.commons.math.ConvergenceException("", var42);
    org.apache.commons.math.MaxIterationsExceededException var45 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: hi!", var42);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, var34, "org.apache.commons.math.FunctionEvaluationException: ", var42);
    double[] var47 = var46.getArgument();
    double[] var49 = new double[] { };
    java.lang.Object[] var52 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException(var49, "hi!", var52);
    org.apache.commons.math.MathException var54 = new org.apache.commons.math.MathException((java.lang.Throwable)var46, "hi!", var52);
    java.lang.String var55 = var46.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var19.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "+ "'", var55.equals("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "));

  }

  public void test273() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test273"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 12.029336393018417d, 6.923077132682409d, 0.0d, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test274"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var14 = new double[] { };
    double[] var18 = new double[] { };
    java.lang.Object[] var21 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, "hi!", var21);
    double[] var25 = new double[] { };
    java.lang.Object[] var28 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var25, "hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, 100.0d, "", var28);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var28);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var14, "org.apache.commons.math.FunctionEvaluationException: hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(var14);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var14);
    double[] var40 = new double[] { };
    java.lang.Object[] var43 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(var40, "hi!", var43);
    double[] var47 = new double[] { };
    java.lang.Object[] var50 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(var47, "hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var44, 100.0d, "", var50);
    double[] var53 = new double[] { };
    java.lang.Object[] var56 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(var53, "hi!", var56);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var52, var53);
    double[] var59 = new double[] { };
    java.lang.Object[] var62 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException(var59, "hi!", var62);
    double[] var66 = new double[] { };
    java.lang.Object[] var69 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var70 = new org.apache.commons.math.FunctionEvaluationException(var66, "hi!", var69);
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var63, 100.0d, "", var69);
    double[] var72 = new double[] { };
    java.lang.Object[] var75 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException(var72, "hi!", var75);
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, var72);
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var52, var72);
    double[] var83 = new double[] { };
    java.lang.Object[] var86 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var87 = new org.apache.commons.math.FunctionEvaluationException(var83, "hi!", var86);
    org.apache.commons.math.ConvergenceException var88 = new org.apache.commons.math.ConvergenceException("", var86);
    org.apache.commons.math.FunctionEvaluationException var89 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var86);
    org.apache.commons.math.ConvergenceException var90 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var52, "org.apache.commons.math.FunctionEvaluationException: hi!", var86);
    org.apache.commons.math.FunctionEvaluationException var91 = new org.apache.commons.math.FunctionEvaluationException(Double.NEGATIVE_INFINITY, "org.apache.commons.math.ConvergenceException: hi!", var86);
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var86);
    org.apache.commons.math.FunctionEvaluationException var93 = new org.apache.commons.math.FunctionEvaluationException(var14, "", var86);
    java.lang.Object[] var95 = null;
    org.apache.commons.math.FunctionEvaluationException var96 = new org.apache.commons.math.FunctionEvaluationException(var14, "", var95);
    java.lang.String var97 = var96.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + ""+ "'", var97.equals(""));

  }

  public void test275() {}
//   public void test275() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test275"); }
// 
// 
//     double var1 = org.apache.commons.math.special.Erf.erf(Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test276() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test276"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = new double[] { };
    java.lang.Object[] var16 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(var13, "hi!", var16);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var13);
    double[] var19 = new double[] { };
    java.lang.Object[] var22 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
    double[] var26 = new double[] { };
    java.lang.Object[] var29 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, "hi!", var29);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 100.0d, "", var29);
    double[] var32 = new double[] { };
    java.lang.Object[] var35 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, "hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var31, var32);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var32);
    double[] var39 = new double[] { };
    java.lang.Object[] var42 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(var39, "hi!", var42);
    double[] var46 = new double[] { };
    java.lang.Object[] var49 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(var46, "hi!", var49);
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, 100.0d, "", var49);
    double[] var52 = new double[] { };
    java.lang.Object[] var55 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(var52, "hi!", var55);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var51, var52);
    var38.addSuppressed((java.lang.Throwable)var57);
    double[] var61 = new double[] { };
    java.lang.Object[] var64 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException(var61, "hi!", var64);
    double[] var68 = new double[] { };
    java.lang.Object[] var71 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(var68, "hi!", var71);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var65, 100.0d, "", var71);
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, 359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var71);
    org.apache.commons.math.ConvergenceException var75 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var38);
    java.lang.String var76 = var75.toString();
    java.lang.String var77 = var75.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "+ "'", var76.equals("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "+ "'", var77.equals("org.apache.commons.math.ConvergenceException: org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "));

  }

  public void test277() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test277"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.999999999999999d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8427007929497143d);

  }

  public void test278() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test278"); }


    double[] var3 = new double[] { };
    java.lang.Object[] var6 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, "hi!", var6);
    org.apache.commons.math.MathException var8 = new org.apache.commons.math.MathException("", var6);
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException((-1.0d), "hi!", var6);
    double[] var10 = var9.getArgument();
    double[] var11 = var9.getArgument();
    double[] var12 = new double[] { };
    java.lang.Object[] var15 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(var12, "hi!", var15);
    double[] var19 = new double[] { };
    java.lang.Object[] var22 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, 100.0d, "", var22);
    double[] var25 = var24.getArgument();
    double[] var26 = new double[] { };
    java.lang.Object[] var29 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, "hi!", var29);
    java.lang.String var31 = var30.toString();
    var24.addSuppressed((java.lang.Throwable)var30);
    double[] var33 = new double[] { };
    java.lang.Object[] var36 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(var33, "hi!", var36);
    double[] var40 = new double[] { };
    java.lang.Object[] var43 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(var40, "hi!", var43);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var37, 100.0d, "", var43);
    double[] var46 = var45.getArgument();
    double[] var51 = new double[] { };
    java.lang.Object[] var54 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(var51, "hi!", var54);
    org.apache.commons.math.ConvergenceException var56 = new org.apache.commons.math.ConvergenceException("", var54);
    org.apache.commons.math.MaxIterationsExceededException var57 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: hi!", var54);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var30, var46, "org.apache.commons.math.FunctionEvaluationException: ", var54);
    double[] var60 = new double[] { };
    java.lang.Object[] var63 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var64 = new org.apache.commons.math.FunctionEvaluationException(var60, "hi!", var63);
    double[] var67 = new double[] { };
    java.lang.Object[] var70 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException(var67, "hi!", var70);
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var64, 100.0d, "", var70);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException(var46, "org.apache.commons.math.ConvergenceException: hi!", var70);
    double[] var74 = new double[] { };
    java.lang.Object[] var77 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(var74, "hi!", var77);
    double[] var81 = new double[] { };
    java.lang.Object[] var84 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var85 = new org.apache.commons.math.FunctionEvaluationException(var81, "hi!", var84);
    org.apache.commons.math.FunctionEvaluationException var86 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var78, 100.0d, "", var84);
    double[] var87 = var86.getArgument();
    double[] var88 = new double[] { };
    java.lang.Object[] var91 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(var88, "hi!", var91);
    java.lang.String var93 = var92.toString();
    var86.addSuppressed((java.lang.Throwable)var92);
    double[] var95 = var86.getArgument();
    java.lang.Object[] var97 = null;
    org.apache.commons.math.FunctionEvaluationException var98 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var73, var95, "hi!", var97);
    org.apache.commons.math.FunctionEvaluationException var99 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var31.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var93.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test279() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test279"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.3224670334240781d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 10.72469348821222d);

  }

  public void test280() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test280"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.3224670334240781d, 0.008067065059848222d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.23585160514005232d);

  }

  public void test281() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test281"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.setAbsoluteAccuracy(0.9999999999999958d);
    org.apache.commons.math.analysis.UnivariateRealFunction var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(var10, 5056.344403845019d, (-1.554312234475219E-14d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test282() {}
//   public void test282() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test282"); }
// 
// 
//     double[] var0 = null;
//     double[] var8 = new double[] { };
//     java.lang.Object[] var11 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(var8, "hi!", var11);
//     double[] var15 = new double[] { };
//     java.lang.Object[] var18 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
//     org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 100.0d, "", var18);
//     org.apache.commons.math.ConvergenceException var21 = new org.apache.commons.math.ConvergenceException("", var18);
//     org.apache.commons.math.MathException var22 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", var18);
//     org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException((-0.42135039647485256d), "org.apache.commons.math.ConvergenceException: hi!", var18);
//     org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException(0.11456726670570161d, "hi!", var18);
//     org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var0, "", var18);
// 
//   }

  public void test283() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test283"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(634.3506282518232d, 0.039870953225837655d, 0.8413447460685428d, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test284() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test284"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 4.431500626822654d, 0.23585160514005232d, 0.2835726304306584d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test285"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.setRelativeAccuracy(Double.NEGATIVE_INFINITY);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.solve(0.03019741043413876d, (-0.8427007929497151d), 0.31662401614731683d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test286"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);

  }

  public void test287() {}
//   public void test287() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test287"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.3224670334240781d);
//     double var4 = var2.inverseCumulativeProbability(3.9894228032189005E-8d);
//     var2.setMean(0.0d);
//     double var7 = var2.getStandardDeviation();
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 0.3224670334240781d);
// 
//   }

  public void test288() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test288"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 0.9999241720413309d, 5.291271612012925E-7d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test289"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var3 = var0.inverseCumulativeProbability(0.0d);
    var0.setMean(0.0d);
    double var7 = var0.inverseCumulativeProbability(0.03019741043413876d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == Double.NEGATIVE_INFINITY);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1.877900186471698d));

  }

  public void test290() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test290"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.03955684504009883d, 0.7655789667475025d, 0.03955684504009883d, (-1));
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test291"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.resetAbsoluteAccuracy();
    double var9 = var0.getRelativeAccuracy();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(9.654109524008826d, (-3.0528818887772244d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0E-14d);

  }

  public void test292() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test292"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var5 = var0.getStandardDeviation();
    double var7 = var0.density((java.lang.Double)1.0E-6d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var9 = var0.inverseCumulativeProbability((-3.6498222936674862d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.03989422804014307d);

  }

  public void test293() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test293"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(2.1286932927217093d, 0.9954022576147243d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7712071528568698d);

  }

  public void test294() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test294"); }


    double[] var2 = new double[] { };
    java.lang.Object[] var5 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
    double[] var9 = new double[] { };
    java.lang.Object[] var12 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, "hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 100.0d, "", var12);
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var12);
    org.apache.commons.math.ConvergenceException var16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var15);
    org.apache.commons.math.MathException var17 = new org.apache.commons.math.MathException((java.lang.Throwable)var15);
    java.lang.Object[] var19 = null;
    org.apache.commons.math.ConvergenceException var20 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var15, "org.apache.commons.math.FunctionEvaluationException: ", var19);
    org.apache.commons.math.ConvergenceException var21 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test295() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test295"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.8413263972267939d, 3.4603695834883132d, 2.251752586176186d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.9053230529447014d);

  }

  public void test296() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test296"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(6.923077132682409d, 0.2835726304306584d, 748.2156829382444d, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.99999997166433d);

  }

  public void test297() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test297"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.setMaximalIterationCount((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test298"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(10.0d, 0.3224670334240781d);
    double var4 = var2.cumulativeProbability(876.1980328718925d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var2.inverseCumulativeProbability(748.2156829382444d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test299() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test299"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-1.0d), 0.0d, 3.9894228032189005E-8d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test300"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation((-2.0872192862952943E-14d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test301() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test301"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.0d, 1.7066537273912313E-78d, 179.0671026847877d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test302() {}
//   public void test302() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test302"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.0d, 9.654109524008826d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test303() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test303"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.23585160514005232d, 0.27970750510912734d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7738964227830363d);

  }

  public void test304() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test304"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.99999997166433d, 0.27155381370221254d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.6357768926832712d);

  }

  public void test305() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test305"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-1.877900186471698d), 0.03955684504009883d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test306"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    double var3 = var0.getFunctionValueAccuracy();
    int var4 = var0.getMaximalIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var5 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(var5, 0.5111616472147071d, 0.3516368094118156d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test307() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test307"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.3413447444769936d, 100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = var2.inverseCumulativeProbability(39.528355311070705d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test308"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setFunctionValueAccuracy(1.0d);
    var0.resetAbsoluteAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(var9, 0.3516368094118156d, 0.7738964227830363d, 2.7981751588972936d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test309() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test309"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.039752825870340104d, (-3.0528818887772244d), (-1.877900186471698d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test310"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(179.0671026847877d, 0.2530140607319138d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 89.6600583727598d);

  }

  public void test311() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test311"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(2.3740623214849856d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.5219912357012065d);

  }

  public void test312() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test312"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var14 = new double[] { };
    java.lang.Object[] var17 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException(var14, "hi!", var17);
    java.lang.String var19 = var18.toString();
    var12.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var21 = var12.getPattern();
    java.lang.String var22 = var12.getPattern();
    double[] var24 = new double[] { };
    java.lang.Object[] var27 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(var24, "hi!", var27);
    double[] var31 = new double[] { };
    java.lang.Object[] var34 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, "hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 100.0d, "", var34);
    double[] var37 = new double[] { };
    java.lang.Object[] var40 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(var37, "hi!", var40);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, var37);
    double[] var43 = new double[] { };
    java.lang.Object[] var46 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(var43, "hi!", var46);
    double[] var50 = new double[] { };
    java.lang.Object[] var53 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(var50, "hi!", var53);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var47, 100.0d, "", var53);
    double[] var56 = new double[] { };
    java.lang.Object[] var59 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(var56, "hi!", var59);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var55, var56);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, var56);
    double[] var67 = new double[] { };
    java.lang.Object[] var70 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException(var67, "hi!", var70);
    double[] var74 = new double[] { };
    java.lang.Object[] var77 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(var74, "hi!", var77);
    org.apache.commons.math.FunctionEvaluationException var79 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, 100.0d, "", var77);
    org.apache.commons.math.MaxIterationsExceededException var80 = new org.apache.commons.math.MaxIterationsExceededException(100, "", var77);
    int var81 = var80.getMaxIterations();
    java.lang.Throwable[] var82 = var80.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var83 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var62, 2.7981751588972936d, "org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", (java.lang.Object[])var82);
    org.apache.commons.math.MathException var84 = new org.apache.commons.math.MathException((java.lang.Throwable)var12, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[])var82);
    org.apache.commons.math.MathException var85 = new org.apache.commons.math.MathException((java.lang.Throwable)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var19.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test313() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test313"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 0.28840103106533194d, Double.NaN, 1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test314() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test314"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.setRelativeAccuracy(Double.NEGATIVE_INFINITY);
    var0.setFunctionValueAccuracy(0.0d);
    org.apache.commons.math.analysis.UnivariateRealFunction var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.solve(var8, 1.0E-15d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test315"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.5100311850900148d, 0.039752825870340104d, 3.009780236492411E-139d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test316"); }


    double[] var6 = new double[] { };
    java.lang.Object[] var9 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(var6, "hi!", var9);
    double[] var13 = new double[] { };
    java.lang.Object[] var16 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(var13, "hi!", var16);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 100.0d, "", var16);
    double[] var19 = new double[] { };
    java.lang.Object[] var22 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, var19);
    double[] var25 = new double[] { };
    java.lang.Object[] var28 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var25, "hi!", var28);
    double[] var32 = new double[] { };
    java.lang.Object[] var35 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, "hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, 100.0d, "", var35);
    double[] var38 = new double[] { };
    java.lang.Object[] var41 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(var38, "hi!", var41);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var37, var38);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, var38);
    double[] var49 = new double[] { };
    java.lang.Object[] var52 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException(var49, "hi!", var52);
    org.apache.commons.math.ConvergenceException var54 = new org.apache.commons.math.ConvergenceException("", var52);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var52);
    org.apache.commons.math.ConvergenceException var56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var18, "org.apache.commons.math.FunctionEvaluationException: hi!", var52);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(Double.NEGATIVE_INFINITY, "org.apache.commons.math.ConvergenceException: hi!", var52);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var52);
    double[] var63 = new double[] { };
    java.lang.Object[] var66 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(var63, "hi!", var66);
    org.apache.commons.math.ConvergenceException var68 = new org.apache.commons.math.ConvergenceException("", var66);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var66);
    java.lang.Object[] var70 = var69.getArguments();
    org.apache.commons.math.ConvergenceException var71 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var58, "org.apache.commons.math.ConvergenceException: hi!", var70);
    org.apache.commons.math.MaxIterationsExceededException var72 = new org.apache.commons.math.MaxIterationsExceededException((-1), "hi!", var70);
    int var73 = var72.getMaxIterations();
    double[] var77 = new double[] { };
    java.lang.Object[] var80 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(var77, "hi!", var80);
    double[] var84 = new double[] { };
    java.lang.Object[] var87 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var88 = new org.apache.commons.math.FunctionEvaluationException(var84, "hi!", var87);
    org.apache.commons.math.FunctionEvaluationException var89 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var81, 100.0d, "", var87);
    org.apache.commons.math.MaxIterationsExceededException var90 = new org.apache.commons.math.MaxIterationsExceededException(100, "", var87);
    org.apache.commons.math.MathException var91 = new org.apache.commons.math.MathException((java.lang.Throwable)var72, "org.apache.commons.math.FunctionEvaluationException: hi!", var87);
    java.lang.String var92 = var91.getPattern();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var92.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));

  }

  public void test317() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test317"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var2 = var0.density((java.lang.Double)3.9893912839872314E-8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.3989422804014324d);

  }

  public void test318() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test318"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.0E-6d, 0.38101511654603265d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.999999264711086d);

  }

  public void test319() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test319"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(5056.344403845019d, 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test320() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test320"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var15 = new double[] { };
    java.lang.Object[] var18 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
    double[] var22 = new double[] { };
    java.lang.Object[] var25 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(var22, "hi!", var25);
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var19, 100.0d, "", var25);
    double[] var28 = var27.getArgument();
    double[] var30 = new double[] { };
    java.lang.Object[] var33 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var30, "hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var28, "org.apache.commons.math.FunctionEvaluationException: hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var13, "", var33);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(var13);
    double[] var38 = var37.getArgument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test321() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test321"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.23585160514005232d, 5.0E11d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test322"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.4113845551055769d, 0.23585160514005232d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test323"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 3.009780236492411E-139d, 0.3416382086016081d, 0.5164072412623864d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test324"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetAbsoluteAccuracy();
    var0.setAbsoluteAccuracy(1751.8796585025225d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve(0.7738964227830363d, 3.009780236492411E-139d, (-1.7558518886337975d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test325() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test325"); }


    double[] var2 = new double[] { };
    java.lang.Object[] var5 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
    double[] var9 = new double[] { };
    java.lang.Object[] var12 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, "hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 100.0d, "", var12);
    double[] var15 = var14.getArgument();
    double[] var16 = new double[] { };
    java.lang.Object[] var19 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException(var16, "hi!", var19);
    java.lang.String var21 = var20.toString();
    var14.addSuppressed((java.lang.Throwable)var20);
    java.lang.String var23 = var14.getPattern();
    java.lang.String var24 = var14.getPattern();
    double[] var26 = new double[] { };
    java.lang.Object[] var29 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, "hi!", var29);
    double[] var33 = new double[] { };
    java.lang.Object[] var36 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException(var33, "hi!", var36);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var30, 100.0d, "", var36);
    double[] var39 = new double[] { };
    java.lang.Object[] var42 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(var39, "hi!", var42);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, var39);
    double[] var45 = new double[] { };
    java.lang.Object[] var48 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(var45, "hi!", var48);
    double[] var52 = new double[] { };
    java.lang.Object[] var55 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException(var52, "hi!", var55);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var49, 100.0d, "", var55);
    double[] var58 = new double[] { };
    java.lang.Object[] var61 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException(var58, "hi!", var61);
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var57, var58);
    org.apache.commons.math.FunctionEvaluationException var64 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var38, var58);
    double[] var69 = new double[] { };
    java.lang.Object[] var72 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException(var69, "hi!", var72);
    double[] var76 = new double[] { };
    java.lang.Object[] var79 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(var76, "hi!", var79);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var73, 100.0d, "", var79);
    org.apache.commons.math.MaxIterationsExceededException var82 = new org.apache.commons.math.MaxIterationsExceededException(100, "", var79);
    int var83 = var82.getMaxIterations();
    java.lang.Throwable[] var84 = var82.getSuppressed();
    org.apache.commons.math.FunctionEvaluationException var85 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var64, 2.7981751588972936d, "org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", (java.lang.Object[])var84);
    org.apache.commons.math.MathException var86 = new org.apache.commons.math.MathException((java.lang.Throwable)var14, "org.apache.commons.math.FunctionEvaluationException: ", (java.lang.Object[])var84);
    org.apache.commons.math.MaxIterationsExceededException var87 = new org.apache.commons.math.MaxIterationsExceededException(0, "", (java.lang.Object[])var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertTrue("'" + var21 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: hi!"+ "'", var21.equals("org.apache.commons.math.FunctionEvaluationException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test326() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test326"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var6 = var0.cumulativeProbability(3.9894228032189005E-8d, 10.0d);
    double var8 = var0.cumulativeProbability(0.4113845551055769d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.cumulativeProbability(0.13985375255456417d, (-7.654341059276559d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.3413447444769936d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5164072412623864d);

  }

  public void test327() {}
//   public void test327() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test327"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.setFunctionValueAccuracy(100.0d);
//     var0.resetAbsoluteAccuracy();
//     var0.setMaximalIterationCount((-1));
//     var0.setMaximalIterationCount((-1));
//     var0.resetAbsoluteAccuracy();
//     double var9 = var0.getRelativeAccuracy();
//     var0.resetAbsoluteAccuracy();
//     var0.resetAbsoluteAccuracy();
//     var0.setRelativeAccuracy(Double.NaN);
//     var0.resetFunctionValueAccuracy();
//     double var17 = var0.solve(0.5100311850900148d, 2.3740623214849856d);
// 
//   }

  public void test328() {}
//   public void test328() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test328"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-1.554312234475219E-14d), 0.99999997166433d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test329() {}
//   public void test329() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test329"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP((-0.30949244172698365d), (-0.8427007929497151d), (-0.42135039647485256d), 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test330() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test330"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.resetAbsoluteAccuracy();
    double var9 = var0.getRelativeAccuracy();
    var0.resetAbsoluteAccuracy();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0E-14d);

  }

  public void test331() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test331"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.9999241720413309d, 0.0023482169025137445d, 0.03019741043413876d, 0);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test332"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(5.291271612012925E-7d, 0.31662401614731683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.15831227263723902d);

  }

  public void test333() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test333"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, (-7.654341059276559d), 0.3224670334240781d, 0.03989422804014307d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test334() {}
//   public void test334() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test334"); }
// 
// 
//     double[] var2 = new double[] { };
//     java.lang.Object[] var5 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
//     double[] var9 = new double[] { };
//     java.lang.Object[] var12 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, "hi!", var12);
//     org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 100.0d, "", var12);
//     org.apache.commons.math.MaxIterationsExceededException var15 = new org.apache.commons.math.MaxIterationsExceededException(100, "", var12);
//     double[] var16 = null;
//     double[] var18 = new double[] { };
//     java.lang.Object[] var21 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, "hi!", var21);
//     double[] var25 = new double[] { };
//     java.lang.Object[] var28 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var25, "hi!", var28);
//     org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, 100.0d, "", var28);
//     double[] var31 = var30.getArgument();
//     double[] var32 = new double[] { };
//     java.lang.Object[] var35 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, "hi!", var35);
//     double[] var39 = new double[] { };
//     java.lang.Object[] var42 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException(var39, "hi!", var42);
//     org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, 100.0d, "", var42);
//     double[] var45 = new double[] { };
//     java.lang.Object[] var48 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException(var45, "hi!", var48);
//     org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var44, var45);
//     double[] var55 = new double[] { };
//     java.lang.Object[] var58 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException(var55, "hi!", var58);
//     org.apache.commons.math.ConvergenceException var60 = new org.apache.commons.math.ConvergenceException("", var58);
//     org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var58);
//     java.lang.Object[] var62 = new java.lang.Object[] { var61};
//     org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var30, var45, "hi!", var62);
//     org.apache.commons.math.ConvergenceException var64 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var63);
//     double[] var69 = new double[] { };
//     java.lang.Object[] var72 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException(var69, "hi!", var72);
//     double[] var76 = new double[] { };
//     java.lang.Object[] var79 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(var76, "hi!", var79);
//     org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var73, 100.0d, "", var79);
//     org.apache.commons.math.FunctionEvaluationException var82 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var79);
//     org.apache.commons.math.ConvergenceException var83 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var79);
//     org.apache.commons.math.ConvergenceException var84 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var64, "org.apache.commons.math.FunctionEvaluationException: ", var79);
//     java.lang.Object[] var85 = var84.getArguments();
//     org.apache.commons.math.FunctionEvaluationException var86 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var15, var16, "hi!", var85);
// 
//   }

  public void test335() {}
//   public void test335() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test335"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     double var2 = var0.getRelativeAccuracy();
//     double var3 = var0.getFunctionValueAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var4 = null;
//     double var7 = var0.solve(var4, 1.7066537273912313E-78d, 0.8413263972267939d);
// 
//   }

  public void test336() {}
//   public void test336() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test336"); }
// 
// 
//     double[] var0 = null;
//     double[] var2 = new double[] { };
//     java.lang.Object[] var5 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
//     double[] var10 = new double[] { };
//     java.lang.Object[] var13 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(var10, "hi!", var13);
//     double[] var17 = new double[] { };
//     java.lang.Object[] var20 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, "hi!", var20);
//     org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, 100.0d, "", var20);
//     org.apache.commons.math.ConvergenceException var23 = new org.apache.commons.math.ConvergenceException("", var20);
//     org.apache.commons.math.MathException var24 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", var20);
//     org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var2, "", var20);
//     org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException(var0, "evaluation failed for argument = {0}", var20);
// 
//   }

  public void test337() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test337"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 3.009780236492411E-139d, (-7.654341059276559d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test338"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetRelativeAccuracy();
    var0.resetRelativeAccuracy();
    var0.setAbsoluteAccuracy(0.039752825870340104d);
    double var8 = var0.getRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.solve(0.27970750510912734d, 0.28840103106533194d, 0.3224670334240781d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0E-14d);

  }

  public void test339() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test339"); }


    double[] var8 = new double[] { };
    java.lang.Object[] var11 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(var8, "hi!", var11);
    double[] var15 = new double[] { };
    java.lang.Object[] var18 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, 100.0d, "", var18);
    double[] var21 = new double[] { };
    java.lang.Object[] var24 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var21, "hi!", var24);
    org.apache.commons.math.FunctionEvaluationException var26 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, var21);
    double[] var27 = new double[] { };
    java.lang.Object[] var30 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(var27, "hi!", var30);
    double[] var34 = new double[] { };
    java.lang.Object[] var37 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(var34, "hi!", var37);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var31, 100.0d, "", var37);
    double[] var40 = new double[] { };
    java.lang.Object[] var43 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(var40, "hi!", var43);
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var39, var40);
    org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var20, var40);
    double[] var51 = new double[] { };
    java.lang.Object[] var54 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(var51, "hi!", var54);
    org.apache.commons.math.ConvergenceException var56 = new org.apache.commons.math.ConvergenceException("", var54);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var54);
    org.apache.commons.math.ConvergenceException var58 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var20, "org.apache.commons.math.FunctionEvaluationException: hi!", var54);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException(Double.NEGATIVE_INFINITY, "org.apache.commons.math.ConvergenceException: hi!", var54);
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var54);
    double[] var65 = new double[] { };
    java.lang.Object[] var68 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(var65, "hi!", var68);
    org.apache.commons.math.ConvergenceException var70 = new org.apache.commons.math.ConvergenceException("", var68);
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var68);
    java.lang.Object[] var72 = var71.getArguments();
    org.apache.commons.math.ConvergenceException var73 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var60, "org.apache.commons.math.ConvergenceException: hi!", var72);
    org.apache.commons.math.MathException var74 = new org.apache.commons.math.MathException("hi!", var72);
    org.apache.commons.math.MaxIterationsExceededException var75 = new org.apache.commons.math.MaxIterationsExceededException(0, "", var72);
    org.apache.commons.math.MathException var76 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test340() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test340"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma(5.796313648399761E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == (-1725235.029074699d));

  }

  public void test341() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test341"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(1.0200623701800295d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.5979760585544307d);

  }

  public void test342() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test342"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.4113845551055769d, 0.0d, 0.5842855571044435d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test343() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test343"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, (-3.6498222936674862d), (-1.7558518886337975d), 100);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test344"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    int var3 = var0.getIterationCount();
    int var4 = var0.getMaximalIterationCount();
    var0.setFunctionValueAccuracy(0.0d);
    var0.setMaximalIterationCount(1);
    double var9 = var0.getFunctionValueAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var10 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var0.solve(var10, (-7.654341059276559d), 0.3516368094118156d, 5.184965762689011d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test345() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test345"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(2.604699452203707d);

  }

  public void test346() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test346"); }


    double var1 = org.apache.commons.math.special.Erf.erf(2.3740623214849856d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9992132966162511d);

  }

  public void test347() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test347"); }


    double[] var6 = new double[] { };
    java.lang.Object[] var9 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var10 = new org.apache.commons.math.FunctionEvaluationException(var6, "hi!", var9);
    double[] var13 = new double[] { };
    java.lang.Object[] var16 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(var13, "hi!", var16);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var10, 100.0d, "", var16);
    double[] var19 = new double[] { };
    java.lang.Object[] var22 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
    org.apache.commons.math.FunctionEvaluationException var24 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, var19);
    double[] var25 = new double[] { };
    java.lang.Object[] var28 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var25, "hi!", var28);
    double[] var32 = new double[] { };
    java.lang.Object[] var35 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, "hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var29, 100.0d, "", var35);
    double[] var38 = new double[] { };
    java.lang.Object[] var41 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException(var38, "hi!", var41);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var37, var38);
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var18, var38);
    double[] var49 = new double[] { };
    java.lang.Object[] var52 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException(var49, "hi!", var52);
    org.apache.commons.math.ConvergenceException var54 = new org.apache.commons.math.ConvergenceException("", var52);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var52);
    org.apache.commons.math.ConvergenceException var56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var18, "org.apache.commons.math.FunctionEvaluationException: hi!", var52);
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(Double.NEGATIVE_INFINITY, "org.apache.commons.math.ConvergenceException: hi!", var52);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var52);
    double[] var63 = new double[] { };
    java.lang.Object[] var66 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(var63, "hi!", var66);
    org.apache.commons.math.ConvergenceException var68 = new org.apache.commons.math.ConvergenceException("", var66);
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var66);
    java.lang.Object[] var70 = var69.getArguments();
    org.apache.commons.math.ConvergenceException var71 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var58, "org.apache.commons.math.ConvergenceException: hi!", var70);
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.FunctionEvaluationException: ", var70);
    double[] var74 = new double[] { };
    java.lang.Object[] var77 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException(var74, "hi!", var77);
    org.apache.commons.math.MathException var79 = new org.apache.commons.math.MathException((java.lang.Throwable)var72, "org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var77);
    java.lang.String var80 = var79.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134"+ "'", var80.equals("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134"));

  }

  public void test348() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test348"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.0E-15d, 1.7066537273912313E-78d, 0.15831227263723902d, 0);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test349() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test349"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 2.251752586176186d, 1751.8796585025225d, 2.251752586176186d, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test350"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.003989422791033237d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 62833.48887514557d);

  }

  public void test351() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test351"); }


    double[] var2 = new double[] { };
    java.lang.Object[] var5 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
    double[] var9 = new double[] { };
    java.lang.Object[] var12 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, "hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 100.0d, "", var12);
    double[] var15 = new double[] { };
    java.lang.Object[] var18 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, var15);
    double[] var21 = new double[] { };
    java.lang.Object[] var24 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var21, "hi!", var24);
    double[] var28 = new double[] { };
    java.lang.Object[] var31 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(var28, "hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, 100.0d, "", var31);
    double[] var34 = new double[] { };
    java.lang.Object[] var37 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(var34, "hi!", var37);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var33, var34);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, var34);
    double[] var41 = new double[] { };
    java.lang.Object[] var44 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(var41, "hi!", var44);
    double[] var48 = new double[] { };
    java.lang.Object[] var51 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException(var48, "hi!", var51);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var45, 100.0d, "", var51);
    double[] var54 = new double[] { };
    java.lang.Object[] var57 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(var54, "hi!", var57);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var53, var54);
    var40.addSuppressed((java.lang.Throwable)var59);
    double[] var61 = new double[] { };
    java.lang.Object[] var64 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException(var61, "hi!", var64);
    double[] var68 = new double[] { };
    java.lang.Object[] var71 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(var68, "hi!", var71);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var65, 100.0d, "", var71);
    double[] var74 = var73.getArgument();
    double[] var76 = new double[] { };
    java.lang.Object[] var79 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(var76, "hi!", var79);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(var74, "org.apache.commons.math.FunctionEvaluationException: hi!", var79);
    double[] var86 = new double[] { };
    java.lang.Object[] var89 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var90 = new org.apache.commons.math.FunctionEvaluationException(var86, "hi!", var89);
    org.apache.commons.math.ConvergenceException var91 = new org.apache.commons.math.ConvergenceException("", var89);
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var89);
    org.apache.commons.math.FunctionEvaluationException var93 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var40, var74, "hi!", var89);
    org.apache.commons.math.MaxIterationsExceededException var94 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: hi!", var89);
    int var95 = var94.getMaxIterations();
    org.apache.commons.math.MathException var96 = new org.apache.commons.math.MathException((java.lang.Throwable)var94);
    int var97 = var94.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == (-1));

  }

  public void test352() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test352"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.06039482086827752d, 2.604699452203707d, 0.7738964227830363d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test353"); }


    double[] var5 = new double[] { };
    java.lang.Object[] var8 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(var5, "hi!", var8);
    double[] var12 = new double[] { };
    java.lang.Object[] var15 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException(var12, "hi!", var15);
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var9, 100.0d, "", var15);
    double[] var18 = new double[] { };
    java.lang.Object[] var21 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, "hi!", var21);
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var17, var18);
    double[] var24 = new double[] { };
    java.lang.Object[] var27 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(var24, "hi!", var27);
    double[] var31 = new double[] { };
    java.lang.Object[] var34 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, "hi!", var34);
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 100.0d, "", var34);
    double[] var37 = new double[] { };
    java.lang.Object[] var40 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException(var37, "hi!", var40);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var36, var37);
    org.apache.commons.math.FunctionEvaluationException var43 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var17, var37);
    double[] var44 = new double[] { };
    java.lang.Object[] var47 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var48 = new org.apache.commons.math.FunctionEvaluationException(var44, "hi!", var47);
    double[] var51 = new double[] { };
    java.lang.Object[] var54 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException(var51, "hi!", var54);
    org.apache.commons.math.FunctionEvaluationException var56 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var48, 100.0d, "", var54);
    double[] var57 = new double[] { };
    java.lang.Object[] var60 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException(var57, "hi!", var60);
    org.apache.commons.math.FunctionEvaluationException var62 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var56, var57);
    var43.addSuppressed((java.lang.Throwable)var62);
    double[] var64 = new double[] { };
    java.lang.Object[] var67 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var68 = new org.apache.commons.math.FunctionEvaluationException(var64, "hi!", var67);
    double[] var71 = new double[] { };
    java.lang.Object[] var74 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException(var71, "hi!", var74);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var68, 100.0d, "", var74);
    double[] var77 = var76.getArgument();
    double[] var79 = new double[] { };
    java.lang.Object[] var82 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var83 = new org.apache.commons.math.FunctionEvaluationException(var79, "hi!", var82);
    org.apache.commons.math.FunctionEvaluationException var84 = new org.apache.commons.math.FunctionEvaluationException(var77, "org.apache.commons.math.FunctionEvaluationException: hi!", var82);
    double[] var89 = new double[] { };
    java.lang.Object[] var92 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var93 = new org.apache.commons.math.FunctionEvaluationException(var89, "hi!", var92);
    org.apache.commons.math.ConvergenceException var94 = new org.apache.commons.math.ConvergenceException("", var92);
    org.apache.commons.math.FunctionEvaluationException var95 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var92);
    org.apache.commons.math.FunctionEvaluationException var96 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var43, var77, "hi!", var92);
    org.apache.commons.math.FunctionEvaluationException var97 = new org.apache.commons.math.FunctionEvaluationException(179.0671026847877d, "org.apache.commons.math.FunctionEvaluationException: hi!", var92);
    org.apache.commons.math.MaxIterationsExceededException var98 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: hi!", var92);
    org.apache.commons.math.ConvergenceException var99 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test354() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test354"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    var0.setRelativeAccuracy(0.03989422804014307d);
    var0.setFunctionValueAccuracy(0.8407834471420012d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);

  }

  public void test355() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test355"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.9999999999999569d, 634.3506282518232d, 0.15831227263723902d, 1);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test356"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.setAbsoluteAccuracy(0.9999999999999958d);
    var0.setAbsoluteAccuracy(0.039752825870340104d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var0.solve(0.9999999999999569d, 0.8413263972267939d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test357"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == Double.POSITIVE_INFINITY);

  }

  public void test358() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test358"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.setFunctionValueAccuracy(10.0d);
    var0.setFunctionValueAccuracy(1.0E-14d);
    org.apache.commons.math.analysis.UnivariateRealFunction var7 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.solve(var7, 100.0d, 0.003989399562455864d, 0.9999999999999569d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test359() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test359"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma((-0.30949244172698365d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9838774180237602d);

  }

  public void test360() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test360"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, (-0.10607177757202746d), 0.039777486921634034d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test361"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.0d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test362() {}
//   public void test362() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test362"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var8 = var0.solve(3.9893912839872314E-8d, 0.5842855571044435d, 0.0d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test363() {}
//   public void test363() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test363"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(Double.NaN, 0.3224670334240781d);
//     double var4 = var2.cumulativeProbability(0.0023482169025137445d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test364() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test364"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.resetAbsoluteAccuracy();
    double var9 = var0.getRelativeAccuracy();
    var0.resetAbsoluteAccuracy();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var14 = var0.solve(1.5979760585544307d, (-2.8271499010371244d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0E-14d);

  }

  public void test365() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test365"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(179.0671026847877d, 0.0d, 0.5164072412623864d, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0d);

  }

  public void test366() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test366"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var5 = var0.getStandardDeviation();
    double var7 = var0.density((java.lang.Double)0.03019741043413876d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setStandardDeviation((-25.5797219793344d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.03989404614609713d);

  }

  public void test367() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test367"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.setAbsoluteAccuracy(0.9999999999999958d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test368"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.7712071528568698d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.3856035764284349d);

  }

  public void test369() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test369"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.03989404614609713d, 0.06039482086827752d, 89.6600583727598d, 0);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test370"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.0d, 0.0d, 0.4113845551055769d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test371"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    int var3 = var0.getIterationCount();
    int var4 = var0.getMaximalIterationCount();
    var0.setFunctionValueAccuracy(0.0d);
    var0.setMaximalIterationCount(1);
    double var9 = var0.getFunctionValueAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(0.43928890683727895d, 1.0E-6d, 0.999999264711086d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test372() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test372"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.3224670334240781d, 0.0d, 0.27970750510912734d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test373"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, (-1.877900186471698d), 0.9999241720413309d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test374"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = var12.getArgument();
    double[] var14 = new double[] { };
    double[] var18 = new double[] { };
    java.lang.Object[] var21 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException(var18, "hi!", var21);
    double[] var25 = new double[] { };
    java.lang.Object[] var28 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException(var25, "hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var22, 100.0d, "", var28);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var28);
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var14, "org.apache.commons.math.FunctionEvaluationException: hi!", var28);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException(var14);
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var14);
    double[] var40 = new double[] { };
    java.lang.Object[] var43 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var44 = new org.apache.commons.math.FunctionEvaluationException(var40, "hi!", var43);
    double[] var47 = new double[] { };
    java.lang.Object[] var50 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var51 = new org.apache.commons.math.FunctionEvaluationException(var47, "hi!", var50);
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var44, 100.0d, "", var50);
    double[] var53 = new double[] { };
    java.lang.Object[] var56 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var57 = new org.apache.commons.math.FunctionEvaluationException(var53, "hi!", var56);
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var52, var53);
    double[] var59 = new double[] { };
    java.lang.Object[] var62 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var63 = new org.apache.commons.math.FunctionEvaluationException(var59, "hi!", var62);
    double[] var66 = new double[] { };
    java.lang.Object[] var69 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var70 = new org.apache.commons.math.FunctionEvaluationException(var66, "hi!", var69);
    org.apache.commons.math.FunctionEvaluationException var71 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var63, 100.0d, "", var69);
    double[] var72 = new double[] { };
    java.lang.Object[] var75 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException(var72, "hi!", var75);
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var71, var72);
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var52, var72);
    double[] var83 = new double[] { };
    java.lang.Object[] var86 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var87 = new org.apache.commons.math.FunctionEvaluationException(var83, "hi!", var86);
    org.apache.commons.math.ConvergenceException var88 = new org.apache.commons.math.ConvergenceException("", var86);
    org.apache.commons.math.FunctionEvaluationException var89 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var86);
    org.apache.commons.math.ConvergenceException var90 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var52, "org.apache.commons.math.FunctionEvaluationException: hi!", var86);
    org.apache.commons.math.FunctionEvaluationException var91 = new org.apache.commons.math.FunctionEvaluationException(Double.NEGATIVE_INFINITY, "org.apache.commons.math.ConvergenceException: hi!", var86);
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var86);
    org.apache.commons.math.FunctionEvaluationException var93 = new org.apache.commons.math.FunctionEvaluationException(var14, "", var86);
    java.lang.Object[] var95 = null;
    org.apache.commons.math.FunctionEvaluationException var96 = new org.apache.commons.math.FunctionEvaluationException(var14, "", var95);
    double[] var97 = var96.getArgument();
    org.apache.commons.math.FunctionEvaluationException var98 = new org.apache.commons.math.FunctionEvaluationException(var97);
    org.apache.commons.math.FunctionEvaluationException var99 = new org.apache.commons.math.FunctionEvaluationException(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test375() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test375"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.2835726304306584d, 0.0d, 0.8413447460685428d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test376"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    double var5 = var0.getFunctionValueAccuracy();
    var0.resetRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);

  }

  public void test377() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test377"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.23585160514005232d, 5.184965762689011d, 17.037034161334805d, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.9909217750678144d);

  }

  public void test378() {}
//   public void test378() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test378"); }
// 
// 
//     java.lang.Throwable var0 = null;
//     double[] var1 = null;
//     double[] var3 = new double[] { };
//     java.lang.Object[] var6 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var7 = new org.apache.commons.math.FunctionEvaluationException(var3, "hi!", var6);
//     double[] var10 = new double[] { };
//     java.lang.Object[] var13 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException(var10, "hi!", var13);
//     org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var7, 100.0d, "", var13);
//     double[] var16 = var15.getArgument();
//     double[] var17 = new double[] { };
//     java.lang.Object[] var20 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, "hi!", var20);
//     java.lang.String var22 = var21.toString();
//     var15.addSuppressed((java.lang.Throwable)var21);
//     double[] var24 = new double[] { };
//     java.lang.Object[] var27 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(var24, "hi!", var27);
//     double[] var31 = new double[] { };
//     java.lang.Object[] var34 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException(var31, "hi!", var34);
//     org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var28, 100.0d, "", var34);
//     double[] var37 = var36.getArgument();
//     double[] var42 = new double[] { };
//     java.lang.Object[] var45 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var46 = new org.apache.commons.math.FunctionEvaluationException(var42, "hi!", var45);
//     org.apache.commons.math.ConvergenceException var47 = new org.apache.commons.math.ConvergenceException("", var45);
//     org.apache.commons.math.MaxIterationsExceededException var48 = new org.apache.commons.math.MaxIterationsExceededException((-1), "org.apache.commons.math.FunctionEvaluationException: hi!", var45);
//     org.apache.commons.math.FunctionEvaluationException var49 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, var37, "org.apache.commons.math.FunctionEvaluationException: ", var45);
//     org.apache.commons.math.FunctionEvaluationException var50 = new org.apache.commons.math.FunctionEvaluationException(var0, var1, "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var45);
// 
//   }

  public void test379() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test379"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.resetRelativeAccuracy();
    int var6 = var0.getMaximalIterationCount();
    var0.setFunctionValueAccuracy(0.0d);
    var0.resetMaximalIterationCount();
    var0.setAbsoluteAccuracy(5056.344403845019d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test380() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test380"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 179.0671026847877d, Double.NaN, (-2.0872192862952943E-14d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test381() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test381"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl var0 = new org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var1 = var0.newNewtonSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var2 = var0.newBrentSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var3 = var0.newDefaultSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var4 = var0.newSecantSolver();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test382() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test382"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl var0 = new org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var1 = var0.newDefaultSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var2 = var0.newSecantSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var3 = var0.newNewtonSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var4 = var0.newNewtonSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var5 = var0.newBrentSolver();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test383() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test383"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.resetAbsoluteAccuracy();
    double var9 = var0.getRelativeAccuracy();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0E-14d);

  }

  public void test384() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test384"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    var0.setMaximalIterationCount(1);
    var0.setFunctionValueAccuracy(1.0E-6d);
    var0.setRelativeAccuracy(2.7981751588972936d);
    double var11 = var0.getFunctionValueAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var15 = var0.solve(0.3224670334240781d, (-1.0d), 0.8407834471420012d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0E-6d);

  }

  public void test385() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test385"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setFunctionValueAccuracy(Double.NaN);
    var0.resetAbsoluteAccuracy();
    int var5 = var0.getMaximalIterationCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(0.9992132966162511d, 0.8407834471420012d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test386() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test386"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.5164072412623864d, 2.251752586176186d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.03555152191798849d);

  }

  public void test387() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test387"); }


    double[] var2 = new double[] { };
    java.lang.Object[] var5 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
    double[] var9 = new double[] { };
    java.lang.Object[] var12 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, "hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 100.0d, "", var12);
    double[] var15 = new double[] { };
    java.lang.Object[] var18 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, var15);
    double[] var21 = new double[] { };
    java.lang.Object[] var24 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var21, "hi!", var24);
    double[] var28 = new double[] { };
    java.lang.Object[] var31 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(var28, "hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, 100.0d, "", var31);
    double[] var34 = new double[] { };
    java.lang.Object[] var37 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(var34, "hi!", var37);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var33, var34);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, var34);
    double[] var41 = new double[] { };
    java.lang.Object[] var44 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(var41, "hi!", var44);
    double[] var48 = new double[] { };
    java.lang.Object[] var51 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException(var48, "hi!", var51);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var45, 100.0d, "", var51);
    double[] var54 = new double[] { };
    java.lang.Object[] var57 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(var54, "hi!", var57);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var53, var54);
    var40.addSuppressed((java.lang.Throwable)var59);
    double[] var61 = new double[] { };
    java.lang.Object[] var64 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var65 = new org.apache.commons.math.FunctionEvaluationException(var61, "hi!", var64);
    double[] var68 = new double[] { };
    java.lang.Object[] var71 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var72 = new org.apache.commons.math.FunctionEvaluationException(var68, "hi!", var71);
    org.apache.commons.math.FunctionEvaluationException var73 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var65, 100.0d, "", var71);
    double[] var74 = var73.getArgument();
    double[] var76 = new double[] { };
    java.lang.Object[] var79 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var80 = new org.apache.commons.math.FunctionEvaluationException(var76, "hi!", var79);
    org.apache.commons.math.FunctionEvaluationException var81 = new org.apache.commons.math.FunctionEvaluationException(var74, "org.apache.commons.math.FunctionEvaluationException: hi!", var79);
    double[] var86 = new double[] { };
    java.lang.Object[] var89 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var90 = new org.apache.commons.math.FunctionEvaluationException(var86, "hi!", var89);
    org.apache.commons.math.ConvergenceException var91 = new org.apache.commons.math.ConvergenceException("", var89);
    org.apache.commons.math.FunctionEvaluationException var92 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var89);
    org.apache.commons.math.FunctionEvaluationException var93 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var40, var74, "hi!", var89);
    org.apache.commons.math.FunctionEvaluationException var94 = new org.apache.commons.math.FunctionEvaluationException(179.0671026847877d, "org.apache.commons.math.FunctionEvaluationException: hi!", var89);
    org.apache.commons.math.MathException var95 = new org.apache.commons.math.MathException((java.lang.Throwable)var94);
    java.lang.Throwable[] var96 = var95.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test388() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test388"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.03955684504009883d, 634.3506282518232d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test389"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.13985375255456417d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.06992687627728209d);

  }

  public void test390() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test390"); }


    double[] var4 = new double[] { };
    java.lang.Object[] var7 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var8 = new org.apache.commons.math.FunctionEvaluationException(var4, "hi!", var7);
    double[] var11 = new double[] { };
    java.lang.Object[] var14 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var15 = new org.apache.commons.math.FunctionEvaluationException(var11, "hi!", var14);
    org.apache.commons.math.FunctionEvaluationException var16 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var8, 100.0d, "", var14);
    double[] var17 = new double[] { };
    java.lang.Object[] var20 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, "hi!", var20);
    org.apache.commons.math.FunctionEvaluationException var22 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, var17);
    double[] var23 = new double[] { };
    java.lang.Object[] var26 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var27 = new org.apache.commons.math.FunctionEvaluationException(var23, "hi!", var26);
    double[] var30 = new double[] { };
    java.lang.Object[] var33 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var34 = new org.apache.commons.math.FunctionEvaluationException(var30, "hi!", var33);
    org.apache.commons.math.FunctionEvaluationException var35 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var27, 100.0d, "", var33);
    double[] var36 = new double[] { };
    java.lang.Object[] var39 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException(var36, "hi!", var39);
    org.apache.commons.math.FunctionEvaluationException var41 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var35, var36);
    org.apache.commons.math.FunctionEvaluationException var42 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var16, var36);
    double[] var43 = new double[] { };
    java.lang.Object[] var46 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var47 = new org.apache.commons.math.FunctionEvaluationException(var43, "hi!", var46);
    double[] var50 = new double[] { };
    java.lang.Object[] var53 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var54 = new org.apache.commons.math.FunctionEvaluationException(var50, "hi!", var53);
    org.apache.commons.math.FunctionEvaluationException var55 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var47, 100.0d, "", var53);
    double[] var56 = new double[] { };
    java.lang.Object[] var59 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var60 = new org.apache.commons.math.FunctionEvaluationException(var56, "hi!", var59);
    org.apache.commons.math.FunctionEvaluationException var61 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var55, var56);
    var42.addSuppressed((java.lang.Throwable)var61);
    double[] var65 = new double[] { };
    java.lang.Object[] var68 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var69 = new org.apache.commons.math.FunctionEvaluationException(var65, "hi!", var68);
    double[] var72 = new double[] { };
    java.lang.Object[] var75 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException(var72, "hi!", var75);
    org.apache.commons.math.FunctionEvaluationException var77 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var69, 100.0d, "", var75);
    org.apache.commons.math.FunctionEvaluationException var78 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var42, 359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var75);
    org.apache.commons.math.MaxIterationsExceededException var79 = new org.apache.commons.math.MaxIterationsExceededException(100, "", var75);
    org.apache.commons.math.MaxIterationsExceededException var80 = new org.apache.commons.math.MaxIterationsExceededException(10, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", var75);
    int var81 = var80.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 10);

  }

  public void test391() {}
//   public void test391() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test391"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.setFunctionValueAccuracy(100.0d);
//     var0.resetAbsoluteAccuracy();
//     var0.setMaximalIterationCount((-1));
//     int var6 = var0.getIterationCount();
//     org.apache.commons.math.analysis.UnivariateRealFunction var7 = null;
//     double var11 = var0.solve(var7, 0.0d, 0.5219912357012065d, 1.0E-14d);
// 
//   }

  public void test392() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test392"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.5100311850900148d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.7707636884086435d);

  }

  public void test393() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test393"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.28840103106533194d, 0.27970750510912734d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.7254060377393206d);

  }

  public void test394() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test394"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(0.3989422804014324d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7993911204328135d);

  }

  public void test395() {}
//   public void test395() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test395"); }
// 
// 
//     double[] var1 = new double[] { };
//     java.lang.Object[] var4 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var5 = new org.apache.commons.math.FunctionEvaluationException(var1, "hi!", var4);
//     double[] var8 = new double[] { };
//     java.lang.Object[] var11 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException(var8, "hi!", var11);
//     org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var5, 100.0d, "", var11);
//     double[] var14 = var13.getArgument();
//     double[] var15 = new double[] { };
//     double[] var19 = new double[] { };
//     java.lang.Object[] var22 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
//     double[] var26 = new double[] { };
//     java.lang.Object[] var29 = new java.lang.Object[] { '4'};
//     org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, "hi!", var29);
//     org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 100.0d, "", var29);
//     org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var29);
//     org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var13, var15, "org.apache.commons.math.FunctionEvaluationException: hi!", var29);
//     org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("", var29);
//     java.lang.Throwable var35 = null;
//     var34.addSuppressed(var35);
// 
//   }

  public void test396() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test396"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.0E-6d, 2.3740623214849856d, 359.1342053695754d, 10);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test397"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var2 = var0.getMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.cumulativeProbability(0.9053230529447014d, 0.0023482169025137445d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.0d);

  }

  public void test398() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test398"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(0.983360177933631d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.009834360744607196d);

  }

  public void test399() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test399"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.039870953225837655d, 5.291271612012925E-7d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.4256320797620381d);

  }

  public void test400() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test400"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(0.03989404614609713d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.1997849266889236d);

  }

  public void test401() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test401"); }


    double[] var5 = new double[] { };
    java.lang.Object[] var8 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var9 = new org.apache.commons.math.FunctionEvaluationException(var5, "hi!", var8);
    org.apache.commons.math.ConvergenceException var10 = new org.apache.commons.math.ConvergenceException("", var8);
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(359.1342053695754d, "org.apache.commons.math.FunctionEvaluationException: hi!", var8);
    java.lang.Object[] var12 = var11.getArguments();
    double[] var17 = new double[] { };
    java.lang.Object[] var20 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var21 = new org.apache.commons.math.FunctionEvaluationException(var17, "hi!", var20);
    double[] var24 = new double[] { };
    java.lang.Object[] var27 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var28 = new org.apache.commons.math.FunctionEvaluationException(var24, "hi!", var27);
    org.apache.commons.math.FunctionEvaluationException var29 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var21, 100.0d, "", var27);
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(1.0d, "", var27);
    org.apache.commons.math.ConvergenceException var31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var27);
    org.apache.commons.math.ConvergenceException var32 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var11, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", var27);
    org.apache.commons.math.ConvergenceException var33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: hi!", var27);
    org.apache.commons.math.MathException var34 = new org.apache.commons.math.MathException("org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134", var27);
    java.lang.String var35 = var34.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134"+ "'", var35.equals("org.apache.commons.math.MathException: org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 359.134"));

  }

  public void test402() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test402"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    var0.setStandardDeviation(1.7066537273912313E-78d);
    var0.setMean(0.7655789667475025d);
    double var9 = var0.cumulativeProbability(0.0023482169025137445d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test403() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test403"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.3516368094118156d, (-3.0528818887772244d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1.3506225396827045d));

  }

  public void test404() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test404"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var3 = var0.inverseCumulativeProbability(Double.NaN);
    double var5 = var0.cumulativeProbability(179.0671026847877d);
    var0.setStandardDeviation(Double.NaN);
    double var8 = var0.getMean();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var11 = var0.cumulativeProbability(2.604699452203707d, 0.06841295385907521d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test405() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test405"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setMaximalIterationCount((-1));
    var0.resetAbsoluteAccuracy();
    var0.resetMaximalIterationCount();
    var0.resetMaximalIterationCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(0.15831227263723902d, 0.03955684504009883d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test406"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    double var1 = var0.getAbsoluteAccuracy();
    int var2 = var0.getIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var3 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.solve(var3, 0.99999997166433d, 0.03989422804014307d, (-25.5797219793344d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test407() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test407"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(0.13985375255456417d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9015164542957792d);

  }

  public void test408() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test408"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.03955684504009883d, 0.9909217750678144d, 0.8413447460685428d, 0);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test409"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, (-7.654341059276559d), 3.009780236492411E-139d, 5.0E11d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test410"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.010050166663333094d);

  }

  public void test411() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test411"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.3416382086016081d, (-1.877900186471698d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test412() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test412"); }


    java.lang.Throwable var0 = null;
    java.lang.Object[] var2 = null;
    org.apache.commons.math.ConvergenceException var3 = new org.apache.commons.math.ConvergenceException(var0, "org.apache.commons.math.FunctionEvaluationException: hi!", var2);

  }

  public void test413() {}
//   public void test413() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test413"); }
// 
// 
//     double var1 = org.apache.commons.math.special.Gamma.logGamma((-0.30949244172698365d));
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == Double.NaN);
// 
//   }

  public void test414() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test414"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.0d, 0.3856035764284349d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.19280178821421745d);

  }

  public void test415() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test415"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.4113845551055769d, 0.2530140607319138d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test416"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.5014182975349006d, (-0.10607177757202746d), 1.9779089640879516E-4d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test417"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    var0.setMaximalIterationCount(1);
    var0.setFunctionValueAccuracy(1.0E-6d);
    var0.setRelativeAccuracy(2.7981751588972936d);
    double var11 = var0.getFunctionValueAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.getFunctionValue();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0E-6d);

  }

  public void test418() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test418"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var6 = var0.inverseCumulativeProbability(10.72469348821222d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);

  }

  public void test419() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test419"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    double var6 = var0.getRelativeAccuracy();
    var0.setFunctionValueAccuracy((-0.42135039647485256d));
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(0.5000000000000004d, 3.009780236492411E-139d, (-1.3506225396827045d));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0E-14d);

  }

  public void test420() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test420"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.28840103106533194d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 13.17113873543612d);

  }

  public void test421() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test421"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(875.9398292512612d);

  }

  public void test422() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test422"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var3 = var0.inverseCumulativeProbability(Double.NaN);
    double var4 = var0.getMean();
    double var6 = var0.cumulativeProbability(0.999999999999999d);
    double var7 = var0.getMean();
    double var10 = var0.cumulativeProbability(0.0d, 12.029336393018417d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.cumulativeProbability(5.291271612012925E-7d, 1.0E-14d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.8413447460685428d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.5000000000000004d);

  }

  public void test423() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test423"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl var0 = new org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var1 = var0.newNewtonSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var2 = var0.newBisectionSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var3 = var0.newBrentSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var4 = var0.newBisectionSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var5 = var0.newBrentSolver();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test424() {}
//   public void test424() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test424"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     double var2 = var0.getRelativeAccuracy();
//     var0.setMaximalIterationCount(0);
//     var0.resetFunctionValueAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var6 = null;
//     double var9 = var0.solve(var6, 0.0d, 0.7655789667475025d);
// 
//   }

  public void test425() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test425"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(748.2156829382444d, 3.009780236492411E-139d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setStandardDeviation(0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test426() {}
//   public void test426() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test426"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.setFunctionValueAccuracy(100.0d);
//     int var3 = var0.getIterationCount();
//     int var4 = var0.getMaximalIterationCount();
//     int var5 = var0.getIterationCount();
//     double var6 = var0.getAbsoluteAccuracy();
//     org.apache.commons.math.analysis.UnivariateRealFunction var7 = null;
//     double var10 = var0.solve(var7, 0.3416382086016081d, 0.8427007929497143d);
// 
//   }

  public void test427() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test427"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    double var2 = var0.getStandardDeviation();
    double var3 = var0.getMean();
    var0.setStandardDeviation(1.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.inverseCumulativeProbability(1751.8796585025225d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);

  }

  public void test428() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test428"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(1.0E-15d);
    org.apache.commons.math.FunctionEvaluationException var3 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var1, 0.06039482086827752d);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 0"+ "'", var4.equals("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: evaluation failed for argument = 0"));

  }

  public void test429() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test429"); }


    double var1 = org.apache.commons.math.special.Gamma.digamma((-2.0872192862952943E-14d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 4.79106343337281E13d);

  }

  public void test430() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test430"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.solve((-1.554312234475219E-14d), (-0.5772156677920679d), 0.5219912357012065d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test431"); }


    double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.29249274169844586d, 0.8413447460685428d, 1751.8796585025225d, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5438809231961432d);

  }

  public void test432() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test432"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.resetRelativeAccuracy();
    var0.resetFunctionValueAccuracy();
    var0.resetAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve(0.23585160514005232d, 0.06039482086827752d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test433"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.setMaximalIterationCount(10);
    var0.setAbsoluteAccuracy(0.0d);
    double var9 = var0.getFunctionValueAccuracy();
    double var10 = var0.getFunctionValueAccuracy();
    var0.setMaximalIterationCount((-1));
    double var13 = var0.getFunctionValueAccuracy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0E-15d);

  }

  public void test434() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test434"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.9909217750678144d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.8388980399280123d);

  }

  public void test435() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test435"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(17.037034161334805d, 875.9398292512612d, 3.9893912839872314E-8d, 0);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test436"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    int var1 = var0.getIterationCount();
    var0.resetRelativeAccuracy();
    var0.resetMaximalIterationCount();
    var0.setMaximalIterationCount(100);
    var0.resetRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var10 = var0.solve(0.0d, 0.999999264711086d, Double.NaN);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test437() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test437"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(3.9893912839872314E-8d, 0.9053230529447014d, 5.0E11d, (-1));
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test438"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 0.8413263972267939d, 0.43928890683727895d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test439"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    var0.setStandardDeviation(1.7066537273912313E-78d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.cumulativeProbability(0.9954022576147243d, 0.5111616472147071d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);

  }

  public void test440() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test440"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, Double.NEGATIVE_INFINITY, 10.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test441"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    int var3 = var0.getIterationCount();
    int var4 = var0.getMaximalIterationCount();
    int var5 = var0.getIterationCount();
    double var6 = var0.getAbsoluteAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0E-6d);

  }

  public void test442() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test442"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.38101511654603265d, 17.037034161334805d);

  }

  public void test443() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test443"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 100.0d, 12.029336393018417d, 0.2530140607319138d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test444"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(2.3740623214849856d, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.1870311607424928d);

  }

  public void test445() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test445"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(2.604699452203707d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.3609465371586793d);

  }

  public void test446() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test446"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(0.03989422804014307d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 3.1997802738793797d);

  }

  public void test447() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test447"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(0.38101511654603265d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 7.932824780573021d);

  }

  public void test448() {}
//   public void test448() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test448"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     int var5 = var0.getIterationCount();
//     int var6 = var0.getIterationCount();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var10 = var0.solve(0.983360177933631d, (-2.8271499010371244d), 0.31662401614731683d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == 0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var6 == 0);
// 
//   }

  public void test449() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test449"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.27970750510912734d, (-1725235.029074699d), 0.039777486921634034d, (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test450() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test450"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var5 = var0.getStandardDeviation();
    double var6 = var0.getMean();
    double var7 = var0.getMean();
    double var8 = var0.getStandardDeviation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);

  }

  public void test451() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test451"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    double var5 = var0.getFunctionValueAccuracy();
    int var6 = var0.getIterationCount();
    var0.resetAbsoluteAccuracy();
    var0.resetRelativeAccuracy();
    org.apache.commons.math.analysis.UnivariateRealFunction var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var13 = var0.solve(var9, 0.5000000000000004d, 0.9008515105459516d, 0.9008515105459516d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test452() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test452"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.7993911204328135d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.7417385135418011d);

  }

  public void test453() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test453"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    double var3 = var0.getAbsoluteAccuracy();
    double var4 = var0.getRelativeAccuracy();
    int var5 = var0.getMaximalIterationCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var8 = var0.solve(2.604699452203707d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0E-6d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1.0E-14d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test454() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test454"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(3.009780236492411E-139d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.1039017651655189E277d);

  }

  public void test455() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test455"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.resetRelativeAccuracy();
    var0.setAbsoluteAccuracy(1.0E-15d);
    var0.setMaximalIterationCount(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var7 = var0.getResult();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test456"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    double var2 = var0.getRelativeAccuracy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var5 = var0.solve(4.431500626822654d, 1.9779089640879516E-4d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0E-14d);

  }

  public void test457() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test457"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.15831227263723902d, 0.9053230529447014d);

  }

  public void test458() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test458"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.resetAbsoluteAccuracy();
    var0.setMaximalIterationCount((-1));
    var0.setFunctionValueAccuracy(1.0d);
    var0.setRelativeAccuracy(17.037034161334805d);
    var0.resetAbsoluteAccuracy();
    int var11 = var0.getIterationCount();
    org.apache.commons.math.analysis.UnivariateRealFunction var12 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var15 = var0.solve(var12, 89.6600583727598d, 0.99999997166433d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test459() {}
//   public void test459() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test459"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-1.0d), 3.009780236492411E-139d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test460() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test460"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.06992687627728209d, 0.31662401614731683d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.19327544621229947d);

  }

  public void test461() {}
//   public void test461() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test461"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.getMean();
//     double var3 = var0.inverseCumulativeProbability(Double.NaN);
//     var0.setMean(Double.NaN);
//     double var7 = var0.cumulativeProbability(1751.8796585025225d);
//     double var8 = var0.getStandardDeviation();
//     double var10 = var0.cumulativeProbability(1.0E-15d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var10 == Double.NaN);
// 
//   }

  public void test462() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test462"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.5219912357012065d, 13.17113873543612d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 6.846564985568663d);

  }

  public void test463() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test463"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(89.6600583727598d, 0.039777486921634034d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.303312700771636E-264d);

  }

  public void test464() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test464"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(876.1980328718925d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5058.093700823767d);

  }

  public void test465() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test465"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.0d, 0.03019741043413876d, 5.0E11d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test466() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test466"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var2 = new org.apache.commons.math.distribution.NormalDistributionImpl(0.06992687627728209d, 748.2156829382444d);

  }

  public void test467() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test467"); }


    double var1 = org.apache.commons.math.special.Gamma.logGamma(12.029336393018417d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 17.57400409212769d);

  }

  public void test468() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test468"); }


    double[] var0 = new double[] { };
    java.lang.Object[] var3 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var4 = new org.apache.commons.math.FunctionEvaluationException(var0, "hi!", var3);
    double[] var7 = new double[] { };
    java.lang.Object[] var10 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var11 = new org.apache.commons.math.FunctionEvaluationException(var7, "hi!", var10);
    org.apache.commons.math.FunctionEvaluationException var12 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var4, 100.0d, "", var10);
    double[] var13 = new double[] { };
    java.lang.Object[] var16 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var17 = new org.apache.commons.math.FunctionEvaluationException(var13, "hi!", var16);
    org.apache.commons.math.FunctionEvaluationException var18 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var13);
    double[] var19 = new double[] { };
    java.lang.Object[] var22 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var23 = new org.apache.commons.math.FunctionEvaluationException(var19, "hi!", var22);
    double[] var26 = new double[] { };
    java.lang.Object[] var29 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var30 = new org.apache.commons.math.FunctionEvaluationException(var26, "hi!", var29);
    org.apache.commons.math.FunctionEvaluationException var31 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var23, 100.0d, "", var29);
    double[] var32 = new double[] { };
    java.lang.Object[] var35 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var36 = new org.apache.commons.math.FunctionEvaluationException(var32, "hi!", var35);
    org.apache.commons.math.FunctionEvaluationException var37 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var31, var32);
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var12, var32);
    java.lang.String var39 = var38.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "+ "'", var39.equals("org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: "));

  }

  public void test469() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test469"); }


    org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
    double var1 = var0.getMean();
    var0.setStandardDeviation(10.0d);
    double var4 = var0.getStandardDeviation();
    double var5 = var0.getStandardDeviation();
    double var7 = var0.density((java.lang.Double)1.0E-6d);
    double var9 = var0.density((java.lang.Double)0.7655789667475025d);
    double var11 = var0.cumulativeProbability(0.27155381370221254d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.03989422804014307d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.039777486921634034d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.510832098461141d);

  }

  public void test470() {}
//   public void test470() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test470"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     var0.setFunctionValueAccuracy(Double.NaN);
//     double var4 = var0.getFunctionValueAccuracy();
//     var0.resetFunctionValueAccuracy();
//     var0.setRelativeAccuracy(0.3416382086016081d);
//     var0.resetRelativeAccuracy();
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var9 = var0.getResult();
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test471() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test471"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(2.3740623214849856d, 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 8.446393896199158E-37d);

  }

  public void test472() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test472"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.setFunctionValueAccuracy(100.0d);
    var0.setRelativeAccuracy(0.3224670334240781d);
    var0.resetMaximalIterationCount();
    var0.setRelativeAccuracy(1.7066537273912313E-78d);
    org.apache.commons.math.analysis.UnivariateRealFunction var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.solve(var8, 0.0d, 0.3856035764284349d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test473() {}
//   public void test473() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test473"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     var0.resetAbsoluteAccuracy();
//     double var2 = var0.getRelativeAccuracy();
//     var0.resetAbsoluteAccuracy();
//     double var6 = var0.solve(0.5111616472147071d, 12.029336393018417d);
// 
//   }

  public void test474() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test474"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl var0 = new org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var1 = var0.newNewtonSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var2 = var0.newBisectionSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var3 = var0.newNewtonSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var4 = var0.newDefaultSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var5 = var0.newDefaultSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var6 = var0.newDefaultSolver();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test475() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test475"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 1.0E12d, 10.72469348821222d, 0.999999264711086d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test476"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var5 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 12.029336393018417d, 0.009834360744607196d, (-1.7558518886337975d), (-1));
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test477"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.6357768926832712d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.6314135462457177d);

  }

  public void test478() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test478"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.resetRelativeAccuracy();
    int var6 = var0.getIterationCount();
    var0.setRelativeAccuracy(12.029336393018417d);
    org.apache.commons.math.analysis.UnivariateRealFunction var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var12 = var0.solve(var9, 0.7712071528568698d, 0.5014182975349006d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test479() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test479"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 1.5979760585544307d, 9.654109524008826d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test480() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test480"); }


    double var1 = org.apache.commons.math.special.Gamma.trigamma(5058.093700823767d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.9772248541421474E-4d);

  }

  public void test481() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test481"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(10.72469348821222d, 0.003989422802914418d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 5.364341455507567d);

  }

  public void test482() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test482"); }


    double var2 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.29249274169844586d, 3.9893912839872314E-8d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.007624881050000694d);

  }

  public void test483() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test483"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    double var1 = var0.getAbsoluteAccuracy();
    var0.resetFunctionValueAccuracy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1.0E-6d);

  }

  public void test484() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test484"); }


    org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
    var0.resetAbsoluteAccuracy();
    var0.setRelativeAccuracy(0.0d);
    var0.resetRelativeAccuracy();
    var0.setMaximalIterationCount(10);
    var0.setAbsoluteAccuracy(0.0d);
    double var9 = var0.getFunctionValueAccuracy();
    double var10 = var0.getFunctionValueAccuracy();
    var0.setMaximalIterationCount(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var16 = var0.solve(13.17113873543612d, 1.5979760585544307d, 0.0d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1.0E-15d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1.0E-15d);

  }

  public void test485() {}
//   public void test485() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test485"); }
// 
// 
//     double var2 = org.apache.commons.math.special.Gamma.regularizedGammaQ((-7.654341059276559d), 0.33772359079451547d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var2 == Double.NaN);
// 
//   }

  public void test486() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test486"); }


    org.apache.commons.math.FunctionEvaluationException var1 = new org.apache.commons.math.FunctionEvaluationException(0.23585160514005232d);

  }

  public void test487() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test487"); }


    double var1 = org.apache.commons.math.special.Erf.erf(6.846564985568663d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.9999999999999989d);

  }

  public void test488() {}
//   public void test488() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test488"); }
// 
// 
//     org.apache.commons.math.distribution.NormalDistributionImpl var0 = new org.apache.commons.math.distribution.NormalDistributionImpl();
//     double var1 = var0.getMean();
//     double var3 = var0.inverseCumulativeProbability(Double.NaN);
//     double var5 = var0.cumulativeProbability(Double.NaN);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var8 = var0.cumulativeProbability(0.039752825870340104d, 1.0E-6d);
//       fail("Expected exception of type Exception");
//     } catch (Exception e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var1 == 0.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1.0d);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var5 == Double.NaN);
// 
//   }

  public void test489() {}
//   public void test489() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test489"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaP(1.6449340668481562d, (-0.30949244172698365d), 0.0d, 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test490() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test490"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var3 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.solve(var0, 0.8407834471420012d, 2.1286932927217093d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test491"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.03555152191798849d, 179.0671026847877d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 89.55132710335285d);

  }

  public void test492() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test492"); }


    org.apache.commons.math.analysis.UnivariateRealFunction var0 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double[] var4 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.bracket(var0, 0.039777486921634034d, 0.99999997166433d, 179.0671026847877d);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test493"); }


    org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl var0 = new org.apache.commons.math.analysis.solvers.UnivariateRealSolverFactoryImpl();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var1 = var0.newDefaultSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var2 = var0.newBrentSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var3 = var0.newBisectionSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var4 = var0.newBrentSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var5 = var0.newBisectionSolver();
    org.apache.commons.math.analysis.solvers.UnivariateRealSolver var6 = var0.newDefaultSolver();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test494() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test494"); }


    double[] var2 = new double[] { };
    java.lang.Object[] var5 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var6 = new org.apache.commons.math.FunctionEvaluationException(var2, "hi!", var5);
    double[] var9 = new double[] { };
    java.lang.Object[] var12 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var13 = new org.apache.commons.math.FunctionEvaluationException(var9, "hi!", var12);
    org.apache.commons.math.FunctionEvaluationException var14 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var6, 100.0d, "", var12);
    double[] var15 = new double[] { };
    java.lang.Object[] var18 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var19 = new org.apache.commons.math.FunctionEvaluationException(var15, "hi!", var18);
    org.apache.commons.math.FunctionEvaluationException var20 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, var15);
    double[] var21 = new double[] { };
    java.lang.Object[] var24 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var25 = new org.apache.commons.math.FunctionEvaluationException(var21, "hi!", var24);
    double[] var28 = new double[] { };
    java.lang.Object[] var31 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var32 = new org.apache.commons.math.FunctionEvaluationException(var28, "hi!", var31);
    org.apache.commons.math.FunctionEvaluationException var33 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var25, 100.0d, "", var31);
    double[] var34 = new double[] { };
    java.lang.Object[] var37 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var38 = new org.apache.commons.math.FunctionEvaluationException(var34, "hi!", var37);
    org.apache.commons.math.FunctionEvaluationException var39 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var33, var34);
    org.apache.commons.math.FunctionEvaluationException var40 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var14, var34);
    double[] var41 = new double[] { };
    java.lang.Object[] var44 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var45 = new org.apache.commons.math.FunctionEvaluationException(var41, "hi!", var44);
    double[] var48 = new double[] { };
    java.lang.Object[] var51 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var52 = new org.apache.commons.math.FunctionEvaluationException(var48, "hi!", var51);
    org.apache.commons.math.FunctionEvaluationException var53 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var45, 100.0d, "", var51);
    double[] var54 = new double[] { };
    java.lang.Object[] var57 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var58 = new org.apache.commons.math.FunctionEvaluationException(var54, "hi!", var57);
    org.apache.commons.math.FunctionEvaluationException var59 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var53, var54);
    var40.addSuppressed((java.lang.Throwable)var59);
    double[] var63 = new double[] { };
    java.lang.Object[] var66 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var67 = new org.apache.commons.math.FunctionEvaluationException(var63, "hi!", var66);
    double[] var70 = new double[] { };
    java.lang.Object[] var73 = new java.lang.Object[] { '4'};
    org.apache.commons.math.FunctionEvaluationException var74 = new org.apache.commons.math.FunctionEvaluationException(var70, "hi!", var73);
    org.apache.commons.math.FunctionEvaluationException var75 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var67, 100.0d, "", var73);
    org.apache.commons.math.FunctionEvaluationException var76 = new org.apache.commons.math.FunctionEvaluationException((java.lang.Throwable)var40, 359.1342053695754d, "org.apache.commons.math.ConvergenceException: hi!", var73);
    org.apache.commons.math.MaxIterationsExceededException var77 = new org.apache.commons.math.MaxIterationsExceededException(100, "", var73);
    org.apache.commons.math.ConvergenceException var78 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable)var77);
    int var79 = var77.getMaxIterations();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 100);

  }

  public void test495() {}
//   public void test495() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test495"); }
// 
// 
//     org.apache.commons.math.analysis.solvers.BrentSolver var0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
//     double var1 = var0.getAbsoluteAccuracy();
//     int var2 = var0.getIterationCount();
//     double var5 = var0.solve(Double.NEGATIVE_INFINITY, 0.3416382086016081d);
// 
//   }

  public void test496() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test496"); }


    java.lang.Object[] var2 = null;
    org.apache.commons.math.MaxIterationsExceededException var3 = new org.apache.commons.math.MaxIterationsExceededException(100, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.FunctionEvaluationException: ", var2);
    java.lang.Object[] var4 = var3.getArguments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test497() {}
//   public void test497() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest0.test497"); }
// 
// 
//     double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.31662401614731683d, (-2.8271499010371244d), 0.0d, 1);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var4 == Double.NaN);
// 
//   }

  public void test498() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test498"); }


    double var1 = org.apache.commons.math.special.Erf.erf(0.03019741043413876d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.034063774453817114d);

  }

  public void test499() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test499"); }


    double var2 = org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils.midpoint(0.06841295385907521d, 1.9779089640879516E-4d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.034305372377742005d);

  }

  public void test500() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test500"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      double var4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(0.33772359079451547d, 1.0E-6d, 0.039752825870340104d, 1);
      fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException");
    } catch (org.apache.commons.math.MaxIterationsExceededException e) {
      // Expected exception.
    }

  }

}
