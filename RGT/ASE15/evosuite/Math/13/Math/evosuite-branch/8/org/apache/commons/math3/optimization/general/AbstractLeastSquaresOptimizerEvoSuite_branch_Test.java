/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:47:47 GMT 2014
 */

package org.apache.commons.math3.optimization.general;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.PointVectorValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.SimpleVectorValueChecker;
import org.apache.commons.math3.optimization.general.GaussNewtonOptimizer;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class AbstractLeastSquaresOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer();
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      // Undeclared exception!
      try {
        double[] doubleArray0 = gaussNewtonOptimizer0.guessParametersErrors();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no degrees of freedom (0 measurements, 0 parameters)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = false;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      int int0 = 5849;
      gaussNewtonOptimizer0.rows = int0;
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      
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
      ConvergenceChecker<PointVectorValuePair> convergenceChecker0 = null;
      boolean boolean0 = false;
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(convergenceChecker0);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      double double0 = levenbergMarquardtOptimizer0.getRMS();
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, double0, 0.01D);
      
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0, convergenceChecker0);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try {
        double[] doubleArray1 = gaussNewtonOptimizer0.computeSigma(doubleArray0, double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer();
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = gaussNewtonOptimizer0.getWeightSquareRoot();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      int int0 = gaussNewtonOptimizer0.getJacobianEvaluations();
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = true;
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer(boolean0);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertNotNull(gaussNewtonOptimizer0);
      
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try {
        double double0 = gaussNewtonOptimizer0.computeCost(doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = (-49.24193775611494);
      SimpleVectorValueChecker simpleVectorValueChecker0 = new SimpleVectorValueChecker(double0, double0);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simpleVectorValueChecker0);
      
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, (ConvergenceChecker<PointVectorValuePair>) simpleVectorValueChecker0, double0, double0, double0, double0);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        levenbergMarquardtOptimizer0.updateJacobian();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GaussNewtonOptimizer gaussNewtonOptimizer0 = new GaussNewtonOptimizer();
      assertEquals(0, gaussNewtonOptimizer0.getJacobianEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getMaxEvaluations());
      assertEquals(0, gaussNewtonOptimizer0.getEvaluations());
      assertEquals(0.0, gaussNewtonOptimizer0.getChiSquare(), 0.01D);
      assertEquals(Double.NaN, gaussNewtonOptimizer0.getRMS(), 0.01D);
      assertNotNull(gaussNewtonOptimizer0);
      
      // Undeclared exception!
      try {
        gaussNewtonOptimizer0.updateResidualsAndCost();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = (-49.24193775611494);
      SimpleVectorValueChecker simpleVectorValueChecker0 = new SimpleVectorValueChecker(double0, double0);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simpleVectorValueChecker0);
      
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer(double0, (ConvergenceChecker<PointVectorValuePair>) simpleVectorValueChecker0, double0, double0, double0, double0);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      levenbergMarquardtOptimizer0.setCost(double0);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals((-49.24193775611494), simpleVectorValueChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(2424.7684339770985, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        double[][] doubleArray0 = levenbergMarquardtOptimizer0.getCovariances();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplePointChecker<PointVectorValuePair> simplePointChecker0 = new SimplePointChecker<PointVectorValuePair>();
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer((ConvergenceChecker<PointVectorValuePair>) simplePointChecker0);
      assertEquals(Double.NaN, levenbergMarquardtOptimizer0.getRMS(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getMaxEvaluations());
      assertEquals(0.0, levenbergMarquardtOptimizer0.getChiSquare(), 0.01D);
      assertEquals(0, levenbergMarquardtOptimizer0.getJacobianEvaluations());
      assertEquals(0, levenbergMarquardtOptimizer0.getEvaluations());
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(levenbergMarquardtOptimizer0);
      
      // Undeclared exception!
      try {
        levenbergMarquardtOptimizer0.setUp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
