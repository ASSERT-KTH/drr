/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 23 16:45:51 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class UniformRealDistribution_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(0.0, 4050.513383816518);
      boolean boolean0 = uniformRealDistribution0.isSupportConnected();
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(2025.256691908259, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(2448.17094362031, 2665.329116269);
      uniformRealDistribution0.sample(797);
      assertEquals(3929.8059956765283, uniformRealDistribution0.getNumericalVariance(), 0.01);
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
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.getNumericalVariance();
      assertEquals(0.08333333333333333, double0, 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(2448.17094362031, 2665.329116269);
      boolean boolean0 = uniformRealDistribution0.isSupportUpperBoundInclusive();
      assertTrue(boolean0);
      assertEquals(2556.750029944655, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(2448.17094362031, 2665.329116269);
      double double0 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
      assertEquals(1.0E-9, double0, 0.01);
      assertEquals(3929.8059956765283, uniformRealDistribution0.getNumericalVariance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      boolean boolean0 = uniformRealDistribution0.isSupportLowerBoundInclusive();
      assertTrue(boolean0);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c();
      UniformRealDistribution uniformRealDistribution0 = null;
      try {
        uniformRealDistribution0 = new UniformRealDistribution(well19937c0, 140.813741100976, (-1.0), 455.40172);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower bound (140.814) must be strictly less than upper bound (-1)
         //
         verifyException("org.apache.commons.math3.distribution.UniformRealDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(2448.17094362031, 2665.329116269);
      double double0 = uniformRealDistribution0.density(12.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2556.750029944655, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.density(1623.45464368);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister((-26L));
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution(mersenneTwister0, (-1745.03079), 4094.585313962733, 0.0);
      double double0 = uniformRealDistribution0.density((-26L));
      assertEquals(1.7124413355210202E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      uniformRealDistribution0.probability(1.0, 1.0);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.probability((-1124.21507), 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      double double0 = uniformRealDistribution0.probability(1.0E-6, 1.0E-6);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01);
  }
}
