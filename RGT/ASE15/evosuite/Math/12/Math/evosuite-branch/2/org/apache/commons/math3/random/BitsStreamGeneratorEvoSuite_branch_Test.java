/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:14:42 GMT 2014
 */

package org.apache.commons.math3.random;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class BitsStreamGeneratorEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 797;
      Well19937c well19937c0 = new Well19937c(int0);
      assertNotNull(well19937c0);
      
      double double0 = well19937c0.nextGaussian();
      assertEquals(0.9066848985821454, double0, 0.01D);
      
      int int1 = well19937c0.next(int0);
      assertEquals(360639354, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      Well44497a well44497a0 = new Well44497a(int1);
      assertNotNull(well44497a0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      int int2 = well44497a0.nextInt(int1);
      assertEquals(310005807, int2);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      Well1024a well1024a0 = new Well1024a(intArray0);
      assertNotNull(well1024a0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      int int0 = 8;
      int int1 = well1024a0.nextInt(int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(3, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
      assertNotNull(mersenneTwister0);
      assertArrayEquals(new int[] {0}, intArray0);
      
      try {
        int int0 = mersenneTwister0.nextInt(intArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = (-1587L);
      ISAACRandom iSAACRandom0 = new ISAACRandom(long0);
      assertNotNull(iSAACRandom0);
      
      double double0 = iSAACRandom0.nextGaussian();
      assertEquals(0.3184468786217998, double0, 0.01D);
      
      double double1 = iSAACRandom0.nextGaussian();
      assertEquals((-1.2296757855871607), double1, 0.01D);
      assertFalse(double1 == double0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = 6722166367014452312L;
      MersenneTwister mersenneTwister0 = new MersenneTwister(long0);
      assertNotNull(mersenneTwister0);
      
      byte[] byteArray0 = new byte[4];
      mersenneTwister0.nextBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-99), (byte)41, (byte)116, (byte)22}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      Well44497a well44497a0 = new Well44497a(intArray0);
      assertNotNull(well44497a0);
      assertArrayEquals(new int[] {0}, intArray0);
      
      byte[] byteArray0 = new byte[2];
      well44497a0.nextBytes(byteArray0);
      assertArrayEquals(new int[] {0}, intArray0);
      assertArrayEquals(new byte[] {(byte)112, (byte) (-64)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a();
      assertNotNull(well19937a0);
      
      boolean boolean0 = well19937a0.nextBoolean();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      assertNotNull(mersenneTwister0);
      
      boolean boolean0 = mersenneTwister0.nextBoolean();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      long long0 = well44497a0.nextLong();
      assertEquals((-2190028534743882324L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[8];
      Well1024a well1024a0 = new Well1024a(intArray0);
      assertNotNull(well1024a0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      float float0 = well1024a0.nextFloat();
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0.4596635F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      int int0 = well44497a0.nextInt();
      assertEquals((-509905754), int0);
  }
}
