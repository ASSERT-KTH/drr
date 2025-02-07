/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 19:56:00 GMT 2019
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
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.preMultiply((RealMatrix) realMatrixImpl0);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.inverse();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // coefficient matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 923.5236346621739;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(923.5236346621739, realMatrixImpl0.getNorm(), 0.01);
      
      double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      try { 
        realMatrixImpl0.getSubMatrix((-1), (-1), 0, (-1084));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
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
  public void test06()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(0, (-1362));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(601, 0);
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
      double[][] doubleArray0 = new double[0][2];
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
      double[][] doubleArray0 = new double[4][9];
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
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.copy();
      assertFalse(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[4][1];
      double[] doubleArray1 = new double[2];
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
  public void test13()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(523, 523);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(523, 515);
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
  public void test14()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 43);
      RealMatrix realMatrix0 = realMatrixImpl0.add((RealMatrix) realMatrixImpl0);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
      assertEquals(1, realMatrixImpl0.getRowDimension());
      assertEquals(43, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(0, 0, 0, 0);
      try { 
        realMatrix0.add((RealMatrix) realMatrixImpl0);
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
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[1][8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1, true);
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
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[7][9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
      RealMatrix realMatrix0 = realMatrixImpl0.subtract((RealMatrix) realMatrixImpl0);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      double[] doubleArray1 = new double[8];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray2 = new double[2][1];
      doubleArray2[0] = doubleArray1;
      doubleArray2[1] = doubleArray1;
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray2);
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
  public void test19()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 43);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarAdd((-897.7850258687943));
      assertEquals(43, realMatrix0.getColumnDimension());
      assertEquals(897.7850258687943, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarMultiply(3299.889);
      assertEquals(9, realMatrix0.getRowDimension());
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.multiply((RealMatrix) realMatrixImpl0);
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
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      double double0 = realMatrixImpl0.getNorm();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(4027, 0, 2254, (-1539));
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
      try { 
        realMatrixImpl0.getSubMatrix(1188, 1188, 1188, (-1711));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, (-2028), 1297);
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
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(0, 0, 2, (-1569));
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
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      try { 
        realMatrixImpl0.getSubMatrix(31, 31, 25, Integer.MAX_VALUE);
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
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(19, 11);
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
  public void test29()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, (-852), 7);
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
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1, 43);
      double[][] doubleArray0 = new double[6][3];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 1, (-970));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[0][1];
      // Undeclared exception!
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 2, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[][] doubleArray0 = new double[3][5];
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
  public void test33()  throws Throwable  {
      double[][] doubleArray0 = new double[2][4];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 0, 8);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[2][9];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 34, 56);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      double[][] doubleArray0 = new double[1][8];
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 1, 431);
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
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1726, 1726);
      RealMatrix realMatrix0 = realMatrixImpl0.getRowMatrix(0);
      assertEquals(1, realMatrix0.getRowDimension());
      assertTrue(realMatrixImpl0.isSquare());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getRowMatrix(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getColumnMatrix(0);
      assertEquals(5, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getColumnMatrix(11);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      double[] doubleArray1 = realMatrixImpl0.getRow(0);
      assertEquals(2, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getRow((-265));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.getColumn(0);
      assertEquals(8, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getColumn((-3989));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
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
  public void test47()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1507.2588;
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals(1507.2588, double0, 0.01);
      
      RealMatrix realMatrix0 = realMatrixImpl0.inverse();
      assertEquals(6.634560700524687E-4, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[5];
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
  public void test49()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1788, 1788);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getTrace();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      double[] doubleArray2 = realMatrixImpl0.operate(doubleArray1);
      assertArrayEquals(new double[] {0.0}, doubleArray2, 0.01);
      assertNotSame(doubleArray2, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(3347, 3347);
      double[] doubleArray0 = new double[32];
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
  public void test52()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      double[] doubleArray2 = realMatrixImpl0.preMultiply(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(523, 523);
      double[] doubleArray0 = new double[2];
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
  public void test54()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.solve(doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // constant vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = new double[3];
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
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
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[7][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 0.5;
      doubleArray1[4] = doubleArray2;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1, true);
      try { 
        realMatrixImpl0.solve((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Matrix is singular.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      int[] intArray0 = new int[5];
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(intArray0, intArray0);
      double double0 = realMatrix0.getDeterminant();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      String string0 = realMatrixImpl0.toString();
      assertEquals("RealMatrixImpl{}", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      String string0 = realMatrixImpl0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1507.2588;
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.inverse();
      boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
      assertEquals(6.634560700524687E-4, realMatrixImpl1.getNorm(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      Object object0 = new Object();
      boolean boolean0 = realMatrixImpl0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[][] doubleArray1 = new double[6][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = new double[8];
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray1);
      boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
      assertEquals(8, realMatrixImpl1.getRowDimension());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.transpose();
      boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.hashCode();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1507.2588;
      doubleArray0[0] = doubleArray1;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      realMatrixImpl0.getDeterminant();
      RealMatrix realMatrix0 = realMatrixImpl0.getLUMatrix();
      assertEquals(1, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
      try { 
        realMatrixImpl0.getLUMatrix();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // LU decomposition requires that the matrix be square.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }
}
