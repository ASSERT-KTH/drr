/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:06:06 GMT 2014
 */

package org.apache.commons.math;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.RombergIntegrator;
import org.apache.commons.math.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class ConvergingAlgorithmImplEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 558.4;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertNotNull(brentOptimizer0);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = double0;
      doubleArray0[8] = double0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {558.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 558.4}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(8, polynomialFunction0.degree());
      
      GoalType goalType0 = GoalType.MINIMIZE;
      try {
        double double1 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, double0, doubleArray0[7], doubleArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (100) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      assertNotNull(simpsonIntegrator0);
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      
      simpsonIntegrator0.resetMaximalIterationCount();
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      assertNotNull(simpsonIntegrator0);
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      
      int int0 = simpsonIntegrator0.getIterationCount();
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RombergIntegrator rombergIntegrator0 = new RombergIntegrator();
      assertNotNull(rombergIntegrator0);
      assertEquals(0, rombergIntegrator0.getIterationCount());
      assertEquals(3, rombergIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-15, rombergIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
      assertEquals(1.0E-6, rombergIntegrator0.getRelativeAccuracy(), 0.01D);
      
      rombergIntegrator0.resetRelativeAccuracy();
      assertEquals(1.0E-14, rombergIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, rombergIntegrator0.getIterationCount());
      assertEquals(3, rombergIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-15, rombergIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(32, rombergIntegrator0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      assertNotNull(simpsonIntegrator0);
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      
      int int0 = simpsonIntegrator0.getMaximalIterationCount();
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(polynomialFunction0);
      assertEquals(0, polynomialFunction0.degree());
      
      MullerSolver mullerSolver0 = new MullerSolver((UnivariateRealFunction) polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(mullerSolver0);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, mullerSolver0.getIterationCount());
      
      mullerSolver0.resetAbsoluteAccuracy();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, mullerSolver0.getIterationCount());
  }
}
