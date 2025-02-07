/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 03 15:34:53 GMT 2019
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class HypergeometricDistribution_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(293, 293, 293);
      boolean boolean0 = hypergeometricDistribution0.isSupportConnected();
      assertTrue(boolean0);
      assertEquals(293.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((-244), (-244), (-244));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (-244)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(1254, (-1), 1254);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-1)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(1487, 1487, (-1768));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,768)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a(0L);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(well44497a0, 2, 1215, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (1,215) must be less than or equal to population size (2)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Well512a well512a0 = new Well512a((int[]) null);
      RandomAdaptor randomAdaptor0 = new RandomAdaptor(well512a0);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(randomAdaptor0, 595, 1, 852);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (852) must be less than or equal to population size (595)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(293, 293, 293);
      double double0 = hypergeometricDistribution0.cumulativeProbability(1374);
      assertEquals(1.0, double0, 0.01);
      assertEquals(293.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(14, 14, 14);
      hypergeometricDistribution0.cumulativeProbability((-2548), (-2548));
      assertEquals(14.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(873, 436, 436);
      // Undeclared exception!
      hypergeometricDistribution0.sample(1291);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(534, 534, 534);
      double double0 = hypergeometricDistribution0.probability((-1443));
      assertEquals(534.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1, 1, 0);
      double double0 = hypergeometricDistribution0.probability(1633);
      assertEquals(1, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(293, 293, 293);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(372);
      assertEquals(293.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(534, 534, 534);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability((-1443));
      assertEquals(1.0, double0, 0.01);
      assertEquals(534.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[5];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(iSAACRandom0, 4207, 1123, 1123);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(1123);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1123, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(534, 534, 534);
      double double0 = hypergeometricDistribution0.getNumericalVariance();
      assertEquals(0.0, double0, 0.01);
      
      int int0 = hypergeometricDistribution0.sample();
      assertEquals(534.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(534, int0);
  }
}
