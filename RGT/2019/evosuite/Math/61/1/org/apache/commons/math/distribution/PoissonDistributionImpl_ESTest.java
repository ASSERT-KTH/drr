/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 09:03:08 GMT 2019
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;


public class PoissonDistributionImpl_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0E-12, 1.0E-12);
      poissonDistributionImpl0.inverseCumulativeProbability(0.0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2618.7093479416, 0.0);
      double double0 = poissonDistributionImpl0.getMean();
      assertEquals(2618.7093479416, double0, 0.01);
  }

//////  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5);
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(0, int0);
      assertEquals(0.5, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0E-12, 1.0E-12);
      double double0 = poissonDistributionImpl0.normalApproximateProbability(3239);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl((-2363.32902945334));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,363.329 is smaller than, or equal to, the minimum (0): mean (-2,363.329)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(840.2321, (-1623));
      double double0 = poissonDistributionImpl0.probability((-1623));
      assertEquals(840.2321, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0E-12, 1.0E-12);
      double double0 = poissonDistributionImpl0.probability(Integer.MAX_VALUE);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5);
      double double0 = poissonDistributionImpl0.probability(74);
      assertEquals(9.706946125009101E-131, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5);
      double double0 = poissonDistributionImpl0.probability(0);
      assertEquals(0.6065306597126334, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.8014398509481984E16, (-3222.2545368310157));
      double double0 = poissonDistributionImpl0.cumulativeProbability((-3222.2545368310157), 1.8014398509481984E16);
      assertEquals(1.8014398509481984E16, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }
}
