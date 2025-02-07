/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 03:44:49 GMT 2014
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class SimplexOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(convergenceChecker0);
      assertNotNull(simplexOptimizer0);
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertNull(simplexOptimizer0.getGoalType());
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[7];
      int int0 = 289;
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(int0);
      assertNotNull(multiDirectionalSimplex0);
      assertEquals(289, multiDirectionalSimplex0.getDimension());
      
      optimizationDataArray0[1] = (OptimizationData) multiDirectionalSimplex0;
      assertNotNull(optimizationDataArray0[1]);
      assertEquals(289, multiDirectionalSimplex0.getDimension());
      
      SimpleBounds simpleBounds0 = SimpleBounds.unbounded(int0);
      assertNotNull(simpleBounds0);
      
      optimizationDataArray0[5] = (OptimizationData) simpleBounds0;
      assertNotNull(optimizationDataArray0[5]);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // constraint
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = 0.0;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(double0, double0);
      assertNotNull(simplexOptimizer0);
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getEvaluations());
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[4];
      int int0 = 1;
      double[] doubleArray0 = new double[1];
      InitialGuess initialGuess0 = new InitialGuess(doubleArray0);
      assertNotNull(initialGuess0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      optimizationDataArray0[1] = (OptimizationData) initialGuess0;
      assertNotNull(optimizationDataArray0[1]);
      
      MultiDirectionalSimplex multiDirectionalSimplex0 = new MultiDirectionalSimplex(int0);
      assertNotNull(multiDirectionalSimplex0);
      assertEquals(1, multiDirectionalSimplex0.getDimension());
      
      optimizationDataArray0[3] = (OptimizationData) multiDirectionalSimplex0;
      assertNotNull(optimizationDataArray0[3]);
      assertEquals(1, multiDirectionalSimplex0.getDimension());
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConvergenceChecker<PointValuePair> convergenceChecker0 = null;
      SimplexOptimizer simplexOptimizer0 = new SimplexOptimizer(convergenceChecker0);
      assertNotNull(simplexOptimizer0);
      assertEquals(0, simplexOptimizer0.getEvaluations());
      assertEquals(2147483647, simplexOptimizer0.getMaxIterations());
      assertEquals(0, simplexOptimizer0.getIterations());
      assertNull(simplexOptimizer0.getGoalType());
      assertEquals(0, simplexOptimizer0.getMaxEvaluations());
      
      OptimizationData[] optimizationDataArray0 = new OptimizationData[13];
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = simplexOptimizer0.optimize(optimizationDataArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
      }
  }
}
