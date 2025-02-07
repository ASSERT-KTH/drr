/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 23:46:26 GMT 2017
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class EigenDecompositionImpl_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2340.6500177);
      doubleArray0[2] = 1116.1943;
      doubleArray0[3] = 805.8061685561252;
      doubleArray0[4] = 0.25;
      doubleArray0[5] = 1060.361;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[1] = (-2340.6500177);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      eigenDecompositionImpl0.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-806.94);
      doubleArray0[1] = (-806.94);
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
      eigenDecompositionImpl0.getVT();
      assertEquals(651152.1636000001, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, (-1495.53));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 1116.1943;
      doubleArray0[3] = 805.8061685561252;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[4] = 805.8061685561252;
      doubleArray1[6] = 1116.1943;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
      assertEquals(805.8061685561252, double0, 0.01);
      assertEquals((-7.128095854546883E23), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[2] = (-240.478783023);
      doubleArray1[4] = 805.8061685561252;
      doubleArray1[6] = 989.762929;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
      assertEquals(3.603623748217655E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals((-240.478783023), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getImagEigenvalue(4);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      ArrayRealVector arrayRealVector0 = (ArrayRealVector)eigenDecompositionImpl0.getEigenvector(0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
      assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-806.94);
      doubleArray0[1] = (-806.94);
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(651152.1636000001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-806.94);
      doubleArray0[1] = 12.566370614359172;
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals((-10140.307103550991), double0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getRealEigenvalue((-694));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -694
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  //@Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((double[]) null, doubleArray0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  //@Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      double[][] doubleArray2 = new double[1][3];
      array2DRowRealMatrix0.data = doubleArray2;
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 12.566370614359172);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no entry at indices (1, 0) in a 1x3 matrix
         //
         verifyException("org.apache.commons.math.linear.Array2DRowRealMatrix", e);
      }
  }

  //@Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl((RealMatrix) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getD();
      assertNotNull(array2DRowRealMatrix0);
      
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 12.566370614359172);
      eigenDecompositionImpl1.getV();
      assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, (-806.94));
      eigenDecompositionImpl1.getSolver();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-2340.6500177);
      doubleArray0[3] = 9.0;
      doubleArray0[2] = (-2340.6500177);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = 9.0;
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = 1116.1943;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 1116.1943;
      doubleArray0[3] = 805.8061685561252;
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = (-240.478783023);
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = 805.8061685561252;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-2340.6500177);
      doubleArray0[5] = (-2340.6500177);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = (-240.478783023);
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = (-2340.6500177);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 1116.1943;
      doubleArray0[5] = 1060.361;
      doubleArray0[6] = 989.762929;
      doubleArray0[7] = 3601.8986751110615;
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = 0.5;
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = 805.8061685561252;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[4] = 0.25;
      doubleArray0[5] = 1060.361;
      doubleArray0[6] = 989.762929;
      doubleArray0[7] = 3601.8986751110615;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = 0.5;
      doubleArray1[3] = (-2340.6500177);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals(2.3149667550111456E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[4] = 1116.1943;
      double[] doubleArray1 = new double[7];
      doubleArray1[4] = 805.8061685561252;
      doubleArray1[5] = 2604766.5680704177;
      doubleArray1[6] = 2604766.5680704177;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-2340.6500177);
      doubleArray0[3] = 805.8061685561252;
      doubleArray0[2] = (-2340.6500177);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = 9.0;
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = 805.8061685561252;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2340.6500177);
      doubleArray0[2] = 1116.1943;
      doubleArray0[5] = 1060.361;
      doubleArray0[6] = 989.762929;
      doubleArray0[7] = 3601.5376077394944;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = (-240.478783023);
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = 805.8061685561252;
      doubleArray1[6] = 1116.1943;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals((-1.580968014927721E26), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = 805.8061685561252;
      doubleArray0[6] = 989.762929;
      doubleArray0[7] = 3601.5376077394944;
      double[] doubleArray1 = new double[7];
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = 805.8061685561252;
      doubleArray1[5] = 989.762929;
      doubleArray1[6] = 1116.1943;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-2340.6500177);
      doubleArray0[7] = 10775.679804615913;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-2340.6500177);
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = (-240.478783023);
      doubleArray1[3] = 989.762929;
      doubleArray1[4] = 805.8061685561252;
      doubleArray1[5] = 805.8061685561252;
      doubleArray1[6] = 1116.1943;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals((-3.174545340053143E29), eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[4] = 805.8061685561252;
      doubleArray1[5] = 1.1102230246251565E-16;
      doubleArray1[6] = 1116.1943;
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[4] = 0.25;
      doubleArray0[5] = (-2340.6500177);
      doubleArray0[6] = Double.NEGATIVE_INFINITY;
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = (-2340.6500177);
      doubleArray0[5] = (-2340.6500177);
      doubleArray0[6] = (-2340.6500177);
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = (-2340.6500177);
      doubleArray1[2] = (-240.478783023);
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = (-2340.6500177);
      doubleArray1[5] = (-11.948660333569418);
      doubleArray1[6] = (-2340.6500177);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2340.6500177);
      doubleArray0[1] = (-2340.6500177);
      doubleArray0[2] = 1116.1943;
      doubleArray0[3] = 805.8061685561252;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 989.762929;
      doubleArray1[3] = (-2340.6500177);
      EigenDecompositionImpl eigenDecompositionImpl0 = null;
      try {
        eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      doubleArray1[2] = (-240.478783023);
      doubleArray1[3] = (-2340.6500177);
      doubleArray1[4] = (-2340.6500177);
      doubleArray1[5] = (-11.948660333569418);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      eigenDecompositionImpl0.getSolver();
      DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
      assertFalse(decompositionSolver0.isNonSingular());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      double double0 = eigenDecompositionImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  //@Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getEigenvector(2935);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2935
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  //@Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
      eigenDecompositionImpl0.getVT();
      try { 
        eigenDecompositionImpl0.getEigenvector(16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      eigenDecompositionImpl0.getSolver();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getVT();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getD();
      eigenDecompositionImpl0.getD();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
      eigenDecompositionImpl0.getVT();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
      eigenDecompositionImpl0.getV();
      eigenDecompositionImpl0.getV();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2340.6500177);
      doubleArray0[1] = 9.0;
      doubleArray0[2] = 1116.1943;
      doubleArray0[5] = 1060.361;
      doubleArray0[6] = 989.762929;
      double[] doubleArray1 = new double[7];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
      Array2DRowRealMatrix array2DRowRealMatrix0 = (Array2DRowRealMatrix)eigenDecompositionImpl0.getVT();
      EigenDecompositionImpl eigenDecompositionImpl1 = null;
      try {
        eigenDecompositionImpl1 = new EigenDecompositionImpl((RealMatrix) array2DRowRealMatrix0, 0.5);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // eigen decomposition of assymetric matrices not supported yet
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
      double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
      eigenDecompositionImpl0.getRealEigenvalue(1);
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }

  //@Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      try { 
        eigenDecompositionImpl0.getImagEigenvalue((-1683));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1683
         //
         verifyException("org.apache.commons.math.linear.EigenDecompositionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[1];
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
      eigenDecompositionImpl0.getImagEigenvalues();
      assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
  }
}
