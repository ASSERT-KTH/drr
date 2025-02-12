/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 19:50:42 GMT 2019
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.util.MathArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class MathArrays_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      try { 
        MathArrays.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertEquals(3, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[23];
      int[] intArray1 = MathArrays.copyOf(intArray0);
      assertNotSame(intArray1, intArray0);
      assertEquals(23, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[0][9];
      MathArrays.sortInPlace(doubleArray0, doubleArray1);
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[6][5];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.scale(459.8596688581, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MathArrays.scaleInPlace(Double.NaN, doubleArray0);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.ebeAdd(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[3];
      try { 
        MathArrays.ebeAdd(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 3
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[5];
      try { 
        MathArrays.ebeSubtract(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 5
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.ebeSubtract(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = MathArrays.ebeMultiply(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[4];
      try { 
        MathArrays.ebeMultiply(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 4
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[3];
      try { 
        MathArrays.ebeDivide(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = MathArrays.distance1(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[14];
      int int0 = MathArrays.distance1(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[10];
      double double0 = MathArrays.distance(intArray0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = MathArrays.distanceInf(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[24];
      int int0 = MathArrays.distanceInf(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double[] doubleArray0 = new Double[6];
      Double double0 = new Double(4263.922226375641);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "#Qu,G@]";
      stringArray0[1] = "org.apache.commons.math3.util.MathArrays$OrderDirection";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      // Undeclared exception!
      try { 
        MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Integer[] integerArray0 = new Integer[7];
      integerArray0[0] = (Integer) 0;
      integerArray0[1] = (Integer) 0;
      integerArray0[2] = (Integer) 0;
      integerArray0[3] = (Integer) 0;
      integerArray0[4] = (Integer) 0;
      integerArray0[5] = (Integer) 0;
      integerArray0[6] = (Integer) (-407);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer[] integerArray0 = new Integer[7];
      integerArray0[0] = (Integer) 0;
      integerArray0[1] = (Integer) 0;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      // Undeclared exception!
      try { 
        MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "wlm";
      stringArray0[1] = "";
      stringArray0[2] = "";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "Kb4zfJq2^xknS";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 309;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly increasing (309 >= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-2806.324437209839);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not strictly decreasing (0 <= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 879.73691;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1.0);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long[][] longArray0 = new long[6][5];
      MathArrays.checkRectangular(longArray0);
      assertEquals(6, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long[][] longArray0 = new long[6][5];
      long[] longArray1 = new long[4];
      longArray0[2] = longArray1;
      try { 
        MathArrays.checkRectangular(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 4 while others have length 5
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 3.834E-20;
      doubleArray0[1] = 800.063135894741;
      MathArrays.checkPositive(doubleArray0);
      assertArrayEquals(new double[] {3.834E-20, 800.063135894741}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      try { 
        MathArrays.checkPositive(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long[] longArray0 = new long[2];
      MathArrays.checkNonNegative(longArray0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[2] = (-1115L);
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,115 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long[][] longArray0 = new long[15][6];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(15, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[][] longArray0 = new long[3][6];
      long[] longArray1 = new long[8];
      longArray1[4] = (-114L);
      longArray0[1] = longArray1;
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -114 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 3.834E-20;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(3.834E-20, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[3] = 1.7976931348623157E308;
      doubleArray0[5] = 1.7976931348623157E308;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 5.669184079525E-24;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(5.669184079525E-24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = Double.NaN;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray0 = new double[6][1];
      try { 
        MathArrays.sortInPlace((double[]) null, mathArrays_OrderDirection0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray1 = new double[6][2];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = null;
      try { 
        MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[2][6];
      try { 
        MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 8
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[7];
      try { 
        MathArrays.linearCombination(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 9
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[4] = Double.NaN;
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double double0 = MathArrays.linearCombination((-324.0), 0.0, 1586.5303875475, 1214.60458036455);
      assertEquals(1927007.075602738, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double double0 = MathArrays.linearCombination(Double.NaN, 1.0, Double.NaN, 459.8596688581);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double double0 = MathArrays.linearCombination(5995.46382, (double) 0, 5995.46382, 1.304E19, (double) 0, (double) 0);
      assertEquals(7.81808482128E22, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, (-444.6707), Double.NaN, 1.0, 0.0, (-1186.1));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double double0 = MathArrays.linearCombination(970.2165282403, 970.2165282403, (-53.018749), (-53.018749), 1724.423834002705, 1724.423834002705, 311.9615726, 311.9615726);
      assertEquals(4015088.6814718395, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      double double0 = MathArrays.linearCombination(Double.NaN, Double.NaN, 2557.1423057067486, 2557.1423057067486, Double.NaN, 1.8014398509481984E16, (-1257.528542), (-632.3742657549561));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      float[] floatArray0 = new float[0];
      boolean boolean0 = MathArrays.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      float[] floatArray0 = new float[6];
      boolean boolean0 = MathArrays.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[7];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float[] floatArray1 = new float[5];
      floatArray1[1] = (-71.25664F);
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      float[] floatArray0 = new float[4];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      float[] floatArray0 = new float[0];
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float[] floatArray1 = new float[0];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      float[] floatArray0 = new float[6];
      floatArray0[0] = 632.891F;
      float[] floatArray1 = new float[6];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray1, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathArrays.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      boolean boolean0 = MathArrays.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[2];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = Double.NaN;
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[2];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = MathArrays.ebeDivide(doubleArray0, doubleArray0);
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      try { 
        MathArrays.normalizeArray((double[]) null, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to an infinite value
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      double[][] doubleArray0 = new double[6][4];
      try { 
        MathArrays.normalizeArray(doubleArray0[5], Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to NaN
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = Double.POSITIVE_INFINITY;
      try { 
        MathArrays.normalizeArray(doubleArray0, (-789.3166612816));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array contains an infinite element, \u221E at index 6
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = Double.NaN;
      try { 
        MathArrays.normalizeArray(doubleArray0, (-394.2152678554));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1336.7952123149457;
      doubleArray0[1] = Double.NaN;
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, (-394.2152678554));
      assertArrayEquals(new double[] {(-394.21526785539993), Double.NaN, -0.0, -0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Class<FieldElement> class0 = FieldElement.class;
      Field<Object> field0 = (Field<Object>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(field0).getZero();
      Object[][] objectArray0 = MathArrays.buildArray(field0, 605, 605);
      assertEquals(605, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathArrays.buildArray((Field<Integer>) null, 175, (-535));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = MathArrays.scale(648.43, doubleArray0);
      double[] doubleArray2 = MathArrays.ebeSubtract(doubleArray1, doubleArray1);
      double[] doubleArray3 = new double[0];
      try { 
        MathArrays.convolve(doubleArray2, doubleArray3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = MathArrays.convolve(doubleArray0, doubleArray0);
      assertEquals(17, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[0];
      try { 
        MathArrays.convolve(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
