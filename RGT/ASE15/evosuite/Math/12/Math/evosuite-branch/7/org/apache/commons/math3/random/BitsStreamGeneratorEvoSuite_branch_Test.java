/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:18:24 GMT 2014
 */

package org.apache.commons.math3.random;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BitsStreamGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      Well44497b well44497b0 = new Well44497b();
      assertNotNull(well44497b0);
      
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      byte byte0 = (byte)26;
      ISAACRandom iSAACRandom0 = new ISAACRandom((long) byte0);
      assertNotNull(iSAACRandom0);
      
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      Well512a well512a0 = new Well512a((int) byte0);
      assertNotNull(well512a0);
      
      int int0 = well512a0.nextInt();
      assertEquals(1966228076, int0);
      
      double double0 = well19937c0.nextDouble();
      assertEquals(0.5344581446364152, double0, 0.01D);
      
      int int1 = well19937c0.nextInt(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1191652076, int1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long long0 = (-9223372036854775808L);
      Well19937c well19937c0 = new Well19937c(long0);
      assertNotNull(well19937c0);
      
      int int0 = 32;
      int int1 = well19937c0.nextInt(int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(19, int1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      Well44497b well44497b0 = new Well44497b();
      assertNotNull(well44497b0);
      
      boolean boolean0 = well44497b0.nextBoolean();
      assertTrue(boolean0);
      
      byte[] byteArray0 = new byte[4];
      well44497b0.nextBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte)101, (byte) (-71), (byte)14, (byte) (-108)}, byteArray0);
      
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      int int0 = well19937c0.nextInt((int) byteArray0[0]);
      assertEquals(22, int0);
      assertArrayEquals(new byte[] {(byte)101, (byte) (-71), (byte)14, (byte) (-108)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      Well44497a well44497a0 = new Well44497a((long) intArray0[1]);
      assertNotNull(well44497a0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      
      byte byte0 = (byte) (-1);
      try {
        int int0 = well44497a0.nextInt((int) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      long long0 = (-9223372036854775808L);
      Well19937c well19937c0 = new Well19937c(long0);
      assertNotNull(well19937c0);
      
      double double0 = well19937c0.nextGaussian();
      assertEquals((-1.020987888924766), double0, 0.01D);
      
      double double1 = well19937c0.nextGaussian();
      assertFalse(double1 == double0);
      assertEquals((-0.7058420061989782), double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[9];
      Well1024a well1024a0 = new Well1024a(intArray0);
      assertNotNull(well1024a0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      byte[] byteArray0 = new byte[10];
      well1024a0.nextBytes(byteArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertArrayEquals(new byte[] {(byte)100, (byte)88, (byte)41, (byte)40, (byte)99, (byte) (-22), (byte)109, (byte) (-127), (byte)50, (byte) (-98)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte)26;
      byteArray0[1] = byte0;
      Well512a well512a0 = new Well512a((int) byteArray0[1]);
      assertNotNull(well512a0);
      assertArrayEquals(new byte[] {(byte)0, (byte)26, (byte)0, (byte)0}, byteArray0);
      
      boolean boolean0 = well512a0.nextBoolean();
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)26, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int int0 = (-1079);
      Well44497b well44497b0 = new Well44497b(int0);
      assertNotNull(well44497b0);
      
      long long0 = well44497b0.nextLong();
      assertEquals((-4478113134579257287L), long0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      float float0 = well19937c0.nextFloat();
      assertEquals(0.90262973F, float0, 0.01F);
  }
}
