/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:21:25 GMT 2014
 */

package org.apache.commons.math.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer;
import org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.random.Well1024a;
import org.apache.commons.math.random.Well19937a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MultiStartUnivariateRealOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = (-1);
      Well1024a well1024a0 = new Well1024a();
      assertNotNull(well1024a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well1024a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair[] univariateRealPointValuePairArray0 = multiStartUnivariateRealOptimizer0.getOptima();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no optimum computed yet
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 10;
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well19937a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      int int1 = multiStartUnivariateRealOptimizer0.getMaxEvaluations();
      assertEquals(0, int1);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      int int0 = 10;
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well19937a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      
      // Undeclared exception!
      try {
        ConvergenceChecker<UnivariateRealPointValuePair> convergenceChecker0 = multiStartUnivariateRealOptimizer0.getConvergenceChecker();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialSplineFunction> baseUnivariateRealOptimizer0 = null;
      int int0 = 1665;
      int[] intArray0 = new int[26];
      Well1024a well1024a0 = new Well1024a(intArray0);
      assertNotNull(well1024a0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      MultiStartUnivariateRealOptimizer<PolynomialSplineFunction> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialSplineFunction>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well1024a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setMaxEvaluations(int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunctionNewtonForm> baseUnivariateRealOptimizer0 = null;
      int int0 = (-18);
      RandomGenerator randomGenerator0 = null;
      MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionNewtonForm>(baseUnivariateRealOptimizer0, int0, randomGenerator0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      ConvergenceChecker<UnivariateRealPointValuePair> convergenceChecker0 = null;
      // Undeclared exception!
      try {
        multiStartUnivariateRealOptimizer0.setConvergenceChecker(convergenceChecker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int int0 = (-34);
      Well19937a well19937a0 = new Well19937a(int0);
      assertNotNull(well19937a0);
      
      BaseUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> baseUnivariateRealOptimizer0 = null;
      MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunctionLagrangeForm>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) well19937a0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      int int1 = multiStartUnivariateRealOptimizer0.getEvaluations();
      assertEquals(0, int1);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BaseUnivariateRealOptimizer<PolynomialFunction> baseUnivariateRealOptimizer0 = null;
      int int0 = 2494;
      int[] intArray0 = new int[3];
      MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
      assertNotNull(mersenneTwister0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      
      MultiStartUnivariateRealOptimizer<PolynomialFunction> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunction>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair univariateRealPointValuePair0 = multiStartUnivariateRealOptimizer0.optimize(polynomialFunction0, goalType0, (double) int0, doubleArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = 0;
      MersenneTwister mersenneTwister0 = new MersenneTwister((long) int0);
      assertNotNull(mersenneTwister0);
      
      BaseUnivariateRealOptimizer<PolynomialFunction> baseUnivariateRealOptimizer0 = null;
      MultiStartUnivariateRealOptimizer<PolynomialFunction> multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer<PolynomialFunction>(baseUnivariateRealOptimizer0, int0, (RandomGenerator) mersenneTwister0);
      assertNotNull(multiStartUnivariateRealOptimizer0);
      assertEquals(0, multiStartUnivariateRealOptimizer0.getMaxEvaluations());
      assertEquals(0, multiStartUnivariateRealOptimizer0.getEvaluations());
      
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertNotNull(polynomialFunction0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        UnivariateRealPointValuePair univariateRealPointValuePair0 = multiStartUnivariateRealOptimizer0.optimize(polynomialFunction0, goalType0, (double) int0, (double) int0, (double) int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }
}
