/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:56:46 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BisectionSolverEvoSuite_branch_Test   {

  //@Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertNotNull(bisectionSolver0);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      
      double double0 = bisectionSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-15, double0, 0.01D);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = double0;
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {1.0E-15, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      int int0 = (-5816);
      double double1 = bisectionSolver0.solve((UnivariateRealFunction) polynomialFunction0, (double) int0, doubleArray0[1], doubleArray0[2]);
      assertFalse(double1 == double0);
      assertEquals((-3.3853575587272644E-7), double1, 0.01D);
      assertArrayEquals(new double[] {1.0E-15, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(32, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, polynomialFunction0.degree());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      assertNotNull(bisectionSolver0);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      bisectionSolver0.f = (UnivariateRealFunction) polynomialFunction0;
      assertNotNull(bisectionSolver0.f);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      
      int int0 = (-5816);
      bisectionSolver0.setAbsoluteAccuracy((double) int0);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals((-5816.0), bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      
      try {
        double double0 = bisectionSolver0.solve((double) int0, doubleArray0[1], doubleArray0[2]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      BisectionSolver bisectionSolver0 = new BisectionSolver((UnivariateRealFunction) polynomialFunction0);
      assertNotNull(bisectionSolver0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(0, bisectionSolver0.getIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
      
      // Undeclared exception!
      try {
        double double0 = bisectionSolver0.solve(doubleArray0[2], doubleArray0[5]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, 0]
         //
      }
  }
}
