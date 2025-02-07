/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:37:47 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.MatrixIndexException;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.SingularValueDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class SingularValueDecompositionImplEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 11;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) int0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {11.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0, int0);
      assertArrayEquals(new double[] {11.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(5, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(11.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertNotNull(singularValueDecompositionImpl0);
      
      double double0 = 3131.543573449919;
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = singularValueDecompositionImpl0.getCovariance(double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cutoff singular value is 3,131.544, should be at most 11
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-2423.388254494408);
      doubleArray0[0] = double0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(2423.388254494408, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(double0);
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(2423.388254494408, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      
      Array2DRowRealMatrix array2DRowRealMatrix2 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getVT();
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(2423.388254494408, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, array2DRowRealMatrix2.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix2.getRowDimension());
      assertEquals(true, array2DRowRealMatrix2.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix2);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotNull(array2DRowRealMatrix2);
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix2));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = 3143.080145;
      doubleArray0[0] = double0;
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
      assertEquals(9, realMatrixImpl0.getColumnDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertNotNull(realMatrixImpl0);
      
      int int0 = 9;
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl0, int0);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(6286.16029, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(9, realMatrixImpl0.getColumnDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(6286.16029, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(9, realMatrixImpl0.getColumnDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertNotNull(decompositionSolver0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = (-1.6801108416205959);
      doubleArray0[1] = double0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-1.6801108416205959), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertNotNull(realMatrixImpl0);
      
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.transpose();
      assertArrayEquals(new double[] {0.0, (-1.6801108416205959), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl1.isSquare());
      assertEquals(1, realMatrixImpl1.getRowDimension());
      assertEquals(9, realMatrixImpl1.getColumnDimension());
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertNotSame(realMatrixImpl1, realMatrixImpl0);
      assertNotSame(realMatrixImpl0, realMatrixImpl1);
      assertNotNull(realMatrixImpl1);
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl1);
      assertArrayEquals(new double[] {0.0, (-1.6801108416205959), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl1.isSquare());
      assertEquals(1, realMatrixImpl1.getRowDimension());
      assertEquals(9, realMatrixImpl1.getColumnDimension());
      assertEquals(1.6801108416205959, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertNotSame(realMatrixImpl1, realMatrixImpl0);
      assertNotSame(realMatrixImpl0, realMatrixImpl1);
      assertNotNull(singularValueDecompositionImpl0);
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertArrayEquals(new double[] {0.0, (-1.6801108416205959), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(false, realMatrixImpl1.isSquare());
      assertEquals(1, realMatrixImpl1.getRowDimension());
      assertEquals(9, realMatrixImpl1.getColumnDimension());
      assertEquals(1.6801108416205959, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertNotSame(realMatrixImpl1, realMatrixImpl0);
      assertNotSame(realMatrixImpl0, realMatrixImpl1);
      assertNotNull(decompositionSolver0);
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-2423.388254494408);
      doubleArray0[0] = double0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(2423.388254494408, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(double0);
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(2423.388254494408, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertArrayEquals(new double[] {(-2423.388254494408)}, doubleArray0, 0.01);
      assertEquals(true, decompositionSolver0.isNonSingular());
      assertEquals(2423.388254494408, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotNull(decompositionSolver0);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[0] = double0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getS();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertNotNull(array2DRowRealMatrix1);
      assertTrue(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertTrue(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      
      Array2DRowRealMatrix array2DRowRealMatrix2 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getS();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix2.getRowDimension());
      assertEquals(1, array2DRowRealMatrix2.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix2.isSquare());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix0);
      assertSame(array2DRowRealMatrix2, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix2);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotNull(array2DRowRealMatrix2);
      assertTrue(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix0));
      assertTrue(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix2));
      assertTrue(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[0] = double0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertNotNull(singularValueDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertNotNull(decompositionSolver0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getUT();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 2149;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(2149, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(2149, openMapRealMatrix0.getRowDimension());
      assertNotNull(openMapRealMatrix0);
      
      OpenMapRealMatrix openMapRealMatrix1 = (OpenMapRealMatrix)openMapRealMatrix0.scalarAdd((double) int0);
      assertEquals(2149, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(2149, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(2149, openMapRealMatrix1.getRowDimension());
      assertEquals(2149, openMapRealMatrix1.getColumnDimension());
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotNull(openMapRealMatrix1);
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) openMapRealMatrix1, int0);
      assertEquals(2149, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(2149, openMapRealMatrix0.getRowDimension());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(4618201.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(2149, openMapRealMatrix1.getRowDimension());
      assertEquals(2149, openMapRealMatrix1.getColumnDimension());
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotNull(singularValueDecompositionImpl0);
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertEquals(2149, openMapRealMatrix0.getColumnDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(2149, openMapRealMatrix0.getRowDimension());
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(4618201.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(true, openMapRealMatrix1.isSquare());
      assertEquals(2149, openMapRealMatrix1.getRowDimension());
      assertEquals(2149, openMapRealMatrix1.getColumnDimension());
      assertNotSame(openMapRealMatrix0, openMapRealMatrix1);
      assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
      assertNotNull(decompositionSolver0);
      assertFalse(openMapRealMatrix0.equals((Object)openMapRealMatrix1));
      assertFalse(openMapRealMatrix1.equals((Object)openMapRealMatrix0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertNotNull(realMatrixImpl0);
      
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.transpose();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl1.getRowDimension());
      assertEquals(false, realMatrixImpl1.isSquare());
      assertEquals(9, realMatrixImpl1.getColumnDimension());
      assertNotSame(realMatrixImpl0, realMatrixImpl1);
      assertNotSame(realMatrixImpl1, realMatrixImpl0);
      assertNotNull(realMatrixImpl1);
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(1, realMatrixImpl0.getColumnDimension());
      assertEquals(9, realMatrixImpl0.getRowDimension());
      assertEquals(1, realMatrixImpl1.getRowDimension());
      assertEquals(false, realMatrixImpl1.isSquare());
      assertEquals(9, realMatrixImpl1.getColumnDimension());
      assertNotSame(realMatrixImpl0, realMatrixImpl1);
      assertNotSame(realMatrixImpl1, realMatrixImpl0);
      assertNotNull(singularValueDecompositionImpl0);
      assertFalse(realMatrixImpl0.equals((Object)realMatrixImpl1));
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
      
      // Undeclared exception!
      try {
        DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // column index -1 out of allowed range [0, 0]
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[0] = double0;
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(decompositionSolver0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getU();
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray0, 0.01);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(Double.POSITIVE_INFINITY, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotNull(array2DRowRealMatrix1);
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[4][6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(6, realMatrixImpl0.getColumnDimension());
      assertNotNull(realMatrixImpl0);
      
      int int0 = 9;
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) realMatrixImpl0, int0);
      assertEquals(4, realMatrixImpl0.getRowDimension());
      assertEquals(false, realMatrixImpl0.isSquare());
      assertEquals(6, realMatrixImpl0.getColumnDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      // Undeclared exception!
      try {
        double double0 = singularValueDecompositionImpl0.getConditionNumber();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      double[] doubleArray1 = singularValueDecompositionImpl0.getSingularValues();
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      // Undeclared exception!
      try {
        double double0 = singularValueDecompositionImpl0.getNorm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }
}
