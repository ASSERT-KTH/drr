/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 25 12:44:36 GMT 2019
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class PowellOptimizer_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(307.0, 307.0, 1.8014398509481984E16, (-1226.50686982678));
      // Undeclared exception!
      try { 
        powellOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer((-3718.0), (-3718.0), (-3718.0), (-3718.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,718 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = null;
      try {
        powellOptimizer0 = new PowellOptimizer(0.8414709568023682, (-950.70201942321), 0.8414709568023682, (-1185.7556989));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -950.702 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PowellOptimizer powellOptimizer0 = new PowellOptimizer(1204.698316926044, 215.9);
      OptimizationData[] optimizationDataArray0 = new OptimizationData[6];
      double[] doubleArray0 = new double[5];
      SimpleBounds simpleBounds0 = new SimpleBounds(doubleArray0, doubleArray0);
      optimizationDataArray0[1] = (OptimizationData) simpleBounds0;
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
}
