/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:29:00 GMT 2014
 */

package org.apache.commons.math3.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RectangularCholeskyDecomposition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class RectangularCholeskyDecompositionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = 3.296104292035678E-8;
      double double1 = (-1554.02268);
      doubleArray0[1] = double1;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-1554.02268), 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(arrayRealVector0);
      assertEquals(1554.02268, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(1554.02268, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(4, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(1554.02268, arrayRealVector0.getNorm(), 0.01D);
      
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)arrayRealVector0.outerProduct((RealVector) arrayRealVector0);
      assertArrayEquals(new double[] {0.0, (-1554.02268), 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(4, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(4, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1554.02268, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(1554.02268, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(4, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(1554.02268, arrayRealVector0.getNorm(), 0.01D);
      
      RectangularCholeskyDecomposition rectangularCholeskyDecomposition0 = new RectangularCholeskyDecomposition((RealMatrix) array2DRowRealMatrix0, double0);
      assertArrayEquals(new double[] {0.0, (-1554.02268), 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(rectangularCholeskyDecomposition0);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(4, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(4, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1554.02268, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(1554.02268, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(4, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(1554.02268, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(2, rectangularCholeskyDecomposition0.getRank());
      assertFalse(double0 == double1);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)rectangularCholeskyDecomposition0.getRootMatrix();
      assertArrayEquals(new double[] {0.0, (-1554.02268), 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix1);
      assertEquals(true, array2DRowRealMatrix0.isSquare());
      assertEquals(false, array2DRowRealMatrix0.isTransposable());
      assertEquals(4, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(4, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1554.02268, arrayRealVector0.getL1Norm(), 0.01D);
      assertEquals(false, arrayRealVector0.isInfinite());
      assertEquals(1554.02268, arrayRealVector0.getLInfNorm(), 0.01D);
      assertEquals(4, arrayRealVector0.getDimension());
      assertEquals(false, arrayRealVector0.isNaN());
      assertEquals(1554.02268, arrayRealVector0.getNorm(), 0.01D);
      assertEquals(2, rectangularCholeskyDecomposition0.getRank());
      assertEquals(4, array2DRowRealMatrix1.getRowDimension());
      assertEquals(false, array2DRowRealMatrix1.isTransposable());
      assertEquals(2, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix1.isSquare());
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(double0 == double1);
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
  }
}
