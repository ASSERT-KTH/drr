/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 25 13:10:21 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class PowellOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(1.0E-15, 1.0E-15);
      assertNull(powellOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(1770.92, 4662.090429999089, 3375.6589, (-1906.414663750367));
      OptimizationData[] optimizationDataArray0 = new OptimizationData[1];
      double[] doubleArray0 = new double[5];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[0] = (OptimizationData) simpleBounds0;
      // Undeclared exception!
      try { 
        powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer((-1552.019885594), (-1552.019885594), 1.0E-15, 1.0E-15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,552.02 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(146.5716, (-1.0), 0.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(2.0, 2.0, 2.0, 1.9987994582857286E-8, (ConvergenceChecker<PointValuePair>) null);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      double[] doubleArray0 = new double[7];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      try { 
        powellOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback", e);
      }
  }
}
