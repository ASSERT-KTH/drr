/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 16:38:37 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class UniformRealDistribution_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      boolean boolean0 = uniformRealDistribution0.isSupportConnected();
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.sample();
      assertEquals(0.9026297667469598, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getNumericalMean();
      assertEquals(0.5, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((-1225.905098), (-1.0));
      double double0 = uniformRealDistribution0.getSupportUpperBound();
      assertEquals((-1.0), double0, 0.01);
      assertEquals(125032.7082588658, uniformRealDistribution0.getNumericalVariance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getNumericalVariance();
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.08333333333333333, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well512a well512a0 = new Well512a(intArray0);
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well512a0, 0.5, 964.35613095164, 0.0);
      boolean boolean0 = uniformRealDistribution0.isSupportUpperBoundInclusive();
      assertTrue(boolean0);
      assertEquals(77418.22009775542, uniformRealDistribution0.getNumericalVariance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getSupportLowerBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      boolean boolean0 = uniformRealDistribution0.isSupportLowerBoundInclusive();
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = null;
      try {
        uniformRealDistribution0 = new UniformRealDistribution((-186.63), (-186.63), (-186.63));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower bound (-186.63) must be strictly less than upper bound (-186.63)
         //
         verifyException("org.apache.commons.math3.distribution.UniformRealDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well512a well512a0 = new Well512a(intArray0);
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well512a0, 0.5, 964.35613095164, 0.0);
      double double0 = uniformRealDistribution0.density(0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(482.42806547582, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[8];
      Well1024a well1024a0 = new Well1024a(intArray0);
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well1024a0, (-386.461011544959), 1.0E-9, 0);
      double double0 = uniformRealDistribution0.density(944.00508718);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-193.2305057719795), uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.density(0.0);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well512a well512a0 = new Well512a(intArray0);
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well512a0, 0.5, 964.35613095164, 0.0);
      double double0 = uniformRealDistribution0.probability(Double.NaN, (double) (-1968));
      assertEquals(77418.22009775542, uniformRealDistribution0.getNumericalVariance(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[8];
      Well1024a well1024a0 = new Well1024a(intArray0);
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(well1024a0, (-386.461011544959), 1.0E-9, 0);
      double double0 = uniformRealDistribution0.probability((double) 0, (double) 1126);
      assertEquals(2.5875968034938523E-12, double0, 0.01);
  }
}
