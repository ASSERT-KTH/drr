/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 19:21:21 GMT 2019
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
      double[] doubleArray0 = new double[1];
      MathArrays.checkOrder(doubleArray0);
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = MathArrays.copyOf(doubleArray0);
      assertEquals(6, doubleArray1.length);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = MathArrays.copyOf(intArray0);
      assertNotSame(intArray1, intArray0);
      assertEquals(8, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[][] doubleArray1 = new double[4][4];
      try { 
        MathArrays.sortInPlace(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 3
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray1 = new double[4][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
      assertEquals(4, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = MathArrays.scale((-2919.418346110722), doubleArray0);
      assertArrayEquals(new double[] {-0.0, -0.0, -0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MathArrays.scaleInPlace(0.0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = MathArrays.ebeAdd(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[0];
      double[] doubleArray2 = MathArrays.scale((-7072.471147503555), doubleArray1);
      try { 
        MathArrays.ebeAdd(doubleArray2, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 9
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[6];
      try { 
        MathArrays.ebeSubtract(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 6
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = MathArrays.ebeMultiply(doubleArray0, doubleArray0);
      try { 
        MathArrays.convolve(doubleArray1, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      try { 
        MathArrays.ebeMultiply(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 7
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = MathArrays.ebeMultiply(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = MathArrays.ebeDivide(doubleArray0, doubleArray0);
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double[] doubleArray1 = new double[5];
      try { 
        MathArrays.ebeDivide(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 5
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = MathArrays.distance1(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = MathArrays.distance1(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = MathArrays.distance(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[1];
      double double0 = MathArrays.distance(intArray0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = MathArrays.distanceInf(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = MathArrays.distanceInf(intArray0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double((-4011.0));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = ">xYw1cx9'3X76oi";
      stringArray0[1] = "gmk0}S$HOj";
      stringArray0[2] = " PY1=D*3ay26q?";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "?h";
      stringArray0[1] = "";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "%pt9I)_p=4";
      stringArray0[1] = "org.apache.commons.math3.util.MathArrays";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double(1.304E19);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Double[] doubleArray0 = new Double[3];
      Double double0 = new Double(1.304E19);
      doubleArray0[0] = double0;
      Double double1 = new Double(0.0);
      doubleArray0[1] = double1;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      // Undeclared exception!
      try { 
        MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "org.apache.commons.math3.util.MathArrays";
      stringArray0[1] = "";
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      // Undeclared exception!
      try { 
        MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
      assertEquals(3, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2497.517;
      double[][] doubleArray1 = new double[4][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      MathArrays.sortInPlace(doubleArray0, doubleArray1);
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0, 2497.517, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1163.16496852;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      boolean boolean0 = MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not strictly decreasing (0 <= 0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2061302.9043859304;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      boolean boolean0 = MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 3291.9536865682535;
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      try { 
        MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // points 0 and 1 are not decreasing (0 < 3,291.954)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long[][] longArray0 = new long[2][0];
      MathArrays.checkRectangular(longArray0);
      assertEquals(2, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long[][] longArray0 = new long[5][0];
      long[] longArray1 = new long[1];
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkRectangular(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // some rows have length 0 while others have length 1
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      MathArrays.checkPositive(doubleArray0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 3.32;
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
  public void test39()  throws Throwable  {
      long[] longArray0 = new long[8];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(8, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[1] = (-2755L);
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,755 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long[][] longArray0 = new long[6][5];
      MathArrays.checkNonNegative(longArray0);
      assertEquals(6, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      long[][] longArray0 = new long[3][2];
      long[] longArray1 = new long[5];
      longArray1[0] = (-2594L);
      longArray0[0] = longArray1;
      try { 
        MathArrays.checkNonNegative(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,594 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.167;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(0.167, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 1.304E19;
      doubleArray0[6] = 1.304E19;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(1.8441344853345161E19, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 5.669184079525E-24;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(5.669184079525E-24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = Double.NaN;
      double double0 = MathArrays.safeNorm(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.DECREASING;
      double[][] doubleArray0 = new double[4][4];
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
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      MathArrays.OrderDirection mathArrays_OrderDirection0 = MathArrays.OrderDirection.INCREASING;
      double[][] doubleArray1 = new double[2][4];
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
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = MathArrays.linearCombination(doubleArray0, doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[6];
      try { 
        MathArrays.linearCombination(doubleArray0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 6
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
      double double0 = MathArrays.linearCombination(0.0, (double) 0, 0.0, (double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      double double0 = MathArrays.linearCombination(617.8, (-3521.6304709105543), (-1359.6), Double.POSITIVE_INFINITY);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double double0 = MathArrays.linearCombination(0.0, 0.0, (double) 0, 0.0, 99.21977448165367, (double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double double0 = MathArrays.linearCombination(Double.POSITIVE_INFINITY, 0.0, 0.0, -0.0, (-1277.63), (-3423.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double double0 = MathArrays.linearCombination((-3731.5063), (-3731.5063), (-2654.1563536521567), (-1347.814792648751), (-3731.5063), 3.32, (-206.939705315), 3.32);
      assertEquals(1.748837482165709E7, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double double0 = MathArrays.linearCombination((-1340.6419), 2159.37697, (-20.0), 0.0, Double.NaN, 0.0, 1071.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      float[] floatArray0 = new float[2];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean boolean0 = MathArrays.equals(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      float[] floatArray0 = new float[4];
      boolean boolean0 = MathArrays.equals((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      float[] floatArray0 = new float[9];
      float[] floatArray1 = new float[3];
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      float[] floatArray0 = new float[8];
      floatArray0[1] = Float.NaN;
      boolean boolean0 = MathArrays.equals(floatArray0, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      float[] floatArray0 = new float[7];
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, floatArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      float[] floatArray0 = new float[6];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      float[] floatArray0 = new float[7];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, (float[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((float[]) null, (float[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float[] floatArray1 = new float[9];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[3] = (-380.42F);
      float[] floatArray1 = new float[9];
      boolean boolean0 = MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = MathArrays.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      boolean boolean0 = MathArrays.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathArrays.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[8];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-473.7354663169);
      double[] doubleArray1 = new double[9];
      boolean boolean0 = MathArrays.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, (double[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathArrays.equalsIncludingNaN((double[]) null, doubleArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[3];
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      double[] doubleArray1 = MathArrays.ebeSubtract(doubleArray0, doubleArray0);
      boolean boolean0 = MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      try { 
        MathArrays.normalizeArray(doubleArray0, Double.POSITIVE_INFINITY);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot normalize to an infinite value
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      double[] doubleArray0 = new double[4];
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
  public void test84()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      try { 
        MathArrays.normalizeArray(doubleArray0, (-2189.772371433704));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array contains an infinite element, \u221E at index 1
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = Double.NaN;
      try { 
        MathArrays.normalizeArray(doubleArray0, 3.32);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 3.32;
      doubleArray0[2] = Double.NaN;
      double[] doubleArray1 = MathArrays.normalizeArray(doubleArray0, 3.32);
      assertArrayEquals(new double[] {3.32, 0.0, Double.NaN, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Field<FieldElement<Double>> field0 = (Field<FieldElement<Double>>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(field0).getRuntimeClass();
      // Undeclared exception!
      try { 
        MathArrays.buildArray(field0, (-2060), (-2060));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Class<FieldElement> class0 = FieldElement.class;
      Field<Object> field0 = (Field<Object>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      Object[][] objectArray0 = MathArrays.buildArray(field0, 0, 0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Class<FieldElement> class0 = FieldElement.class;
      Field<String> field0 = (Field<String>) mock(Field.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(field0).getRuntimeClass();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(field0).getZero();
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = MathArrays.convolve(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertEquals(9, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[6];
      try { 
        MathArrays.convolve(doubleArray1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no data
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
