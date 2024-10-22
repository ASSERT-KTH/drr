/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:02:02 GMT 2014
 */

package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class CMAESOptimizerEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      double[] doubleArray0 = new double[3];
      double double0 = 1.3514669016323972;
      int int1 = 3093;
      double[][] doubleArray1 = new double[3][3];
      doubleArray0[0] = double0;
      doubleArray0[1] = (double) int1;
      doubleArray0[2] = doubleArray0[1];
      Well44497a well44497a0 = new Well44497a();
      //  // Unstable assertion: assertNotNull(well44497a0);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1, (RandomGenerator) well44497a0);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int0, int0, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[2], doubleArray1[2], doubleArray0);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertArrayEquals(new double[] {1.3514669016323972, 3093.0, 3093.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(3093, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(3094, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 32;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) int0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {32.0, 0.0}, doubleArray0, 0.01);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      double[][] doubleArray1 = new double[2][8];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      int int1 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray0, int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertArrayEquals(new double[] {32.0, 0.0}, doubleArray0, 0.01);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[0], doubleArray1[1], doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 32 out of [0, 0] range
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1329);
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) int1;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int1, doubleArray0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {0.0, (-1329.0), 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertFalse(int1 == int0);
      
      double[][] doubleArray1 = new double[3][3];
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1, (RandomGenerator) well44497a0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[2], doubleArray1[2], doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,329 is smaller than the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = (-1832);
      boolean boolean0 = true;
      double[] doubleArray0 = new double[1];
      double double0 = 2633.7506041589636;
      doubleArray0[0] = double0;
      int int1 = 2285;
      Well44497a well44497a0 = new Well44497a();
      //  // Unstable assertion: assertNotNull(well44497a0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, (double) int0, boolean0, int1, int1, (RandomGenerator) well44497a0, boolean0);
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertArrayEquals(new double[] {2633.7506041589636}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      int int2 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int1, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertArrayEquals(new double[] {2633.7506041589636}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(2286, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(2285, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-13);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) int0;
      int int1 = 2285;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      int int2 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int1, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      doubleArray0[0] = (double) int2;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(2285, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(89, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[10];
      double double0 = 79.6;
      doubleArray0[3] = double0;
      int int1 = 882;
      boolean boolean0 = false;
      ISAACRandom iSAACRandom0 = new ISAACRandom();
      //  // Unstable assertion: assertNotNull(iSAACRandom0);
      
      SimplePointChecker<PointValuePair> simplePointChecker0 = new SimplePointChecker<PointValuePair>();
      //  // Unstable assertion: assertNotNull(simplePointChecker0);
      //  // Unstable assertion: assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      //  // Unstable assertion: assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, doubleArray0[3], boolean0, int0, int0, (RandomGenerator) iSAACRandom0, boolean0, (ConvergenceChecker<PointValuePair>) simplePointChecker0);
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 79.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      //  // Unstable assertion: assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      double[][] doubleArray1 = new double[10][10];
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[3], int1, int0, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[6]);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 79.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(1.1102230246251565E-14, simplePointChecker0.getRelativeThreshold(), 0.01D);
      //  // Unstable assertion: assertEquals(2.2250738585072014E-306, simplePointChecker0.getAbsoluteThreshold(), 0.01D);
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(882, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(883, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = (-13);
      double[] doubleArray0 = new double[1];
      int int1 = 2285;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      int int2 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int0, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(1425, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(2285, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = (-13);
      double[] doubleArray0 = new double[1];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertNotNull(list0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertNotNull(list0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = (-13);
      double[] doubleArray0 = new double[1];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertNotNull(list0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertNotNull(list0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, list0.size());
      assertEquals(true, list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-13);
      double[] doubleArray0 = new double[1];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      int int1 = 2285;
      double[][] doubleArray1 = new double[1][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      int int2 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int0, int2, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray1[0], doubleArray0);
      assertNotNull(pointValuePair0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(2285, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(5, cMAESOptimizer0.getEvaluations());
      assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
  }
}
