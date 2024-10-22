/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:19:46 GMT 2014
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
      String string0 = "l";
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
      String string0 = "f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = "0D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = ".";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = "6E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = "e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      String string0 = "--0xvfZ!,b=aqByF";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String string0 = "0EBJZ; ]2i";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = "eQ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      String string0 = "..";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      String string0 = "+xWkm3\\A#X]}k:[)!S";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = "-0xArray cannot be empty.";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = "-0x-0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = "-0x0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = "-0";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "-0X";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = "9";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = (byte)89;
      byte byte2 = NumberUtils.max(byte0, byte0, byte1);
      assertEquals((byte)89, byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = (byte) (-46);
      byte byte1 = (byte) (-1);
      byte byte2 = NumberUtils.max(byte0, byte1, byte0);
      assertEquals((byte) (-1), byte2);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte byte0 = (byte)17;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertEquals((byte)17, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      byte byte2 = NumberUtils.max(byte1, byte1, byte1);
      assertEquals((byte)17, byte2);
      assertTrue(byte0 == byte1);
      assertTrue(byte0 == byte2);
      assertTrue(byte2 == byte1);
      assertTrue(byte2 == byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte1 == byte2);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      short short0 = (short) (-2567);
      short short1 = (short)0;
      short short2 = NumberUtils.max(short0, short0, short1);
      assertEquals((short)0, short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
      assertFalse(short2 == short0);
      assertTrue(short2 == short1);
      assertFalse(short0 == short2);
      assertFalse(short0 == short1);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      short short0 = (short) (-2567);
      short short1 = (short) (-1);
      short short2 = NumberUtils.max(short0, short1, short1);
      assertEquals((short) (-1), short2);
      assertTrue(short2 == short1);
      assertFalse(short2 == short0);
      assertFalse(short0 == short1);
      assertFalse(short0 == short2);
      assertTrue(short1 == short2);
      assertFalse(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte byte0 = (byte)68;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertEquals((byte)68, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      int int0 = 776;
      int int1 = NumberUtils.max((int) byte0, (int) byte1, int0);
      assertEquals(776, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte byte0 = (byte)17;
      byte byte1 = (byte)0;
      byte byte2 = NumberUtils.min(byte0, byte1, byte0);
      assertEquals((byte)0, byte2);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
      
      int int0 = NumberUtils.max((int) byte2, (int) byte0, (int) byte0);
      assertEquals(17, int0);
      assertTrue(byte1 == byte2);
      assertFalse(byte1 == byte0);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte2);
      assertFalse(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte byte0 = (byte)68;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertEquals((byte)68, byte1);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      
      int int0 = 776;
      long long0 = NumberUtils.max((long) byte1, (long) int0, (long) byte1);
      assertEquals(776L, long0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byte byte0 = (byte)10;
      long long0 = NumberUtils.max((long) byteArray0[1], (long) byteArray0[1], (long) byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(10L, long0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte byte0 = (byte)36;
      byte byte1 = (byte)17;
      byte byte2 = NumberUtils.min(byte0, byte0, byte1);
      assertEquals((byte)17, byte2);
      assertFalse(byte1 == byte0);
      assertTrue(byte1 == byte2);
      assertFalse(byte2 == byte0);
      assertTrue(byte2 == byte1);
      assertFalse(byte0 == byte1);
      assertFalse(byte0 == byte2);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      String string0 = "--0xvfZ!,b=aqByF";
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
      
      short short0 = (short) (-785);
      short short1 = NumberUtils.min((short) byte0, (short) byte0, short0);
      assertEquals((short) (-785), short1);
      assertTrue(short0 == short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      String string0 = "";
      short short0 = (short)0;
      short short1 = NumberUtils.toShort(string0, short0);
      assertEquals((short)0, short1);
      assertTrue(short1 == short0);
      assertTrue(short0 == short1);
      
      short short2 = (short)34;
      assertFalse(short2 == short1);
      
      short short3 = NumberUtils.min(short2, short1, short1);
      assertEquals((short)0, short3);
      assertTrue(short3 == short0);
      assertFalse(short3 == short2);
      assertTrue(short3 == short1);
      assertTrue(short1 == short0);
      assertFalse(short1 == short2);
      assertTrue(short1 == short3);
      assertFalse(short2 == short0);
      assertFalse(short2 == short3);
      assertFalse(short2 == short1);
      assertTrue(short0 == short1);
      assertTrue(short0 == short3);
      assertFalse(short0 == short2);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte byte0 = (byte) (-99);
      int int0 = (-3694);
      int int1 = NumberUtils.min((int) byte0, (int) byte0, int0);
      assertEquals((-3694), int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte byte0 = (byte)68;
      byte byte1 = NumberUtils.min(byte0, byte0, byte0);
      assertEquals((byte)68, byte1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
      
      int int0 = 776;
      int int1 = NumberUtils.min(int0, (int) byte1, int0);
      assertEquals(68, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertTrue(byte0 == byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      long long0 = 0L;
      long long1 = (-1L);
      long long2 = NumberUtils.min(long0, long0, long1);
      assertEquals((-1L), long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int int0 = 0;
      long long0 = 937L;
      long long1 = NumberUtils.min(long0, (long) int0, long0);
      assertEquals(0L, long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      String string0 = "P";
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
      
      long long0 = NumberUtils.min((long) short0, (long) short0, (long) short0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte byte0 = (byte)17;
      float[] floatArray0 = new float[22];
      floatArray0[1] = (float) byte0;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 17.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(17.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = Float.NaN;
      floatArray0[5] = float0;
      float float1 = NumberUtils.max(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
      //  // Unstable assertion: assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      double double0 = (-1.0);
      doubleArray0[0] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {(-1.0), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double1, 0.01D);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = Double.NaN;
      doubleArray0[6] = double0;
      double double1 = NumberUtils.max(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byte byte0 = (byte)10;
      byteArray0[2] = byte0;
      byte byte1 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)10, byte1);
      assertTrue(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      short short0 = (short)1;
      short[] shortArray0 = new short[10];
      shortArray0[1] = short0;
      short short1 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)1, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)1, short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
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
  public void test047()  throws Throwable  {
      byte byte0 = (byte) (-107);
      int[] intArray0 = new int[9];
      intArray0[0] = (int) byte0;
      int int0 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {(-107), 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      byte byte0 = (byte) (-8);
      long[] longArray0 = new long[6];
      longArray0[0] = (long) byte0;
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {(-8L), 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(0L, long0);
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
      float[] floatArray0 = new float[9];
      float float0 = (-5059.425F);
      floatArray0[8] = float0;
      float float1 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, (-5059.425F)}, floatArray0, 0.01F);
      assertEquals((-5059.425F), float1, 0.01F);
      assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = (-1.0F);
      floatArray0[3] = float0;
      float float1 = Float.NaN;
      floatArray0[3] = float1;
      float float2 = NumberUtils.min(floatArray0);
      //  // Unstable assertion: assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, Float.NaN, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      //  // Unstable assertion: assertEquals(Float.NaN, float2, 0.01F);
      //  // Unstable assertion: assertTrue(float2 == float1);
      //  // Unstable assertion: assertFalse(float2 == float0);
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
      float float0 = (-2226.39F);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) float0;
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-2226.389892578125), 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-2226.389892578125), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      double double0 = Double.NaN;
      doubleArray0[2] = double0;
      double double1 = NumberUtils.min(doubleArray0);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertTrue(double1 == double0);
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
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)127;
      byteArray0[0] = byte0;
      byte byte1 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)127, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)0, byte1);
      assertFalse(byte1 == byte0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
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
  public void test058()  throws Throwable  {
      short[] shortArray0 = new short[10];
      short short0 = (short) (-2114);
      shortArray0[8] = short0;
      short short1 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short)0, (short) (-2114), (short)0}, shortArray0);
      assertEquals((short) (-2114), short1);
      assertTrue(short1 == short0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = (-1330);
      intArray0[8] = int0;
      int int1 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, (-1330), 0}, intArray0);
      assertEquals((-1330), int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
      long[] longArray0 = new long[6];
      long long0 = 223L;
      longArray0[0] = long0;
      long long1 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {223L, 0L, 0L, 0L, 0L, 0L}, longArray0);
      assertEquals(0L, long1);
      assertFalse(long1 == long0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
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
  public void test064()  throws Throwable  {
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
  public void test065()  throws Throwable  {
      String string0 = null;
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(string0);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = null;
      BigInteger bigInteger0 = NumberUtils.createBigInteger(string0);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      String string0 = null;
      Long long0 = NumberUtils.createLong(string0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      String string0 = null;
      Integer integer0 = NumberUtils.createInteger(string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      String string0 = null;
      Double double0 = NumberUtils.createDouble(string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      String string0 = null;
      Float float0 = NumberUtils.createFloat(string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      String string0 = "sFfaRf0e";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // sFfaRf0e is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      String string0 = "X<3";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"X<3\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      String string0 = "\"l4Aivn{J7e:6-C*5";
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
  public void test075()  throws Throwable  {
      String string0 = "0lr(i{ 0hw[Wm/v\"Kf";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0lr(i{ 0hw[Wm/v\"Kf is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      String string0 = ">h]xx}2-<r@-JL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // >h]xx}2-<r@-JL is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      String string0 = "vfZ!,b=aqByF";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // vfZ!,b=aqByF is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      String string0 = ".X.";
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
      String string0 = "0D";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertEquals(0, bigDecimal0.shortValue());
      assertEquals(0, bigDecimal0.byteValue());
      assertNotNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      String string0 = "Array cannot be empty.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Array cannot be empty. is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      String string0 = "g.apahe.comon.lang3.SEriUtils";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // g.apahe.comon.lang3.SEriUtils is not a valid number.
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
      String string0 = "-0Xr9gC";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-r9gC\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = "0X";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
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
  public void test086()  throws Throwable  {
      String string0 = "0x";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

  @Test(timeout = 4000)
  public void test087() {}
//   @Test(timeout = 4000)
//   public void test087()  throws Throwable  {
//       String string0 = "---0Xr9gC";
//       Number number0 = NumberUtils.createNumber(string0);
//       assertNull(number0);
//   }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
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
  public void test089()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = ".5";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.5F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      String string0 = null;
      short short0 = NumberUtils.toShort(string0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = null;
      byte byte0 = NumberUtils.toByte(string0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      byte byte0 = (byte) (-95);
      String string0 = "qdm$?)21K";
      double double0 = NumberUtils.toDouble(string0, (double) byte0);
      assertEquals((-95.0), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      String string0 = null;
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      short short0 = (short) (-1150);
      String string0 = null;
      long long0 = NumberUtils.toLong(string0, (long) short0);
      assertEquals((-1150L), long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = null;
      int int0 = (-139);
      int int1 = NumberUtils.toInt(string0, int0);
      assertEquals((-139), int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = null;
      double double0 = NumberUtils.toDouble(string0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = "Strings must not be null";
      long long0 = 1L;
      int int0 = (-139);
      int int1 = NumberUtils.toInt(string0, int0);
      assertEquals((-139), int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      
      float float0 = NumberUtils.max((float) long0, (float) long0, (float) int1);
      assertEquals(1.0F, float0, 0.01F);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = ".5";
      long long0 = NumberUtils.toLong(string0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      float float0 = (-2226.39F);
      float float1 = NumberUtils.min(float0, float0, float0);
      assertEquals((-2226.39F), float1, 0.01F);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      float float0 = (-3193.54F);
      double double0 = NumberUtils.min((double) float0, (double) float0, (double) float0);
      assertEquals((-3193.5400390625), double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = (-3.1173913289641964);
      double double1 = NumberUtils.max(double0, double0, double0);
      assertEquals((-3.1173913289641964), double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = "Strings must not be null";
      float float0 = NumberUtils.toFloat(string0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      String string0 = "5~_";
      int int0 = NumberUtils.toInt(string0);
      assertEquals(0, int0);
  }
}
