/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:16:17 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
 import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

 
public class UniformRealDistributionEvoSuite_branch_Test   {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      assertNotNull(uniformRealDistribution0);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      
      double double0 = uniformRealDistribution0.getSolverAbsoluteAccuracy();
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(1.0E-9, double0, 0.01D);
      
      double double1 = 1759.352158125939;
      assertFalse(double1 == double0);
      
      double double2 = uniformRealDistribution0.cumulativeProbability(double0, double1);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(0.999999999, double2, 0.01D);
  }

  //@Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = 1.0E-9;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      double double1 = 358.41446613536;
      double double2 = (-962.8);
      double double3 = 56.2733273;
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((RandomGenerator) well44497a0, double2, double3, double0);
      assertNotNull(uniformRealDistribution0);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals((-453.26333635), uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals((-962.8), uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(86542.53720119107, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(56.2733273, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      
      double double4 = uniformRealDistribution0.sample();
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals((-453.26333635), uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals((-962.8), uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(86542.53720119107, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(56.2733273, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double3 == double4);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double4);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double4);
      assertFalse(double0 == double1);
      assertFalse(double4 == double3);
      assertFalse(double4 == double1);
      assertFalse(double4 == double0);
      assertFalse(double4 == double2);
      assertEquals((-64.71277453040872), double4, 0.01D);
      
      UniformRealDistribution uniformRealDistribution1 = new UniformRealDistribution(double0, double1, double1);
      assertNotNull(uniformRealDistribution1);
      assertEquals(true, uniformRealDistribution1.isSupportConnected());
      assertEquals(358.41446613536, uniformRealDistribution1.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution1.isSupportLowerBoundInclusive());
      assertEquals(1.0E-9, uniformRealDistribution1.getSupportLowerBound(), 0.01D);
      assertEquals(10705.07746119819, uniformRealDistribution1.getNumericalVariance(), 0.01D);
      assertEquals(179.20723306818, uniformRealDistribution1.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution1.isSupportUpperBoundInclusive());
      assertFalse(uniformRealDistribution1.equals((Object)uniformRealDistribution0));
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double4);
      assertFalse(double0 == double1);
      assertFalse(double1 == double4);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertNotSame(uniformRealDistribution1, uniformRealDistribution0);
      
      double double5 = uniformRealDistribution1.cumulativeProbability(double4);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals((-453.26333635), uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals((-962.8), uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(86542.53720119107, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(56.2733273, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution1.isSupportConnected());
      assertEquals(358.41446613536, uniformRealDistribution1.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution1.isSupportLowerBoundInclusive());
      assertEquals(1.0E-9, uniformRealDistribution1.getSupportLowerBound(), 0.01D);
      assertEquals(10705.07746119819, uniformRealDistribution1.getNumericalVariance(), 0.01D);
      assertEquals(179.20723306818, uniformRealDistribution1.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution1.isSupportUpperBoundInclusive());
      assertFalse(double3 == double4);
      assertFalse(double3 == double2);
      assertFalse(double3 == double5);
      assertFalse(double3 == double1);
      assertFalse(double3 == double0);
      assertFalse(uniformRealDistribution0.equals((Object)uniformRealDistribution1));
      assertFalse(uniformRealDistribution1.equals((Object)uniformRealDistribution0));
      assertFalse(double5 == double0);
      assertFalse(double5 == double4);
      assertFalse(double5 == double2);
      assertFalse(double5 == double1);
      assertFalse(double5 == double3);
      assertFalse(double2 == double1);
      assertFalse(double2 == double4);
      assertFalse(double2 == double0);
      assertFalse(double2 == double5);
      assertFalse(double2 == double3);
      assertFalse(double0 == double5);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertFalse(double0 == double4);
      assertFalse(double0 == double1);
      assertFalse(double4 == double3);
      assertFalse(double4 == double1);
      assertFalse(double4 == double0);
      assertFalse(double4 == double2);
      assertFalse(double4 == double5);
      assertFalse(double1 == double4);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double5);
      assertNotSame(uniformRealDistribution0, uniformRealDistribution1);
      assertNotSame(uniformRealDistribution1, uniformRealDistribution0);
      assertEquals(0.0, double5, 0.01D);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = 2104.755;
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      assertNotNull(uniformRealDistribution0);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      
      double double1 = uniformRealDistribution0.density(double0);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = 1.0E-9;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      double double1 = 358.41446613536;
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((RandomGenerator) well44497a0, double0, double1, double1);
      assertNotNull(uniformRealDistribution0);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(10705.07746119819, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(179.20723306818, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(358.41446613536, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double double2 = uniformRealDistribution0.sample();
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(10705.07746119819, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(179.20723306818, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(358.41446613536, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertEquals(315.86289704257206, double2, 0.01D);
      
      double double3 = uniformRealDistribution0.density(double2);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(10705.07746119819, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(179.20723306818, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(358.41446613536, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double3);
      assertFalse(double0 == double2);
      assertEquals(0.0027900659557226876, double3, 0.01D);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      assertNotNull(uniformRealDistribution0);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      
      double double0 = (-1.0);
      double double1 = uniformRealDistribution0.density(double0);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = (-1.0);
      UniformRealDistribution uniformRealDistribution0 = null;
      try {
        uniformRealDistribution0 = new UniformRealDistribution(double0, double0, double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower bound (-1) must be strictly less than upper bound (-1)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      assertNotNull(uniformRealDistribution0);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      
      boolean boolean0 = uniformRealDistribution0.isSupportUpperBoundInclusive();
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      assertNotNull(uniformRealDistribution0);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      
      double double0 = uniformRealDistribution0.getSupportUpperBound();
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.0, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      assertNotNull(uniformRealDistribution0);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      
      boolean boolean0 = uniformRealDistribution0.isSupportConnected();
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = 1.0E-9;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      double double1 = 358.41446613536;
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((RandomGenerator) well44497a0, double0, double1, double0);
      assertNotNull(uniformRealDistribution0);
      assertEquals(179.20723306818, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(358.41446613536, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(10705.07746119819, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      double double2 = uniformRealDistribution0.getNumericalMean();
      assertEquals(179.20723306818, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(358.41446613536, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(10705.07746119819, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(179.20723306818, double2, 0.01D);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = 1.0E-9;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      double double1 = 56.2733273;
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((RandomGenerator) well44497a0, double0, double1, double0);
      assertNotNull(uniformRealDistribution0);
      assertEquals(263.89061377503157, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(28.136663650499997, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(56.2733273, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      double double2 = uniformRealDistribution0.getSupportLowerBound();
      assertEquals(263.89061377503157, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(28.136663650499997, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(56.2733273, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertFalse(double2 == double1);
      assertTrue(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(1.0E-9, double2, 0.01D);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution();
      assertNotNull(uniformRealDistribution0);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      
      double double0 = uniformRealDistribution0.getNumericalVariance();
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(0.0, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(0.08333333333333333, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(1.0, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(0.5, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertEquals(0.08333333333333333, double0, 0.01D);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = 1.0E-9;
      Well44497a well44497a0 = new Well44497a();
      assertNotNull(well44497a0);
      
      double double1 = 56.2733273;
      UniformRealDistribution uniformRealDistribution0 = new UniformRealDistribution((RandomGenerator) well44497a0, double0, double1, double0);
      assertNotNull(uniformRealDistribution0);
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(56.2733273, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(263.89061377503157, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(28.136663650499997, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      boolean boolean0 = uniformRealDistribution0.isSupportLowerBoundInclusive();
      assertEquals(true, uniformRealDistribution0.isSupportLowerBoundInclusive());
      assertEquals(true, uniformRealDistribution0.isSupportConnected());
      assertEquals(1.0E-9, uniformRealDistribution0.getSupportLowerBound(), 0.01D);
      assertEquals(56.2733273, uniformRealDistribution0.getSupportUpperBound(), 0.01D);
      assertEquals(true, uniformRealDistribution0.isSupportUpperBoundInclusive());
      assertEquals(263.89061377503157, uniformRealDistribution0.getNumericalVariance(), 0.01D);
      assertEquals(28.136663650499997, uniformRealDistribution0.getNumericalMean(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertTrue(boolean0);
  }
}
