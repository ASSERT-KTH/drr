/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 24 09:12:25 GMT 2019
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
  public void test00()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0E-12, 1.0E-12);
      poissonDistributionImpl0.getDomainLowerBound((-2458.07893082098));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(7.0);
      double double0 = poissonDistributionImpl0.getMean();
      assertEquals(7.0, double0, 0.01);
  }

//////  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 1.0);
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(0, int0);
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 1.0);
      int int0 = poissonDistributionImpl0.getDomainUpperBound((-4029));
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl((-3893.430986346861), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,893.431 is smaller than, or equal to, the minimum (0): mean (-3,893.431)
         //
         verifyException("org.apache.commons.math.distribution.PoissonDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 1.0);
      double double0 = poissonDistributionImpl0.normalApproximateProbability(102);
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 1.0);
      double double0 = poissonDistributionImpl0.probability((-4029));
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 1.0);
      double double0 = poissonDistributionImpl0.probability(0);
      assertEquals(0.36787944117144233, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2.85040095144011776E17);
      double double0 = poissonDistributionImpl0.probability(2.85040095144011776E17);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2.85040095144011776E17, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 1.0);
      double double0 = poissonDistributionImpl0.probability(219);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 1.0);
      double double0 = poissonDistributionImpl0.cumulativeProbability(0, 0);
      assertEquals(0.6321205588285574, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0E-12, 1.0E-12);
      double double0 = poissonDistributionImpl0.cumulativeProbability(Integer.MAX_VALUE);
      assertEquals(1.0, double0, 0.01);
  }
}
