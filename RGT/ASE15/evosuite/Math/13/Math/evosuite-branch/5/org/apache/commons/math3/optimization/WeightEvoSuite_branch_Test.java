/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:16:28 GMT 2014
 */

package org.apache.commons.math3.optimization;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.Weight;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class WeightEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 204;
      int int1 = 6;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int1);
      assertNotNull(openMapRealMatrix0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(6, openMapRealMatrix0.getColumnDimension());
      assertEquals(false, openMapRealMatrix0.isSquare());
      assertEquals(204, openMapRealMatrix0.getRowDimension());
      assertEquals(false, openMapRealMatrix0.isTransposable());
      
      Weight weight0 = null;
      try {
        weight0 = new Weight((RealMatrix) openMapRealMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // non square (6x204) matrix
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Weight weight0 = new Weight(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight0);
      
      DiagonalMatrix diagonalMatrix0 = (DiagonalMatrix)weight0.getWeight();
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(diagonalMatrix0);
      assertEquals(9, diagonalMatrix0.getRowDimension());
      assertEquals(9, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(false, diagonalMatrix0.isTransposable());
      
      Weight weight1 = new Weight((RealMatrix) diagonalMatrix0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(weight1);
      assertFalse(weight0.equals((Object)weight1));
      assertFalse(weight1.equals((Object)weight0));
      assertEquals(9, diagonalMatrix0.getRowDimension());
      assertEquals(9, diagonalMatrix0.getColumnDimension());
      assertEquals(true, diagonalMatrix0.isSquare());
      assertEquals(false, diagonalMatrix0.isTransposable());
      assertNotSame(weight0, weight1);
      assertNotSame(weight1, weight0);
  }
}
