/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:07:51 GMT 2014
 */

package org.apache.commons.math.stat.correlation;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.stat.correlation.Covariance;
import org.apache.commons.math.stat.correlation.PearsonsCorrelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class PearsonsCorrelationEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertNotNull(realMatrixImpl0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(7, realMatrixImpl0.getRowDimension());
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 7 rows and 1 columns.
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix();
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(0, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(0, array2DRowRealMatrix0.getColumnDimension());
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) array2DRowRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 0 rows and 0 columns.
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertNotNull(realMatrixImpl0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(3, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      
      int int0 = 0;
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) realMatrixImpl0, int0);
      assertNotNull(pearsonsCorrelation0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(3, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      
      double[] doubleArray1 = new double[1];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray1, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[][] doubleArray1 = new double[6][2];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray1[1], doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 2; yArray has 4 elements
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      double double0 = Double.NaN;
      Double double1 = new Double(double0);
      assertEquals(Double.NaN, (double)double1, 0.01D);
      assertTrue(double1.equals((Object)double0));
      
      doubleArray0[0] = double1;
      doubleArray0[1] = double1;
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = doubleArray0[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      assertNotNull(arrayRealVector0);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(6, arrayRealVector0.getDimension());
      assertEquals(true, arrayRealVector0.isNaN());
      assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01D);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)arrayRealVector0.outerProduct(arrayRealVector0);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(6, arrayRealVector0.getDimension());
      assertEquals(true, arrayRealVector0.isNaN());
      assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) array2DRowRealMatrix0);
      assertNotNull(pearsonsCorrelation0);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(6, arrayRealVector0.getDimension());
      assertEquals(true, arrayRealVector0.isNaN());
      assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      assertNotNull(blockRealMatrix0);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(6, arrayRealVector0.getDimension());
      assertEquals(true, arrayRealVector0.isNaN());
      assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(6, blockRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(6, blockRealMatrix0.getRowDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(6, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[2][4];
      Covariance covariance0 = new Covariance(doubleArray0);
      assertNotNull(covariance0);
      assertEquals(2, covariance0.getN());
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
      assertNotNull(pearsonsCorrelation0);
      assertEquals(2, covariance0.getN());
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationStandardErrors();
      assertNotNull(blockRealMatrix0);
      assertEquals(2, covariance0.getN());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(4, blockRealMatrix0.getColumnDimension());
      assertEquals(4, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Covariance covariance0 = new Covariance();
      assertNotNull(covariance0);
      assertEquals(0, covariance0.getN());
      
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // covariance matrix is null
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      double[][] doubleArray0 = new double[3][6];
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
      assertNotNull(blockRealMatrix0);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(6, blockRealMatrix0.getRowDimension());
      assertEquals(6, blockRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(realMatrix0);
  }
}
