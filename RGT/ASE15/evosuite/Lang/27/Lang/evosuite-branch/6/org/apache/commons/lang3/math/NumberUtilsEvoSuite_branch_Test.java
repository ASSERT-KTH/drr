/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:41:20 GMT 2014
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
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "--q#y2;2@M";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "EZ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "2ex,~Jz%>#7|";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "-0xBeM?x{]a*#6brIR";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "0x0xFc3UYN-'Yy>?xR9L%F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "-0xF";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "0x...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "0Xq#y2;2@M";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte byte0 = (byte) (-89);
      byte byte1 = (byte)70;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertEquals((byte)70, byte2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "5c";
      byte byte0 = (byte)2;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)2, byte1);
      
      byte byte2 = NumberUtils.max(byte1, byte1, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte0 == byte2);
      assertTrue(byte2 == byte1);
      assertTrue(byte2 == byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertEquals((byte)2, byte2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      short short0 = (short)69;
      short short1 = (short)38;
      short short2 = NumberUtils.max(short1, short1, short0);
      assertFalse(short2 == short1);
      assertTrue(short2 == short0);
      assertFalse(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertEquals((short)69, short2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      short short0 = (short)69;
      short short1 = (short) (-1523);
      short short2 = NumberUtils.max(short1, short0, short0);
      assertFalse(short1 == short0);
      assertFalse(short1 == short2);
      assertTrue(short2 == short0);
      assertFalse(short2 == short1);
      assertFalse(short0 == short1);
      assertTrue(short0 == short2);
      assertEquals((short)69, short2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 2149;
      int int1 = (-1570);
      int int2 = NumberUtils.min(int0, int0, int1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals((-1570), int2);
      
      int int3 = NumberUtils.max(int2, int0, int1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int3);
      assertFalse(int2 == int0);
      assertFalse(int1 == int3);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertTrue(int3 == int0);
      assertTrue(int0 == int3);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(2149, int3);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "t";
      int int0 = (-1);
      int int1 = 550;
      int int2 = NumberUtils.max(int0, int0, int1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(550, int2);
      
      int int3 = NumberUtils.toInt(string0);
      assertFalse(int3 == int1);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertEquals(0, int3);
      
      long long0 = NumberUtils.max((long) int3, (long) int3, (long) int2);
      assertFalse(int2 == int3);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int3);
      assertFalse(int3 == int1);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int3);
      assertFalse(int0 == int1);
      assertEquals(550L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = (-1971L);
      long long1 = 756L;
      long long2 = NumberUtils.max(long0, long1, long1);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertEquals(756L, long2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte byte0 = (byte)68;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertEquals((byte)0, byte2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte byte0 = (byte)77;
      byte byte1 = (byte) (-124);
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertEquals((byte) (-124), byte2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      short short0 = (short)69;
      byte byte0 = (byte)29;
      short short1 = (short) (-1523);
      short short2 = NumberUtils.min((short) byte0, short0, short1);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertEquals((short) (-1523), short2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      short short0 = (short)69;
      short[] shortArray0 = new short[4];
      shortArray0[1] = short0;
      short short1 = NumberUtils.min(shortArray0[1], shortArray0[2], shortArray0[1]);
      assertFalse(short1 == short0);
      assertArrayEquals(new short[] {(short)0, (short)69, (short)0, (short)0}, shortArray0);
      assertEquals((short)0, short1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)55;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertEquals((byte)55, byte2);
      
      int int0 = NumberUtils.min((int) byte2, (int) byte0, (int) byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      short short0 = (short) (-5600);
      long long0 = 0L;
      long long1 = NumberUtils.min(long0, long0, (long) short0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals((-5600L), long1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long[] longArray0 = new long[10];
      long long0 = 1L;
      long long1 = NumberUtils.min(long0, longArray0[3], long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      short short0 = (short)2;
      float[] floatArray0 = new float[6];
      floatArray0[1] = (float) short0;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(2.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      float[] floatArray0 = new float[20];
      float float0 = Float.NaN;
      floatArray0[6] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 4733.23422088;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertTrue(double1 == double0);
      assertArrayEquals(new double[] {0.0, 4733.23422088, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4733.23422088, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = Double.NaN;
      doubleArray0[3] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)32;
      byteArray0[4] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertTrue(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)32, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)32, byte1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try {
        byte byte0 = NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      short short0 = (short)69;
      short[] shortArray0 = new short[4];
      shortArray0[2] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertTrue(short1 == short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)69, (short)0}, shortArray0);
      assertEquals((short)69, short1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = 100;
      intArray0[1] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertTrue(int1 == int0);
      assertArrayEquals(new int[] {0, 100, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(100, int1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte byte0 = (byte)48;
      long[] longArray0 = new long[6];
      longArray0[5] = (long) byte0;
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 48L}, longArray0);
      assertEquals(48L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      long[] longArray0 = null;
      // Undeclared exception!
      try {
        long long0 = NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = (-3511.856F);
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertTrue(float1 == float0);
      assertArrayEquals(new float[] {0.0F, (-3511.856F), 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals((-3511.856F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = Float.NaN;
      floatArray0[3] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, Float.NaN, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-1.0);
      doubleArray0[6] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertTrue(double1 == double0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-1.0), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-1.0), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = Double.NaN;
      doubleArray0[1] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      double[] doubleArray0 = null;
      // Undeclared exception!
      try {
        double double0 = NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)69;
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertFalse(byte1 == byte0);
      assertArrayEquals(new byte[] {(byte)69, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)0, byte1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      short short0 = (short)69;
      short[] shortArray0 = new short[4];
      shortArray0[0] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertFalse(short1 == short0);
      assertArrayEquals(new short[] {(short)69, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)0, short1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      short[] shortArray0 = null;
      // Undeclared exception!
      try {
        short short0 = NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = (-294);
      intArray0[3] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertTrue(int1 == int0);
      assertArrayEquals(new int[] {0, 0, 0, (-294)}, intArray0);
      assertEquals((-294), int1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long[] longArray0 = new long[10];
      long long0 = 1L;
      longArray0[0] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertFalse(long1 == long0);
      assertArrayEquals(new long[] {1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = "r\\hx>0";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"r\\hx>0\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = "Strings must not be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = "\\f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \\f is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = "IllegalAccessException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IllegalAccessException occurred is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = "HxOdZa!?a=oGP9L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // HxOdZa!?a=oGP9L is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = "F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = "E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // E is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = "Minimum abbreviation width with offset is 7";
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
  public void test72()  throws Throwable  {
      String string0 = "B8AvV0TC!l-9xMKe]aE";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // B8AvV0TC!l-9xMKe]aE is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
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
  public void test74()  throws Throwable  {
      String string0 = "jaa.text.Normlize Ms not aailble";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // jaa.text.Normlize Ms not aailble is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = "0.";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String string0 = "-0X{*p]QZ}.y)0K(r2=jN";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-{*p]QZ}.y)0K(r2=jN\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String string0 = "0XZ<VL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Z<VL\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      String string0 = "-0x#oJ4^BWOo}yVv0+B";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-#oJ4^BWOo}yVv0+B\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      String string0 = "0x0xFc3UYN-'Yy>?xR9L%F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0xFc3UYN-'Yy>?xR9L%F\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      String string0 = "--{*jXP.'Cn-4qat\\ydM";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      String string0 = "";
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
  public void test82()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      byte byte0 = (byte) (-89);
      String string0 = "*oXePacdK";
      short short0 = NumberUtils.toShort(string0, (short) byte0);
      assertEquals((short) (-89), short0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte)55;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)55, byte1);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      short short0 = (short)13;
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0, (float) short0);
      assertEquals(13.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      String string0 = null;
      byte[] byteArray0 = new byte[1];
      byte byte0 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals((byte)0, byte0);
      
      long long0 = NumberUtils.toLong(string0, (long) byte0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      String string0 = "5c";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      float float0 = (-732.34F);
      float float1 = NumberUtils.max(float0, float0, float0);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
      assertEquals((-732.34F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      String string0 = "java.text.Normalizer is not available";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      String string0 = "5c";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      float float0 = (-2925.5706F);
      float float1 = NumberUtils.min(float0, float0, float0);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
      assertEquals((-2925.5706F), float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      double double0 = 4601.93733;
      double double1 = NumberUtils.min(double0, double0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(4601.93733, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      double double0 = 0.0;
      int int0 = (-1);
      int int1 = NumberUtils.max(int0, int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals((-1), int1);
      
      double double1 = NumberUtils.max(double0, (double) int1, (double) int1);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      String string0 = "--q#y2;2@M";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
