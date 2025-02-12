/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:22:12 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MultivariateNormalDistributionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 2313.9034843583227;
      doubleArray0[0] = double0;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      assertNotNull(multivariateNormalDistribution0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
      
      int int0 = 826;
      double[][] doubleArray2 = multivariateNormalDistribution0.sample(int0);
      assertNotNull(doubleArray2);
      assertNotSame(doubleArray1, doubleArray2);
      assertNotSame(doubleArray2, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray2));
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 2313.9034843583227;
      doubleArray0[0] = double0;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      assertNotNull(multivariateNormalDistribution0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
      
      double[] doubleArray2 = multivariateNormalDistribution0.getStandardDeviations();
      assertNotNull(doubleArray2);
      assertNotSame(doubleArray0, doubleArray2);
      assertNotSame(doubleArray2, doubleArray0);
      assertFalse(doubleArray0.equals((Object)doubleArray2));
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {48.10305067621307}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 2313.9034843583227;
      doubleArray0[0] = double0;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      assertNotNull(multivariateNormalDistribution0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
      
      double[] doubleArray2 = new double[6];
      assertNotSame(doubleArray2, doubleArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      try {
        double double1 = multivariateNormalDistribution0.density(doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 3246;
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      
      double[] doubleArray0 = new double[2];
      double double0 = 539.9264455157;
      doubleArray0[0] = double0;
      doubleArray0[1] = (double) int0;
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well44497a0, doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0 is smaller than, or equal to, the minimum (0): not positive definite matrix: value -0 at index 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][5];
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 7
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[6];
      Well44497b well44497b0 = new Well44497b(intArray0);
      assertNotNull(well44497b0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      
      double[] doubleArray0 = new double[15];
      double[][] doubleArray1 = new double[1][9];
      MultivariateNormalDistribution multivariateNormalDistribution0 = null;
      try {
        multivariateNormalDistribution0 = new MultivariateNormalDistribution((RandomGenerator) well44497b0, doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 15
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 2313.9034843583227;
      doubleArray0[0] = double0;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      assertNotNull(multivariateNormalDistribution0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
      
      double double1 = multivariateNormalDistribution0.density(doubleArray1[0]);
      assertFalse(double1 == double0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
      assertEquals(0.008293492300244265, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 2313.9034843583227;
      doubleArray0[0] = double0;
      double[][] doubleArray1 = new double[1][2];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      MultivariateNormalDistribution multivariateNormalDistribution0 = new MultivariateNormalDistribution(doubleArray0, doubleArray1);
      assertNotNull(multivariateNormalDistribution0);
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)multivariateNormalDistribution0.getCovariances();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, multivariateNormalDistribution0.getDimension());
      assertArrayEquals(new double[] {2313.9034843583227}, doubleArray0, 0.01);
  }
}
