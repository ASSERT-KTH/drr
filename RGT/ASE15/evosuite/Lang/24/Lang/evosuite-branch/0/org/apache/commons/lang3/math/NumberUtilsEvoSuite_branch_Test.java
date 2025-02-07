/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:37:29 GMT 2014
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
  public void test000()  throws Throwable  {
      String string0 = "-l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "-e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "2.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "6EI+m}_\"t=4>gJ]#\\`4";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "--The Ar#ay must notdbe nlll";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "ezjMjS6h'l2hl;t2S";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "93..=AF@?\\";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "0xAblank s'Mig is jot a vaid n+mber";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "0x0xjava.text.Normalizrr is notavailable";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0x ]SF6fY!hNF>.p.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0xF";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "0EH";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "+G";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "7";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte) (-108);
      byte byte2 = NumberUtils.max(byte1, byte1, byte0);
      assertFalse(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte2 == byte1);
      assertTrue(byte2 == byte0);
      assertFalse(byte0 == byte1);
      assertTrue(byte0 == byte2);
      assertEquals((byte)0, byte2);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = NumberUtils.max(byte0, byte0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)0, byte1);
      
      byte byte2 = (byte)88;
      assertFalse(byte2 == byte1);
      
      byte byte3 = NumberUtils.max(byte1, byte2, byte0);
      assertFalse(byte0 == byte2);
      assertTrue(byte0 == byte1);
      assertFalse(byte0 == byte3);
      assertTrue(byte1 == byte0);
      assertFalse(byte1 == byte2);
      assertFalse(byte1 == byte3);
      assertFalse(byte3 == byte1);
      assertFalse(byte3 == byte0);
      assertTrue(byte3 == byte2);
      assertFalse(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte3);
      assertEquals((byte)88, byte3);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      short short0 = (short) (-3343);
      short short1 = (short)2430;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertEquals((short)2430, short2);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      short short0 = (short) (-3343);
      short short1 = (short) (-3);
      short short2 = NumberUtils.max(short0, short1, short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
      assertEquals((short) (-3), short2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(0, int0);
      
      int int1 = 1671;
      assertFalse(int1 == int0);
      
      int int2 = NumberUtils.max(int0, int0, int1);
      assertArrayEquals(new int[] {0}, intArray0);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals(1671, int2);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      short short0 = (short) (-3343);
      short short1 = (short) (-3);
      int int0 = NumberUtils.max((int) short0, (int) short1, (int) short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      long long0 = 0L;
      long long1 = 998L;
      long long2 = NumberUtils.max(long0, long0, long1);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertEquals(998L, long2);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      short short0 = (short)46;
      short short1 = (short) (-874);
      long long0 = NumberUtils.max((long) short1, (long) short0, (long) short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals(46L, long0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = "-0x";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      long long0 = NumberUtils.max((long) int0, (long) int0, (long) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte byte0 = (byte)17;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertEquals((byte)0, byte2);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte byte0 = (byte)127;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte1, byte1);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertEquals((byte)0, byte2);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = NumberUtils.max(byte0, byte0, byte0);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      assertEquals((byte)0, byte1);
      
      byte byte2 = (byte) (-108);
      assertFalse(byte2 == byte1);
      
      short short0 = NumberUtils.min((short) byte1, (short) byte0, (short) byte2);
      assertFalse(byte0 == byte2);
      assertTrue(byte0 == byte1);
      assertFalse(byte1 == byte2);
      assertTrue(byte1 == byte0);
      assertFalse(byte2 == byte0);
      assertFalse(byte2 == byte1);
      assertEquals((short) (-108), short0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      short short0 = (short) (-3343);
      short short1 = (short) (-3);
      short short2 = NumberUtils.min(short1, short0, short1);
      assertTrue(short2 == short0);
      assertFalse(short2 == short1);
      assertTrue(short0 == short2);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertFalse(short1 == short2);
      assertEquals((short) (-3343), short2);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = (-3890);
      intArray0[0] = int0;
      int int1 = 0;
      int int2 = NumberUtils.min(int1, int1, intArray0[0]);
      assertArrayEquals(new int[] {(-3890), 0, 0, 0, 0, 0, 0}, intArray0);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertTrue(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals((-3890), int2);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short short0 = (short)1223;
      shortArray0[1] = short0;
      shortArray0[3] = shortArray0[1];
      int int0 = NumberUtils.min((int) shortArray0[3], (int) shortArray0[0], (int) shortArray0[2]);
      assertArrayEquals(new short[] {(short)0, (short)1223, (short)0, (short)1223, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      long long0 = 599L;
      int[] intArray0 = new int[1];
      int int0 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertEquals(0, int0);
      
      long long1 = NumberUtils.min(long0, long0, (long) int0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      long long0 = 251L;
      long long1 = 0L;
      long long2 = NumberUtils.min(long0, long1, long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long1 == long0);
      assertTrue(long1 == long2);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertEquals(0L, long2);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      long long0 = NumberUtils.min((long) int0, (long) int0, (long) int0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      float[] floatArray0 = new float[10];
      float float0 = 2013.0F;
      floatArray0[8] = float0;
      float float1 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2013.0F, 0.0F}, floatArray0, 0.01F);
      assertTrue(float1 == float0);
      assertEquals(2013.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[10];
      float float0 = Float.NaN;
      floatArray0[9] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = 1010.607157;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 1010.607157, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertEquals(1010.607157, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = Double.NaN;
      doubleArray0[3] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)114;
      byteArray0[3] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)114, (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte)114, byte1);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short short0 = (short)1223;
      shortArray0[1] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)1223, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short)1223, short1);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = (-3890);
      intArray0[0] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {(-3890), 0, 0, 0, 0, 0, 0}, intArray0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      long[] longArray0 = new long[10];
      long long0 = 2620L;
      longArray0[7] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 2620L, 0L, 0L}, longArray0);
      assertTrue(long1 == long0);
      assertEquals(2620L, long1);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
      long long0 = (-1L);
      float[] floatArray0 = new float[22];
      floatArray0[2] = (float) long0;
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, (-1.0F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      float[] floatArray0 = new float[4];
      float float0 = Float.NaN;
      floatArray0[1] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
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
  public void test051()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = (-3715.17122164);
      doubleArray0[6] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, (-3715.17122164), 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertEquals((-3715.17122164), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = Double.NaN;
      doubleArray0[7] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
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
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-5);
      byteArray0[3] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-5), (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
      assertEquals((byte) (-5), byte1);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short[] shortArray0 = new short[9];
      short short0 = (short) (-914);
      shortArray0[6] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short) (-914), (short)0, (short)0}, shortArray0);
      assertTrue(short1 == short0);
      assertEquals((short) (-914), short1);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = (-1581);
      intArray0[6] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, (-1581), 0, 0, 0}, intArray0);
      assertTrue(int1 == int0);
      assertEquals((-1581), int1);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = "org.apache.commons.lang3.math.NumberUtils";
      int int0 = (-372);
      int int1 = NumberUtils.toInt(string0, int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals((-372), int1);
      
      long[] longArray0 = new long[10];
      longArray0[9] = (long) int1;
      long long0 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, (-372L)}, longArray0);
      assertEquals((-372L), long0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
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
  public void test059()  throws Throwable  {
      String string0 = " ";
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
  public void test060()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = "QUTi'tiU}=ARc0+44";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Illegal embedded sign character
         //
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = "-l";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -l is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
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
  public void test069()  throws Throwable  {
      String string0 = "g>,9f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // g>,9f is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      String string0 = "Un392L/8Z$y&9L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Un392L/8Z$y&9L is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "hw]F8|%ID`5fe";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // hw]F8|%ID`5fe is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      String string0 = "dN+W||2fj=2\\kEei y";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // dN+W||2fj=2\\kEei y is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "0EH";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0EH is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "~.e[`K'j}]FEt";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ~.e[`K'j}]FEt is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = ".Fh=@t3#y$FiFQ\"+EF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .Fh=@t3#y$FiFQ\"+EF is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = " SF6fY!hNF>.p.";
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
  public void test079()  throws Throwable  {
      String string0 = " is not a valid umber.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid umber. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "-0Xjava.text.Normalizer is not available";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-java.text.Normalizer is not available\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "0Xjava.text.Normalizer is not available";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.text.Normalizer is not available\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "-0x";
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
  public void test083()  throws Throwable  {
      String string0 = "0xjava.text.Normalizrr is not available";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.text.Normalizrr is not available\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "--{}N1";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
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
  public void test086()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = "4D";
      Double double0 = (Double)NumberUtils.createNumber(string0);
      assertEquals(4.0, (double)double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = null;
      double double0 = (-2418.423001);
      double double1 = NumberUtils.toDouble(string0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals((-2418.423001), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte)105;
      float float0 = NumberUtils.toFloat(string0, (float) byte0);
      assertEquals(105.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      short[] shortArray0 = new short[8];
      String string0 = null;
      long long0 = NumberUtils.toLong(string0, (long) shortArray0[6]);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = "g";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = "-0x";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
      
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      float float1 = NumberUtils.max((float) int0, (float) int0, float0);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
      assertEquals(0.0F, float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = "<ylMKjQ]jW_WC?)Z_-)";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = "QUTi'tiU}=ARc0+44";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      float float0 = NumberUtils.min((float) byteArray0[1], (float) byteArray0[0], (float) byteArray0[0]);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = 0.0;
      double double1 = NumberUtils.min(doubleArray0[3], double0, doubleArray0[2]);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = "--{}N1";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
      
      double double0 = NumberUtils.max((double) int0, (double) int0, (double) int0);
      assertEquals(0.0, double0, 0.01D);
  }
}
