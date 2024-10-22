/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 19:31:25 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class RealMatrixImpl_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-494.06116506263);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(494.06116506263, realMatrixImpl0.getNorm(), 0.01);
      
      double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
      
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals((-494.06116506263), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.copy();
      assertEquals(6, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      // Undeclared exception!
      try { 
        realMatrixImpl0.preMultiply((RealMatrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.inverse();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Matrix is singular.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      // Undeclared exception!
      try { 
        realMatrixImpl0.getPermutation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl((-3122), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1692, 1692);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(1291, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl((double[][]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[0][7];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(814, 814);
      double[][] doubleArray0 = new double[1][3];
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.add((RealMatrix) realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[10][1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.add((RealMatrix) realMatrixImpl0);
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      try { 
        realMatrixImpl0.add(realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(808, 808);
      try { 
        realMatrixImpl0.subtract((RealMatrix) realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.subtract((RealMatrix) realMatrixImpl0);
      assertEquals(6, realMatrix0.getRowDimension());
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[2][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      try { 
        realMatrixImpl0.subtract(realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.scalarAdd(1.0);
      boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
      assertEquals(6.0, realMatrixImpl1.getNorm(), 0.01);
      assertFalse(boolean0);
      assertEquals(1, realMatrixImpl1.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarMultiply(0.0);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.multiply((RealMatrix) realMatrixImpl0);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.multiply(realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrices are not multiplication compatible.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double double0 = realMatrixImpl0.getNorm();
      assertEquals(0.0, double0, 0.01);
      assertEquals(4, realMatrixImpl0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 1);
      try { 
        realMatrixImpl0.getSubMatrix((-5472), (-5981), (-5981), (-1707));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(0, 0, 0, 0);
      assertTrue(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(11, 11);
      try { 
        realMatrixImpl0.getSubMatrix(1, (-259), (-259), 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(1409, 1409, 1409, (-496));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, (-4), (-4));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, 0, (-1937));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, 31, 31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      int[] intArray0 = new int[5];
      realMatrixImpl0.getSubMatrix(intArray0, intArray0);
      assertEquals(3, realMatrixImpl0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      int[] intArray0 = new int[0];
      try { 
        realMatrixImpl0.getSubMatrix(intArray0, intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // selected row and column index arrays must be non-empty
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[4][9];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray1, (-1), (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[5][8];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 0, (-2337));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[0][8];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[6];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray1, 0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[1][3];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 1664, 1664);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[7][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray1, 788, 788);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.getRowMatrix(0);
      assertEquals(4, realMatrixImpl0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 1);
      try { 
        realMatrixImpl0.getRowMatrix((-1707));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getColumnMatrix(0);
      assertEquals(3, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 1);
      try { 
        realMatrixImpl0.getColumnMatrix((-2102));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.getRow(0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getRow(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.getColumn(0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(2, 2);
      try { 
        realMatrixImpl0.getColumn(2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.transpose();
      assertEquals(8, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getDeterminant();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-494.06116506263);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals((-494.06116506263), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getTrace();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(17, 17);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getTrace();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.operate(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.operate(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.preMultiply(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[3][0];
      realMatrixImpl0.data = doubleArray1;
      try { 
        realMatrixImpl0.preMultiply(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1692, 1692);
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // constant vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(2271, 2);
      try { 
        realMatrixImpl0.solve((RealMatrix) realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incorrect row dimension
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // coefficient matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[7];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
      boolean boolean0 = realMatrixImpl0.isSingular();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[9][5];
      double[] doubleArray1 = new double[9];
      doubleArray1[1] = 1122.4243017788374;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = 2709.8233241;
      doubleArray0[1] = doubleArray2;
      realMatrixImpl0.data = doubleArray0;
      try { 
        realMatrixImpl0.luDecompose();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is singular
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      String string0 = realMatrixImpl0.toString();
      assertEquals("RealMatrixImpl{}", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      String string0 = realMatrixImpl0.toString();
      assertEquals("RealMatrixImpl{{0.0},{0.0}}", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[3][0];
      realMatrixImpl0.data = doubleArray1;
      doubleArray1[0] = doubleArray0;
      // Undeclared exception!
      try { 
        realMatrixImpl0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      boolean boolean0 = realMatrixImpl0.equals("%b J$x'6I3Ni)Ah&4");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[9][8];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      doubleArray1[7] = doubleArray0;
      doubleArray1[8] = doubleArray0;
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[9][8];
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1[3]);
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
      assertFalse(boolean0);
      assertFalse(realMatrixImpl1.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray0);
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.hashCode();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[4][5];
      realMatrixImpl0.lu = doubleArray1;
      RealMatrix realMatrix0 = realMatrixImpl0.getLUMatrix();
      assertEquals(5, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.getLUMatrix();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is singular
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }
}
