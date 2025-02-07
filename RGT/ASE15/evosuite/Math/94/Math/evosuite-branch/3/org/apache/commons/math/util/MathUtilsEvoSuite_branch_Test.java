/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:40:29 GMT 2014
 */

package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockArithmeticException;

import org.junit.runner.RunWith;

 
public class MathUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = 885L;
      long long1 = (-9223372036854775808L);
      // Undeclared exception!
      try {
        long long2 = MathUtils.subAndCheck(long0, long1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = (-2269L);
      long long1 = (-9223372036854775808L);
      long long2 = MathUtils.subAndCheck(long0, long1);
      assertEquals(9223372036854773539L, long2);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long1 == long0);
      assertFalse(long1 == long2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.gcd(int0, int0);
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      
      int int2 = MathUtils.subAndCheck(int1, int1);
      assertEquals(0, int2);
      assertTrue(int1 == int2);
      assertTrue(int1 == int0);
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      assertTrue(int0 == int1);
      assertTrue(int0 == int2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte byte0 = (byte) (-18);
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      
      short short0 = MathUtils.sign((short) byte1);
      assertEquals((short) (-1), short0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-25);
      long long0 = MathUtils.sign((long) int0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = 0L;
      long long1 = MathUtils.sign(long0);
      assertEquals(0L, long1);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      
      long long0 = MathUtils.sign((long) byte1);
      assertEquals(1L, long0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      float float0 = 283.46396F;
      float float1 = MathUtils.sign(float0);
      assertEquals(1.0F, float1, 0.01F);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)0, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      float float0 = MathUtils.sign((float) byte1);
      assertEquals(0.0F, float0, 0.01F);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      float float0 = Float.NaN;
      float float1 = MathUtils.sign(float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float0 == float1);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = (-37);
      float float0 = MathUtils.sign((float) int0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-1500);
      float float0 = MathUtils.indicator((float) int0);
      assertEquals((-1.0F), float0, 0.01F);
      
      double double0 = MathUtils.sign((double) float0);
      assertEquals((-1.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = 0.0;
      double double1 = MathUtils.sign(double0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      short short0 = (short)803;
      double double0 = MathUtils.sign((double) short0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      
      byte byte2 = MathUtils.sign(byte1);
      assertEquals((byte)1, byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      float float0 = 1604.9576F;
      int int0 = 7;
      float float1 = MathUtils.round(float0, int0, int0);
      assertEquals(1604.9576F, float1, 0.01F);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 0;
      float float0 = Float.NaN;
      int int1 = 6;
      float float1 = MathUtils.round(float0, int0, int1);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertTrue(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 0;
      float float0 = (-17.60059F);
      int int1 = 3;
      float float1 = MathUtils.round(float0, int0, int1);
      assertEquals((-18.0F), float1, 0.01F);
      assertFalse(float1 == float0);
      assertFalse(float0 == float1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 2;
      int int1 = (-25);
      float float0 = MathUtils.round((float) int1, int0, int0);
      assertEquals((-24.99F), float0, 0.01F);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      
      int int0 = (-8);
      // Undeclared exception!
      try {
        float float0 = MathUtils.round((float) byte1, (int) byte0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      float float0 = 2791.87F;
      int int0 = (-1);
      int int1 = 7;
      // Undeclared exception!
      try {
        float float1 = MathUtils.round(float0, int0, int1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = (-37);
      int int1 = 6;
      float float0 = MathUtils.round((float) int0, int0, int1);
      assertEquals(-0.0F, float0, 0.01F);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 0;
      int int1 = 3;
      float float0 = MathUtils.round((float) int0, int0, int1);
      assertEquals((-1.0F), float0, 0.01F);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 0;
      int int1 = 2;
      int int2 = MathUtils.gcd(int0, int1);
      assertEquals(2, int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      
      float float0 = MathUtils.round((float) int2, int1, int1);
      assertEquals(2.01F, float0, 0.01F);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long long0 = (-8L);
      long long1 = MathUtils.mulAndCheck(long0, long0);
      assertEquals(64L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      
      int int0 = 1174;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      float float0 = MathUtils.round((float) long1, int0, int1);
      assertEquals(Float.NaN, float0, 0.01F);
      assertFalse(int1 == int0);
      assertFalse(long1 == long0);
      assertFalse(int0 == int1);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      
      double double0 = Double.POSITIVE_INFINITY;
      double double1 = MathUtils.round(double0, (int) byte1);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
      assertFalse(byte1 == byte0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = (-329);
      int int1 = MathUtils.gcd(int0, int0);
      //  // Unstable assertion: assertEquals(329, int1);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      
      double double0 = Double.NaN;
      double double1 = MathUtils.sign(double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      
      double double2 = MathUtils.round(double1, int1, int1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(double0 == double2);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertTrue(double2 == double0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = (-1);
      double double0 = Double.POSITIVE_INFINITY;
      double double1 = MathUtils.scalb(double0, int0);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 1;
      double double0 = Double.NaN;
      double double1 = MathUtils.scalb(double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      short short0 = (short)0;
      int int0 = MathUtils.hash((double) short0);
      assertEquals(0, int0);
      
      short short1 = MathUtils.sign(short0);
      assertEquals((short)0, short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      
      short short2 = MathUtils.indicator(short1);
      assertEquals((short)1, short2);
      assertFalse(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short1 == short2);
      assertTrue(short1 == short0);
      assertFalse(short0 == short2);
      assertTrue(short0 == short1);
      
      double double0 = MathUtils.scalb((double) short2, int0);
      assertEquals(1.0, double0, 0.01D);
      assertFalse(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short1 == short2);
      assertTrue(short1 == short0);
      assertFalse(short0 == short2);
      assertTrue(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      
      double double0 = MathUtils.scalb((double) byte0, (int) byte1);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 2;
      double double0 = 0.0;
      double double1 = MathUtils.nextAfter((double) int0, double0);
      assertEquals(1.9999999999999998, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      float float0 = (-0.36833173F);
      int int0 = 5;
      float float1 = MathUtils.round(float0, int0, int0);
      assertEquals((-0.36833F), float1, 0.01F);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      float float0 = 0.0F;
      int int0 = 5;
      float float1 = MathUtils.round(float0, int0, int0);
      //  // Unstable assertion: assertEquals(-0.0F, float1, 0.01F);
      //  // Unstable assertion: assertFalse(float0 == float1);
      //  // Unstable assertion: assertFalse(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 2598;
      float float0 = MathUtils.round((float) int0, int0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long long0 = 4503599627370496L;
      // Undeclared exception!
      try {
        long long1 = MathUtils.mulAndCheck(long0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte byte0 = (byte)0;
      long long0 = MathUtils.mulAndCheck((long) byte0, (long) byte0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = (-9218868437227405313L);
      long long1 = 2457L;
      // Undeclared exception!
      try {
        long long2 = MathUtils.mulAndCheck(long0, long1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      short short0 = (short)0;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)0, short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      
      long long0 = (-1L);
      long long1 = MathUtils.mulAndCheck(long0, (long) short1);
      assertEquals(0L, long1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long long0 = (-9218868437227405307L);
      // Undeclared exception!
      try {
        long long1 = MathUtils.mulAndCheck(long0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = 257;
      long long0 = (-1783L);
      long long1 = MathUtils.mulAndCheck(long0, (long) int0);
      assertEquals((-458231L), long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = 257;
      long long0 = MathUtils.addAndCheck((long) int0, (long) int0);
      assertEquals(514L, long0);
      
      long long1 = MathUtils.mulAndCheck(long0, (long) int0);
      assertEquals(132098L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = (-1500);
      double double0 = MathUtils.log((double) int0, (double) int0);
      assertEquals(Double.NaN, double0, 0.01D);
      
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = double0;
      int int1 = MathUtils.hash(doubleArray0);
      assertEquals(2146959391, int1);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
      assertFalse(int1 == int0);
      
      // Undeclared exception!
      try {
        int int2 = MathUtils.mulAndCheck(int1, int1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = (-1134);
      int int1 = MathUtils.mulAndCheck(int0, int0);
      assertEquals(1285956, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      int int2 = (-2243);
      assertFalse(int2 == int1);
      
      // Undeclared exception!
      try {
        int int3 = MathUtils.lcm(int1, int2);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte byte0 = (byte) (-18);
      short short0 = MathUtils.indicator((short) byte0);
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)0, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      long long0 = MathUtils.indicator((long) byte1);
      assertEquals(1L, long0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = (-1500);
      long long0 = MathUtils.indicator((long) int0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.indicator(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = (-329);
      int int1 = MathUtils.indicator(int0);
      assertEquals((-1), int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      short short0 = (short)0;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)0, short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      
      float float0 = (-2692.0F);
      float float1 = MathUtils.round(float0, (int) short1);
      assertEquals((-2692.0F), float1, 0.01F);
      assertTrue(short0 == short1);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = 0;
      float float0 = Float.NaN;
      float float1 = MathUtils.round(float0, int0, int0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertTrue(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      long long0 = (-8L);
      double double0 = MathUtils.indicator((double) long0);
      assertEquals((-1.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = (-1500);
      double double0 = MathUtils.log((double) int0, (double) int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double0, 0.01D);
      
      double double1 = MathUtils.indicator(double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      short short0 = (short)803;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)1, short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      
      double double0 = MathUtils.indicator((double) short1);
      assertEquals(1.0, double0, 0.01D);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = (-1134);
      int int1 = MathUtils.mulAndCheck(int0, int0);
      assertEquals(1285956, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      int int2 = MathUtils.sign(int0);
      assertEquals((-1), int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      
      int int3 = MathUtils.lcm(int1, int2);
      assertEquals(1285956, int3);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int3);
      assertTrue(int3 == int1);
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int1 == int2);
      assertTrue(int1 == int3);
      assertFalse(int1 == int0);
      assertFalse(int2 == int3);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = 1174;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      int int2 = (-654);
      assertFalse(int2 == int1);
      
      int int3 = MathUtils.gcd(int2, int1);
      assertEquals(1, int3);
      assertFalse(int2 == int3);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int3);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertTrue(int1 == int3);
      assertTrue(int3 == int1);
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.sign(int0);
      assertEquals(0, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      
      int int2 = (-83);
      assertFalse(int2 == int1);
      
      int int3 = MathUtils.lcm(int2, int1);
      assertEquals(0, int3);
      assertTrue(int3 == int1);
      assertFalse(int3 == int2);
      assertTrue(int3 == int0);
      assertTrue(int0 == int1);
      assertTrue(int0 == int3);
      assertFalse(int0 == int2);
      assertFalse(int2 == int3);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int2);
      assertTrue(int1 == int3);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte byte0 = (byte) (-18);
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      
      // Undeclared exception!
      try {
        double double0 = MathUtils.factorialLog((int) byte1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte byte0 = (byte) (-118);
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      
      // Undeclared exception!
      try {
        double double0 = MathUtils.factorialDouble((int) byte1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = 257;
      // Undeclared exception!
      try {
        long long0 = MathUtils.factorial(int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = 0;
      long long0 = MathUtils.factorial(int0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = 257;
      long long0 = MathUtils.addAndCheck((long) int0, (long) int0);
      assertEquals(514L, long0);
      
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[0] = (double) long0;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {514.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[8];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = null;
      boolean boolean0 = MathUtils.equals(doubleArray1, doubleArray0);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = null;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      double[] doubleArray0 = null;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      double double0 = 0.0;
      double double1 = MathUtils.log(double0, double0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double[] doubleArray0 = new double[16];
      doubleArray0[2] = double1;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = 0;
      double double0 = Double.NaN;
      boolean boolean0 = MathUtils.equals(double0, (double) int0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      double double0 = MathUtils.binomialCoefficientLog(int0, int1);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      short short0 = (short)803;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)1, short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      
      double double0 = MathUtils.binomialCoefficientLog((int) short0, (int) short1);
      assertEquals(6.688354713946762, double0, 0.01D);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = 1101;
      int int1 = 0;
      double double0 = MathUtils.binomialCoefficientLog(int0, int1);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      int int0 = (-270);
      // Undeclared exception!
      try {
        double double0 = MathUtils.binomialCoefficientDouble(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      short short0 = (short)803;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)1, short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      
      int int0 = 0;
      // Undeclared exception!
      try {
        double double0 = MathUtils.binomialCoefficientDouble(int0, (int) short1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      int int0 = 1884;
      int int1 = 771;
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient(int0, int1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      long long0 = MathUtils.binomialCoefficient(int0, int1);
      assertEquals(0L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      int int0 = 1;
      int int1 = 1326;
      long long0 = MathUtils.binomialCoefficient(int1, int0);
      assertEquals(1326L, long0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      long long0 = MathUtils.binomialCoefficient(int1, int0);
      assertEquals(1L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      int int0 = 0;
      long long0 = MathUtils.binomialCoefficient(int0, int0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      int int0 = (-37);
      int int1 = 0;
      long long0 = MathUtils.binomialCoefficient(int1, int0);
      assertEquals(0L, long0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient(int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      int int0 = (-2159);
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      int int0 = 2598;
      long long0 = (-9223372036854775807L);
      // Undeclared exception!
      try {
        long long1 = MathUtils.addAndCheck((long) int0, long0);
       //  fail("Expecting exception: ArithmeticException");
       // Unstable assertion
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      int int0 = 2;
      int int1 = MathUtils.mulAndCheck(int0, int0);
      assertEquals(4, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      long long0 = MathUtils.subAndCheck((long) int1, (long) int1);
      assertEquals(0L, long0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      int int0 = (-1);
      long long0 = (-9223372036854775808L);
      // Undeclared exception!
      try {
        long long1 = MathUtils.addAndCheck((long) int0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      int int0 = (-1500);
      double[] doubleArray0 = new double[1];
      int int1 = MathUtils.hash(doubleArray0);
      assertEquals(31, int1);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertFalse(int1 == int0);
      
      int int2 = MathUtils.addAndCheck(int1, int0);
      assertEquals((-1469), int2);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      short short0 = (short)803;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)1, short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      
      double double0 = MathUtils.binomialCoefficientDouble((int) short1, (int) short1);
      assertEquals(1.0, double0, 0.01D);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      byte byte0 = (byte)0;
      double double0 = MathUtils.cosh((double) byte0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      float float0 = 0.0F;
      double double0 = MathUtils.sinh((double) float0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      int int0 = (-1134);
      int int1 = MathUtils.mulAndCheck(int0, int0);
      assertEquals(1285956, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      int int2 = MathUtils.lcm(int1, int1);
      assertEquals(1285956, int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.normalizeAngle((double) int0, (double) int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.sign(int0);
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      
      float float0 = MathUtils.round((float) int1, int1);
      assertEquals(0.0F, float0, 0.01F);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      int int0 = (-1134);
      long long0 = MathUtils.addAndCheck((long) int0, (long) int0);
      assertEquals((-2268L), long0);
  }
}
