/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:58:39 GMT 2014
 */

package org.apache.commons.lang3.math;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;

import org.junit.runner.RunWith;

 
public class NumberUtilsEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "7e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "9";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "--w4egF'L61";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = "+6(";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "E.'YylT{9";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "2.ehKR;GEe\\}@\"<[ ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "..G";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "0xDOf-rL?kxVe";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "0x0xv`??\"%mg4L>`R9_`}f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "-0x)v9|\\Ry6";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "-0X}{q`Dz6Pi,z87?";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "b";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte byte0 = (byte) (-61);
      byte byte1 = (byte)49;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte)49, byte2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte byte0 = (byte) (-41);
      byte byte1 = (byte)57;
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)57, byte2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      short short0 = (short)771;
      short short1 = (short)2076;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertEquals((short)2076, short2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte byte0 = (byte)102;
      byte byte1 = (byte)57;
      short short0 = NumberUtils.max((short) byte1, (short) byte0, (short) byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((short)102, short0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      short short0 = (short) (-3507);
      int[] intArray0 = new int[1];
      int int0 = NumberUtils.max((int) short0, (int) short0, intArray0[0]);
      assertEquals(0, int0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
      
      int int0 = 2828;
      int int1 = NumberUtils.max((int) short0, int0, int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(2828, int1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-580);
      long long0 = 3756L;
      long long1 = NumberUtils.max((long) int0, (long) int0, long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals(3756L, long1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = (-580);
      long long0 = 0L;
      long long1 = NumberUtils.min((long) int0, long0, long0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals((-580L), long1);
      
      long long2 = NumberUtils.max((long) int0, long0, long1);
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertTrue(long2 == long0);
      assertFalse(long2 == long1);
      assertTrue(long0 == long2);
      assertFalse(long0 == long1);
      assertEquals(0L, long2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = (-580);
      int int1 = NumberUtils.min(int0, int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals((-580), int1);
      
      long long0 = NumberUtils.max((long) int1, (long) int1, (long) int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals((-580L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte byte0 = (byte)102;
      byte byte1 = (byte)8;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)8, byte2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte byte0 = (byte)102;
      byte byte1 = (byte)57;
      byte byte2 = NumberUtils.min(byte0, byte1, byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertEquals((byte)57, byte2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      short short0 = (short)3942;
      short short1 = (short) (-3507);
      short short2 = NumberUtils.min(short0, short0, short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals((short) (-3507), short2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = "";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
      
      short short1 = (short)2911;
      assertFalse(short1 == short0);
      
      short short2 = NumberUtils.min(short1, short0, short1);
      assertTrue(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short1 == short0);
      assertFalse(short1 == short2);
      assertTrue(short0 == short2);
      assertFalse(short0 == short1);
      assertEquals((short)0, short2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = Integer.MAX_VALUE;
      int int1 = 2;
      int int2 = NumberUtils.min(int0, int0, int1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertEquals(2, int2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Integer.MAX_VALUE;
      int int1 = 2490;
      int int2 = NumberUtils.min(int0, int1, int0);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(2490, int2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      short short0 = (short)771;
      short short1 = NumberUtils.max(short0, short0, short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short)771, short1);
      
      long long0 = 0L;
      long long1 = NumberUtils.min((long) short1, (long) short0, long0);
      assertTrue(short0 == short1);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertTrue(short1 == short0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte byte0 = (byte) (-41);
      byte byte1 = (byte)57;
      long long0 = NumberUtils.min((long) byte1, (long) byte0, (long) byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((-41L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      float[] floatArray0 = new float[10];
      float float0 = 1.0F;
      floatArray0[4] = float0;
      float float1 = NumberUtils.max(floatArray0);
      assertTrue(float1 == float0);
      assertEquals(1.0F, float1, 0.01F);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long long0 = 1L;
      short short0 = (short) (-3507);
      double double0 = NumberUtils.min((double) short0, (double) short0, (double) long0);
      assertEquals((-3507.0), double0, 0.01D);
      
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertFalse(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {(-3507.0), 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      float float0 = Float.NaN;
      double[] doubleArray0 = new double[20];
      doubleArray0[8] = (double) float0;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)48;
      byteArray0[1] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)48, byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)48, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      short[] shortArray0 = new short[25];
      short short0 = (short)1;
      shortArray0[5] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)1, short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)1, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      short short0 = (short)2011;
      short short1 = NumberUtils.min(short0, short0, short0);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
      assertEquals((short)2011, short1);
      
      int[] intArray0 = new int[8];
      intArray0[1] = (int) short1;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(2011, int0);
      assertArrayEquals(new int[] {0, 2011, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      long long0 = (-2405L);
      long[] longArray0 = new long[8];
      longArray0[0] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {(-2405L), 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = 1758.4F;
      floatArray0[0] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertFalse(float1 == float0);
      assertEquals(0.0F, float1, 0.01F);
      assertArrayEquals(new float[] {1758.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = Float.NaN;
      floatArray0[3] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      float[] floatArray0 = null;
      // Undeclared exception!
      try {
        float float0 = NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte byte0 = (byte)110;
      double[] doubleArray0 = new double[24];
      doubleArray0[0] = (double) byte0;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {110.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = Double.NaN;
      doubleArray0[6] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte)10;
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertFalse(byte1 == byte0);
      assertEquals((byte)0, byte1);
      assertArrayEquals(new byte[] {(byte)10, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte byte0 = (byte)107;
      short[] shortArray0 = new short[8];
      shortArray0[0] = (short) byte0;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
      assertArrayEquals(new short[] {(short)107, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = 43;
      int[] intArray0 = new int[4];
      intArray0[0] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertArrayEquals(new int[] {43, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int[] intArray0 = null;
      // Undeclared exception!
      try {
        int int0 = NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long[] longArray0 = new long[10];
      long long0 = 233L;
      longArray0[0] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {233L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = ")v9|\\Ry6";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \")v9|\\Ry6\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = "The Array must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = "[\\F/.q4]I\\l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // [\\F/.q4]I\\l is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = "eyeAOJtf";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // eyeAOJtf is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = "Y9XS9Vs^zwXL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Y9XS9Vs^zwXL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = "#\"i8J*Fj0=m$rD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // #\"i8J*Fj0=m$rD is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = "DOf-rL?kxVe";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // DOf-rL?kxVe is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = "...";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String string0 = "rvVfibe\"D1";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = "9fUMWSEeh+f,x";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 9fUMWSEeh+f,x is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String string0 = "InvocationTargetException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // InvocationTargetException occurred is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String string0 = " is not a valid number.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      String string0 = "/1la0.0'VdQ2\"<d`";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // /1la0.0'VdQ2\"<d` is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String string0 = "sun.tex.Normalizer is no avilable";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // sun.tex.Normalizer is no avilable is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      String string0 = "0l";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      String string0 = "-0xY9XS9Vs^zwXR";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-Y9XS9Vs^zwXR\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String string0 = "-0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      String string0 = "--1wcK|n:eQb:e ]^o;";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      String string0 = " ";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      String string0 = "0xv`??\"%mg4L>`R9_`}f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"v`??\"%mg4L>`R9_`}f\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte)0;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)0, byte1);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      String string0 = null;
      long long0 = 1708L;
      float float0 = NumberUtils.toFloat(string0, (float) long0);
      assertEquals(1708.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      String string0 = null;
      long long0 = 1708L;
      long long1 = NumberUtils.toLong(string0, long0);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
      assertEquals(1708L, long1);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      String string0 = "VX<S4:@tebQ+rr!i";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      int int0 = (-289);
      float float0 = NumberUtils.max((float) int0, (float) int0, (float) int0);
      assertEquals((-289.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      String string0 = "";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      String string0 = "Cu\"6Oa`@QV#+l6$";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      String string0 = "'Ov4wZq__S>e%%@=O";
      byte byte0 = (byte)0;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)0, byte1);
      
      float float0 = NumberUtils.min((float) byte1, (float) byte1, (float) byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      String string0 = "0X";
      int int0 = (-121);
      double double0 = NumberUtils.toDouble(string0, (double) int0);
      assertEquals((-121.0), double0, 0.01D);
      
      double double1 = NumberUtils.max((double) int0, double0, (double) int0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals((-121.0), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      String string0 = "2.ehKR;GEe\\}@\"<[ ";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test99()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
