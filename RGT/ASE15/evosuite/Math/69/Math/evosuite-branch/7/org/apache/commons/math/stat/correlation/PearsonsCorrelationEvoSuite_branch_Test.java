/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:07:16 GMT 2014
 */

package org.apache.commons.math.stat.correlation;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.stat.correlation.Covariance;
import org.apache.commons.math.stat.correlation.PearsonsCorrelation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class PearsonsCorrelationEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 3 rows and 1 columns.
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      PearsonsCorrelation pearsonsCorrelation0 = null;
      try {
        pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // insufficient data: only 1 rows and 8 columns.
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      double[][] doubleArray0 = new double[12][1];
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray0[2], doubleArray0[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 1; yArray has 1 elements
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[6];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try {
        double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid array dimensions. xArray has size 8; yArray has 6 elements
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationPValues();
      assertNotNull(blockRealMatrix0);
      assertEquals(3, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(3, blockRealMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(doubleArray0);
      assertNotNull(pearsonsCorrelation0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.getCorrelationStandardErrors();
      assertNotNull(blockRealMatrix0);
      assertEquals(3, blockRealMatrix0.getColumnDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(3, blockRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      int int0 = 1620;
      int int1 = 2;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int1);
      assertNotNull(openMapRealMatrix0);
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(2, openMapRealMatrix0.getColumnDimension());
      assertEquals(1620, openMapRealMatrix0.getRowDimension());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      Covariance covariance0 = new Covariance((RealMatrix) openMapRealMatrix0);
      assertNotNull(covariance0);
      assertEquals(1620, covariance0.getN());
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(2, openMapRealMatrix0.getColumnDimension());
      assertEquals(1620, openMapRealMatrix0.getRowDimension());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation(covariance0);
      assertNotNull(pearsonsCorrelation0);
      assertEquals(1620, covariance0.getN());
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(2, openMapRealMatrix0.getColumnDimension());
      assertEquals(1620, openMapRealMatrix0.getRowDimension());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      double double0 = 2057.578142778;
      Double double1 = new Double(double0);
      assertTrue(double1.equals((Object)double0));
      assertEquals(2057.578142778, (double)double1, 0.01D);
      
      doubleArray0[0] = double1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[0];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      assertNotNull(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01D);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(4, openMapRealVector0.getDimension());
      
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      assertNotNull(arrayRealVector0);
      assertEquals(2057.578142778, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(4, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(4115.156285556, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(8230.312571112, arrayRealVector0.getL1Norm(), 0.01D);
      
      OpenMapRealMatrix openMapRealMatrix0 = (OpenMapRealMatrix)openMapRealVector0.outerProduct((RealVector) arrayRealVector0);
      assertNotNull(openMapRealMatrix0);
      assertEquals(4, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(4, openMapRealMatrix0.getRowDimension());
      assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01D);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(4, openMapRealVector0.getDimension());
      assertEquals(2057.578142778, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(4, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(4115.156285556, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(8230.312571112, arrayRealVector0.getL1Norm(), 0.01D);
      
      int int0 = 0;
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation((RealMatrix) openMapRealMatrix0, int0);
      assertNotNull(pearsonsCorrelation0);
      assertEquals(4, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(4, openMapRealMatrix0.getRowDimension());
      assertEquals(1.0, openMapRealVector0.getSparcity(), 0.01D);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01D);
      assertEquals(4, openMapRealVector0.getDimension());
      assertEquals(2057.578142778, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(4, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(4115.156285556, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(8230.312571112, arrayRealVector0.getL1Norm(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      double[][] doubleArray0 = new double[10][7];
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0);
      assertNotNull(blockRealMatrix0);
      assertEquals(7, blockRealMatrix0.getRowDimension());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(7, blockRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PearsonsCorrelation pearsonsCorrelation0 = new PearsonsCorrelation();
      assertNotNull(pearsonsCorrelation0);
      
      RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
      assertNull(realMatrix0);
  }
}
