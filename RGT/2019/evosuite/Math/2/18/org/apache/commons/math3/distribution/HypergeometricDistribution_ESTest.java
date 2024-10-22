/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 15:42:13 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class HypergeometricDistribution_ESTest {

////  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2797, 1, 307);
      int[] intArray0 = hypergeometricDistribution0.sample(1);
      assertArrayEquals(new int[] {1}, intArray0);
      
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(0.1097604576331784, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(422, 422, 1);
      boolean boolean0 = hypergeometricDistribution0.isSupportConnected();
      assertTrue(boolean0);
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a((-1955L));
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(well44497a0, (-2240), (-80), (-80));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (-2,240)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Well512a well512a0 = new Well512a();
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(well512a0, 1441, (-1083), 1441);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-1,083)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(605, 0, (-284));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-284)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) null, 52, 1360, 1360);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (1,360) must be less than or equal to population size (52)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(2, 2, 112);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (112) must be less than or equal to population size (2)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(422, 422, 1);
      double double0 = hypergeometricDistribution0.cumulativeProbability(0, 1);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(732);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(well44497a0, 863, 732, 732);
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(622, int0);
      assertEquals(620.8852838933951, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(6080, 0, 6080);
      double double0 = hypergeometricDistribution0.probability((-282));
      assertEquals(6080, hypergeometricDistribution0.getSampleSize());
      assertEquals(6080, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(mersenneTwister0, 3809, 771, 1);
      double double0 = hypergeometricDistribution0.probability(771);
      assertEquals(0.20241533210816487, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2797, 1, 307);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(2797);
      assertEquals(0.1097604576331784, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(422, 422, 1);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(0);
      assertEquals(1.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(2797, 1, 307);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(1);
      assertEquals(0.1097604576331784, double0, 0.01);
  }
}
