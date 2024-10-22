/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:01:56 GMT 2014
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
      long long0 = 735L;
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
      long long0 = (-4277L);
      long long1 = (-9223372036854775808L);
      long long2 = MathUtils.subAndCheck(long0, long1);
      assertEquals(9223372036854771531L, long2);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long1 == long0);
      assertFalse(long1 == long2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      int int0 = MathUtils.subAndCheck((int) byte0, (int) byte1);
      assertEquals(0, int0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte byte0 = (byte)1;
      short short0 = MathUtils.sign((short) byte0);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      short short0 = (short) (-1575);
      long long0 = MathUtils.sign((long) short0);
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
      long long0 = 2882L;
      long long1 = MathUtils.sign(long0);
      assertEquals(1L, long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = (-1);
      int int1 = MathUtils.sign(int0);
      assertEquals((-1), int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)0, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      int int0 = MathUtils.sign((int) byte1);
      assertEquals(0, int0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 1797;
      int int1 = MathUtils.sign(int0);
      assertEquals(1, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      float float0 = (-946.06683F);
      float float1 = MathUtils.sign(float0);
      assertEquals((-1.0F), float1, 0.01F);
      assertFalse(float1 == float0);
      assertFalse(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      float float0 = 0.0F;
      float float1 = MathUtils.sign(float0);
      assertEquals(0.0F, float1, 0.01F);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      float float0 = Float.NaN;
      float float1 = MathUtils.sign(float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float0 == float1);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 1;
      float float0 = MathUtils.sign((float) int0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = (-768);
      double double0 = MathUtils.sign((double) int0);
      assertEquals((-1.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      long long0 = MathUtils.subAndCheck((long) byte0, (long) byte1);
      assertEquals(0L, long0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      double double0 = MathUtils.sign((double) long0);
      assertEquals(0.0, double0, 0.01D);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 735;
      float float0 = MathUtils.round((float) int0, int0);
      assertEquals(Float.NaN, float0, 0.01F);
      
      double double0 = MathUtils.sign((double) float0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      double double0 = MathUtils.sign((double) byte1);
      assertEquals(1.0, double0, 0.01D);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte byte0 = (byte) (-69);
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 6;
      float float0 = MathUtils.round((float) int0, int0, int0);
      assertEquals(6.0F, float0, 0.01F);
      
      int int1 = 2949;
      float float1 = MathUtils.round(float0, int1, int0);
      assertEquals(Float.NaN, float1, 0.01F);
      assertFalse(int1 == int0);
      assertFalse(float1 == float0);
      assertFalse(int0 == int1);
      assertFalse(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 5;
      int int1 = (-4);
      float float0 = MathUtils.round((float) int0, int1, int0);
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = 2;
      int int1 = (-3841);
      float float0 = MathUtils.round((float) int1, int0, int0);
      assertEquals((-3840.99F), float0, 0.01F);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      float float0 = 0.0F;
      int int0 = 7;
      float float1 = MathUtils.round(float0, int0, int0);
      assertEquals(0.0F, float1, 0.01F);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = 5;
      float float0 = MathUtils.round((float) int0, int0, int0);
      assertEquals(5.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 3;
      float float0 = MathUtils.round((float) int0, int0, int0);
      assertEquals(2.999F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-3542);
      int int1 = MathUtils.lcm(int0, int0);
      assertEquals(3542, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      int int2 = 2;
      assertFalse(int2 == int1);
      
      float float0 = MathUtils.round((float) int1, int1, int2);
      assertEquals(Float.NaN, float0, 0.01F);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      short short0 = (short)0;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)0, short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      
      double double0 = Double.NEGATIVE_INFINITY;
      double double1 = MathUtils.round(double0, (int) short1, (int) short0);
      assertEquals(Double.NEGATIVE_INFINITY, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double double0 = Double.POSITIVE_INFINITY;
      int int0 = (-1824);
      double double1 = MathUtils.scalb(double0, int0);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 735;
      float float0 = MathUtils.round((float) int0, int0);
      assertEquals(Float.NaN, float0, 0.01F);
      
      double double0 = MathUtils.scalb((double) float0, int0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 1797;
      double double0 = MathUtils.scalb((double) int0, int0);
      assertEquals((-4.9661423659215094E-73), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double double0 = 0.0;
      int int0 = 1797;
      double double1 = MathUtils.scalb(double0, int0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double double0 = 0.0;
      double double1 = 1.0;
      double double2 = MathUtils.nextAfter(double1, double0);
      assertEquals(0.9999999999999999, double2, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = 1021;
      double double0 = MathUtils.nextAfter((double) int0, (double) int0);
      assertEquals(1021.0000000000001, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = 0;
      float float0 = Float.NaN;
      float float1 = MathUtils.round(float0, int0, int0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertTrue(float0 == float1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      short short0 = (short) (-1575);
      short short1 = MathUtils.sign(short0);
      assertEquals((short) (-1), short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      
      int int0 = MathUtils.lcm((int) short0, (int) short1);
      assertEquals(1575, int0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      
      int int1 = MathUtils.hash((double) int0);
      assertEquals(1083743232, int1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      long long0 = 4503599627370505L;
      // Undeclared exception!
      try {
        long long1 = MathUtils.mulAndCheck(long0, (long) int1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      short short0 = (short)0;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)0, short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      
      long long0 = MathUtils.mulAndCheck((long) short1, (long) short0);
      assertEquals(0L, long0);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 0;
      long long0 = (-1094L);
      long long1 = MathUtils.subAndCheck(long0, (long) int0);
      assertEquals((-1094L), long1);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      
      long long2 = 1L;
      assertFalse(long2 == long1);
      
      long long3 = MathUtils.mulAndCheck(long1, long2);
      assertEquals((-1094L), long3);
      assertTrue(long1 == long0);
      assertTrue(long1 == long3);
      assertFalse(long1 == long2);
      assertFalse(long0 == long2);
      assertTrue(long0 == long1);
      assertTrue(long0 == long3);
      assertFalse(long2 == long1);
      assertFalse(long2 == long3);
      assertFalse(long2 == long0);
      assertTrue(long3 == long1);
      assertFalse(long3 == long2);
      assertTrue(long3 == long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = (-768);
      int int1 = MathUtils.gcd(int0, int0);
      assertEquals(768, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      int int2 = (-2076);
      assertFalse(int2 == int1);
      
      long long0 = MathUtils.binomialCoefficient(int1, int2);
      assertEquals(0L, long0);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      
      long long1 = MathUtils.mulAndCheck((long) int2, long0);
      assertEquals(0L, long1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertTrue(long1 == long0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertTrue(long0 == long1);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long long0 = (-9223372036854775808L);
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
  public void test39()  throws Throwable  {
      int int0 = (-2757);
      int int1 = MathUtils.hash((double) int0);
      assertEquals((-1062893056), int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      long long0 = MathUtils.mulAndCheck((long) int1, (long) int1);
      assertEquals(1129741648493019136L, long0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long long0 = 9218868437227405312L;
      long long1 = (-725L);
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
  public void test41()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      long long0 = MathUtils.mulAndCheck((long) byte1, (long) byte0);
      assertEquals(1L, long0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = 3287;
      int int1 = MathUtils.hash((double) int0);
      assertEquals(1084861952, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      int int2 = (-1970);
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
  public void test43()  throws Throwable  {
      short short0 = (short)2149;
      short short1 = MathUtils.indicator(short0);
      assertEquals((short)1, short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      short short0 = (short)0;
      short short1 = MathUtils.sign(short0);
      assertEquals((short)0, short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      
      long long0 = MathUtils.indicator((long) short1);
      assertEquals(1L, long0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte byte0 = (byte) (-69);
      long long0 = MathUtils.indicator((long) byte0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = 1021;
      int int1 = MathUtils.indicator(int0);
      assertEquals(1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = (-1392);
      int int1 = MathUtils.indicator(int0);
      assertEquals((-1), int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = 0;
      float float0 = Float.NaN;
      short short0 = (short) (-1);
      short short1 = MathUtils.indicator(short0);
      assertEquals((short) (-1), short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      
      // Undeclared exception!
      try {
        float float1 = MathUtils.round(float0, int0, (int) short1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      short short0 = (short) (-5);
      double double0 = MathUtils.indicator((double) short0);
      assertEquals((-1.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double double0 = Double.NaN;
      double double1 = MathUtils.indicator(double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      double double0 = MathUtils.indicator((double) byte1);
      assertEquals(1.0, double0, 0.01D);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte)1, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte byte0 = (byte) (-82);
      byte byte1 = MathUtils.indicator(byte0);
      assertEquals((byte) (-1), byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = 3287;
      int int1 = MathUtils.hash((double) int0);
      assertEquals(1084861952, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      // Undeclared exception!
      try {
        int int2 = MathUtils.lcm(int1, int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = 1021;
      int int1 = 0;
      int int2 = MathUtils.gcd(int0, int1);
      assertEquals(1021, int2);
      assertFalse(int2 == int1);
      assertTrue(int2 == int0);
      assertTrue(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)0, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      int int0 = MathUtils.gcd((int) byte1, (int) byte0);
      assertEquals(0, int0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = (-2757);
      int int1 = MathUtils.hash((double) int0);
      assertEquals((-1062893056), int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      // Undeclared exception!
      try {
        double double0 = MathUtils.factorialLog(int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int int0 = (-731);
      // Undeclared exception!
      try {
        double double0 = MathUtils.factorialDouble(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      short short0 = (short)31;
      // Undeclared exception!
      try {
        long long0 = MathUtils.factorial((int) short0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte byte0 = (byte)1;
      long long0 = MathUtils.factorial((int) byte0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[] doubleArray1 = new double[4];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(boolean0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = null;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double[] doubleArray1 = null;
      boolean boolean0 = MathUtils.equals(doubleArray1, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte byte0 = (byte)0;
      double double0 = Double.NaN;
      double double1 = MathUtils.round(double0, (int) byte0, (int) byte0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = double1;
      double[] doubleArray1 = new double[5];
      //  // Unstable assertion: assertNotSame(doubleArray1, doubleArray0);
      //  // Unstable assertion: assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      //  // Unstable assertion: assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertNotSame(doubleArray1, doubleArray0);
      //  // Unstable assertion: assertNotSame(doubleArray0, doubleArray1);
      //  // Unstable assertion: assertFalse(boolean0);
      //  // Unstable assertion: assertFalse(doubleArray1.equals((Object)doubleArray0));
      //  // Unstable assertion: assertFalse(doubleArray0.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte byte0 = (byte)0;
      double double0 = Double.NaN;
      double double1 = MathUtils.round(double0, (int) byte0, (int) byte0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = double1;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      double double0 = MathUtils.binomialCoefficientDouble(int0, int1);
      assertEquals(0.0, double0, 0.01D);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte byte0 = (byte)1;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      int int0 = 22;
      double double0 = MathUtils.binomialCoefficientDouble(int0, (int) byte1);
      assertEquals(22.0, double0, 0.01D);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = 1;
      int int1 = 0;
      double double0 = MathUtils.binomialCoefficientDouble(int0, int1);
      assertEquals(1.0, double0, 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = (-1);
      int int1 = MathUtils.addAndCheck(int0, int0);
      assertEquals((-2), int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      // Undeclared exception!
      try {
        double double0 = MathUtils.binomialCoefficientDouble(int1, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = (-2653);
      int int1 = 0;
      // Undeclared exception!
      try {
        double double0 = MathUtils.binomialCoefficientLog(int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      int int0 = 4;
      int int1 = 3;
      long long0 = MathUtils.binomialCoefficient(int0, int1);
      assertEquals(4L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      int int0 = 4130;
      int int1 = 3365;
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
  public void test73()  throws Throwable  {
      int int0 = 0;
      int int1 = 2383;
      long long0 = MathUtils.binomialCoefficient(int1, int0);
      assertEquals(1L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      int int0 = 1;
      int int1 = 4130;
      long long0 = MathUtils.binomialCoefficient(int1, int0);
      assertEquals(4130L, long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte byte0 = (byte) (-37);
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient((int) byte0, (int) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte byte0 = (byte)95;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient((int) byte1, (int) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      int int0 = 1;
      long long0 = MathUtils.binomialCoefficient(int0, int0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      long long0 = 9218868437227405316L;
      // Undeclared exception!
      try {
        long long1 = MathUtils.addAndCheck(long0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      int int0 = 1021;
      short short0 = (short) (-5);
      int int1 = MathUtils.gcd(int0, int0);
      assertEquals(1021, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      
      long long0 = MathUtils.subAndCheck((long) short0, (long) int1);
      assertEquals((-1026L), long0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      long long0 = (-9218868437227405304L);
      // Undeclared exception!
      try {
        long long1 = MathUtils.addAndCheck(long0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      double double0 = 3827.31884045274;
      int int0 = MathUtils.hash(double0);
      assertEquals(2141433073, int0);
      
      // Undeclared exception!
      try {
        int int1 = MathUtils.addAndCheck(int0, int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      double double0 = (-1.0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = double0;
      int int0 = MathUtils.hash(doubleArray0);
      assertArrayEquals(new double[] {(-1.0)}, doubleArray0, 0.01);
      assertEquals((-1074790369), int0);
      
      // Undeclared exception!
      try {
        int int1 = MathUtils.addAndCheck(int0, int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      int int0 = 1;
      double double0 = MathUtils.binomialCoefficientDouble(int0, int0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      byte byte0 = (byte)95;
      byte byte1 = MathUtils.sign(byte0);
      assertEquals((byte)1, byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      
      double double0 = MathUtils.round((double) byte0, (int) byte1);
      assertEquals(95.0, double0, 0.01D);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      int int0 = 1021;
      double double0 = MathUtils.cosh((double) int0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      int int0 = (-2757);
      double double0 = MathUtils.log((double) int0, (double) int0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      int int0 = 1797;
      double double0 = MathUtils.sinh((double) int0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      short short0 = (short) (-5);
      double double0 = MathUtils.normalizeAngle((double) short0, (double) short0);
      assertEquals((-5.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      float float0 = (-1745.56F);
      int int0 = (-1392);
      float float1 = MathUtils.round(float0, int0);
      assertEquals(Float.NaN, float1, 0.01F);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      int int0 = 1;
      long long0 = MathUtils.addAndCheck((long) int0, (long) int0);
      assertEquals(2L, long0);
  }
}
