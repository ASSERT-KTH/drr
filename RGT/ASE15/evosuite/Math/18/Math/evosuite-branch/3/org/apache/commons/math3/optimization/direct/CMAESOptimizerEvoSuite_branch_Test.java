/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:16:57 GMT 2014
 */

package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CMAESOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = true;
      int int0 = 539;
      int int1 = 0;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>();
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, (double) int1, boolean0, int1, int1, (RandomGenerator) well44497a0, boolean0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well44497a0);
      assertFalse(int0 == int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray1[0], doubleArray1[0]);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(539, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      assertEquals(1, cMAESOptimizer0.getEvaluations());
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[25];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[2][6];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      double[] doubleArray2 = new double[2];
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertNotSame(doubleArray2, doubleArray0);
      
      double double0 = (-4.566098167230033E-8);
      doubleArray0[17] = double0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray2, int0, int0, unitSphereRandomVectorGenerator0);
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray2, 0.01);
      assertNotSame(doubleArray2, doubleArray0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[1], doubleArray1[1], doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 4;
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) int0;
      boolean boolean0 = false;
      int int1 = 0;
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int1, (RandomGenerator) well512a0, boolean0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertArrayEquals(new double[] {4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[10][1];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      assertNotNull(doubleArray1[7]);
      
      doubleArray1[8] = doubleArray0;
      assertNotNull(doubleArray1[8]);
      
      doubleArray1[9] = doubleArray0;
      assertNotNull(doubleArray1[9]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[5], doubleArray1[6], doubleArray1[7]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 out of [0, 0] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = (-14);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) int0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertArrayEquals(new double[] {(-14.0), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[6][10];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      int int1 = 600;
      int int2 = 0;
      GoalType goalType0 = GoalType.MINIMIZE;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertNotNull(microsphereInterpolatingFunction0);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[4]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -14 is smaller than the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = 4;
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) int0;
      int int1 = 1126;
      boolean boolean0 = false;
      int int2 = 0;
      Well512a well512a0 = new Well512a();
      //  // Unstable assertion: assertNotNull(well512a0);
      
      boolean boolean1 = true;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, doubleArray0[3], boolean0, int2, int2, (RandomGenerator) well512a0, boolean1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(boolean1 == boolean0);
      //  // Unstable assertion: assertFalse(boolean0 == boolean1);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertArrayEquals(new double[] {4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[10][1];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray1[5];
      //  // Unstable assertion: assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[7]);
      
      doubleArray1[8] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[8]);
      
      doubleArray1[9] = doubleArray1[8];
      //  // Unstable assertion: assertNotNull(doubleArray1[9]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(boolean1 == boolean0);
      //  // Unstable assertion: assertFalse(boolean0 == boolean1);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertArrayEquals(new double[] {4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(1127, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(1126, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 4;
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = (double) int0;
      doubleArray0[2] = (double) int0;
      doubleArray0[3] = (double) int0;
      doubleArray0[4] = (double) int0;
      doubleArray0[5] = (double) int0;
      doubleArray0[6] = (double) int0;
      doubleArray0[7] = (double) int0;
      doubleArray0[8] = doubleArray0[1];
      doubleArray0[9] = (double) int0;
      int int1 = 1124;
      boolean boolean0 = false;
      int int2 = 0;
      Well512a well512a0 = new Well512a();
      //  // Unstable assertion: assertNotNull(well512a0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, (double) int1, boolean0, int1, int2, (RandomGenerator) well512a0, boolean0);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertArrayEquals(new double[] {4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[10][1];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[7]);
      
      doubleArray1[8] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[8]);
      
      doubleArray1[9] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[9]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertArrayEquals(new double[] {4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(1124, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(1125, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 4;
      double[] doubleArray0 = new double[10];
      doubleArray0[4] = (double) int0;
      int int1 = 230;
      boolean boolean0 = true;
      int int2 = 0;
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, doubleArray0[3], boolean0, int1, int2, (RandomGenerator) well512a0, boolean0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[10][1];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      assertNotNull(doubleArray1[7]);
      
      doubleArray1[8] = doubleArray0;
      assertNotNull(doubleArray1[8]);
      
      doubleArray1[9] = doubleArray0;
      assertNotNull(doubleArray1[9]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int2, unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(230, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      assertEquals(5, cMAESOptimizer0.getEvaluations());
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 4;
      double[] doubleArray0 = new double[10];
      doubleArray0[6] = (double) int0;
      int int1 = 1126;
      boolean boolean0 = false;
      int int2 = 0;
      Well512a well512a0 = new Well512a();
      //  // Unstable assertion: assertNotNull(well512a0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, doubleArray0[6], boolean0, int2, int2, (RandomGenerator) well512a0, boolean0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[10][1];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray1[5];
      //  // Unstable assertion: assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[7]);
      
      doubleArray1[8] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[8]);
      
      doubleArray1[9] = doubleArray1[8];
      //  // Unstable assertion: assertNotNull(doubleArray1[9]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(1126, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(1127, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 4;
      double[] doubleArray0 = new double[10];
      int int1 = 1124;
      boolean boolean0 = false;
      int int2 = 0;
      Well512a well512a0 = new Well512a();
      assertNotNull(well512a0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, (double) int1, boolean0, int1, int2, (RandomGenerator) well512a0, boolean0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[10][1];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      assertNotNull(doubleArray1[7]);
      
      doubleArray1[8] = doubleArray0;
      assertNotNull(doubleArray1[8]);
      
      doubleArray1[9] = doubleArray0;
      assertNotNull(doubleArray1[9]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int2, unitSphereRandomVectorGenerator0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(5, cMAESOptimizer0.getEvaluations());
      assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      assertEquals(1124, cMAESOptimizer0.getMaxEvaluations());
      assertNotNull(pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = true;
      int int0 = 539;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>();
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertNotNull(simplePointChecker0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well44497a0, boolean0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      int int1 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1, (RandomGenerator) well44497a0);
      assertFalse(int1 == int0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int0, int0, unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertNotNull(cMAESOptimizer0);
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 137;
      double[] doubleArray0 = new double[8];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 4;
      double[] doubleArray0 = new double[10];
      int int1 = 1126;
      int int2 = 0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[10][1];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray1[5];
      //  // Unstable assertion: assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[7]);
      
      doubleArray1[8] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[8]);
      
      doubleArray1[9] = doubleArray1[8];
      //  // Unstable assertion: assertNotNull(doubleArray1[9]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = null;
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int0, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(1126, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(1127, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNotNull(pointValuePair0);
  }
}
