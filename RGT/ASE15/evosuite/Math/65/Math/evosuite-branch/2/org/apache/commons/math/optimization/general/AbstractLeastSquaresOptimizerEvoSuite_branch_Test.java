/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:06:30 GMT 2014
 */

package org.apache.commons.math.optimization.general;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class AbstractLeastSquaresOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      
      try {
        double[] doubleArray0 = levenbergMarquardtOptimizer0.guessParametersErrors();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      
      int int0 = 2028;
      gaussNewtonOptimizer0.rows = int0;
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      
      int int0 = (-5);
      levenbergMarquardtOptimizer0.setMaxEvaluations(int0);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(-5, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      
      // Undeclared exception!
      try {
        VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      
      int int0 = (-4);
      gaussNewtonOptimizer0.setMaxIterations(int0);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(-4, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      
      try {
        VectorialPointValuePair vectorialPointValuePair0 = gaussNewtonOptimizer0.doOptimize();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (-4) exceeded
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      levenbergMarquardtOptimizer0.incrementIterationsCounter();
      assertEquals(1, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      double double0 = levenbergMarquardtOptimizer0.getRMS();
      assertEquals(Double.NaN, double0, 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      
      VectorialConvergenceChecker vectorialConvergenceChecker0 = levenbergMarquardtOptimizer0.getConvergenceChecker();
      assertNull(vectorialConvergenceChecker0);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      
      int int0 = levenbergMarquardtOptimizer0.getMaxIterations();
      assertEquals(1000, int0);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      
      int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
      assertEquals(0, int0);
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      
      int int0 = levenbergMarquardtOptimizer0.getIterations();
      assertEquals(0, int0);
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertNotNull(gaussNewtonOptimizer0);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
      
      int int0 = gaussNewtonOptimizer0.getEvaluations();
      assertEquals(0, int0);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(100, gaussNewtonOptimizer0.getMaxIterations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(2147483647, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getIterations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertNotNull(levenbergMarquardtOptimizer0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      
      int int0 = levenbergMarquardtOptimizer0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(1000, levenbergMarquardtOptimizer0.getMaxIterations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(2147483647, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getIterations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
  }
}
