/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 19:45:49 GMT 2019
 */

package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;


public class MathArrays_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0, 233);
      try { 
        MathArrays.ebeSubtract(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 233 != 1
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertEquals(0, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = MathArrays.copyOf(intArray0);
      assertNotSame(intArray1, intArray0);
      assertEquals(5, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[3][1];
      try { 
        MathArrays.sortInPlace(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[][] doubleArray1 = new double[3][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      MathArrays.sortInPlace(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray1 = new double[8][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      doubleArray1[7] = doubleArray0;
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertEquals(8, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[8][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      doubleArray1[7] = doubleArray0;
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertEquals(8, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.ebeAdd(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      try { 
        MathArrays.ebeAdd(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = MathArrays.ebeSubtract(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = MathArrays.ebeMultiply(doubleArray0, doubleArray0);
      assertNotSame(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[9];
      try { 
        MathArrays.ebeMultiply(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 8
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.ebeDivide(doubleArray0, doubleArray0);
      boolean boolean0 = MathArrays.equals(doubleArray1, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[4];
      try { 
        MathArrays.ebeDivide(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distance1(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = MathArrays.distance1(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = MathArrays.distance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      double double0 = MathArrays.distance(intArray0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[20];
      double double0 = MathArrays.distanceInf(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = MathArrays.distanceInf(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "D$={%rE";
      stringArray0[1] = "]9*c5cAwJ~KG7'3k;kq";
      stringArray0[2] = "";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer[] integerArray0 = new Integer[3];
      Integer integer0 = new Integer(1933);
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      Integer integer1 = new Integer((-239));
      integerArray0[2] = integer1;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = new Integer((-1615));
      integerArray0[0] = integer0;
      integerArray0[1] = integerArray0[0];
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
  public void test24()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      doubleArray0[0] = (Double) 3.32;
      doubleArray0[1] = (Double) 3.32;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "FAILED_FRACTION_CONVERSION";
      stringArray0[1] = "3V6P?;Z\frs~A9#u9";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = new Integer((-1615));
      integerArray0[0] = integer0;
      Integer integer1 = Integer.valueOf(213);
      integerArray0[1] = integer1;
      boolean boolean0 = MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[] doubleArray0 = new double[5];
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-2044.28356);
      try { 
        MathArrays.checkOrder(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly increasing (0 >= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 0.5F;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not increasing (0.5 > 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-3321.0595464);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not strictly decreasing (-3,321.06 <= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-224.59879593976);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 1 and 2 are not decreasing (-224.599 < 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 363.3137841344062;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[][] longArray0 = new long[6][4];
      MathArrays.checkRectangular(longArray0);
      assertEquals(6, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long[][] longArray0 = new long[6][9];
      long[] longArray1 = new long[1];
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkRectangular(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 9 while others have length 1
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-841.199596);
      MathArrays.scaleInPlace((-841.199596), doubleArray0);
      MathArrays.checkPositive(doubleArray0);
      assertArrayEquals(new double[] {707616.7603105633}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[4];
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
  public void test37()  throws Throwable  {
      long[] longArray0 = new long[3];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(3, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[2] = (-1014L);
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,014 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long[][] longArray0 = new long[2][1];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(2, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long[][] longArray0 = new long[7][5];
      long[] longArray1 = new long[1];
      longArray1[0] = (-941L);
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -941 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 6.52E18;
      doubleArray0[2] = 6.52E18;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(9.2206724266725806E18, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-583.58F);
      doubleArray0[2] = (double) (-583.58F);
      doubleArray0[3] = (double) 3.4028235E38F;
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, 3446.0);
      double double0 = MathArrays.safeNorm(doubleArray1);
      assertEquals(3446.0, double0, 0.01);
      assertArrayEquals(new double[] {(-5.909847392194697E-33), 0.0, (-5.909847392194697E-33), 3446.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = Double.NaN;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray0 = new double[7][8];
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
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray1 = new double[2][8];
      doubleArray1[0] = null;
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
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[4];
      try { 
        MathArrays.linearCombination(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 4
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[6] = Double.NEGATIVE_INFINITY;
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, (-571.8133), 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double double0 = MathArrays.linearCombination(1.0, Double.NaN, 1.34217729E8, 1.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 219.0, 1.34217729E8, (-1.0), 0.0, (-1370.458698));
      assertEquals((-1.34217729E8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 0.0, Double.POSITIVE_INFINITY, 0.0, 1.34217729E8, 2900.891786);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double double0 = MathArrays.linearCombination(158.34521770769274, 158.34521770769274, 158.34521770769274, 158.34521770769274, 158.34521770769274, 158.34521770769274, 158.34521770769274, 158.34521770769274);
      assertEquals(100292.83188358645, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double double0 = MathArrays.linearCombination(1.0, 1041.87292, 1.0, 1.0, Double.NaN, 158.605, 158.605, (-1607.93));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      float[] floatArray0 = new float[4];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = MathArrays.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      float[] floatArray0 = new float[9];
      boolean boolean0 = MathArrays.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float[] floatArray1 = new float[0];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[0] = Float.NaN;
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      float[] floatArray0 = new float[7];
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      float[] floatArray0 = new float[7];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      float[] floatArray0 = new float[8];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float[] floatArray1 = new float[4];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray1, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = 116.5F;
      float[] floatArray1 = new float[5];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathArrays.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathArrays.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[3];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0, 3392);
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
      assertFalse(boolean0);
      assertEquals(3392, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 451.575192;
      double[] doubleArray1 = MathArrays.scale(451.575192, doubleArray0);
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {203920.15402983688, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      try { 
        MathArrays.normalizeArray(doubleArray0, Double.NEGATIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to an infinite value
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      try { 
        MathArrays.normalizeArray(doubleArray0, Double.NaN);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to NaN
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = Double.POSITIVE_INFINITY;
      try { 
        MathArrays.normalizeArray(doubleArray0, 1249.33287632);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array contains an infinite element, \u221E at index 4
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[5] = Double.NaN;
      try { 
        MathArrays.normalizeArray(doubleArray0, (-910.316));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 6.283185307179586;
      doubleArray0[5] = Double.NaN;
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, (-910.316));
      assertArrayEquals(new double[] {(-910.316), -0.0, -0.0, -0.0, -0.0, Double.NaN, -0.0, -0.0, -0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathArrays.buildArray((Field<Pair<String, Double>>) null, (-582), (-582));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Class<FieldElement> class0 = FieldElement.class;
      Field<Object> field0 = (Field<Object>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(field0).getZero();
      Object[][] objectArray0 = MathArrays.buildArray(field0, 5325, 3828);
      assertEquals(5325, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      try { 
        MathArrays.convolve(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      double[] doubleArray1 = MathArrays.convolve(doubleArray0, doubleArray0);
      assertEquals(29, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      double[] doubleArray0 = new double[1];
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
