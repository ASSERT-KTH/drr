/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:27:23 GMT 2014
 */

package org.apache.commons.math3.util;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.MathArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class MathArraysEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.convolve(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = 2057.18657049;
      doubleArray0[0] = double0;
      double double1 = Double.NaN;
      doubleArray0[2] = double1;
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, doubleArray0[0]);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {2057.18657049, 0.0, Double.NaN, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {2057.18657049, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      try {
        double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, doubleArray0[2]);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
      
      try {
        double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, double0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[8];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[1];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray1);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = (-1.0F);
      floatArray0[0] = float0;
      float[] floatArray1 = new float[4];
      assertNotSame(floatArray1, floatArray0);
      assertFalse(floatArray1.equals((Object)floatArray0));
      
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertNotSame(floatArray1, floatArray0);
      assertNotSame(floatArray0, floatArray1);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F}, floatArray1, 0.01F);
      assertArrayEquals(new float[] {(-1.0F), 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertFalse(floatArray1.equals((Object)floatArray0));
      assertFalse(floatArray0.equals((Object)floatArray1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[4];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float float0 = Float.NaN;
      floatArray0[5] = float0;
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      float[] floatArray0 = new float[10];
      float[] floatArray1 = new float[4];
      assertNotSame(floatArray1, floatArray0);
      assertFalse(floatArray1.equals((Object)floatArray0));
      
      boolean boolean0 = MathArrays.equals(floatArray1, floatArray0);
      assertNotSame(floatArray0, floatArray1);
      assertNotSame(floatArray1, floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F}, floatArray1, 0.01F);
      assertFalse(floatArray0.equals((Object)floatArray1));
      assertFalse(floatArray1.equals((Object)floatArray0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      float[] floatArray0 = new float[4];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      float[] floatArray0 = new float[4];
      float float0 = (-1.0F);
      double double0 = Double.NaN;
      double double1 = MathArrays.linearCombination((double) floatArray0[2], (double) float0, doubleArray0[0], (double) floatArray0[2], (double) floatArray0[0], double0, (double) floatArray0[0], doubleArray0[0]);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = (-825.3898057011756);
      double double1 = MathArrays.linearCombination(double0, doubleArray0[0], double0, double0, doubleArray0[0], doubleArray0[0], double0, double0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(1362536.662710849, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = 0.0;
      long[] longArray0 = new long[3];
      long long0 = 2073L;
      double double1 = MathArrays.linearCombination(double0, (double) longArray0[1], double0, (double) longArray0[2], (double) long0, double0);
      assertArrayEquals(new long[] {0L, 0L, 0L}, longArray0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = 21.16032140613129;
      double double1 = MathArrays.linearCombination(doubleArray0[3], doubleArray0[0], doubleArray0[1], double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      doubleArray0[1] = double0;
      double double1 = MathArrays.safeNorm(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, Double.NaN, Double.NaN, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = (-18L);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (double) long0;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, (-18.0), 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(18.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = (-579);
      long[][] longArray0 = new long[12][3];
      long[] longArray1 = new long[8];
      longArray1[0] = (long) int0;
      longArray0[0] = longArray1;
      assertNotNull(longArray0[0]);
      
      try {
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -579 is smaller than the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[][] longArray0 = new long[1][4];
      MathArrays.checkNonNegative(longArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      long[] longArray0 = new long[8];
      long long0 = (-951L);
      longArray0[0] = long0;
      try {
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -951 is smaller than the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long[] longArray0 = new long[1];
      MathArrays.checkNonNegative(longArray0);
      assertArrayEquals(new long[] {0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      try {
        MathArrays.checkPositive(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = (-1362.072);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      double[] doubleArray1 = MathArrays.ebeMultiply(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {1855240.1331839997, 1855240.1331839997}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {(-1362.072), (-1362.072)}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      
      MathArrays.checkPositive(doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {1855240.1331839997, 1855240.1331839997}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {(-1362.072), (-1362.072)}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      long[][] longArray0 = new long[7][8];
      long[] longArray1 = new long[3];
      longArray0[0] = longArray1;
      assertNotNull(longArray0[0]);
      
      try {
        MathArrays.checkRectangular(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 8 while others have length 3
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      long[][] longArray0 = new long[12][3];
      MathArrays.checkRectangular(longArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = (-2158.0);
      Integer[] integerArray0 = new Integer[4];
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      int int1 = 130;
      Integer integer1 = new Integer(int1);
      assertNotSame(integer1, integer0);
      assertFalse(int1 == int0);
      assertTrue(integer1.equals((Object)int1));
      assertFalse(integer1.equals((Object)int0));
      assertFalse(integer1.equals((Object)integer0));
      assertEquals(130, (int)integer1);
      
      integerArray0[2] = integer1;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = false;
      boolean boolean1 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, boolean0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean1);
      
      doubleArray0[0] = double0;
      boolean boolean2 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, boolean1);
      assertArrayEquals(new double[] {(-2158.0), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean1 == boolean2);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean0 == boolean2);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = 0.0;
      doubleArray0[1] = double0;
      double double1 = (-1.0);
      doubleArray0[1] = double1;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = true;
      boolean boolean1 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, boolean0);
      assertArrayEquals(new double[] {0.0, (-1.0), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[10];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      double double0 = 5536.1869650705;
      doubleArray1[0] = double0;
      doubleArray0[1] = doubleArray1[0];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = false;
      try {
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not increasing (5,536.187 > 0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[9];
      int int0 = (-2086);
      intArray0[3] = int0;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) intArray0[3];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = true;
      try {
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, boolean0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly increasing (0 >= 0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      try {
        MathArrays.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not strictly increasing (0 >= 0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = false;
      MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = 810;
      intArray0[3] = int0;
      Integer[] integerArray0 = new Integer[6];
      integerArray0[0] = (Integer) intArray0[3];
      integerArray0[1] = (Integer) intArray0[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = true;
      // Undeclared exception!
      try {
        boolean boolean1 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int[] intArray0 = new int[7];
      Integer[] integerArray0 = new Integer[6];
      integerArray0[0] = (Integer) intArray0[3];
      integerArray0[1] = (Integer) intArray0[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = true;
      boolean boolean1 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, boolean0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = "*\\8P`YL_F^[e8sS";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      String string1 = "vz2f]-!S9w";
      assertNotSame(string1, string0);
      
      stringArray0[1] = string1;
      assertNotNull(stringArray0[1]);
      
      stringArray0[2] = stringArray0[0];
      assertNotNull(stringArray0[2]);
      
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = false;
      boolean boolean1 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, boolean0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[10];
      String string0 = "";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      String string1 = "org.apache.commons.math3.util.MathArrays";
      assertNotSame(string1, string0);
      
      stringArray0[1] = string1;
      assertNotNull(stringArray0[1]);
      
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = true;
      // Undeclared exception!
      try {
        boolean boolean1 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[10];
      String string0 = "";
      stringArray0[0] = string0;
      assertNotNull(stringArray0[0]);
      
      stringArray0[1] = string0;
      assertNotNull(stringArray0[1]);
      
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = true;
      boolean boolean1 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, boolean0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = 2663;
      Integer[] integerArray0 = new Integer[3];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = false;
      integerArray0[0] = (Integer) int0;
      integerArray0[1] = (Integer) int0;
      integerArray0[2] = (Integer) int0;
      boolean boolean1 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, boolean0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = MathArrays.distanceInf(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distanceInf(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[] intArray0 = new int[7];
      double double0 = MathArrays.distance(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distance(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = MathArrays.distance1(intArray0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distance1(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[6];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try {
        double[] doubleArray2 = MathArrays.ebeDivide(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 8
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = MathArrays.ebeDivide(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[9];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try {
        double[] doubleArray2 = MathArrays.ebeMultiply(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 9
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[8];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try {
        double[] doubleArray2 = MathArrays.ebeSubtract(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 4
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = MathArrays.ebeSubtract(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[2];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      try {
        double[] doubleArray2 = MathArrays.ebeAdd(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 2
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.ebeAdd(doubleArray0, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double double0 = 2213.0;
      double[] doubleArray0 = new double[1];
      MathArrays.scaleInPlace(double0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int[] intArray0 = new int[9];
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.scale((double) intArray0[2], doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[][] doubleArray1 = new double[10][7];
      try {
        MathArrays.sortInPlace(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 5
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int[] intArray0 = new int[9];
      int[] intArray1 = MathArrays.copyOf(intArray0);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray1);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotNull(doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Integer[] integerArray0 = new Integer[4];
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      integerArray0[0] = integer0;
      int int1 = (-3571);
      Integer integer1 = new Integer(int1);
      assertNotSame(integer1, integer0);
      assertFalse(integer1.equals((Object)int0));
      assertTrue(integer1.equals((Object)int1));
      assertFalse(integer1.equals((Object)integer0));
      assertFalse(int1 == int0);
      assertEquals((-3571), (int)integer1);
      
      integerArray0[1] = integer1;
      integerArray0[2] = integer0;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = false;
      boolean boolean1 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, boolean0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean1);
      
      boolean boolean2 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, boolean1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1 == boolean2);
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean0 == boolean2);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[6][10];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }
}
