/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:12:18 GMT 2014
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
      String string0 = "c";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = "L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "9f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = "2";
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
      String string0 = "--i@";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "6E*lNW):\"wcp5Zt";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "eH)ec$H}Xe[v/Vc/>";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "...";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "+89v_";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "-0xa<hTvMmw\"TD[>E#6";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "-0x0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0x$RAdn{BZfyr7Z'b*YnF";
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
      String string0 = "-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "0l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "-0xsun.text.Normalizer is not available";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)2;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertEquals((byte)2, byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte2 == byte0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = (byte) (-12);
      byte byte1 = (byte)76;
      byte byte2 = NumberUtils.max(byte0, byte1, byte1);
      assertEquals((byte)76, byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      short short0 = (short)120;
      short short1 = (short)1388;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertEquals((short)1388, short2);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      short short0 = (short)0;
      short short1 = (short)1734;
      short short2 = NumberUtils.max(short0, short1, short0);
      assertEquals((short)1734, short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short1 == short0);
      assertTrue(short1 == short2);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      int int0 = (-1731);
      int int1 = 521;
      int int2 = NumberUtils.max(int0, int0, int1);
      assertEquals(521, int2);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      int int0 = (-1731);
      int int1 = 120;
      int int2 = NumberUtils.max(int0, int1, int1);
      assertEquals(120, int2);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      short short0 = (short)0;
      long long0 = 1959L;
      long long1 = NumberUtils.max((long) short0, (long) short0, long0);
      assertEquals(1959L, long1);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte)73;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertEquals((byte)73, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      long long0 = 1L;
      long long1 = NumberUtils.max(long0, (long) byte1, (long) byte0);
      assertEquals(73L, long1);
      assertTrue(byte0 == byte1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte byte0 = (byte)120;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertEquals((byte)0, byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte byte0 = (byte)120;
      byte byte1 = (byte)1;
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertEquals((byte)1, byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)0;
      short short0 = (short) (-1390);
      short short1 = NumberUtils.min((short) byte0, (short) byte0, short0);
      assertEquals((short) (-1390), short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      short[] shortArray0 = new short[5];
      short short0 = (short)8192;
      short short1 = NumberUtils.min(short0, shortArray0[0], short0);
      assertEquals((short)0, short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int int0 = 64;
      byte byte0 = (byte)0;
      int int1 = (-2525);
      int int2 = NumberUtils.min(int0, (int) byte0, int1);
      assertEquals((-2525), int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertTrue(int1 == int2);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      int int0 = 64;
      byte byte0 = (byte)0;
      int int1 = NumberUtils.min(int0, (int) byte0, (int) byte0);
      assertEquals(0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte byte0 = (byte)115;
      int int0 = NumberUtils.min((int) byte0, (int) byte0, (int) byte0);
      assertEquals(115, int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      long long0 = 526L;
      long long1 = (-1L);
      long long2 = NumberUtils.min(long0, long0, long1);
      assertEquals((-1L), long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      short[] shortArray0 = new short[17];
      short short0 = (short) (-918);
      shortArray0[0] = short0;
      long long0 = NumberUtils.min((long) shortArray0[1], (long) shortArray0[0], (long) shortArray0[2]);
      assertEquals((-918L), long0);
      assertArrayEquals(new short[] {(short) (-918), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      float[] floatArray0 = new float[23];
      float float0 = (-388.201F);
      floatArray0[0] = float0;
      float float1 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float1, 0.01F);
      assertArrayEquals(new float[] {(-388.201F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertFalse(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = Float.NaN;
      floatArray0[2] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = (-2.175166471660351);
      doubleArray0[0] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double1, 0.01D);
      assertArrayEquals(new double[] {(-2.175166471660351), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double double0 = Double.NaN;
      doubleArray0[3] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte byte0 = (byte)73;
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertEquals((byte)73, byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)73, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
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
      short[] shortArray0 = new short[17];
      short short0 = (short) (-918);
      shortArray0[0] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short1);
      assertArrayEquals(new short[] {(short) (-918), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertFalse(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
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
  public void test046()  throws Throwable  {
      int[] intArray0 = new int[23];
      int int0 = 1502;
      intArray0[1] = int0;
      int int1 = NumberUtils.max(intArray0);
      assertEquals(1502, int1);
      assertArrayEquals(new int[] {0, 1502, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
      long[] longArray0 = new long[4];
      long long0 = (-3459L);
      longArray0[0] = long0;
      long long1 = NumberUtils.max(longArray0);
      assertEquals(0L, long1);
      assertArrayEquals(new long[] {(-3459L), 0L, 0L, 0L}, longArray0);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
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
  public void test050()  throws Throwable  {
      float[] floatArray0 = new float[5];
      float float0 = Float.NaN;
      floatArray0[0] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertEquals(0.0F, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {Float.NaN, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertFalse(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      float[] floatArray0 = new float[8];
      float float0 = Float.NaN;
      floatArray0[5] = float0;
      float float1 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
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
  public void test053()  throws Throwable  {
      short short0 = (short)120;
      double[] doubleArray0 = new double[19];
      doubleArray0[0] = (double) short0;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new double[] {120.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      float float0 = Float.NaN;
      doubleArray0[7] = (double) float0;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-8);
      byteArray0[2] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-8), byte1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-8), (byte)0}, byteArray0);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      short[] shortArray0 = new short[4];
      short short0 = (short) (-1013);
      shortArray0[3] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertEquals((short) (-1013), short1);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short) (-1013)}, shortArray0);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
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
  public void test059()  throws Throwable  {
      byte byte0 = (byte)76;
      int[] intArray0 = new int[4];
      intArray0[0] = (int) byte0;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
      assertArrayEquals(new int[] {76, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      short short0 = (short)2;
      long[] longArray0 = new long[9];
      longArray0[0] = (long) short0;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
      assertArrayEquals(new long[] {2L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = "2.";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(2.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = "Minimum abbevaion widthis 4";
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
  public void test071()  throws Throwable  {
      String string0 = "0l";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "Strings must nt be null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must nt be null is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "xKPcvUxey`CW&f";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // xKPcvUxey`CW&f is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      String string0 = "vqQSz}H1@S~WL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // vqQSz}H1@S~WL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String string0 = "5F";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(5.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = "CuiwWr_p+>@l:=+fBnE";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // CuiwWr_p+>@l:=+fBnE is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = ".";
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
  public void test078()  throws Throwable  {
      String string0 = "o/5";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"o/5\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test079() {}
//   @Test(timeout = 4000)
//   public void test079()  throws Throwable  {
//       String string0 = "7$MSJd%E7fdd&eb";
//       try {
//         Number number0 = NumberUtils.createNumber(string0);
//         fail("Expecting exception: NumberFormatException");
//       
//       } catch(NumberFormatException e) {
//          //
//          // 7$MSJd%E7fdd&eb is not a valid number.
//          //
//       }
//   }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
      String string0 = "rray cannot be empty.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // rray cannot be empty. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String string0 = "B0.W+6m!D";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // B0.W+6m!D is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = "F.{*EzU9/wU{\"O=";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F.{*EzU9/wU{\"O= is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "-0X9/H6hK74f- q7M(?0";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-9/H6hK74f- q7M(?0\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = "0XIllegalAccessException occurred";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"IllegalAccessException occurred\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = "-0xsun.text.Normalizer is not available";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-sun.text.Normalizer is not available\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = "0x-0x";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Sign character in wrong position
         //
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = "--i@";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
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
  public void test090()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = null;
      short[] shortArray0 = new short[5];
      short short0 = NumberUtils.toShort(string0, shortArray0[1]);
      assertEquals((short)0, short0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = "org.apache.commons.lang3.StringUtils";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = "I>r0";
      long[] longArray0 = new long[4];
      float float0 = NumberUtils.toFloat(string0, (float) longArray0[3]);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      String string0 = null;
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = null;
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = "5F";
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(5.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int[] intArray0 = new int[23];
      float float0 = NumberUtils.max((float) intArray0[2], (float) intArray0[2], (float) intArray0[2]);
      assertEquals(0.0F, float0, 0.01F);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = "?";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = null;
      byte byte0 = (byte)73;
      byte byte1 = NumberUtils.toByte(string0, byte0);
      assertEquals((byte)73, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      float float0 = NumberUtils.min((float) byte0, (float) byte1, (float) byte0);
      assertEquals(73.0F, float0, 0.01F);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double double0 = (-1.0);
      double double1 = NumberUtils.min(double0, double0, double0);
      assertEquals((-1.0), double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = "2";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)2, short0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      int[] intArray0 = new int[23];
      double double0 = NumberUtils.max((double) intArray0[2], (double) intArray0[1], (double) intArray0[2]);
      assertEquals(0.0, double0, 0.01D);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = "-";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
